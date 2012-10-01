#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.lazy.initialized;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-core-example-lazy-initialized.xml");
        System.out.println("Getting bean --> " + CalculateInterest.class.getCanonicalName());
        bean.getBean("calculateInterest");
        System.out.println("Getting bean --> " + InterestInformation.class.getCanonicalName());
        bean.getBean("inetrestInfo");
    }
}
