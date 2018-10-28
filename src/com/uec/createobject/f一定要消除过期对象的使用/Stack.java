package com.uec.createobject.f一定要消除过期对象的使用;
/*
 * java 内存泄漏主要3个原因：
 * 1、对象的引用
 * 2、来源是缓存；就像redis做session共享
 * 3、监听器和其它回调
 */
import java.util.Arrays;
import java.util.EmptyStackException;
/*
 * 这个程序maybe会发生内存溢出：
 * 原因：一个栈先是增长，再收缩，那么，从栈中弹出来的对象将不会被当做垃圾回收；
 * 即使使用栈的程序不再引用这些对象，他们也不会被GC回收；
 * 这是因为,栈内部维护着对这些对象的过期引用。
 * 所谓过期引用，是指永远不会被解除的引用。
 */
public class Stack {
	/*
	 * 支持垃圾回收的java语言，内存泄漏是很隐蔽的（称这类内存泄漏为“无意识的对象保留”）
	 * 这类程序的解决办法：（很简单），只要一个单元被弹出栈，指向它的引用就过期了。
	 * 在程序33行处，加入“elements[size] = null;”就可以清空对象的引用。
	 */
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITAL_CAPACITY = 16;
	public Stack(){
		elements = new Object[DEFAULT_INITAL_CAPACITY];
	}
	public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	}
	public Object pop(){
		if(size == 0){
			throw new EmptyStackException();
		}
		
//		elements[size] = null;
		return elements[--size];
	}
	private void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, 2*size+1);
		}
	}
}
