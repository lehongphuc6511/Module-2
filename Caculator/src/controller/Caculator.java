package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @GetMapping ("/Caculator")
        public String Caculator(){

        return "views";
    }
    @PostMapping ("/Result")
    public String Result(@RequestParam Float text1,Float text2,String operator, Model model){
        Float result;
        switch (operator){
            case "Addition(+)":
                result = text1 + text2;
                break;
            case "Subtraction(-)":
                result = text1 - text2;
                break;
            case "Multiplication(X)":
                result = text1 * text2;
                break;
            case "Division(/)":
                result = text1 / text2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        model.addAttribute("result",result);
        return "views";
    }

}
