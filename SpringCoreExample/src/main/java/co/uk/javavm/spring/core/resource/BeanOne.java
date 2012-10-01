package co.uk.javavm.spring.core.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BeanOne {
    private BeanTwo beanTwoSetter;
    private BeanTwo beanTwoContructor;
    private BeanTwo beanTwoAnyMethod;
    // Property is autowired
    @Autowired
    @Qualifier("beanTwo")
    private BeanTwo beanTwoProperty;
    // Constructor is autowired
    @Autowired
    private BeanOne(@Qualifier("beanTwo") BeanTwo beanTwoContructor) {
        this.beanTwoContructor = beanTwoContructor;
    }
    // Setter is autowired
    @Autowired
    @Qualifier("beanThree")
    public void setBeanTwoSetter(BeanTwo beanTwoSetter) {
        this.beanTwoSetter = beanTwoSetter;
    }
    // Any other method is autowired
    @Autowired
    @Qualifier("beanThree")
    public void helloWorld(BeanTwo beanTwoAnyMethod) {
        this.beanTwoAnyMethod = beanTwoAnyMethod;
    }
    public String toString() {
        return "BeanOne [\nSetter based autowired = " + beanTwoSetter.printMessage()
            + ",\nContructor based autowired = " + beanTwoContructor.printMessage()
            + ",\nAny method based autowired =  =" + beanTwoAnyMethod.printMessage()
            + ",\nProperty based autowired = =" + beanTwoProperty.printMessage() + "\n]";
    }
}
