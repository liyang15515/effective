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
//		System.out.println(set+"--ɾ��ǰ--"+list);
		for(int i = 0;i < 3;i++){
			System.out.println("============��"+i+"��ѭ����ʼ=================");
			System.out.println(set+"--set��"+i+"�� ɾ��ǰ");
			set.remove(i);
			System.out.println(set+"--set��"+i+"�� ɾ����");
			System.out.println("============================");
			System.out.println(list+"--list��"+i+"�� ɾ��ǰ");
			list.remove(i);
			System.out.println(list+"--list��"+i+"�� ɾ����");
//			System.out.println("============��"+i+"��ѭ������=================");
			
		}
//		System.out.println("============================");
//		System.out.println(set+"--ɾ����--"+list);
	}
}
