package com.onlineshopping.kharedi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    

    @GetMapping("/admin")
    public String admin(Model m){
        m.addAttribute("Admin Connected");
        return "AdminPage";
    }

    @GetMapping("/admin/categories")
    public String Categories(){
        return "categories";
    }
}
