package effective.code.unit6.test3;

public class ConstantsTest {
    public static void main(String[] args) {
        String key = Constants.ServiceStatus.NORMAL.getName();
        int value = Constants.ServiceStatus.NORMAL.getValue();
        System.out.println(key+":"+ value);
        System.out.println(Constants.ServiceStatus.NORMAL);
        
    }
}
