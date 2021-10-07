package com.techment.bank.exception;

public class IdNotFoundException extends Exception{

	String msg =" ";

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public IdNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
