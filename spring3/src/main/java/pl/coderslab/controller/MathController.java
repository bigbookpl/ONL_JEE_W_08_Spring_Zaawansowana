package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
//     /first/random/10/30
@Controller
@RequestMapping("/first")
public class MathController {

    @GetMapping(path ="/random/{min}/{max}", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String randomAction(@PathVariable int max, @PathVariable int min){

        Random rand = new Random();
        int rnd = rand.nextInt(max+1-min)+min;
        return "Użytkownik podał wartość "+min+" i "+max+". Wylosowano liczbę: "+rnd;
    }
}
