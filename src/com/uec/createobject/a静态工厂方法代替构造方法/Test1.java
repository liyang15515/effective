package com.uec.createobject.a静态工厂方法代替构造方法;

public class Test1 {
	
	public static void main(String[] args) {
		Provider p = new Provider() {
			
			@Override
			public Service newService() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Services.registerDefaultProvider(p);
		Service s = Services.newInstance();
		System.out.println(s);
	}
}
