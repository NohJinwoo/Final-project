package com.style.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.style.dto.NotionVO;

import util.DBManager;

public class NotionDAO {
	private NotionDAO() {

	}

	private static NotionDAO instance = new NotionDAO();

	// 인스텐스를 리턴한다
	public static NotionDAO getInstance() {
		return instance;
	}

	// 최근 등록한 게시글이 먼저 나오도록 게시글 목록을 출력한다.
	public List<NotionVO> selectAllNotions() {
		String sql = "select * from notion order by nno desc";

		List<NotionVO> list = new ArrayList<NotionVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				NotionVO nVo = new NotionVO();
				nVo.setNno(rs.getInt("nno"));
				nVo.setNtitle(rs.getString("ntitle"));
				nVo.setNkinds(rs.getString("nkinds"));
				nVo.setNcontent(rs.getString("ncontent"));
				nVo.setNcount(rs.getString("ncount"));
				nVo.setNdate(rs.getTimestamp("ndate"));
				nVo.setStatus(rs.getString("status"));

				list.add(nVo);
			}
		} catch (SQLException e) {
			// e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}

	// 전달인자로 받은 VO객체를 board 테이블에 삽입한다.
	public void insertNotion(NotionVO nVo) {
		String sql = "insert into Notion(" + "nno,ntitle,ncontent,nkinds,ncount,status) "
				+ "values(Notion_seq.nextval, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, nVo.getNtitle());
			pstmt.setString(2, nVo.getNcontent());
			pstmt.setString(3, nVo.getNkinds());
			pstmt.setString(4, nVo.getStatus());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void updateReadCount(String nno) {
		String sql = "update notion set readcount = readcount+1 where nno=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nno);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 공지 글 상세 내용 보기: 글 번호로 찾아온다. : 실패 null;
	// board체이블에서 게시글 번호로 해당 게시글을 찾아 게시글 정보를 BoardVO 객체로 얻어준다.
	public NotionVO selectOneNontionByNno(String nno) {
		String sql = "select * from notion where nno =?";

		NotionVO nVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nno);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nVo = new NotionVO();

				nVo.setNno(rs.getInt("nno"));
				nVo.setNtitle(rs.getString("ntitle"));
				nVo.setNkinds(rs.getString("nkinds"));
				nVo.setNcount(rs.getString("ncount"));
				nVo.setNdate(rs.getTimestamp("ndate"));
				nVo.setStatus(rs.getString("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return nVo;
	}

	// 매개 변수로 받은 VO객쳋 내의 코드로 notion 테이블에서 검색해서 VO객체에 저장된 정보로 게시글 정보를 수집한다
	public void updateNotion(NotionVO nVo) {
		String sql = "update notion set ntitle=? ncontent=?," + "nkinds=?, status=? where nno=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, nVo.getNtitle());
			pstmt.setString(2, nVo.getNcontent());
			pstmt.setString(3, nVo.getNkinds());
			pstmt.setString(4, nVo.getStatus());
			pstmt.setInt(6, nVo.getNno());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 게시글 번호에 해당되는 게시글 정보를 삭제한다.
	public void deleteNotion(String nno) {
		String sql = "delete notion where nno=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, nno);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}