package com.base.designpattern;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class SignletonHunger {
	private static final SignletonHunger sing=new SignletonHunger();
	private SignletonHunger(){}
	public static SignletonHunger getInstance(){
		return sing;
	}
}
