package com.vleague.model;

import java.sql.Date;

public class CauThu {
	private String maCT;
	private String tenCT;
	private int soAo;
	private String viTri;
	private Date namSinh;
	private String queQuan;
	private String chanThuan;
	private int chieuCao;
	private int canNang;
	private DoiBong doiBong;
	
	public CauThu(String maCT, String tenCT, int soAo, String viTri, Date namSinh, String queQuan, String chanThuan,
			int chieuCao, int canNang, DoiBong doiBong) {
		super();
		this.maCT = maCT;
		this.tenCT = tenCT;
		this.soAo = soAo;
		this.viTri = viTri;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
		this.chanThuan = chanThuan;
		this.chieuCao = chieuCao;
		this.canNang = canNang;
		this.doiBong = doiBong;
	}
	
	public DoiBong getDoiBong() {
		return doiBong;
	}

	public void setDoiBong(DoiBong doiBong) {
		this.doiBong = doiBong;
	}

	public String getMaCT() {
		return maCT;
	}
	public void setMaCT(String maCT) {
		this.maCT = maCT;
	}
	public String getTenCT() {
		return tenCT;
	}
	public void setTenCT(String tenCT) {
		this.tenCT = tenCT;
	}
	public int getSoAo() {
		return soAo;
	}
	public void setSoAo(int soAo) {
		this.soAo = soAo;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getChanThuan() {
		return chanThuan;
	}
	public void setChanThuan(String chanThuan) {
		this.chanThuan = chanThuan;
	}
	public int getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}
	public int getCanNang() {
		return canNang;
	}
	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}
	
}
