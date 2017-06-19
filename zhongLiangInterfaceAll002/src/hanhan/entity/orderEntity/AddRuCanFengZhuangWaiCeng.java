package hanhan.entity.orderEntity;

public class AddRuCanFengZhuangWaiCeng {//外层那些参数封装
	private String tid;
	/*string
	必选
	外部订单号*/
	
	private String trade_type;
	/*string
	可选
	fixed或空：已付款订单  presale：预售订单*/
	private String created;
	/*date
	必选
	交易创建时间*/
	private String end_time;
	/*date
	可选
	交易结束时间*/
	private String buyer_nick;
	/*string
	必选
	买家昵称*/
	private int num;
	/*string
	可选
	订单商品数量*/
	private String buyer_message;
	/*string
	可选
	买家留言*/
	private String shipping_type;
	/*string
	可选
	创建交易时的物流方式*/
	private double payment;
	/*number
	必选
	实付金额*/
	private double discount_fee;
	/*number
	必选
	系统优惠金额（默认0）*/
	private double adjust_fee;
	/*number
	必选
	卖家手工调整金额（默认0）*/
	private String status;
	/*string
	可选
	交易状态（已付款，等待发货等）*/
	private String pay_time;
	/*date
	可选
	付款时间*/
	private String modified;
	/*date
	可选
	交易修改时间*/
	private double point_fee;
	/*number
	可选
	买家使用积分金额*/
	private double total_fee;
	/*number
	必选
	商品金额（商品价格乘以数量的总金额）*/
	private double post_fee;
	/*number
	必选
	邮费（包邮为0）*/
	private String receiver_name;
	/*string
	必选
	收货人的姓名*/
	private String receiver_state;
	/*string
	必选
	收货人的所在省份*/
	private String receiver_city;
	/*string
	必选
	收货人的所在城市*/
	private String receiver_district;
	/*string
	必选
	收货人的所在地区*/
	private String receiver_address;
	/*string
	必选
	收货人的详细地址*/
	private String receiver_zip;
	/*string
	可选
	收货人的邮编*/
	private String receiver_mobile;
	/*string
	必选
	收货人的手机号码*/
	private String receiver_phone;
	/*string
	可选
	收货人的电话号码*/
	private String consign_time;
	/*date
	可选
	卖家发货时间*/
	private String buyer_email;
	/*string
	可选
	买家邮件地址*/
	private double commission_fee;
	/*number
	可选
	交易佣金*/
	private double has_post_fee;
	/*number
	可选
	是否包含邮费（true/false）*/
	private double cod_fee;
	/*number
	可选
	货到付款服务费*/
	private String cod_status;
	/*string
	可选
	货到付款物流状态*/
	private String promotion;
	/*string
	可选
	交易促销详细信息*/
	private String invoice_name;
	/*string
	可选
	发票抬头（开发票为必填）*/
	private double express_agency_fee;
	/*number
	可选
	快递代收款*/
	private int isverifyinventory;
	 /* number
	   可选
	是否验证库存(1验证，0不验证)*/
	private String DM_roadNum;
	/*  string
	   可选
	多点道口号*/
	private String DM_storeroomName;
	/*  string
	   可选
	多点仓库名*/
	private String DM_tid2;
	  /*string
	   可选
	多点三方单号*/
	private String DM_produceStoreId;
	 /* string
	   可选
	多点门店ID*/
	private String DM_produceStoreName;
	 /* string
	   可选
	多点门店名称*/
	private String DM_shipmentType;
	 /* string
	   可选
	送货方式*/
	private String DM_roadAreaName;
	  /*string
	   可选
	路区*/
	private String DM_specialLabel;
	 /* string
	   可选
	多点订单属性
	订单明细*/
//	tradeorder
	/*名称
	类型
	可选/必选
	备注*/
	
	public AddRuCanFengZhuangWaiCeng() {

	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getBuyer_nick() {
		return buyer_nick;
	}

	public void setBuyer_nick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getBuyer_message() {
		return buyer_message;
	}

	public void setBuyer_message(String buyer_message) {
		this.buyer_message = buyer_message;
	}

	public String getShipping_type() {
		return shipping_type;
	}

	public void setShipping_type(String shipping_type) {
		this.shipping_type = shipping_type;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getDiscount_fee() {
		return discount_fee;
	}

	public void setDiscount_fee(double discount_fee) {
		this.discount_fee = discount_fee;
	}

	public double getAdjust_fee() {
		return adjust_fee;
	}

	public void setAdjust_fee(double adjust_fee) {
		this.adjust_fee = adjust_fee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPay_time() {
		return pay_time;
	}

	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public double getPoint_fee() {
		return point_fee;
	}

	public void setPoint_fee(double point_fee) {
		this.point_fee = point_fee;
	}

	public double getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(double total_fee) {
		this.total_fee = total_fee;
	}

	public double getPost_fee() {
		return post_fee;
	}

	public void setPost_fee(double post_fee) {
		this.post_fee = post_fee;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_state(String receiver_state) {
		this.receiver_state = receiver_state;
	}

	public String getReceiver_city() {
		return receiver_city;
	}

	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}

	public String getReceiver_district() {
		return receiver_district;
	}

	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getReceiver_zip() {
		return receiver_zip;
	}

	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	public String getReceiver_phone() {
		return receiver_phone;
	}

	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}

	public String getConsign_time() {
		return consign_time;
	}

	public void setConsign_time(String consign_time) {
		this.consign_time = consign_time;
	}

	public String getBuyer_email() {
		return buyer_email;
	}

	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public double getCommission_fee() {
		return commission_fee;
	}

	public void setCommission_fee(double commission_fee) {
		this.commission_fee = commission_fee;
	}

	public double getHas_post_fee() {
		return has_post_fee;
	}

	public void setHas_post_fee(double has_post_fee) {
		this.has_post_fee = has_post_fee;
	}

	public double getCod_fee() {
		return cod_fee;
	}

	public void setCod_fee(double cod_fee) {
		this.cod_fee = cod_fee;
	}

	public String getCod_status() {
		return cod_status;
	}

	public void setCod_status(String cod_status) {
		this.cod_status = cod_status;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getInvoice_name() {
		return invoice_name;
	}

	public void setInvoice_name(String invoice_name) {
		this.invoice_name = invoice_name;
	}

	public double getExpress_agency_fee() {
		return express_agency_fee;
	}

	public void setExpress_agency_fee(double express_agency_fee) {
		this.express_agency_fee = express_agency_fee;
	}

	public int getIsverifyinventory() {
		return isverifyinventory;
	}

	public void setIsverifyinventory(int isverifyinventory) {
		this.isverifyinventory = isverifyinventory;
	}

	public String getDM_roadNum() {
		return DM_roadNum;
	}

	public void setDM_roadNum(String dM_roadNum) {
		DM_roadNum = dM_roadNum;
	}

	public String getDM_storeroomName() {
		return DM_storeroomName;
	}

	public void setDM_storeroomName(String dM_storeroomName) {
		DM_storeroomName = dM_storeroomName;
	}

	public String getDM_tid2() {
		return DM_tid2;
	}

	public void setDM_tid2(String dM_tid2) {
		DM_tid2 = dM_tid2;
	}

	public String getDM_produceStoreId() {
		return DM_produceStoreId;
	}

	public void setDM_produceStoreId(String dM_produceStoreId) {
		DM_produceStoreId = dM_produceStoreId;
	}

	public String getDM_produceStoreName() {
		return DM_produceStoreName;
	}

	public void setDM_produceStoreName(String dM_produceStoreName) {
		DM_produceStoreName = dM_produceStoreName;
	}

	public String getDM_shipmentType() {
		return DM_shipmentType;
	}

	public void setDM_shipmentType(String dM_shipmentType) {
		DM_shipmentType = dM_shipmentType;
	}

	public String getDM_roadAreaName() {
		return DM_roadAreaName;
	}

	public void setDM_roadAreaName(String dM_roadAreaName) {
		DM_roadAreaName = dM_roadAreaName;
	}

	public String getDM_specialLabel() {
		return DM_specialLabel;
	}

	public void setDM_specialLabel(String dM_specialLabel) {
		DM_specialLabel = dM_specialLabel;
	}

	@Override
	public String toString() {
		return "AddRuCanFengZhuang [tid=" + tid + ", trade_type=" + trade_type + ", created=" + created + ", end_time="
				+ end_time + ", buyer_nick=" + buyer_nick + ", num=" + num + ", buyer_message=" + buyer_message
				+ ", shipping_type=" + shipping_type + ", payment=" + payment + ", discount_fee=" + discount_fee
				+ ", adjust_fee=" + adjust_fee + ", status=" + status + ", pay_time=" + pay_time + ", modified="
				+ modified + ", point_fee=" + point_fee + ", total_fee=" + total_fee + ", post_fee=" + post_fee
				+ ", receiver_name=" + receiver_name + ", receiver_state=" + receiver_state + ", receiver_city="
				+ receiver_city + ", receiver_district=" + receiver_district + ", receiver_address=" + receiver_address
				+ ", receiver_zip=" + receiver_zip + ", receiver_mobile=" + receiver_mobile + ", receiver_phone="
				+ receiver_phone + ", consign_time=" + consign_time + ", buyer_email=" + buyer_email
				+ ", commission_fee=" + commission_fee + ", has_post_fee=" + has_post_fee + ", cod_fee=" + cod_fee
				+ ", cod_status=" + cod_status + ", promotion=" + promotion + ", invoice_name=" + invoice_name
				+ ", express_agency_fee=" + express_agency_fee + ", isverifyinventory=" + isverifyinventory
				+ ", DM_roadNum=" + DM_roadNum + ", DM_storeroomName=" + DM_storeroomName + ", DM_tid2=" + DM_tid2
				+ ", DM_produceStoreId=" + DM_produceStoreId + ", DM_produceStoreName=" + DM_produceStoreName
				+ ", DM_shipmentType=" + DM_shipmentType + ", DM_roadAreaName=" + DM_roadAreaName + ", DM_specialLabel="
				+ DM_specialLabel + "]";
	}
	

}
