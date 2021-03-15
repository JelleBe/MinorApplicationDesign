package nl.bioinf.nanotomy.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String getLandingPage(){
        return "landingpage";
    }
}