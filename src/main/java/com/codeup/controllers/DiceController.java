package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;



/**
 * Created by PapoteDetres1 on 2/8/17.
 */
@Controller
public class DiceController {

    @GetMapping("/dice")
    public String welcomePage(){return "dice/dice";}

    @GetMapping("/dice/{n}")
    public String diceOne(@PathVariable int n, Model model) {
        int rollDice = (int) (Math.random() * 6 + 1);


        model.addAttribute("n", n);
        model.addAttribute("rollDice", rollDice);
        return "dice/rolldice";
    }

}
