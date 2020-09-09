package com.vleague.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vleague.dao.TranDauDAO;
import com.vleague.model.DangKyCauThu;
import com.vleague.model.DoiBong;
import com.vleague.model.TranDau;
import com.vleague.model.VongDau;

public class TranDauDAOImpl extends DAO implements TranDauDAO{

	@Override
	public ArrayList<TranDau> getTranDau(String maVong) {
		// TODO Auto-generated method stub
		ArrayList<TranDau> lsTranDau = new ArrayList<TranDau>();
		try {
			Connection conn = getConnection();
			
			PreparedStatement preparedStatement = 
					conn.prepareStatement("SELECT MaTran, ThoiGian, Gio, SoCTToiDaMoiDoi, VaiTro, MaDoi, TenDoi "
										+ "FROM vleague.trandau "
										+ "INNER JOIN vleague.dangkycauthu ON dangkycauthu.TranDauMaTran = trandau.MaTran "
										+ "INNER JOIN vleague.doibong ON doibong.MaDoi = dangkycauthu.DoiBongMaDoi "
										+ "WHERE trandau.VongDauMaVong = '"+maVong+"' "
										+ "ORDER BY ThoiGian ASC, Gio;");
			ResultSet rs = preparedStatement.executeQuery();
			DangKyCauThu doi = null;
			while(rs.next()) {
				String maTran = rs.getString(1);
				Date thoiGian = rs.getDate(2);
				String gio = rs.getString(3);
				int soCT = rs.getInt(4);
				String vaiTro = rs.getString(5);
				DoiBong doiBong = new DoiBong(rs.getString(6), rs.getString(7));
				if (doi==null) {
					doi = new DangKyCauThu(doiBong, vaiTro);
					continue;
				}
				lsTranDau.add(new TranDau(maTran, thoiGian, gio, soCT, doi, new DangKyCauThu(new DoiBong(rs.getString(6), rs.getString(7)), vaiTro)));
				doi = null;
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			printSQLException(e);
		}
		return lsTranDau;
	}
	
	public static void main(String[] args) {
		TranDauDAOImpl vd = new TranDauDAOImpl();
		for(TranDau v : vd.getTranDau("MV00010")) {
			System.out.print(v.getGio());
		}
	}

}
