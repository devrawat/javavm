package co.uk.javavm.spring.core.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanOne implements InitializingBean, DisposableBean {
    public BeanOne() {
        System.out.println("  Bean instantiated  ");
    }
    public void destroy() throws Exception {
        System.out.println("  Initialization call back  ");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("  Destruction call back   ");
    }
}
