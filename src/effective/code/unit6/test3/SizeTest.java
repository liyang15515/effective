package effective.code.unit6.test3;

public class SizeTest {

	public static void main(String[] args) {
		//1:toString()�������س������� 
		System.out.println(Size.SMALL);
        System.out.println(Size.SMALL.toString());//SMALL
        
        //2:valueOf()
        System.out.println(Size.valueOf("LARGE"));
        
        //3:values:����ÿ��������
        //SMALL MEDIUM LARGE EXTRA_LARGE
        Size[] sizes = Size.values();
        for (Size size : sizes) {
            System.out.println(size);
        }
        
        //4:ordinal ���س�����λ�ã���0��ʼ
        System.out.println(Size.LARGE.ordinal());
        
        int i = Size.EXTRA_LARGE.compareTo(Size.EXTRA_LARGE);
        System.out.println(i);

        System.out.println(Size.LARGE.getSuoxie());
    }
	
}
