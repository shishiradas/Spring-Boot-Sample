package com.demo.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.AppConfig;
import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Repository("jdbc2")
public class EmpDaoJpaImpl implements EmpDao {
	
@Autowired
JdbcTemplate jt	;
@Override	
public int saveEmp(Employee e) {
	

	int count=jt.update(new PreparedStatementCreator() {
		
		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pst=con.prepareStatement("insert into emp(empno,name,address,salary) values (?,?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getName());			
			pst.setString(3, e.getCity());
			pst.setDouble(4, e.getSalary());
			return pst;		
					
					
		}
	});
	
	return count;
}



@Override
public List<Employee> getAll() {
List <Employee> e= jt.query("select * from emp", new RowMapper<Employee>(){
		

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Employee(rs.getInt("EMPNO"), rs.getString("NAME") , rs.getString("ADDRESS")
			, rs.getDouble("SALARY"));
					
		};
								
	});

	return e;
}

@Override
public Employee findById(int empId) {
	
Employee e= jt.queryForObject("select * from emp where empno ="+ empId, new RowMapper<Employee>(){
		

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Employee(rs.getInt("EMPNO"), rs.getString("NAME") , rs.getString("ADDRESS")
			, rs.getDouble("SALARY"));
					
		};
								
	});

	return e;
}


@Override
@Transactional
	public int saveEmpList(List<Employee> elist) {
		
	int count=0;
	for (Employee e:elist){
		
		saveEmp(e);
	count++;
	}
		
	return count;
	}


}