package com.uec.createobject.a静态工厂方法代替构造方法;

public class Test4 {
public static void main(String[] args) {
	
}
}
class Child{
    int age = 10;
    int weight = 30;
    public static Child newChild(int age, int weight) {
        Child child = new Child();
        child.weight = weight;
        child.age = age;
        return child;
    }
    public static Child newChildWithWeight(int weight) {
        Child child = new Child();
        child.weight = weight;
        return child;
    }
    public static Child newChildWithAge(int age) {
        Child child = new Child();
        child.age = age;
        return child;
    }
}
