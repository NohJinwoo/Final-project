package com.style.dto;

public class MemberVO {
	private String mem_id;
	private String mem_pw;
	private String mem_pwcheck; 
	private String mem_name;
	private String mem_nickname;
	private String mem_email;
	private String mem_addr; 
	private String mem_detailaddr;
	private String mem_phone;
	private String emp_id;
	private String emp_pw;
	private String emp_name;
	private String emp_nickname;
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_pw() {
		return emp_pw;
	}
	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_nickname() {
		return emp_nickname;
	}
	public void setEmp_nickname(String emp_nickname) {
		this.emp_nickname = emp_nickname;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_pwcheck() {
		return mem_pwcheck;
	}
	public void setMem_pwcheck(String mem_pwcheck) {
		this.mem_pwcheck = mem_pwcheck;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_addr() {
		return mem_addr;
	}
	public void setMem_addr(String mem_addr) {
		this.mem_addr = mem_addr;
	}
	public String getMem_detailaddr() {
		return mem_detailaddr;
	}
	public void setMem_detailaddr(String mem_detailaddr) {
		this.mem_detailaddr = mem_detailaddr;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	
	@Override
	public String toString() {
		return "MemberVO [mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_pwcheck=" + mem_pwcheck + ", mem_name="
				+ mem_name + ", mem_nickname=" + mem_nickname + ", mem_email=" + mem_email + ", mem_addr=" + mem_addr
				+ ", mem_detailaddr=" + mem_detailaddr + ", mem_phone=" + mem_phone + ", emp_id=" + emp_id + ", emp_pw="
				+ emp_pw + ", emp_name=" + emp_name + ", emp_nickname=" + emp_nickname + ", getEmp_id()=" + getEmp_id()
				+ ", getEmp_pw()=" + getEmp_pw() + ", getEmp_name()=" + getEmp_name() + ", getEmp_nickname()="
				+ getEmp_nickname() + ", getMem_id()=" + getMem_id() + ", getMem_pw()=" + getMem_pw()
				+ ", getMem_pwcheck()=" + getMem_pwcheck() + ", getMem_name()=" + getMem_name() + ", getMem_nickname()="
				+ getMem_nickname() + ", getMem_email()=" + getMem_email() + ", getMem_addr()=" + getMem_addr()
				+ ", getMem_detailaddr()=" + getMem_detailaddr() + ", getMem_phone()=" + getMem_phone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}