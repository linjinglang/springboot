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
@Order(2)
public class TwiceApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        Map<String,Object> map = new HashMap<>();
        map.put("csdn","暴走吧哈士奇2");
        MapPropertySource mapPropertySource = new MapPropertySource("TwiceApplicationContextInitializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("===============================================================>TwiceApplicationContextInitializer");
    }
}
