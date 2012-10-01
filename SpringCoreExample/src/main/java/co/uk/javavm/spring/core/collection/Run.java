package co.uk.javavm.spring.core.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-core-example-collection.xml");
        BankProp ci = (BankProp) bean.getBean("bankProp");
        System.out.println(ci.toString());
    }
}
