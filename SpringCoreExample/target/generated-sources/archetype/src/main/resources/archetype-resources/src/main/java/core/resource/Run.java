#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
            "spring-core-example-annotation.xml");
        BeanOne beanOne = (BeanOne) beanFactory.getBean("beanOne");
        System.out.println(beanOne.toString());
    }
}
