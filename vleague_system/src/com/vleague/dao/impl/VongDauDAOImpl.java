package com.vleague.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vleague.dao.VongDauDao;
import com.vleague.model.VongDau;

public class VongDauDAOImpl extends DAO implements VongDauDao{
	@Override
	public ArrayList<VongDau> getVongDau() {
		// TODO Auto-generated method stub
		ArrayList<VongDau> lsVong = new ArrayList<VongDau>();
		try {
			Connection conn = getConnection();
			
			PreparedStatement preparedStatement = 
					conn.prepareStatement("SELECT MaVong, TenVong, ThoiGianStart, ThoiGianEnd "
										   + "FROM vleague.vongdau "
										   + "ORDER BY ThoiGianStart ASC");
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				String maVong = rs.getString(1);
				String tenVong = rs.getString(2);
				Date timestart = rs.getDate(3);
				Date timeend = rs.getDate(4);
				lsVong.add(new VongDau(maVong, tenVong, timestart, timeend));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			printSQLException(e);
		}
		return lsVong;
	}
	
//	public static void main(String[] args) {
//		VongDauDAOImpl vd = new VongDauDAOImpl();
//		for(VongDau v : vd.getVongDau()) {
//			System.out.print(v.getMaVong());
//		}
//	}
}