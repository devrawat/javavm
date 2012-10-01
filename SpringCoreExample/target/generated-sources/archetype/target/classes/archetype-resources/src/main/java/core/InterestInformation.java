#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

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
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LocalBean [interestRate=");
        builder.append(interestRate);
        builder.append(", interestType=");
        builder.append(interestType);
        builder.append("]");
        return builder.toString();
    }
}
