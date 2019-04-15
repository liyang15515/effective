package effective.code.unit6.test1;

public class SignalTest{
	Signal color = Signal.RED;
	public static void main(String[] args) {
		SignalTest a = new SignalTest();
				a.change();
		
	}
	public void change() {  
        switch (color) {  
        case RED:  
            color = Signal.GREEN;
            System.out.println(color);
            break;  
        case YELLOW:  
            color = Signal.RED;  
            System.out.println(color);
            break;  
        case GREEN:  
            color = Signal.YELLOW;  
            System.out.println(color);
            break;  
        }  
    }  

}
