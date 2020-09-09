package com.vleague.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vleague.dao.impl.TranDauDAOImpl;
import com.vleague.model.TranDau;

/**
 * Servlet implementation class LichDauController
 */
@WebServlet(urlPatterns = "/lich_dau")
public class LichDauController extends HttpServlet {
	private static final long serialVersionUID = 110L;
    private TranDauDAOImpl tranDauDAO;
    private String save;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichDauController() {
        super();
        tranDauDAO = new TranDauDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String roundId = request.getParameter("round");
		if (roundId != null) save = roundId;
		else roundId = save;
		String round = save.substring(save.length()-2, save.length());
		ArrayList<TranDau> listTD= tranDauDAO.getTranDau(roundId);
		request.setAttribute("round", Integer.parseInt(round));
		request.setAttribute("listTD", listTD);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/client/page/lichdau.jsp");
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
