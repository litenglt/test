package com.base.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInstance implements InvocationHandler{
	//定义一个Object对象
	private Object target;
	//创建一个获取对象的方法
	public Object getInstance(Object target){
		this.target=target;
		Class<?> clazz=target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	//实现调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//业务代码
		before();
		Object obj=method.invoke(target, args);
		after();
		return obj;
	}

	public void before(){
		System.out.println("lkkkk");
	}
	
	public void after(){
		System.out.println("dsssssssss");
	}
}
