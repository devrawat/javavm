package co.uk.javavm.spring.mvc;

import static java.text.DateFormat.LONG;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class InterceptorController
{
    // No primary mapping (empty value element)
    @RequestMapping("/intercept")
    public String defaultMapping(Locale locale, Model model)
    {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(LONG, LONG, locale);
        String formattedDate = dateFormat.format(date);
        System.out.println("Inside controller ");
        model.addAttribute("serverTime", formattedDate);
        model.addAttribute("message", "Intercepted");
        return "home";
    }

}
