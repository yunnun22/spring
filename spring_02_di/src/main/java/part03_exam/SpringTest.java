package part03_exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		String path = "part03_exam/di.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Service svc = null;
		
		svc = (Service)context.getBean("svc");
		svc.prn();
		
		/*
		 * [출력결과]
		 * kim a1234
		 */
	}

}
