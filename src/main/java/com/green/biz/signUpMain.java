package com.green.biz;

/*
 * 회원정보 클래스
 */
public class signUpMain {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "signUpMain [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
