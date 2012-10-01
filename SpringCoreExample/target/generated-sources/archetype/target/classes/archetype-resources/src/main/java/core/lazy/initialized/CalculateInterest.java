#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.lazy.initialized;

public class CalculateInterest {
    public CalculateInterest() {
        System.out.println("Bean " + this.getClass().getName() + " initialized");
    }
}
