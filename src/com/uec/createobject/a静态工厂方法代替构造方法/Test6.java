package com.uec.createobject.a静态工厂方法代替构造方法;

public class Test6 {
public static void main(String[] args) {
	
}
}
class Players {
    public static final int TYPE_RUNNER = 1;
    public static final int TYPE_SWIMMER = 2;
    public static final int TYPE_RACER = 3;
    int type;

    /**
     * 
	可以减少对外暴露的属性
	软件开发中有一条很重要的经验：对外暴露的属性越多，调用者就越容易出错。
	所以对于类的提供者，一般来说，应该努力减少对外暴露属性，从而降低调用者出错的机会。
     */
    //私有構造器只能在类的内部访问，外部没有权限访问
    private Players(int type) {
        this.type = type;
    }

    public static Players newRunner() {
        return new Players(TYPE_RUNNER);
    }
    public static Players newSwimmer() {
        return new Players(TYPE_SWIMMER);
    }
    public static Players newRacer() {
        return new Players(TYPE_RACER);
    }
}


