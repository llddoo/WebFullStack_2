package com.iu.s1.member;

public class MemberDTO {
	
	//모든 멤버변수는 private
	//변수명과 데이터타입은 컬럼과 동일하게
	//getter, setter
	//기본생성자 1개
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}

