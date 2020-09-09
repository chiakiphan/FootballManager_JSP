package com.vleague.model;

import java.sql.Date;

public class VongDau {
	private String maVong;
	private String tenVong;
	private Date thoiGianStart;
	private Date thoiGianEnd;
	private String moTa;
	private GiaiBong giaiBong;
	
	public VongDau(String maVong, String tenVong, Date thoiGianStart, Date thoiGianEnd) {
		super();
		this.maVong = maVong;
		this.tenVong = tenVong;
		this.thoiGianStart = thoiGianStart;
		this.thoiGianEnd = thoiGianEnd;
	}
	public VongDau(String maVong, String tenVong, Date thoiGianStart, Date thoiGianEnd, String moTa, GiaiBong giaiBong) {
		super();
		this.maVong = maVong;
		this.tenVong = tenVong;
		this.thoiGianStart = thoiGianStart;
		this.thoiGianEnd = thoiGianEnd;
		this.moTa = moTa;
		this.giaiBong = giaiBong;
	}
	
	public String getMaVong() {
		return maVong;
	}
	public void setMaVong(String maVong) {
		this.maVong = maVong;
	}
	public String getTenVong() {
		return tenVong;
	}
	public void setTenVong(String tenVong) {
		this.tenVong = tenVong;
	}
	
	public Date getThoiGianStart() {
		return thoiGianStart;
	}
	public void setThoiGianStart(Date thoiGianStart) {
		this.thoiGianStart = thoiGianStart;
	}
	public Date getThoiGianEnd() {
		return thoiGianEnd;
	}
	public void setThoiGianEnd(Date thoiGianEnd) {
		this.thoiGianEnd = thoiGianEnd;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public GiaiBong getGiaiBong() {
		return giaiBong;
	}
	public void setGiaiBong(GiaiBong giaiBong) {
		this.giaiBong = giaiBong;
	}
	
	
}
