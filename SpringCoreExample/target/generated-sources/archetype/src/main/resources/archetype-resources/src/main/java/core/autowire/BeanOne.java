#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.autowire;
public class BeanOne {
    private BeanTwo beanTwo;
    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
    public BeanTwo getBeanTwo() {
        return beanTwo;
    }
}
