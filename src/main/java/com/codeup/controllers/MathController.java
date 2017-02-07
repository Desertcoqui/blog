package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by PapoteDetres1 on 2/7/17.
 */

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody

    public String Add(@PathVariable int num1, @PathVariable int num2){
        return "<h1>Your sum of " + num1 +" + "+ num2+" = "+(num1+num2)+" </h1>";
    }
//-------------------------------------------------------------------------------------------

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody

    public String multiply(@PathVariable int num1, @PathVariable int num2){
        return "<h1>The multiplication of " + num1 +" * "+ num2+" = "+(num1*num2)+" </h1>";
    }
//-------------------------------------------------------------------------------------------
    @GetMapping("/sub/{num1}/and/{num2}")
    @ResponseBody

    public String sub(@PathVariable int num1, @PathVariable int num2){
        return "<h1>The subtraction of " + num1 +" - "+ num2+" = "+(num1-num2)+" </h1>";
    }
//-------------------------------------------------------------------------------------------
    @GetMapping("/divide/{num1}/and/{num2}")
    @ResponseBody

    public String divide(@PathVariable int num1, @PathVariable int num2){
        return "<h1>The subtraction of " + num1 +" / "+ num2+" = "+(num1/num2)+" </h1>";
    }


}
