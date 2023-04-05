package springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPerson {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("mySpringConf.xml"));
		Person p = factory.getBean("myperson",Person.class);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		
	}

}
