package co.uk.javavm.spring.mvc;

import static java.text.DateFormat.LONG;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    // No primary mapping (empty value element)
    @RequestMapping("/")
    public String defaultMapping(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(LONG, LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        model.addAttribute("message", "From Empty Primary Mapping Method handler");
        return "home";
    }

    // Simple primary mapping expression.
    @RequestMapping(value = "/homePage")
    public String simpleMapping(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(LONG, LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        model.addAttribute("message", "From Simple Primary Mapping Method handler");
        return "home";
    }

    // Template primary mapping expression.
    // Each URI template variable will have corresponding argument with
    // @PathVariable annotation
    // Here template variable is same as argument variable name.
    @RequestMapping(value = "/homePage/{month}/{year}")
    public String templateMappingOne(Model model, @PathVariable int month, @PathVariable int year) {
        model.addAttribute("message", " Month is " + month + "  Year is  " + year);
        return "home";
    }

    // Template primary mapping expression.
    // Each URI template variable will have corresponding argument with
    // @PathVariable annotation
    // Here template variable is different from argument variable name.
    @RequestMapping(value = "/homePage/{day}")
    public String templateMappingTwo(Model model, @PathVariable("day") int dayVar) {
        model.addAttribute("message", " Day is " + dayVar);
        return "home";
    }

    /*
     * The syntax for supporting regular expression is
     * {variableName:regularExpression} e.g. We have to pass date in the
     * yyyy-mm-dd format, to capture this we can define our mapping in the form
     * of regular expression. If any invalid date is passed like 1525-18-15 then
     * WARNING: No mapping found for HTTP request with URI
     * [/springMVC/date/1525-18-16] in DispatcherServlet with name 'appServlet'
     * will be thrown on server console.
     */
    @RequestMapping(value = "/date/{year:[12][0-9]\\d\\d}-{month:0[1-9]|1[012]}-{day:0[1-9]|[12][0-9]|3[01]}")
    public String templateMappingWithRegularExpression(Model model, @PathVariable int day, @PathVariable int month, @PathVariable int year) {
        model.addAttribute("message", " Day  is " + day + "\n Year is " + year + "\n Month is " + month);
        return "home";
    }

    /*
     * The syntax for supporting a path pattern We can pass any thing in place
     * of "*"
     */
    @RequestMapping(value = "/path/*/check/")
    public String templateMappingWithPathPattern(Model model) {
        model.addAttribute("message", "Check ");
        return "home";
    }
}
