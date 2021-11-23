package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblthongbao")
@Entity
public class Thongbao {
	@Id
	@Column
	private int idtb;
	@Column
	private int idkh;
	@Column
	private String noidung;
	public int getIdtb() {
		return idtb;
	}
	public void setIdtb(int idtb) {
		this.idtb = idtb;
	}
	public int getIdkh() {
		return idkh;
	}
	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	
	
}
