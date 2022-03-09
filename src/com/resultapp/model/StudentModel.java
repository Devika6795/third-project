package com.resultapp.model;

public class StudentModel {

	public long regNo;
	public String name;
	public String email;
	public  int batchNo;
	//public String branch;
	

	public StudentModel(long regNo,String name, String email, int batchNo) {
		
		this.regNo = regNo;
		this.name = name;
		this.email = email;
		this.batchNo = batchNo;
		//this.branch = branch;
	
	//public StudentModel(String name) {
		//this.name = name;
	}

	}


