package com.style.dto;

import java.sql.Timestamp;

public class NotionVO {
	private int nno;
	private String ntitle;
	private String ncontent;
	private String nkinds;
	private String ncount;
	private Timestamp ndate;
	private String status;

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNkinds() {
		return nkinds;
	}

	public void setNkinds(String nkinds) {
		this.nkinds = nkinds;
	}

	public String getNcount() {
		return ncount;
	}

	public void setNcount(String ncount) {
		this.ncount = ncount;
	}

	public Timestamp getNdate() {
		return ndate;
	}

	public void setNdate(Timestamp ndate) {
		this.ndate = ndate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
