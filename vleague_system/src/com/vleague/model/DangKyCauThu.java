package com.vleague.model;

import java.util.ArrayList;

public class DangKyCauThu {
	private ArrayList<CauThu> cauThu;
	private DoiBong doiBong;
	private String id;
	private String vaiTro;
	
	public DangKyCauThu(DoiBong doiBong, String vaiTro) {
		super();
		this.doiBong = doiBong;
		this.vaiTro = vaiTro;
	}
	public String getVaiTro() {
		return vaiTro;
	}
	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}
	public DangKyCauThu(ArrayList<CauThu> cauThu, DoiBong doiBong, String id) {
		super();
		this.cauThu = cauThu;
		this.doiBong = doiBong;
		this.id = id;
	}
	public ArrayList<CauThu> getCauThu() {
		return cauThu;
	}
	public void setCauThu(ArrayList<CauThu> cauThu) {
		this.cauThu = cauThu;
	}
	public DoiBong getDoiBong() {
		return doiBong;
	}
	public void setDoiBong(DoiBong doiBong) {
		this.doiBong = doiBong;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
