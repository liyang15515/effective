package effective.code.unit6.test1;
/*
 * 所有的枚举都继承自java.lang.Enum类。
 * 由于Java 不支持多继承，所以枚举对象不能再继承其他类。 
 */
public enum Color3 implements Behaviour{
	RED("红色",1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);  
    // 成员变量  
    private String name;  
    private int index;  
    // 构造方法  
    private Color3(String name, int index) {  
        this.name = name;  
        this.index = index;  
    }  

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.index+":"+this.name);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.name;  
	}

}
