package com.company.FormLoginUp.Controlers;

import com.company.FormLoginUp.Models.MainModel;
import com.company.FormLoginUp.Repositories.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @Autowired
    private MainRepository mainrepository;
    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }
    @GetMapping("/info")
    public String info(Model model){
        Iterable<MainModel> info= mainrepository.findAll();
        model.addAttribute("info",info);
        return"databaseinfo";
    }
    @PostMapping("/")
    public String forminput(@RequestParam String login,@RequestParam String password, Model model){
        MainModel table=new MainModel(login,password);
        mainrepository.save(table);
        return "redirect:/";
    }


}
