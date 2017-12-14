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

    GameService gm = new GameService();

    @GetMapping("/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView("game")
                .addObject("title","Nouveau Puissance4")
                .addObject("body", "test")
                .addObject("route","/game/new")
                .addObject("j1", gm.newGame().getNom1())
                .addObject("j2", gm.newGame().getNom2())
                ;
        return mav;
    }


}
