package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PapoteDetres1 on 2/7/17.
 */
@Controller
public class HelloWorldController {


    @GetMapping("/home")
    public String homePage(){
        return "home";//home.html
    }

    @GetMapping("/demo")
    public String showDefault(Model model){

        List<String> names = new ArrayList<>();
        names.add("bob");
        names.add("bob2");
        names.add("bob3");
        names.add("bob4");
        names.add("bob5");
        //this is a string
        model.addAttribute("date", "Feb 7th");
        //this is a list
        //ListNames is passing the list to the default.html in the Demos directory
        model.addAttribute("ListNames", names);
        return "/demo/default";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact/form";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String Hello(@PathVariable String name){
        return "<h1>Hello "+name+"World Spring!!!</h1>";
    }

    @RequestMapping(path = "/bye/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String bye(@PathVariable String name){
        return "<h1> Goodbye" + name + "! from Spring <h1>";
    }







}
