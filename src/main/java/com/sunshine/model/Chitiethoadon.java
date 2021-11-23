package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblchitiethoadon")
@Entity
public class Chitiethoadon {
	@Id
	@Column
	private int idhd;
	@Column
	private int idsp;
	@Column
	private int soluong;
	
	public int getIdhd() {
		return idhd;
	}
	public void setIdhd(int idhd) {
		this.idhd = idhd;
	}
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	
}
