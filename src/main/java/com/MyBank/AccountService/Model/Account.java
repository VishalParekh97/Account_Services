package com.MyBank.AccountService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	
	@Id
	private int account_id;
	private String account_uuid;
	private int sortcode;
	private int account_number;
	private int product_code;
	private String status;
	private String account_name;
	private int customer_number;
	
	
	public Account() {
	}
	
	public Account(int accoount_id, String account_uuid, int sortcode, int account_number, int product_code, String status,
			String account_name, int customer_number) {
		this.account_id = account_id;
		this.account_uuid = account_uuid;
		this.sortcode = sortcode;
		this.account_number = account_number;
		this.product_code = product_code;
		this.status = status;
		this.account_name = account_name;
		this.customer_number = customer_number;
	}
    @Column(name = "account_id", nullable = false)
	public int getAccount_id() {
		
		return account_id;
	}


	public void setAccoount_id(int accoount_id) {
		this.account_id = accoount_id;
	}
    @Column(name = "account_uuid", nullable = false)
	public String getAccountuuid() {
		return account_uuid;
	}
	public void setAccountuuid(String accountuuid) {
		this.account_uuid = accountuuid;
	}
    @Column(name = "sortcode", nullable = false)
	public int getSortcode() {
		return sortcode;
	}
	public void setSortcode(int sortcode) {
		this.sortcode = sortcode;
	}
	
    @Column(name = "account_number", nullable = false)
	public int getAccountnumber() {
		return account_number;
	}
	public void setAccountnumber(int accountnumber) {
		this.account_number = accountnumber;
	}
	
    @Column(name = "product_code", nullable = false)
	public int getProductcode() {
		return product_code;
	}
	public void setProductcode(int productcode) {
		this.product_code = productcode;
	}
	
    @Column(name = "status", nullable = false)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    @Column(name = "account_name", nullable = false)
	public String getAccountname() {
		return account_name;
	}
	public void setAccountname(String accountname) {
		this.account_name = accountname;
	}
    @Column(name = "customer_number", nullable = false)
	public int getCustomernumber() {
		return customer_number;
	}
	public void setCustomernumber(int customer_number) {
		this.customer_number = customer_number;
	}
	
	@Override
	public String toString() {
		return "Account [accoount_id=" + account_id + ", accountuuid=" + account_uuid + ", sortcode=" + sortcode
				+ ", accountnumber=" + account_number + ", productcode=" + product_code + ", status=" + status
				+ ", accountname=" + account_name + ", customernumber=" + customer_number + "]";
	}
	
}
