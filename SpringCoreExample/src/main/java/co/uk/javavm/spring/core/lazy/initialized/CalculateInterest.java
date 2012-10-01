package co.uk.javavm.spring.core.lazy.initialized;

public class CalculateInterest {
    public CalculateInterest() {
        System.out.println("Bean " + this.getClass().getName() + " initialized");
    }
}
