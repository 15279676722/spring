package org.springframework.yq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.yq.entity.BeanFactoryPostProcessorBean;
import org.springframework.yq.entity.TestBean;

/**
 * @author yangqiang
 * @create 2021-11-30 19:26
 */
@Configuration
public class SpringConfig {
	@Bean
	public TestBean testBean(){
		return new TestBean("yq",1);
	}
	@Bean
	public BeanFactoryPostProcessorBean beanFactoryPostProcessorBean(){
		return new BeanFactoryPostProcessorBean("yq",1);
	}
}
