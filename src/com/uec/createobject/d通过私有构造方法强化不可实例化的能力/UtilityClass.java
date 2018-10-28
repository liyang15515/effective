package com.uec.createobject.d通过私有构造方法强化不可实例化的能力;

public class UtilityClass {

	//这样写构造器，可以让人不能实例化这个类
	private UtilityClass(){
		throw new AssertionError();
	}
	public static void main(String[] args) {
		UtilityClass uc = new UtilityClass();
		System.out.println(uc);
	}
}
