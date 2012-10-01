package co.uk.javavm.spring.core.p.namespace;

public class InterestInformation {
    private float interestRate;
    // Compounded or Simple
    private String interestType;
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }
}
