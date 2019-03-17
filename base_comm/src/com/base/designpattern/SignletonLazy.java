package com.base.designpattern;

/**
 * ¿¡º”‘ÿ
 * @author Administrator
 *
 */
public class SignletonLazy {
	private SignletonLazy() {
	}

	private static volatile SignletonLazy sing = null;

	public static SignletonLazy getInstance() {
		synchronized (SignletonLazy.class) {
			if (sing == null) {
				sing = new SignletonLazy();
			}
		}
		return sing;
	}
}
