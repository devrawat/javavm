package co.uk.javavm.spring.core;

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
