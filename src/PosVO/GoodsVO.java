package PosVO;

import javax.swing.ImageIcon;

public class GoodsVO {
	private String goodsCode;
	private String goodsName;
	private String goodsKind;
	private int goodsPrice;
	private int goodsPackageNum;
	private ImageIcon icon;
	public GoodsVO(String goodsCode, String goodsName, String goodsKind, int goodsPrice, int goodsPackageNum) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsKind = goodsKind;
		this.goodsPrice = goodsPrice;
		this.goodsPackageNum = goodsPackageNum;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsKind() {
		return goodsKind;
	}
	public void setGoodsKind(String goodsKind) {
		this.goodsKind = goodsKind;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsPackageNum() {
		return goodsPackageNum;
	}
	public void setGoodsPackageNum(int goodsPackageNum) {
		this.goodsPackageNum = goodsPackageNum;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
}
