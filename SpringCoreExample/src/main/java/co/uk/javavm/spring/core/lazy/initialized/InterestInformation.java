package co.uk.javavm.spring.core.lazy.initialized;

public class InterestInformation {
    public InterestInformation() {
        System.out.println("Bean " + this.getClass().getName() + " initialized");
    }
}
