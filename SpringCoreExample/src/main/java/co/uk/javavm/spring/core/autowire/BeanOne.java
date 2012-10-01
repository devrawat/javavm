package co.uk.javavm.spring.core.autowire;
public class BeanOne {
    private BeanTwo beanTwo;
    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
    public BeanTwo getBeanTwo() {
        return beanTwo;
    }
}
