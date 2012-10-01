#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.lazy.initialized;

public class InterestInformation {
    public InterestInformation() {
        System.out.println("Bean " + this.getClass().getName() + " initialized");
    }
}
