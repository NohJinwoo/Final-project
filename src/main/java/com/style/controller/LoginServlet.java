package com.style.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.style.dao.MemberDAO;
import com.style.dto.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String url = "views/login.jsp";
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("LoginUser") != null) {//이미 로그인 된 사용자이면
			url = "main.do"; //메인 페이지로 이동한다.
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "views/login.jsp";
		
		String mem_id = request.getParameter("mem_id");
		String mem_pw = request.getParameter("mem_pw");
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(mem_id, mem_pw);
				
		if(result==1) {
			MemberVO mVo = mDao.getUser(mem_id);
			HttpSession session = request.getSession();
			session.setAttribute("LoginUser", mVo);
			request.setAttribute("message", "로그인에 성공했습니다.");
			url = "main.do";
		} else if (result==0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		} else if (result==-1) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		}	
}
