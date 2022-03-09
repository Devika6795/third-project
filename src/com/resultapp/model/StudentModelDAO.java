package com.resultapp.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentModelDAO {
public void addStudent(StudentModel student) throws Exception{
	//step 1 : database driver (optional)
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step2: get the connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	System.out.println(connection);
	
	String query = "insert into devi_student(reg_no,NAME,email,batch_no) values ('"+student.regNo+"','"+student.name+"','"+student.email+"','"+student.batchNo+"')";
	//System.out.println(query);
	Statement statement = connection.createStatement();
	int rows = statement.executeUpdate(query);
	System.out.println("No of rows inserted:" + rows);
	//close the connection
	connection.close();
	
}
public void updateStudent(StudentModel student) throws Exception{
	// step1: database driver(option)
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step2: get the connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	System.out.println(connection);
	
	//update student set name ='naresh kumar' where reg_no =1
	String query = "update devi_student set NAME = '"+student.name+"'where reg_no ="+student.regNo;
	System.out.println(query);
	Statement statement = connection.createStatement();
	int rows = statement.executeUpdate(query);
	System.out.println("No of rows updated:" +rows);
	connection.close();
}

}
