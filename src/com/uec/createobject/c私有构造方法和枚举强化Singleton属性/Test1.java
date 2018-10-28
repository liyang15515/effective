package com.uec.createobject.c私有构造方法和枚举强化Singleton属性;

import java.lang.reflect.Constructor;

public class Test1 {
/*
 * 代码这种写法，
 * 通过反射机制，可以调用私有构造器，创建对象；
 * 所以单利这种写法存在bug	
 */
public static void main(String[] args) {
//	Elvis1 e = new Elvis1();
	System.out.println(Elvis1.INSTANCE);
	System.out.println(Elvis1.INSTANCE);
	System.out.println(Elvis1.INSTANCE);
	
	 try
     {
         Class<Elvis1> classType = Elvis1.class;

         Constructor<Elvis1> c = classType.getDeclaredConstructor();
//         Constructor<Elvis1> c = classType.getConstructor();
         c.setAccessible(true);
         
         Elvis1 e2 = Elvis1.INSTANCE;
         Elvis1 e1 = (Elvis1)c.newInstance();
         System.out.println(e1==e2);
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }

}
}
