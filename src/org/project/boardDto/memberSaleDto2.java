package org.project.boardDto;

import java.util.Date;

public class memberSaleDto2 {

	private int custNo;
	private String custName;
	private String grade;
	private int price;
	private String pcode;
	private Date sDate;
	public memberSaleDto2(int custNo, String custName, String grade, int price, String pcode, Date sDate) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.grade = grade;
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
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
