package com.vleague.model;

import java.sql.Date;
import java.util.ArrayList;

public class TranDau {
	private String maTran;
	private SanDau sanDau;
	private VongDau vongDau;
	private Date thoiGian;
	private String gio;
	private int soCT;
	private DangKyCauThu doi1;
	private DangKyCauThu doi2;
	
	public TranDau(String maTran, Date thoiGian, String gio, int soCT, DangKyCauThu doi1, DangKyCauThu doi2) {
		super();
		this.maTran = maTran;
		this.thoiGian = thoiGian;
		this.gio = gio;
		this.soCT = soCT;
		this.doi1 = doi1;
		this.doi2 = doi2;
	}
	
	public String getMaTran() {
		return maTran;
	}
	public void setMaTran(String maTran) {
		this.maTran = maTran;
	}
	public SanDau getSanDau() {
		return sanDau;
	}
	public void setSanDau(SanDau sanDau) {
		this.sanDau = sanDau;
	}
	public VongDau getVongDau() {
		return vongDau;
	}
	public void setVongDau(VongDau vongDau) {
		this.vongDau = vongDau;
	}
	public Date getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
	public int getSoCT() {
		return soCT;
	}
	public void setSoCT(int soCT) {
		this.soCT = soCT;
	}

	public String getGio() {
		return gio;
	}

	public void setGio(String gio) {
		this.gio = gio;
	}

	public DangKyCauThu getDoi1() {
		return doi1;
	}

	public void setDoi1(DangKyCauThu doi1) {
		this.doi1 = doi1;
	}

	public DangKyCauThu getDoi2() {
		return doi2;
	}

	public void setDoi2(DangKyCauThu doi2) {
		this.doi2 = doi2;
	}
	
	
}
