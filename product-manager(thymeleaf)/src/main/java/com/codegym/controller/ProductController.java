package com.codegym.controller;

import com.codegym.service.ProductService;
import com.codegym.service.ProductServicelmpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    ProductService productService = new ProductServicelmpl();
    @GetMapping("/")
    public String index (Model model){
        model.addAttribute("products", productService.listAll());
        return "index";
    }




}
