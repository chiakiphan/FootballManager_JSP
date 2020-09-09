package com.vleague.dao;

import com.vleague.model.DangKyCauThu;

public interface DangKyCauThuDAO {
	public DangKyCauThu getDangKyCT(String maTran, String maDoi);
	public boolean luuDangKy(DangKyCauThu dangKy);
	public boolean kiemTraDK(DangKyCauThu dangKy);
}
