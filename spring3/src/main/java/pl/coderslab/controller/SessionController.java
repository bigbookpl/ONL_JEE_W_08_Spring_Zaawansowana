package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String getSessionsView(HttpSession ses, Model model){
        String loginStart = (String) ses.getAttribute("loginStart");
        if (loginStart != null){
            return "loginStart istnieje - "+loginStart;
        }else {
            model.addAttribute("loginStart",LocalTime.now().toString());
            return "Ustawiona sesja";
        }
    }

}
