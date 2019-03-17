package com.base.designpattern;

/**
 * ��̬�ڲ���
 * @author Administrator
 *
 */
public class SignletonLazyInnder {
	private SignletonLazyInnder(){
		if(InnerLazy.sign!=null){
			throw new RuntimeException("�����������ʵ��");
		}
	}
	
	public static SignletonLazyInnder getInstance(){
		return InnerLazy.sign;
	}
	private static class InnerLazy{
		private static final SignletonLazyInnder sign=new SignletonLazyInnder();
	}
}
