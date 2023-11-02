package com.Newconnection;

public class Login {
	 String name,email,password,repassword,mobile;

	
		

	public Login(String name, String email, String password, String repassword, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
		this.mobile = mobile;
		

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



}

	