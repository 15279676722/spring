package org.springframework.yq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.yq.entity.TestBean;
import org.springframework.yq.service.MessageService;

/**
 * @author yangqiang
 * @create 2021-12-02 15:50
 */
public class MessageServiceImpl implements MessageService {
	@Autowired
    private TestBean testBean;
	public String getMessage() {
		return testBean.getName();
	}
}
