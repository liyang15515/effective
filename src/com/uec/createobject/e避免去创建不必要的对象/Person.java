package com.uec.createobject.e避免去创建不必要的对象;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
	public static void main(String[] args) {
		/*
		 * new String("stringette")如果哦用在循环中，会创建出成千上万的String对象！
		 */
		String  s = new String("stringette");//Do not do this！！！
		
		// 改进后版本
		String ss = "stringette";
		System.out.println(new Person().isBabyBoomer());
	}

	
	
	private final Date birthDate = new Date();
	/*
	 * 每次isBabyBoomer()被调用的时候，都会新建一个Calendar、一个TimeZone、两个Date实例，这是不必要的
	 * 因为Calendar实例的创建代价特别昂贵！！！
	 */
	public boolean isBabyBoomer(){
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	
}
