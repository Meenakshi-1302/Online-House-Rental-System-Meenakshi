package com.meenu.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_tbl")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(name="Customer Name")
	private String cname;
	@Column(name="Mobile Number")
	private long mobile;
	public Customer() {
		super();
		
	}
	public Customer(int cid, String cname, long mobile) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobile = mobile;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobile=" + mobile + "]";
	}
	

}
