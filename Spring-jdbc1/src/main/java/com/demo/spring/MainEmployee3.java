package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.service.EmpRegisterApp;

public class MainEmployee3 {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		List<Employee> empList = jt.query("select * from emp", new RowMapper<Employee>() {

			@Override

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Employee(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));

			}

		});

		for (Employee e : empList) {

			System.out.println(e.getEmpId() + " " + e.getName());
			;
		}

	}

}
