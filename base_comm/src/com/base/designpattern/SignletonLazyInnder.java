package com.base.designpattern;

/**
 * 静态内部类
 * @author Administrator
 *
 */
public class SignletonLazyInnder {
	private SignletonLazyInnder(){
		if(InnerLazy.sign!=null){
			throw new RuntimeException("不允许创建多个实例");
		}
	}
	
	public static SignletonLazyInnder getInstance(){
		return InnerLazy.sign;
	}
	private static class InnerLazy{
		private static final SignletonLazyInnder sign=new SignletonLazyInnder();
	}
}
