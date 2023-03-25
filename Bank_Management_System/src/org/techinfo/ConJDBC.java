package org.techinfo;
import java.sql.*;

public class ConJDBC {
	
	Connection c;
	Statement s;
	
	public ConJDBC() {
		try {
//			Class.forName(com.mysql.cj.jdbc.Driver); //no need of register driver
//			Class.forName(com.mysql.cj.jdbc.Driver);
			c= DriverManager.getConnection("jdbc:mysql://bankmanagementsystem", "root", "mtrsuraj");
			s= c.createStatement();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
