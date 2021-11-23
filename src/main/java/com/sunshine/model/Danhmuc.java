package com.sunshine.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "tbldanhmuc")
@Entity
public class Danhmuc {
	@Id
	@Column
	private int iddm;
	@Column
	private String tendm;
	@Column
	private String anhdm;
	public int getIddm() {
		return iddm;
	}
	public void setIddm(int iddm) {
		this.iddm = iddm;
	}
	public String getTendm() {
		return tendm;
	}
	public void setTendm(String tendm) {
		this.tendm = tendm;
	}
	public String getAnhdm() {
		return anhdm;
	}
	public void setAnhdm(String anhdm) {
		this.anhdm = anhdm;
	}
	
}
