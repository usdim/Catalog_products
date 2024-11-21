package com.cataloge.com.cataloge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@SpringBootApplication
public class Application {
    @Autowired
    Operation oper;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);


    }

    @GetMapping("/")
    public String getFirst(Model model) {

        model.addAttribute("tab_lines", oper.products);
        return "catalogue-view";
    }

    @GetMapping("/diskr")
    public String getSecond(int id, Model model1) {
        System.out.println("getSecond");
        System.out.println("id = " + id);

        model1.addAttribute("product", oper.getByid(id));

        return "diskr";
    }


    @GetMapping("/deleteProd")
    public String deleteProduct(int id, Model model2) {

        model2.addAttribute("product", oper.removeById(id));
        return "redirect:/";
    }
}



