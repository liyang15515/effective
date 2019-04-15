package effective.code.unit6.test3;

public class SizeTest {

	public static void main(String[] args) {
		//1:toString()方法返回常量的名 
		System.out.println(Size.SMALL);
        System.out.println(Size.SMALL.toString());//SMALL
        
        //2:valueOf()
        System.out.println(Size.valueOf("LARGE"));
        
        //3:values:返回每个常量名
        //SMALL MEDIUM LARGE EXTRA_LARGE
        Size[] sizes = Size.values();
        for (Size size : sizes) {
            System.out.println(size);
        }
        
        //4:ordinal 返回常量的位置，从0开始
        System.out.println(Size.LARGE.ordinal());
        
        int i = Size.EXTRA_LARGE.compareTo(Size.EXTRA_LARGE);
        System.out.println(i);

        System.out.println(Size.LARGE.getSuoxie());
    }
	
}
