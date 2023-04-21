package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DriverMobile {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Mobile.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
	  Mobile mobile	= (Mobile) bf.getBean("mobile");
	  mobile.used();
	  
	}
 
}
