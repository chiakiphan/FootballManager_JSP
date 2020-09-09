package com.vleague.dao.impl;

import java.sql.Connection;

import com.vleague.dao.DangKyCauThuDAO;
import com.vleague.model.DangKyCauThu;

public class DangKyCauThuDAOImpl extends DAO implements DangKyCauThuDAO {
	Connection conn = getConnection();
	@Override
	public DangKyCauThu getDangKyCT(String maTran, String maDoi) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean luuDangKy(DangKyCauThu dangKy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kiemTraDK(DangKyCauThu dangKy) {
		// TODO Auto-generated method stub
		return false;
	}

}
