package com.zhou.bean;

public class User {
	
	private String username;
	private String password;
	private int level;
	private String usernum;
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getUsernum() {
		return usernum;
	}
	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", level=" + level + ", usernum=" + usernum + "]";
	}
	public User(String username, String password, int level, String usernum) {
		super();
		this.username = username;
		this.password = password;
		this.level = level;
		this.usernum = usernum;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
