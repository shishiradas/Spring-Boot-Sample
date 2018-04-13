package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

//import com.mysql.jdbc.PreparedStatement;



public class JdbcApp2 {
	
	
	public static void main(String[] args) {
		
		
		Connection conn = null;
		Statement st= null;
		ResultSet rs = null;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager
			.getConnection("jdbc:mysql://localhost:3306/springdb","root","admin");
			
			PreparedStatement pst = conn.prepareStatement("" +"insert into emp(empno,name,address,salary)" + "values(?,?,?,?)");
			
			pst.setInt(1, 200);
			pst.setString(2, "Shishira");
			pst.setString(3, "Trivandrum");;
			pst.setDouble(4, 50000);;
			
			int count= pst.executeUpdate();

			System.out.println("Record is inserted into EMP table at row " + count);
				
				
				
			
		} catch(ClassNotFoundException e){
			
			System.out.println("Driver class not found..");
			
		} catch(SQLException e){
			
			e.printStackTrace();
			
		}finally{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
