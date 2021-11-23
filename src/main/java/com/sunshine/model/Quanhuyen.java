package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblquanhuyen")
@Entity
public class Quanhuyen {
	@Id
	@Column
	private int idqh;
	@Column
	private int idtp;
	@Column
	private String tenquan;
	public int getIdqh() {
		return idqh;
	}
	public void setIdqh(int idqh) {
		this.idqh = idqh;
	}
	public int getIdtp() {
		return idtp;
	}
	public void setIdtp(int idtp) {
		this.idtp = idtp;
	}
	public String getTenquan() {
		return tenquan;
	}
	public void setTenquan(String tenquan) {
		this.tenquan = tenquan;
	}
	
	
}
