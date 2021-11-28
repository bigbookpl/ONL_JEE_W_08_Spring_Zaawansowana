package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneOffset;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloView(Model model){

        Instant.now(Clock.fixed(
                Instant.parse("2018-08-22T00:00:00Z"),
                ZoneOffset.UTC));

        if (LocalTime.now().getHour() >= 8 && LocalTime.now().getHour() < 20){
            model.addAttribute("fontColor","black");
            model.addAttribute("backgroundColor","white");
        }else {
            model.addAttribute("fontColor","white");
            model.addAttribute("backgroundColor","black");
        }


        return "home";
    }

}
