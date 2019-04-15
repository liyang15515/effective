package effective.code.unit6.test1;

public enum Color1 {
	/*
	 * ��������Զ����Լ��ķ�������ô������enumʵ�����е�������һ���ֺ�";"��
	 * ���� Java Ҫ������ȶ��� enum ʵ���� 
	 */
	RED(1,"��ɫ"),GREEN(2,"��ɫ"),BLANK(3,"��ɫ"),YELLOW(4,"��ɫ");
	// ö����__��Ա���� 
    private String name;  
    private int index;
 // ö����__������===>������˽�е�private������
    private Color1(int index,String name){
    	this.name = name;
    	this.index = index;
    }
    
    public String getName() {  
        return name;  
    }
//ö����ų�����û�б�Ҫ�ṩset����
//    public void setName(String name) {  
//        this.name = name;  
//    }  
    public int getIndex() {  
        return index;  
    }  
//    public void setIndex(int index) {  
//        this.index = index;  
//    }  

    // ��ͨ����  
    public static String getIndex(int index) {  
        for (Color1 c : Color1.values()) {  
            if (c.getIndex() == index) {  
                return c.name;  
            }  
        }  
        return null;  
    } 
}
