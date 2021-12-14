package org.springframework.yq.entity;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.yq.service.MessageService;
import org.springframework.yq.service.impl.MessageServiceImpl;

/**
 * @author yangqiang
 * @create 2021-12-03 16:01
 */
public class TestFactoryBean implements FactoryBean<MessageService> {
	@Override
	public MessageService getObject() throws Exception {
		return new MessageServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return MessageService.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
