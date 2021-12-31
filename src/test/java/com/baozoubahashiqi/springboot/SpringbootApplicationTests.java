package com.baozoubahashiqi.springboot;

import com.baozoubahashiqi.springboot.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void testInitializer() {
        System.out.println("InitializerName: " + testService.test());
    }

}
