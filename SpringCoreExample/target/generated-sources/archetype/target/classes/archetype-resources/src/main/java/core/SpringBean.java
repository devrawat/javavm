#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

public class SpringBean {
    private String name;
    public SpringBean() {
        System.out.println("This is contrcutor of bean");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(" Welcome  " + name);
    }
}
