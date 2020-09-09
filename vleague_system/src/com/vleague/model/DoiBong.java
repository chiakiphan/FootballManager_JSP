package com.vleague.model;

public class DoiBong {
	private String maDoi;
	private String tenDoi;
	private String tranPhuc;
	private String diaChi;
	private String moTa;
	private String xepHang;
	public DoiBong(String maDoi, String tenDoi) {
		super();
		this.maDoi = maDoi;
		this.tenDoi = tenDoi;
	}
	public DoiBong(String maDoi, String tenDoi, String tranPhuc, String diaChi) {
		super();
		this.maDoi = maDoi;
		this.tenDoi = tenDoi;
		this.tranPhuc = tranPhuc;
	}
	public String getMaDoi() {
		return maDoi;
	}
	public void setMaDoi(String maDoi) {
		this.maDoi = maDoi;
	}
	public String getTenDoi() {
		return tenDoi;
	}
	public void setTenDoi(String tenDoi) {
		this.tenDoi = tenDoi;
	}
	public String getTranPhuc() {
		return tranPhuc;
	}
	public void setTranPhuc(String tranPhuc) {
		this.tranPhuc = tranPhuc;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getXepHang() {
		return xepHang;
	}
	public void setXepHang(String xepHang) {
		this.xepHang = xepHang;
	}
	
	
}
