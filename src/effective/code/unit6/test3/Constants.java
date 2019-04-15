package effective.code.unit6.test3;
import java.util.*;
/*
 * �ӿ��ﶨ�徲̬�ڲ���ô���
 * 		�Բ�ͬ���ܵĳ������з��࣬�������Ƚ���ȷ������������interface����߲��ܶ���static��̬����飬����û�취���ೣ�����������峣��״̬�룬
 * 		����map��Ŷ�Ӧ��˵����Ϣ��ֻ��ͨ��ע�͸�������Ա�õ�ʱ�򿴡�
 *
 *������������������ȫ��������һ�����������������̬��ö�٣�
 *		ö���ඨ�����������Ĺ�������һ���൱��key��һ����value������Ҳ��final���͵ģ�ÿ��ö�ٶ�Ӧʵ������һ��״̬�����á�
 * 
 */
public class Constants {
	public static enum Dict{
        PROSTA("PROSTA","��Ʒ״̬"),
        COUNTRY("COUNTRY","����"),       
        YWLX("YWLX","ҵ������"),
        INDUSTRYCOMPANYTYPE("IndustryCompanyType","��˾����"),
        JSFS("JSFS","���㷽ʽ"),
        COMMISSIONTYPE("COMMISSIONTYPE","��Ӷ����"),
        BALUNITTYPE("BALUNITTYPE","���㵥λ����"),
        ORDERSTATS("OrderStats","����״̬"),
        BACKORDERSTATUS("BackOrderStatus","�˵����״̬"),
        BUSINESSPAYMENT("BusinessPayment","ҵ�����"),
        ENABLESTATE("enableState","���ý���"),
        APPROVESTATE("approveState","����״̬"),
//        ����ϵͳ��������Ʒϵͳ��xml
        PRODUCTCONTENTTYPE("productContentType","��Ʒ���ݷ���"),
        IDENTITY("identity","��Ӧ��Ⱥ"),
        AREA("area","����"),
        VISATYPE("visatype","ǩ֤����"),
        SERVICETYPE("serviceType","��֤��֤��Ʒ���ݷ���"),
        PRODUCTTYPEQUALITY("productTypeQuality","��֤��֤��Ʒ����"),
        EXPRESSTYPE("expresstype","��֤��֤�Ӽ�����"),
        IDETIFICATIONTYPE("identificationType","��֤���"),
        QYKHLX("QYKHLX","�ͻ�����"),
        ZILIAONAME("ziliaoName","��������"),
        YESORNO("yesOrNo","�Ƿ�");              
        private Dict(String value,String name){
            this.value=value;
            this.name=name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
	/**
     * ����״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum OrderStats{
        
        DELETE(0,"ɾ��"),RESERVE(1,"����Ԥ��"),CONFIRM(2,"����ȷ��"),COMPLETE(3,"�������"),CLOSE(4,"�����ر�");
        
        private OrderStats(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
        
    }
    /**
     * �Ա�
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum sex{
        
        MAN("1","��"),FEMAN("2","Ů");
        
        private sex(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
        
    }
    /**
     * �˵����״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum BackOrderStatus{
        WAIT(1,"�����"),AUDIT(2,"�����"),PASS(3,"���ͨ��"),NOTPASS(4,"��˲�ͨ��");
        private BackOrderStatus(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ���㷽ʽ
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum jiesuan{
        XIANJIE("1","�ֽ�"),YUEJIE("2","�½�");
        private jiesuan(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ҵ�����
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum BusinessPayment{
        VISA("FUND18","ǩ֤��"),PREMIUMS("FUND07","����"),DEPOSIT("FUND10","Ѻ��"),CANCELLING("FUND12","ȡ����"),FUND20("FUND20","�������"),FUND14("FUND14","��֤��"),FUND09("FUND09","�ſ�");
        private BusinessPayment(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ͨ�õ����ý���״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum EnableState{
        DISABLE(0,"����"),ENABLE(1,"����");
        private EnableState(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ͨ�õ�����״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum ApproveState{
        REJECT(0,"��ͨ��"),PASS(1,"ͨ��");
        private ApproveState(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ͨ�õ��Ƿ�
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum YesOrNo{
        NO(0,"��"),YES(1,"��");
        private YesOrNo(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ҵ��״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-18
     */
    public static enum ServiceStatus{
        NORMAL(1,"��������"),CHANGEING(2,"Ӧ�ձ����"),BACKING(3,"�˵���"),BACK(4,"�˵�");
        private ServiceStatus(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     *  ֧��״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum PayStatus{
        NOTPAY("01","δ֧��"),PARTPAY("02","����֧��"),FINISHPAY("03","֧�����");
        private PayStatus(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    public static enum DeleteStatus{
        NORMAL(1,"����"),DELETE(0,"ɾ��");
        private DeleteStatus(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     *  ��������,��Ҫ���ж϶����Ǵ��ĸ�ϵͳ���͹����ģ�
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum OrderType{
        SALE("DDLY010301","ERP"),DISTRIBUTION("DDLY0104","����ƽ̨");
        private OrderType(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    public static enum CommonFieldEnum {
        DBID("dbid",UUID.randomUUID().toString().replace("-", "")), //����
        CREATEPERSONNAME("createpersonname","username"),//����������
        CREATEPERSONCODE("createpersoncode","usercode"),//����������
        CREATEUSTIME("createtime",new Date()),//����ʱ��
        UPDATEPERSONNAME("updatepersonname","username"),//����������
        UPDATEPERSONCODE("updatepersoncode","usercode"),//����������
        UPDATETIME("updatetime",new Date()),//����ʱ��
        ACTIONPERSONNAME("actionpersonname","username"),//����������
        ACTIONPERSONCODE("actionpersoncode","usercode"),//������code
        ACTIONTIME("actiontime",new Date()),//����ʱ��
        ;
        private CommonFieldEnum(String value, Object type) {
            this.value = value;
            this.type = type;
        }

        private final String value;
        private final Object type;
        
        public String getValue() {
            return value;
        }
        public Object getType() {
            return type;
        }
    }

    /**
     *  ҵ������
     * <p>Company:rayootech</p>
     * @author xudf
     * @date 2016-6-17
     */
    public static enum BusinessType{
        NOTARY("YWLX09","ǩ֤-��֤��֤"),VISA("YWLX10","ǩ֤-����ǩ֤"),NOTVISA("YWLX16","ǩ֤����"),INSURANCE("YWLX11","����-���챣��");
        private BusinessType(String value,String name){
            this.value = value;
            this.name = name;
        }
        private final String value;
        private final String name;
        
        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
    /**
     * ����״̬
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum LockStatus{
        NORMAL(0,"����"),RECEIVCHANGE(1,"Ӧ�ձ��������"),SEALED(2,"���˷���������"),BACK(3,"�˵���������");
        private LockStatus(Integer value,String name){
            this.value = value;
            this.name = name;
        }
        private final Integer value;
        private final String name;
        
        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }
}
