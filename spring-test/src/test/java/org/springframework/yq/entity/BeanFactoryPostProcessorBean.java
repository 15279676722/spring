package org.springframework.yq.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author yangqiang
 * @create 2021-12-01 15:29
 */
public class BeanFactoryPostProcessorBean implements BeanFactoryPostProcessor {
	private String name;
	private Integer id;

	public BeanFactoryPostProcessorBean(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessorBean test");
	}
}
