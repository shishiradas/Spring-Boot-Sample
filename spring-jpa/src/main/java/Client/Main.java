package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.model.AppConfig;
import com.demo.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	EmpDao dao = (EmpDao) ctx.getBean("empDaoImpl");
	//String resp=dao.saveEmp(new Employee(1,"Karan","Hyderabad",78000));
	//System.out.println(resp);
		
	for(Employee e:dao.getAll()){
		
		System.out.println(e.getEmpId() + " " + e.getName());		
	}

		Employee e=dao.findById(100);
		System.out.println(e.getEmpId() + " " + e.getName());
		
		String resp=dao.delete(108);
		System.out.println(resp);
	
}

	
}