import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
public static void main(String[] args) {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
	Message m=(Message) ctx.getBean("msg1");
	Mail m2=(Mail) ctx.getBean("mail");
	System.out.println(m2.getMessage().getBody());
	System.out.println(m.getBody());
	
	
}

}
