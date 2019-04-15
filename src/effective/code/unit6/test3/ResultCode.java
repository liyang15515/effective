package effective.code.unit6.test3;

public enum ResultCode {
	 /**δ�鵽�й����п���Ϣ */
    NOT_FIND(1000,"δ�鵽�й����п���Ϣ !"),
   /** �����ɹ�*/
   SUCCESS(1002,"OPERATION SUCCESS!"),
   /** ����ʧ��*/
   FAIL(-1002,"OPERATION FAIL!"),
   /** ϵͳ�쳣*/
   EXCEPTION(-8888,"��ѽ��ϵͳ��С����!"),

   /**��½ʧ�� */
   LOGIN_FAIL(-1015,"��½ʧ�ܣ������û����������Ƿ���ȷ��"),
   /** δ��½*/
   NO_LOGIN(-1019,"����û�е�½�����¼�����ԣ�"),
   /** ȱ�ٲ���*/
   LOSE_NECESSARY_PARAMETERS(-1020,"ȱ�ٱ�Ҫ���������飡"),
   /** �ֻ��Ÿ�ʽ����ȷ*/
   PHONE_FORMAT_ERROR(-1021,"�ֻ��Ÿ�ʽ����ȷ�����飡"),
   /** �ֻ��ű�ռ��*/
   PHONE_OCCUPY(-1022,"�ֻ�����ע�ᣬ���½��"),
   /** ��֤�벻��ȷ*/
   VERIFICATION_CODE_ERROR(-1023,"��֤�벻��ȷ����ʧЧ��"),
   /** ԭʼ�������*/
   ORIGINAL_PWD_ERROR(-1024,"ԭʼ����������飡"),
   /** ͼƬ��֤�벻��ȷ*/
   IMAGE_CODE_ERROR(-1025,"ͼƬ��֤�벻��ȷ����ʧЧ��");
   private String mode;
   private int code;
   private ResultCode(int code,String mode) {
       this.code=code;
       this.mode = mode;
   }
   /**
   * <p>Title: getMode</p>
   * <p>Description: ��ȡ����</p>
   * @return
   */
   public String getMode() {
       return mode;
   }
//   public void setMode(int code,String mode) {
//       this.code=code;
//       this.mode = mode;
//   }
   /**
   * <p>Title: operation</p>
   * <p>Description: ��ȡ����</p>
   * @return
   */
   public String operation(){
       return this.mode;
   }
   /**
   * <p>Title: getCode</p>
   * <p>Description: ��ȡCODE</p>
   * @return
   */
   public int getCode() {
       return code;
   }
//   public void setCode(int code) {
//       this.code = code;
//   }
   /**
   * <p>Title: getByValue</p>
   * <p>Description: ͨ��CODE��ȡ��ʶ</p>
   * @param code
   * @return
   */
   public static ResultCode getByValue(int code) {  
       for (ResultCode resultcode : values()) {  
           if (resultcode.getCode()==code) {  
               return resultcode;  
           }  
       }  
       return null;  
   }  
}
