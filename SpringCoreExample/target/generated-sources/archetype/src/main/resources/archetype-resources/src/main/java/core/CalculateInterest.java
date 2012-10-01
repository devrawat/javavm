#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

public class CalculateInterest {
    private long loan;
    private int durationInMonths;
    private InterestInformation interestInfo;
    private CalculateInterest(long loan, int durationInMonths, InterestInformation interestInfo) {
        this.loan = loan;
        this.durationInMonths = durationInMonths;
        this.interestInfo = interestInfo;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" CalculateInterest [loan=");
        builder.append(loan);
        builder.append(", durationInMonths=");
        builder.append(durationInMonths);
        builder.append(", interestInfo=");
        builder.append(interestInfo);
        builder.append("]");
        return builder.toString();
    }
}
