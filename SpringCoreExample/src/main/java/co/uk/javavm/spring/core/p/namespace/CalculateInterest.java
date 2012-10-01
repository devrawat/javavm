package co.uk.javavm.spring.core.p.namespace;

public class CalculateInterest {
    private long loan;
    private int durationInMonths;
    private InterestInformation interestInfo;

    public void setLoan(long loan) {
        this.loan = loan;
    }
    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }
    public void setInterestInfo(InterestInformation interestInfo) {
        this.interestInfo = interestInfo;
    }
    @Override
    public String toString() {
        return "CalculateInterest [loan=" + loan + ", durationInMonths=" + durationInMonths
            + ", interestInfo=" + interestInfo + "]";
    }

}
