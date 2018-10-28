package com.uec.createobject.a静态工厂方法代替构造方法;

public class Test5 {
public static void main(String[] args) {
    // 创建一个测试数据
    User tester = User.newTestInstance();
    // use tester
    System.out.println(tester);
}
static class User{
    String name ;
    int age ;
    String description;
    public static User newTestInstance() {
        User tester = new User();
        tester.setName("隔壁老张");
        tester.setAge(16);
        tester.setDescription("我住隔壁我姓张！");
        return tester;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
}
}
