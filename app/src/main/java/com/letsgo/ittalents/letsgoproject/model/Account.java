package com.letsgo.ittalents.letsgoproject.model;

public class Account {

	private String email;
	private String password;
	private boolean hasLogged;
	
	
	public Account(String email, String password) {
		this.validateEmail(email);
		this.validatePassword(password);
	}

	private void validatePassword(String password){
		this.password = password;
	}
	
	private void validateEmail(String inputEmail){
		this.email = inputEmail;
	}
	
	protected boolean getHasLogged(){
		return this.hasLogged;
	}
	
 	public void login(String pass){
		if (pass.equals(this.password)) {
			this.hasLogged = true;
			System.out.println("Welcome " + this.email);
		}
	}
	
	public void logout(){
		this.hasLogged = false;
		System.out.println("Goodbye!");
	}
	
}
