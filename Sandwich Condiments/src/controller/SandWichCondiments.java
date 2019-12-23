package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.List;

@Controller
public class SandWichCondiments {
    @GetMapping ("/sandWich")
    public String sandWich(){
    return "index";
    }

    @PostMapping ("/result")
    public String result(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment", condiment);


        return "index";
    }
}

