package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.demo.spring.service.EmpRegisterApp;

public class MainEmployee {

	public static void main(String[] args) {
		
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt= (JdbcTemplate)ctx.getBean("jdbcTemplate");
		int count=jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst=con.prepareStatement("insert into emp(empno,name,address,salary) values (?,?,?,?)");
				pst.setInt(1, 118);
				pst.setString(2, "Raju");			
				pst.setString(3, "Kottayam");
				pst.setDouble(4, 50000);
				return pst;		
						
						
			}
		});
		
		System.out.println("Record is inserted into EMP table at row " + count);
		

	}

}
