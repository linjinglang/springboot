package com.baozoubahashiqi.springboot;

import com.baozoubahashiqi.springboot.initializer.FirstApplicationContextInitializer;
import com.baozoubahashiqi.springboot.initializer.TwiceApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
        springApplication.addInitializers(new FirstApplicationContextInitializer());
        springApplication.addInitializers(new TwiceApplicationContextInitializer());
        //可以在application.properties配置文件中配置，也可以直接在properties里边设置属性
        Properties properties = new Properties();
        properties.put("csdn","暴走吧哈士奇");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }

}
