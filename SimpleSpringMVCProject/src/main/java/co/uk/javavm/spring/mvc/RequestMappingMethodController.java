package co.uk.javavm.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestMappingMethodController {
    @RequestMapping(value = "/form/")
    public String defaultMapping() {
        return "form";
    }
    /*
     * RequestMapping wIth POST method.
     */
    @RequestMapping(
            value = "/form/display", 
            method = RequestMethod.POST)
    public String processResult(Model model, 
            @RequestBody String requestVar,
            @RequestParam(value="lastName") String lastName,
            @RequestParam(value="firstName") String firstName) {
        System.out.println(" Request Variable  "+requestVar);
        model.addAttribute("lastName", lastName);
        model.addAttribute("firstName", firstName);
        return "display";
    }
}
