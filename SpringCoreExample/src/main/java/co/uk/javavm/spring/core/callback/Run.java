package co.uk.javavm.spring.core.callback;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-core-example-callback.xml");
        // Bean loaded
        context.getBean("beanOne");
        // context closed
        context.close();
    }
}
