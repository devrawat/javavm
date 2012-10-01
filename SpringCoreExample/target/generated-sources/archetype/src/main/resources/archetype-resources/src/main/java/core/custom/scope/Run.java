#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.custom.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
            "spring-core-example-scope.xml");

        // Bean request from container
        BeanOne firstInstance = (BeanOne) beanFactory.getBean("beanOne");
        // Bean request from container again
        BeanOne secondInstance = (BeanOne) beanFactory.getBean("beanOne");
        System.out.println(" Instances are same: " + firstInstance.equals(secondInstance));
        /*
         * Output:
         *
         * In case of singleton scope we get "Bean instantiated" printed only
         * once and Instances are same: true
         *
         * In case of prototype scope we get "Bean instantiated" printed twice
         * and Instances are same: false
         */
    }
}
