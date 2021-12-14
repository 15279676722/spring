package org.springframework.yq.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.yq.config.SpringConfig;
import org.springframework.yq.entity.TestBean;
import org.springframework.yq.service.MessageService;

/**
 * @author yangqiang
 * @create 2021-11-30 19:27
 */
public class SpringConfigTest {
	@Test
    public void testAnnotation(){
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

	}

	@Test
	public void testXML(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:yq/XMLSpringConfig.xml");
		System.out.println(ac.getBean(TestBean.class));
	}
	@Test
	public void testXMLInterface(){

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:yq/XMLSpringConfigInterface.xml");
 		System.out.println(ac.getBean(MessageService.class).getMessage());
	}

	@Test
	public void testXMLInterface2(){

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:yq/XMLSpringConfigInterface.xml");
		System.out.println(ac.getBean(MessageService.class).getMessage());
	}
}
