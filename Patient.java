package com.hospital;

public class Patient {
	int token;
	String name;
	long cno;
	String address;
	double money;
	public Patient(int token, String name, long cno, String address, double money) {
		super();
		this.token = token;
		this.name = name;
		this.cno = cno;
		this.address = address;
		this.money = money;
	}
	public Patient(int token, String name, long cno, String address) {
		super();
		this.token = token;
		this.name = name;
		this.cno = cno;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "token no="+token+"name ="+name+"cno="+cno+"address ="+address;
	}
	

}
