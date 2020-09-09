package com.vleague.model;

public class TrongTai {
	private String name;
	private String viTri;
	private String maTT;
	
	public TrongTai(String name, String viTri, String maTT) {
		super();
		this.name = name;
		this.viTri = viTri;
		this.maTT = maTT;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public String getMaTT() {
		return maTT;
	}
	public void setMaTT(String maTT) {
		this.maTT = maTT;
	}
	
}
