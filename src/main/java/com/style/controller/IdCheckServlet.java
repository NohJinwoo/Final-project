package com.style.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.style.dao.MemberDAO;

/**
 * Servlet implementation class IdCheckServlet
 */
@WebServlet("/idCheck.do")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IdCheckServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.confirmID(mem_id);
		request.setAttribute("mem_id", mem_id);
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("views/idcheck.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
