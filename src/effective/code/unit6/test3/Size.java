package effective.code.unit6.test3;

public enum Size {
	SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");
    
    /**
     * Àı–¥
     */
    private String suoxie;
    
    private Size(String suoxie){
        this.suoxie = suoxie;
    }
    
    public String getSuoxie(){
        return suoxie;
    }
}
