package com.style.dao;

import java.sql.*;
import javax.sql.*;

import com.style.dto.MemberVO;

import javax.naming.*;

public class MemberDAO {
	private MemberDAO() {

	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}

	// 사용자 인증시 사용하는 메소드
	public int userCheck(String mem_id, String mem_pw) {
		int result = -1;
		String sql = "select mem_pw from ezen_member where mem_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("mem_pw") != null && rs.getString("mem_pw").equals(mem_pw)) {
					result = 1;
				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// 관리자 인증시 사용하는 메소드
	public int adminCheck(String emp_id, String emp_pw) {
		int result = -1;
		String sql = "select emp_pw from ezen_employees where emp_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("emp_pw") != null && rs.getString("emp_pw").equals(emp_pw)) {
					result = 1;
				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// 아이디로 회원 정보 가져오는 메소드
	public MemberVO getUser(String mem_id) {
		MemberVO mVo = null;
		String sql = "select * from ezen_member where mem_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mVo = new MemberVO();
				mVo.setMem_id(rs.getString("mem_id"));
				mVo.setMem_pw(rs.getString("mem_pw"));
//				mVo.setMem_pwcheck(rs.getString("mem_pwcheck"));
				mVo.setMem_name(rs.getString("mem_name"));
				mVo.setMem_nickname(rs.getString("mem_nickname"));
				mVo.setMem_email(rs.getString("mem_email"));
				mVo.setMem_addr(rs.getString("mem_addr"));
				mVo.setMem_detailaddr(rs.getString("mem_detailaddr"));
				mVo.setMem_phone(rs.getString("mem_phone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mVo;
	}

	// 아이디로 관리자 정보 가져오는 메소드
	public MemberVO getAdmin(String emp_id) {
		MemberVO mVo = null;
		String sql = "select * from ezen_employees where emp_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mVo = new MemberVO();
				mVo.setEmp_id(rs.getString("emp_id"));
				mVo.setEmp_pw(rs.getString("emp_pw"));
//					mVo.setMem_pwcheck(rs.getString("mem_pwcheck"));
				mVo.setEmp_name(rs.getString("emp_name"));
				mVo.setEmp_nickname(rs.getString("emp_nickname"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mVo;
	}

	public int confirmID(String mem_id) {
		int result = -1;
		String sql = "select mem_id from ezen_member where mem_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("mem_id") != null && rs.getString("mem_id").equals(mem_id)) {
					result = 1;
				} else if(rs.getString("mem_id").length() < 4) {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int insertMember(MemberVO mVo) {
		int result = -1;
		String sql = "insert into ezen_member values(?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getMem_id());
			pstmt.setString(2, mVo.getMem_pw());
//			pstmt.setString(3, mVo.getMem_pwcheck());
			pstmt.setString(3, mVo.getMem_name());
			pstmt.setString(4, mVo.getMem_nickname());
			pstmt.setString(5, mVo.getMem_email());
			pstmt.setString(6, mVo.getMem_addr());
			pstmt.setString(7, mVo.getMem_detailaddr());
			pstmt.setString(8, mVo.getMem_phone());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int updateMember(MemberVO mVo) {
		int result = -1;
		String sql = "update ezen_member set mem_pw=?, mem_nickname=?,"
				+ "mem_email=?, mem_addr=?, mem_detailaddr=?, mem_phone=? where mem_id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getMem_pw());
			pstmt.setString(2, mVo.getMem_nickname());
			pstmt.setString(3, mVo.getMem_email());
			pstmt.setString(4, mVo.getMem_addr());
			pstmt.setString(5, mVo.getMem_detailaddr());
			pstmt.setString(6, mVo.getMem_phone());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public String findId(String mem_name, String mem_phone) {
		String mem_id = null;
		String sql = "select mem_id from ezen_member where mem_name=? and mem_phone=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_name);
			pstmt.setString(2, mem_phone);			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem_id = rs.getString("mem_id");
				}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mem_id;
	}
}
