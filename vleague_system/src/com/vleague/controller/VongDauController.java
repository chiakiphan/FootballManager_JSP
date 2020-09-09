package com.vleague.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
import com.vleague.dao.impl.VongDauDAOImpl;
import com.vleague.model.VongDau;

/**
 * Servlet implementation class VongDauController
 */
@WebServlet(urlPatterns = "/vong_dau")
public class VongDauController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VongDauDAOImpl vongDauDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VongDauController() {
        super();
        vongDauDAO = new VongDauDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<VongDau> lsVong = vongDauDAO.getVongDau();
		HttpSession session = request.getSession();
		session.setAttribute("listVD", lsVong);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/client/page/vongdau2.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
