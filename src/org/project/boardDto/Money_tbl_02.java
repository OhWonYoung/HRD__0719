package org.project.boardDto;

import java.util.Date;

public class Money_tbl_02 {

	private int custNo;
	private int saleNol;
	private int pcost;
	private int amount;
	private int price;
	private String pcode;
	private Date sDate;
	public Money_tbl_02(int custNo, int saleNol, int pcost, int amount, int price, String pcode, Date sDate) {
		super();
		this.custNo = custNo;
		this.saleNol = saleNol;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sDate = sDate;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public int getSaleNol() {
		return saleNol;
	}
	public void setSaleNol(int saleNol) {
		this.saleNol = saleNol;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public Date getsDate() {
		return sDate;
	}
	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}
	
	
}
