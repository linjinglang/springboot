package com.baozoubahashiqi.springboot.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linjl
 */
@Order(1)
public class FirstApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String,Object> map = new HashMap<>();
        map.put("csdn","暴走吧哈士奇1");
        MapPropertySource mapPropertySource = new MapPropertySource("FirstApplicationContextInitializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("===============================================================>FirstApplicationContextInitializer");
    }
}
