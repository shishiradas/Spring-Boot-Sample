package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcApp {
	
	
	public static void main(String[] args) {
		
		
		Connection conn = null;
		Statement st= null;
		ResultSet rs = null;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager
			.getConnection("jdbc:mysql://localhost:3306/springdb","root","admin");
			st=conn.createStatement();
			rs=st.executeQuery("select * from emp");
			while(rs.next()){
				
				int id=rs.getInt("EMPNO");
				String name=rs.getString("NAME");
				String city=rs.getString("ADDRESS");
				double salary=rs.getDouble("SALARY");
				System.out.println( "Employee with employee ID " + id+ " and name " + name + " from " + city + " has salary Rs"+ salary);
				
				
				
			}
		} catch(ClassNotFoundException e){
			
			System.out.println("Driver class not found..");
			
		} catch(SQLException e){
			
			e.printStackTrace();
			
		}finally{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
