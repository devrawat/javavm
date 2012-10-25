package co.uk.javavm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttributeController
{
    /*
     * Sets the Person in model map
     */
    @ModelAttribute("person")
    public Person getLastName()
    {
        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Wright";
        return person;
    }

    /*
     * Handler method to display the original person.
     */
    @RequestMapping("/person")
    public String processRequestFirst()
    {
        return "displayPerson";
    }

    /*
     * Handler method to display the changed person. ModelAttribute is passed to
     * the method which then gets changed with new values.
     */
    @RequestMapping("/person/change")
    public String processRequestSecond(@ModelAttribute("person") Person person)
    {
        person.firstName = "David";
        person.lastName = "Boon";
        return "displayPerson";
    }

    /*
     * Model attribute newPerson is not present in the model so a instance of
     * Person will be created in this handler method.
     */
    @RequestMapping("/newperson")
    public String processRequestThird(@ModelAttribute("newPerson") Person newPerson)
    {
        newPerson.firstName = "new David";
        newPerson.lastName = "new Boon";
        System.out.println(newPerson);
        return "displayPerson";
    }
}
/*
 * Person class
 */
class Person
{
    public String firstName;
    public String lastName;
    public Person()
    {
     
    }
    public String toString()
    {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}

