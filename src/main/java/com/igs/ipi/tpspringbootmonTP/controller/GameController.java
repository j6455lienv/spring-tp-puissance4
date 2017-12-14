package com.igs.ipi.tpspringbootmonTP.controller;

import com.igs.ipi.tpspringbootmonTP.model.GameModel;
import com.igs.ipi.tpspringbootmonTP.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    GameService gs = new GameService();


    @GetMapping("/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView("game")
                .addObject("title","Nouveau Puissance4")
                .addObject("body", "test")
                .addObject("route","/game/new")
                .addObject("j1", gs.newGame().getNom1())
                .addObject("j2", gs.newGame().getNom2())
                .addObject("tab", gs.newGame().getTab())
                ;
        return mav;
    }


}
