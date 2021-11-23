package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblsanphamyeuthich")
@Entity
public class Sanphamyeuthich {
	@Id
	@Column
	private int idkh;
	@Column
	private int idsp;
	
	public int getIdkh() {
		return idkh;
	}
	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	
	
}
