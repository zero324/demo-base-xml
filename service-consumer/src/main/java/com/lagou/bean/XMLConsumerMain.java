package com.lagou.bean;

import com.lagou.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class XMLConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        applicationContext.start();
        HelloService helloService = applicationContext.getBean(HelloService.class);
        while(true){
            System.in.read();
            String world = helloService.sayHello("world");
            System.out.println("调用成功: "+world);
        }
    }

}
