package com.vleague.model;

public class SanDau {
	private String maSan;
	private String tenSan;
	private String moTa;
	private int sucChua;
	public SanDau(String maSan, String tenSan, int sucChua) {
		super();
		this.maSan = maSan;
		this.tenSan = tenSan;
		this.sucChua = sucChua;
	}
	public String getMaSan() {
		return maSan;
	}
	public void setMaSan(String maSan) {
		this.maSan = maSan;
	}
	public String getTenSan() {
		return tenSan;
	}
	public void setTenSan(String tenSan) {
		this.tenSan = tenSan;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	
	
}
