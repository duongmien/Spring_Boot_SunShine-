package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblthanhpho")
@Entity
public class Thanhpho {
	@Id
	@Column
	private int idtp;
	@Column
	private String tenthanhpho;
	public int getIdtp() {
		return idtp;
	}
	public void setIdtp(int idtp) {
		this.idtp = idtp;
	}
	public String getTenthanhpho() {
		return tenthanhpho;
	}
	public void setTenthanhpho(String tenthanhpho) {
		this.tenthanhpho = tenthanhpho;
	}
	
}
