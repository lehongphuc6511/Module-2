package Chuyen_doi_tien_te.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class chuyen_doi_controller {
    @GetMapping("/converter")
    public String index() {
        return "converter";
    }

    @PostMapping("/result")
    public String submit(@RequestParam String usd, Model model) {
        float result = Float.parseFloat(usd) * 23000;
        model.addAttribute("result", result);
        model.addAttribute("usd",usd);

        return "converter";
    }
}
