package com.baozoubahashiqi.springboot.bootloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author linjl
 */
@Component
@Order(2)
public class SecondCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner---------------------------2");
    }
}
