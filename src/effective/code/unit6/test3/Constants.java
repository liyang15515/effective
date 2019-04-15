package effective.code.unit6.test3;
import java.util.*;
/*
 * 接口里定义静态内部类好处：
 * 		对不同功能的常量进行分类，用起来比较明确，但是由于是interface，里边不能定义static静态代码块，所以没办法像类常量那样即定义常量状态码，
 * 		又在map里放对应的说明信息，只能通过注释给开发人员用的时候看。
 *
 *申哥的这种做法算是两全其美，在一个常量类里，定义多个静态的枚举，
 *		枚举类定义两个参数的构造器，一个相当于key，一个是value，属性也是final类型的，每个枚举对应实体对象的一种状态，甚好。
 * 
 */
public class Constants {
	public static enum Dict{
        PROSTA("PROSTA","产品状态"),
        COUNTRY("COUNTRY","国家"),       
        YWLX("YWLX","业务类型"),
        INDUSTRYCOMPANYTYPE("IndustryCompanyType","公司类型"),
        JSFS("JSFS","结算方式"),
        COMMISSIONTYPE("COMMISSIONTYPE","返佣类型"),
        BALUNITTYPE("BALUNITTYPE","结算单位类型"),
        ORDERSTATS("OrderStats","订单状态"),
        BACKORDERSTATUS("BackOrderStatus","退单审核状态"),
        BUSINESSPAYMENT("BusinessPayment","业务款项"),
        ENABLESTATE("enableState","启用禁用"),
        APPROVESTATE("approveState","审批状态"),
//        分销系统所需是商品系统的xml
        PRODUCTCONTENTTYPE("productContentType","商品内容分类"),
        IDENTITY("identity","适应人群"),
        AREA("area","领区"),
        VISATYPE("visatype","签证类型"),
        SERVICETYPE("serviceType","公证认证商品内容分类"),
        PRODUCTTYPEQUALITY("productTypeQuality","公证认证商品性质"),
        EXPRESSTYPE("expresstype","公证认证加急种类"),
        IDETIFICATIONTYPE("identificationType","认证类别"),
        QYKHLX("QYKHLX","客户类型"),
        ZILIAONAME("ziliaoName","资料名称"),
        YESORNO("yesOrNo","是否");              
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
     * 订单状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum OrderStats{
        
        DELETE(0,"删除"),RESERVE(1,"订单预定"),CONFIRM(2,"订单确认"),COMPLETE(3,"订单完成"),CLOSE(4,"订单关闭");
        
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
     * 性别
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum sex{
        
        MAN("1","男"),FEMAN("2","女");
        
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
     * 退单审核状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum BackOrderStatus{
        WAIT(1,"待审核"),AUDIT(2,"审核中"),PASS(3,"审核通过"),NOTPASS(4,"审核不通过");
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
     * 结算方式
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum jiesuan{
        XIANJIE("1","现结"),YUEJIE("2","月结");
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
     * 业务款项
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum BusinessPayment{
        VISA("FUND18","签证费"),PREMIUMS("FUND07","保险"),DEPOSIT("FUND10","押金"),CANCELLING("FUND12","取消金"),FUND20("FUND20","单项服务"),FUND14("FUND14","认证费"),FUND09("FUND09","团款");
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
     * 通用的启用禁用状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum EnableState{
        DISABLE(0,"禁用"),ENABLE(1,"启用");
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
     * 通用的审批状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum ApproveState{
        REJECT(0,"不通过"),PASS(1,"通过");
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
     * 通用的是否
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-14
     */
    public static enum YesOrNo{
        NO(0,"否"),YES(1,"是");
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
     * 业务状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-18
     */
    public static enum ServiceStatus{
        NORMAL(1,"正常办理"),CHANGEING(2,"应收变更中"),BACKING(3,"退单中"),BACK(4,"退单");
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
     *  支付状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum PayStatus{
        NOTPAY("01","未支付"),PARTPAY("02","部分支付"),FINISHPAY("03","支付完成");
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
        NORMAL(1,"正常"),DELETE(0,"删除");
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
     *  订单类型,主要是判断订单是从哪个系统推送过来的，
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum OrderType{
        SALE("DDLY010301","ERP"),DISTRIBUTION("DDLY0104","分销平台");
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
        DBID("dbid",UUID.randomUUID().toString().replace("-", "")), //主键
        CREATEPERSONNAME("createpersonname","username"),//创建人姓名
        CREATEPERSONCODE("createpersoncode","usercode"),//创建人姓名
        CREATEUSTIME("createtime",new Date()),//创建时间
        UPDATEPERSONNAME("updatepersonname","username"),//更新人姓名
        UPDATEPERSONCODE("updatepersoncode","usercode"),//更新人姓名
        UPDATETIME("updatetime",new Date()),//更新时间
        ACTIONPERSONNAME("actionpersonname","username"),//操作人姓名
        ACTIONPERSONCODE("actionpersoncode","usercode"),//操作人code
        ACTIONTIME("actiontime",new Date()),//操作时间
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
     *  业务类型
     * <p>Company:rayootech</p>
     * @author xudf
     * @date 2016-6-17
     */
    public static enum BusinessType{
        NOTARY("YWLX09","签证-公证认证"),VISA("YWLX10","签证-单办签证"),NOTVISA("YWLX16","签证其他"),INSURANCE("YWLX11","保险-单办保险");
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
     * 锁单状态
     * <p>Company:rayootech</p>
     * @author zhangxueshen
     * @date 2016-6-16
     */
    public static enum LockStatus{
        NORMAL(0,"正常"),RECEIVCHANGE(1,"应收变更锁单中"),SEALED(2,"客人封存更锁单中"),BACK(3,"退单更锁单中");
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
