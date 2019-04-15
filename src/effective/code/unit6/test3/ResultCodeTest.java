package effective.code.unit6.test3;

public class ResultCodeTest {
public static void main(String[] args) {
	
	System.out.println(ResultCode.NOT_FIND);
	System.out.println(ResultCode.NOT_FIND.operation());
	System.out.println(ResultCode.NOT_FIND.ordinal());
	System.out.println(ResultCode.NOT_FIND.getCode());
	System.out.println(ResultCode.NOT_FIND.getMode());
	System.out.println(ResultCode.NOT_FIND.name());
}
}
