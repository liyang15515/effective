package effective.code.unit6.test1;
/*
 * ���е�ö�ٶ��̳���java.lang.Enum�ࡣ
 * ����Java ��֧�ֶ�̳У�����ö�ٶ������ټ̳������ࡣ 
 */
public enum Color3 implements Behaviour{
	RED("��ɫ",1), GREEN("��ɫ", 2), BLANK("��ɫ", 3), YELLOW("��ɫ", 4);  
    // ��Ա����  
    private String name;  
    private int index;  
    // ���췽��  
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
