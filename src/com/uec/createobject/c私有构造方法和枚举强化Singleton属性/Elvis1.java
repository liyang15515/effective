package com.uec.createobject.c私有构造方法和枚举强化Singleton属性;
/*
 * 代码Elvis2这种写法，
 * 通过反射机制，可以调用私有构造器，创建对象；
 * 所以单利这种写法依然存在bug
 * 解决：如果要解决问题，抵御反射的攻击，可以修改构造器，让它在被要求创建第2个实例的时候，抛出异常	
 */
public class Elvis1 {

	public static final Elvis1 INSTANCE = new Elvis1();
	
/*	private Elvis1(){
		
	}*/

    private static boolean flag = false;
    

	public void leaveTheBuilding(){
		
	}
	
	//解决办法：
	
	private Elvis1(){
	       synchronized(Elvis1.class)
	        {
	            if(flag == false)
	            {
	                flag = !flag;
	            }
	            else
	            {
	                throw new RuntimeException("单例模式被侵犯！");
	            }

	        }
	}
	
}
