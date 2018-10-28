package com.uec.createobject.c私有构造方法和枚举强化Singleton属性;

public enum Elivis3 {

	INSTANCE;
	private Resource instance;
	Elivis3(){
		instance = new Resource();
	}
    public Resource getInstance() {
        return instance;
    }
	public void leaveTheBuilding(){
		
	}
}
class Resource{
	
}