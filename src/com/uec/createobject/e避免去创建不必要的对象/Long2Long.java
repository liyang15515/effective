package com.uec.createobject.e避免去创建不必要的对象;

public class Long2Long {
public static void main(String[] args) {
	System.out.println("start========="+System.currentTimeMillis());
	/*
	 * 变量sum被声明成Long而不是long，意味着程序大约制造2的31次方的Long的实例
	 * sum声明用Long，大约要7.6秒才可以得到计算结果
	 * sum声明用long，大约要700毫秒
	 */
//	long sum = 0L;
	Long sum = 0L;
	for(long i = 0;i < Integer.MAX_VALUE;i++){
		sum += i;
	}
	/*
	 * 优先使用基本类型而不是装箱基本类型，当心无意识的自动装箱
	 * 
	 */
	System.out.println(sum);
	System.out.println("end========="+System.currentTimeMillis());
}
}
