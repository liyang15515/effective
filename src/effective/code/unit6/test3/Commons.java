package effective.code.unit6.test3;

public enum Commons {

	PAGE_SIZE(20);
	private Integer value;
	private Commons(Integer value){
		this.value = value;
	}
	public Integer getValue(){
		return value;
	}
}
