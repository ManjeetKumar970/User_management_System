package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpringConf.xml");
		Employee e=context.getBean("emp", Employee.class);
		System.out.println(e.getDegn());
		System.out.println(e.getSalary());
		System.out.println("---------------------------");
		
		Person p= context.getBean("myperson",Person.class);
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}

}
