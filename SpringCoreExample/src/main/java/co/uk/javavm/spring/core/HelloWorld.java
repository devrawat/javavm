package co.uk.javavm.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-core-example.xml");
        CalculateInterest ci = (CalculateInterest) bean.getBean("calculateInterest");
        System.out.println(ci.toString());
    }
}
