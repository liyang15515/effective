package com.uec.createobject.a静态工厂方法代替构造方法;

public class Test3 {
	public static void main(String[] args) {
		Person p = Person.getInstance();
		Player pl = (Player) Person.getInstance2();
		Cooker c = (Cooker) Person.getInstance3();
	}
}

class Person {

	public static Person getInstance() {
		return new Person();
		// 这里可以改为 return new Player() / Cooker()
	}
	public static Person getInstance2() {
		return new Player();
		// 这里可以改为 return new Player() / Cooker()
	}
	public static Person getInstance3() {
		return new Cooker();
		// 这里可以改为 return new Player() / Cooker()
	}
}

class Player extends Person {

}

class Cooker extends Person {

}
