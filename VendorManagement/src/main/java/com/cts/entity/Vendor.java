package com.cts.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vendorId;
	private String name;
	private String phone;
	private String emailId;
	private String address;
	
	public Vendor() {
	}
	public Vendor(long vendorId, String name, String phone, String emailId, String address) {
		super();
		this.vendorId = vendorId;
		this.name = name;
		this.phone = phone;
		this.emailId = emailId;
		this.address = address;
	}
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
