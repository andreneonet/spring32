package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = context.getBean("student",Student.class);
		
		System.out.println(student);
		
		((ConfigurableApplicationContext)context).close();
	}
}
