package com.igs.ipi.tpspringbootmonTP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    @GetMapping("/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView("game")
                .addObject("title","Nouveau Puissance4")
                .addObject("body", "test")
                .addObject("route","/game/new");
        return mav;
    }


}
