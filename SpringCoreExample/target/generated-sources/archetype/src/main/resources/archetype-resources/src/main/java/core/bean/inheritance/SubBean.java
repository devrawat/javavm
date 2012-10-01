#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.bean.inheritance;

public class SubBean {
    private String firstName;
    private String lastName;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "SubBean [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
