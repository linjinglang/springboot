package com.baozoubahashiqi.springboot.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author linjl
 */
@Service
public class TestServiceImpl implements TestService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public String test() {
        return applicationContext.getEnvironment().getProperty("csdn");
    }
}
