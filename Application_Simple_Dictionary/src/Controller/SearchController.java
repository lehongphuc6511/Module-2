package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String search(){
        return "search";
    }
    @PostMapping("/result")
    public String result(@RequestParam String world, Model model){
        model.addAttribute("world",world);
        switch (world){
            case "message":
                model.addAttribute("translate","Tin Nhắn");
                break;
            case "cat":
                model.addAttribute("translate","Con Mèo");
                break;
            case "fish":
                model.addAttribute("translate","Con Cá");
                break;
            case "people":
                model.addAttribute("translate","Con Người");
                break;
            case "books":
                model.addAttribute("translate","Những Quyển Sách");
                break;
            default:
                model.addAttribute("translate","Not In Dictionary");
                break;
        }
        return "search";
    }
}
