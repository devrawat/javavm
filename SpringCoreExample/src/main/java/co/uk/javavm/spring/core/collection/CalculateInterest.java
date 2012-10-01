package co.uk.javavm.spring.core.collection;

public class CalculateInterest {
    private long loan;
    private int durationInMonths;
    private InterestDetails interestDetails;
    private CalculateInterest(long loan, int durationInMonths, InterestDetails interestDetails) {
        this.loan = loan;
        this.durationInMonths = durationInMonths;
        this.interestDetails = interestDetails;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CalculateInterest [loan=");
        builder.append(loan);
        builder.append(", durationInMonths=");
        builder.append(durationInMonths);
        builder.append(", interestDetails=");
        builder.append(interestDetails);
        builder.append("]");
        return builder.toString();
    }
}
