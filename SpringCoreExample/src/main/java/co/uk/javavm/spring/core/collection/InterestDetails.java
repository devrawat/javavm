package co.uk.javavm.spring.core.collection;

public class InterestDetails {
    private float interestRate;
    // Compounded or Simple
    private String interestType;

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("InterestDetails [interestRate=");
        builder.append(interestRate);
        builder.append(", interestType=");
        builder.append(interestType);
        builder.append("]");
        return builder.toString();
    }
}
