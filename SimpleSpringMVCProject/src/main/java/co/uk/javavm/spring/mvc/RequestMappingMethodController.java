package co.uk.javavm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestMappingMethodController
{
    @RequestMapping(value = "/form")
    public String textForm()
    {
        return "form";
    }

    @RequestMapping(value = "/xmlForm")
    public String xmlForm()
    {
        return "xmlForm";
    }

    /*
     * RequestMapping wIth POST method.
     */
    @RequestMapping(value = "/form/display", method = RequestMethod.POST)
    public String processResult(Model model, 
            @RequestBody String requestVar, 
            @RequestParam(value = "lastName") String lastName, 
            @RequestParam(value = "firstName") String firstName)
    {
        System.out.println(" Request Variable  " + requestVar);
        model.addAttribute("lastName", lastName);
        model.addAttribute("firstName", firstName);
        return "display";
    }

    /*
     * Process XML Request . 
     * Consume request have Content-Type with application/xml.
     * Produces response of content-type text/plain 
     */
    @RequestMapping(value = "/xmlDisplay", 
                                    method = RequestMethod.POST, 
                                    consumes = "application/xml",
                                    produces="text/plain")
    public @ResponseBody String addUser(@RequestHeader("content-type") String contentType, 
                                     @RequestBody String reqbody)
    {
        System.out.println(" Value of request " + reqbody);
        System.out.println("content type is " + contentType);
        return reqbody;
    }
}
