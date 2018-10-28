package com.uec.createobject.builder构建器者模式;

import 	com.uec.createobject.builder构建器者模式.NutrilonFacts.Builder;;
public class Test1 {
public static void main(String[] args) {
	Builder bb = new Builder(0, 0);
	NutrilonFacts nf = bb.setCalories(1).setCarbohydrate(2).setFat(3).setSodium(4).build();
	System.out.println(nf instanceof NutrilonFacts);
	
	
	
}
}
