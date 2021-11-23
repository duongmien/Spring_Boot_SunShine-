package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblsanpham")
@Entity
public class Sanpham {
	@Id
	@Column
	private int idsp;
	@Column
	private int iddm;
	@Column
	private String tensanpham;
	@Column
	private String motasanpham;
	@Column
	private String anhsanpham;
	@Column
	private String giasanpham;
	@Column
	private String kcal;
	@Column
	private String thoigianchebien;
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	public int getIddm() {
		return iddm;
	}
	public void setIddm(int iddm) {
		this.iddm = iddm;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getMotasanpham() {
		return motasanpham;
	}
	public void setMotasanpham(String motasanpham) {
		this.motasanpham = motasanpham;
	}
	
	
	public String getAnhsanpham() {
		return anhsanpham;
	}
	public void setAnhsanpham(String anhsanpham) {
		this.anhsanpham = anhsanpham;
	}
	public String getGiasanpham() {
		return giasanpham;
	}
	public void setGiasanpham(String giasanpham) {
		this.giasanpham = giasanpham;
	}
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	public String getThoigianchebien() {
		return thoigianchebien;
	}
	public void setThoigianchebien(String thoigianchebien) {
		this.thoigianchebien = thoigianchebien;
	}
	
}
