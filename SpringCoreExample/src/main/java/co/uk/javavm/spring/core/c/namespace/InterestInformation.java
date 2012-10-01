package co.uk.javavm.spring.core.c.namespace;

public class InterestInformation {
    private float interestRate;
    // Compounded or Simple
    private String interestType;
    public InterestInformation(float interestRate, String interestType) {
        this.interestRate = interestRate;
        this.interestType = interestType;
    }
}
