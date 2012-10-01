package co.uk.javavm.spring.core.resource;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
    public String printMessage() {
        return " * Bean Two * ";
    }
}
