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
 * Servlet implementation class JoinServlet
 */
@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "views/signup.jsp";

		HttpSession session = request.getSession();
		
		if(session.getAttribute("Mem_id") != null) {//이미 로그인 된 사용자이면
			url = "login.do"; //로그인 페이지로 이동한다.
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String url = "views/signup.jsp";

		String mem_id = request.getParameter("mem_id");
		String mem_pw = request.getParameter("mem_pw");
//		String mem_pwcheck = request.getParameter("mem_pwcheck");
		String mem_name = request.getParameter("mem_name");
		String mem_nickname = request.getParameter("mem_nickname");
		String mem_email = request.getParameter("mem_email");
		String mem_addr = request.getParameter("mem_addr");
		String mem_detailaddr = request.getParameter("mem_detailaddr");
		String mem_phone = request.getParameter("mem_phone");

		MemberVO mVo = new MemberVO();
		mVo.setMem_id(mem_id);
		mVo.setMem_pw(mem_pw);
//		mVo.setMem_pwcheck(mem_pwcheck);
		mVo.setMem_name(mem_name);
		mVo.setMem_nickname(mem_nickname);
		mVo.setMem_email(mem_email);
		mVo.setMem_addr(mem_addr);
		mVo.setMem_detailaddr(mem_detailaddr);
		mVo.setMem_phone(mem_phone);


		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.insertMember(mVo);

		HttpSession session = request.getSession();

		if (result == 1) {
			session.setAttribute("Mem_id", mVo.getMem_id());
			request.setAttribute("message", "회원 가입에 성공했습니다.");
			url = "views/login.jsp";
		} else {
			request.setAttribute("message", "회원 가입에 실패했습니다.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
