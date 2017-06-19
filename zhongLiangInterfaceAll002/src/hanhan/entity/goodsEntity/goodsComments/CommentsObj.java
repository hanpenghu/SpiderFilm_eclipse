package hanhan.entity.goodsEntity.goodsComments;

public class CommentsObj {
	private String averageScore;
	private String generalRate;
	private String goodRate;
	private String skuId;
	private String poorRate;
	public CommentsObj() {
		// TODO Auto-generated constructor stub
	}
	public CommentsObj(String averageScore, String generalRate, String goodRate, String skuId, String poorRate) {
		super();
		this.averageScore = averageScore;
		this.generalRate = generalRate;
		this.goodRate = goodRate;
		this.skuId = skuId;
		this.poorRate = poorRate;
	}
	public String getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(String averageScore) {
		this.averageScore = averageScore;
	}
	public String getGeneralRate() {
		return generalRate;
	}
	public void setGeneralRate(String generalRate) {
		this.generalRate = generalRate;
	}
	public String getGoodRate() {
		return goodRate;
	}
	public void setGoodRate(String goodRate) {
		this.goodRate = goodRate;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getPoorRate() {
		return poorRate;
	}
	public void setPoorRate(String poorRate) {
		this.poorRate = poorRate;
	}
	@Override
	public String toString() {
		return "CommentsObj [averageScore=" + averageScore + ", generalRate=" + generalRate + ", goodRate=" + goodRate
				+ ", skuId=" + skuId + ", poorRate=" + poorRate + "]";
	}

}
