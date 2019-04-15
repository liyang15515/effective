package effective.code.unit5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = -3;i < 3;i++){
			set.add(i);
			list.add(i);
		}
//		System.out.println(set+"--删除前--"+list);
		for(int i = 0;i < 3;i++){
			System.out.println("============第"+i+"轮循环开始=================");
			System.out.println(set+"--set第"+i+"次 删除前");
			set.remove(i);
			System.out.println(set+"--set第"+i+"次 删除后");
			System.out.println("============================");
			System.out.println(list+"--list第"+i+"次 删除前");
			list.remove(i);
			System.out.println(list+"--list第"+i+"次 删除后");
//			System.out.println("============第"+i+"轮循环结束=================");
			
		}
//		System.out.println("============================");
//		System.out.println(set+"--删除后--"+list);
	}
}
