package page4.cn.uec.ʹ��ͳ�Ա�ķ���Ȩ����С��;

import java.io.ObjectStreamConstants;

public class ConstantsTest implements Constants{
	public static void main(String[] args) {
//		String str = Constants.CHANG_LIANG;
		String str = CHANG_LIANG;
		System.out.println(str);
	}
}
class ConstantsTest2{
	public static void main(String[] args) {
		String str2 = Constants.CHANG_LIANG;
		System.out.println(str2);
		byte str3 = ObjectStreamConstants.SC_BLOCK_DATA;
	}
}