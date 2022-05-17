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
 * Servlet implementation class FindIdResultServlet
 */
@WebServlet("/findidresult.do")
public class FindIdResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindIdResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mem_name = request.getParameter("mem_name");
		String mem_phone = request.getParameter("mem_phone");
		MemberDAO mDao = MemberDAO.getInstance();
		String mem_id = mDao.findId(mem_name, mem_phone);
		if(mem_id != null) {
			request.setAttribute("mem_id", mem_id);
			request.setAttribute("message", "아이디를 찾았습니다.");
		} else {
			request.setAttribute("message", "아이디를 찾지 못했습니다.");
		}		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/findIdResult.jsp");
		dispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
