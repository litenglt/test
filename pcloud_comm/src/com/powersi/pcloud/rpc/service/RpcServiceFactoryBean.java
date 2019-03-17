package com.powersi.pcloud.rpc.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.powersi.comm.exception.ApusException;

/**
 * pcloud工程使用的远程服务工厂类
 * 负责提供spring的xml中，使用本类来动态根据配置的服务入口地址加载服务实例
 * xml定义demo：
	<bean id="ChooseDiagnoseBizVS"
		class="com.powersi.hygeia.comm.service.HygeiaServiceFactoryBean">
		<property name="serviceUrl"
			value="http://@{dbservice}/hygeia_db/remoting/ChooseDiagnoseBizVS"></property>
		<property name="serviceInterface"
			value="com.powersi.biz.medicare.diagnose.service.ChooseDiagnoseBizVS"></property>
	</bean>
 * @author 李志钢
 *
 */
public class RpcServiceFactoryBean implements FactoryBean<Object>
{
    private String serviceUrl; //配置的目标服务器URL，中间地址部分使用${server}
    private String serviceInterface; //对应目标service的class
    
    @Autowired
    RpcConfigReadService rpcConfigReadService;


    @Override
    public Object getObject() throws Exception
    {
        HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
        factory.setServiceUrl(this.getServiceUrl());
        factory.setServiceInterface(Class.forName(serviceInterface));
        factory.afterPropertiesSet();
        Object obj = factory.getObject();
        if (obj == null)
        {
            throw new ApusException("无法根据url，class创建service: url:" + this.getServiceUrl() + ",class:" + serviceInterface);
        }
        return obj;
    }

    @Override
    public Class<?> getObjectType()
    {
        if (StringUtils.isBlank(serviceInterface))
        {
            return null;
        }
        try
        {
            return Class.forName(serviceInterface);
        }
        catch (ClassNotFoundException e)
        {
            //			throw new ApusException(e);
            return null;
        }
    }

    @Override
    public boolean isSingleton()
    {
        return false;
    }

    public String getServiceUrl()
    {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl)
    {
        this.serviceUrl = serviceUrl;
        this.replaceServiceUrlWithConfig();
    }

    public String getServiceInterface()
    {
        return serviceInterface;
    }

    public void setServiceInterface(String serviceInterface)
    {
        this.serviceInterface = serviceInterface;
    }
    
    /**
     * 根据配置，替换url中对应服务为目标IP+port
     */
    private void replaceServiceUrlWithConfig(){
    	//通过正则表达式提取serviceUrl中 @{xxxxxx}的xxxx，这个是服务名称，例如PCLOUD_LOG
    	Pattern pattern     = Pattern.compile("(?<=\\@\\{)\\w+", Pattern.CASE_INSENSITIVE);
        Matcher matcher     = pattern.matcher( this.getServiceUrl() );
        while( matcher.find() ){
            String serviceName = matcher.group(0);
            String endpoint = rpcConfigReadService.getConfigByServiceName(serviceName);
            this.serviceUrl = serviceUrl.replaceAll("@\\{"+serviceName+"\\}", endpoint);
        }
    }
    
    public static void main(String[] args) {
//    	String ss = "reading a book";
//    	String ss = "http://@{dbservice}/hygeia_esb/@{aaserv}remoting/diagnoseSaveBizVS";
//    	Pattern pattern     = Pattern.compile("(?<=\\@\\{)\\w+", Pattern.CASE_INSENSITIVE);
//        Matcher matcher     = pattern.matcher( ss );
//        while( matcher.find() ){
//            String s1 = matcher.group(0);
//            System.out.println(s1);
//            ss = ss.replaceAll("@\\{"+s1+"\\}", "s111111111");
//        }
//        
//        System.out.println(ss);
	}

}
