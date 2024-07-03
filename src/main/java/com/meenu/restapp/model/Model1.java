package com.meenu.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Owner_tbl")
public class Model1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Door-No")
	private int dno;
	@Column(name="Street Name")
	private String sname;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private long pincode;
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private Customer customer;
	public Model1() {
		super();
		
	}
	public Model1(int id, String name, int dno, String sname, String city, long pincode, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.dno = dno;
		this.sname = sname;
		this.city = city;
		this.pincode = pincode;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Model1 [id=" + id + ", name=" + name + ", dno=" + dno + ", sname=" + sname + ", city=" + city
				+ ", pincode=" + pincode + ", customer=" + customer + "]";
	}
	
	
	
	
	

}
