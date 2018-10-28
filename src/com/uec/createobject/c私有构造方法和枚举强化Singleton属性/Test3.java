package com.uec.createobject.c私有构造方法和枚举强化Singleton属性;
/*
 * 这种方式绝对可以防止多次实例化，抵御反射攻击；
 * 单元素的枚举类型已经成为实现singleton的最佳方法
 */
public class Test3 {
public static void main(String[] args) {
	Resource rs = Elivis3.INSTANCE.getInstance();
	Resource rs2 = Elivis3.INSTANCE.getInstance();
	Resource rs3 = Elivis3.INSTANCE.getInstance();
	System.out.println(rs2);
	System.out.println(rs);
	System.out.println(rs3);
}
}
/*
 * 
 * 
 */
