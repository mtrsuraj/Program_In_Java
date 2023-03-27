package org.techinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;

//import com.mysql.cj.jdbc.Driver;

public class Students {
	
	public void createDatabase() {
	try {
		String url = "jdbc:mysql://localhost:3306/";
		String user= "root";
		String pasword = "mtrsuraj";
		Connection con = DriverManager.getConnection(url, user, pasword);
		Statement stm = con.createStatement();
		String query = "create database myCoding";
		stm.execute(query);
		System.out.println("Connected Successfully...");
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
 }

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/myCoding";
			String user = "root";
			String password = "mtrsuraj";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			String query="create table student(rollNo int(3), stName varchar(20), stEmail varchar(200))";
			st.execute(query);
			System.out.println("Successfully table created!");
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void createStData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "myCoding";
			String user = "root";
			String pasword= "mtrsuraj";
			Connection con = DriverManager.getConnection(url+db, user, pasword);
//			Statement st = con.createStatement();
//	    	String query = "Insert into student (rollNo, stName, stEmail) VALUES('123','suman','suram@gmail.com')";
			String query = "Insert into student (rollNo, stName, stEmail) VALUES(?,?,?)";

			PreparedStatement stm = con.prepareStatement(query);
//			String query = "";
			stm.setInt(1, 11);
			stm.setString(2, "Bhalu");
			stm.setString(3, "Bhalu@gmail.com");
//			stm.execute();
//			stm.executeUpdate();
			stm.executeQuery();
			System.out.println("data insert successfully");
			
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String user="root";
			String pasword="mtrsuraj";
			String db = "myCoding";
			Connection con = DriverManager.getConnection(url+db, user, pasword);
			Statement st = con.createStatement();
			String query = "Select * from student";
		    ResultSet rs=	st.executeQuery(query);
			while(rs.next()) {
				System.out.println("id = "+ rs.getInt(1));
				System.out.println("name= "+rs.getString(2));
				System.out.println("email= "+ rs.getString(3));
			}
			System.out.println("read successfully");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String password= "mtrsuraj";
			String db = "myCoding";
			Connection con = DriverManager.getConnection(url+db, user, password);
//			Statement st = con.createStatement();
			String query = "UPDATE student set rollNo=? where stName = ? ";
			PreparedStatement stm = con.prepareStatement(query);
			stm.setInt(1, 12);
			stm.setString(2, "Lalu");
//			stm.setString(3, "ram");
			stm.execute();
			System.out.println("Update successfully");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deletData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String password = "mtrsuraj";
			String db = "myCoding";
			Connection con = DriverManager.getConnection(url+db, user, password);
			String query = "DELETE FROM student WHERE stName=?";
			PreparedStatement stm = con.prepareStatement(query);
			stm.setString(1, "Lalu");
			stm.execute();
			System.out.println("Delete successfully");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
