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
 * Servlet implementation class FindPwResultServlet
 */
@WebServlet("/findpwresult.do")
public class FindPwResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPwResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mem_id = request.getParameter("mem_id");
		String mem_phone = request.getParameter("mem_phone");
		MemberDAO mDao = MemberDAO.getInstance();
		String mem_pw = mDao.findPw(mem_id, mem_phone);
		if(mem_pw != null) {
			request.setAttribute("mem_pw", mem_pw);
			request.setAttribute("message", "비밀번호를 찾았습니다.");
		} else {
			request.setAttribute("message", "비밀번호를 찾지 못했습니다.");
		}		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/findPwResult.jsp");
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
