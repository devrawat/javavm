package co.uk.javavm.spring.core.resource;

import org.springframework.stereotype.Component;

@Component
public class BeanThree extends BeanTwo {
    public String printMessage() {
        return " * Bean Three * ";
    }
}
