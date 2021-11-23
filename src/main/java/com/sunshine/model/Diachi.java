package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbldiachi")
@Entity
public class Diachi {
	@Id
	@Column
	private int iddc;
	@Column
	private int idpx;
	@Column
	private int idkh;
	@Column
	private String diachi;
	
	public int getIddc() {
		return iddc;
	}
	public void setIddc(int iddc) {
		this.iddc = iddc;
	}
	public int getIdpx() {
		return idpx;
	}
	public void setIdpx(int idpx) {
		this.idpx = idpx;
	}
	public int getIdkh() {
		return idkh;
	}
	public void setIdkh(int idkh) {
		this.idkh = idkh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
}
