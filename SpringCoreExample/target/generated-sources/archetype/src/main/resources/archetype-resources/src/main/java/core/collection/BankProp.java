#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.collection;

import java.util.Properties;

public class BankProp {
    private Properties banksNameProp;
    public BankProp(Properties banksNameProp) {
        this.banksNameProp = banksNameProp;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BankProp [banksNameProp=");
        builder.append(banksNameProp);
        builder.append("]");
        return builder.toString();
    }
}
