package com.resultapp.model;

public class StudentModelTest {

	public static void main(String[] args) throws Exception{
	    StudentModel s1 = new StudentModel(42121810400667l,"kulfie","kulfie@gmail.com",2018);
		//System.out.println(s1.regNo+"-"+s1.name + "-" + + "2017" + "CSE");
		StudentModelDAO studentDAO = new StudentModelDAO();
		studentDAO.addStudent(s1);
		
		StudentModel s2 = new StudentModel(4212181040064l,"Devid","devika@gmail.com",2018);
		System.out.println(s2.name+"  "+s2.regNo);
		studentDAO.updateStudent(s2);
	}

}

