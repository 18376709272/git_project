package com.student.model;

public class StudentMode {
	private int id;//id
	private String username;//用户名
	private String password;//用户密码
	private int sex;//性别，0男1女
	private String love;//爱好
	
	public StudentMode(int id, String username, String password, int sex, String love) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.love = love;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


	public String getLove() {
		return love;
	}


	public void setLove(String love) {
		this.love = love;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
