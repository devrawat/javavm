#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

public class SpringBeanNonStaticMethodExample {
    private static SpringBeanNonStaticMethodExample bean;

    // Private constructor, So new operator can not be used to create instance
    // of this class.
    private SpringBeanNonStaticMethodExample() {
        System.out.println("Contructor");
    }
    /**
     * This method returns instance of SpringBeanStaticMethodExample class. This
     * is non static method.
     *
     * @return new instance of SpringBeanStaticMethodExample
     */
    public SpringBeanNonStaticMethodExample getInstance() {
        System.out.println("Creating instance");
        return bean;
    }
    public void printMessage() {
        System.out.println("Hello, this is new");
    }
}
