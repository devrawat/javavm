#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
            "spring-core-example-autowire.xml");
        BeanOne bean = (BeanOne) beanFactory.getBean("beanOne");
        bean.getBeanTwo().printMessage();
    }
}
