package effective.code.unit6.test1;

public enum Color1 {
	/*
	 * 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号";"。
	 * 而且 Java 要求必须先定义 enum 实例。 
	 */
	RED(1,"红色"),GREEN(2,"绿色"),BLANK(3,"白色"),YELLOW(4,"黄色");
	// 枚举类__成员变量 
    private String name;  
    private int index;
 // 枚举类__构造器===>必须是私有的private构造器
    private Color1(int index,String name){
    	this.name = name;
    	this.index = index;
    }
    
    public String getName() {  
        return name;  
    }
//枚举类放常量，没有必要提供set方法
//    public void setName(String name) {  
//        this.name = name;  
//    }  
    public int getIndex() {  
        return index;  
    }  
//    public void setIndex(int index) {  
//        this.index = index;  
//    }  

    // 普通方法  
    public static String getIndex(int index) {  
        for (Color1 c : Color1.values()) {  
            if (c.getIndex() == index) {  
                return c.name;  
            }  
        }  
        return null;  
    } 
}
