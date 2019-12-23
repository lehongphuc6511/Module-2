package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("greeting")
public class GreetingController {
    @GetMapping("/greeting2")
    public String greeting(@RequestParam String text, Model modle){
        modle.addAttribute("text", text);
        return "greeting2";
    }
}
