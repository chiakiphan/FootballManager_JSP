package com.vleague.model;

import java.util.ArrayList;

public class ToTrongTai {
	private ArrayList<TrongTai> trongTai;
	private TranDau tranDau;
	public ToTrongTai(ArrayList<TrongTai> trongTai, TranDau tranDau) {
		super();
		this.trongTai = trongTai;
		this.tranDau = tranDau;
	}
	public ArrayList<TrongTai> getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(ArrayList<TrongTai> trongTai) {
		this.trongTai = trongTai;
	}
	public TranDau getTranDau() {
		return tranDau;
	}
	public void setTranDau(TranDau tranDau) {
		this.tranDau = tranDau;
	}
	
	
}
