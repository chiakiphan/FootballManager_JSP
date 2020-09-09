package com.vleague.model;

public class GiaiBong {
	private String tenGiai;
	private String maGiai;
	private String moTa;
	private int soDoi;
	public GiaiBong(String tenGiai, String maGiai, String moTa, int soDoi) {
		super();
		this.tenGiai = tenGiai;
		this.maGiai = maGiai;
		this.moTa = moTa;
		this.soDoi = soDoi;
	}
	public String getTenGiai() {
		return tenGiai;
	}
	public void setTenGiai(String tenGiai) {
		this.tenGiai = tenGiai;
	}
	public String getMaGiai() {
		return maGiai;
	}
	public void setMaGiai(String maGiai) {
		this.maGiai = maGiai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSoDoi() {
		return soDoi;
	}
	public void setSoDoi(int soDoi) {
		this.soDoi = soDoi;
	}
	
}
