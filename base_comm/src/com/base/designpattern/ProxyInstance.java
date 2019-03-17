package com.base.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInstance implements InvocationHandler{
	//����һ��Object����
	private Object target;
	//����һ����ȡ����ķ���
	public Object getInstance(Object target){
		this.target=target;
		Class<?> clazz=target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	//ʵ�ֵ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//ҵ�����
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
