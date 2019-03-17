package com.base.designpattern;

import java.io.Serializable;

public class SignletonSerialization implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private final static SignletonSerialization sign=new SignletonSerialization();
	private SignletonSerialization(){}
	public SignletonSerialization getInstance(){
		return sign;
	}
	
	private Object readResolve(){
		return sign;
	}
}
