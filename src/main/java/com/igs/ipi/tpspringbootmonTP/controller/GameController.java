package com.igs.ipi.tpspringbootmonTP.controller;

import com.igs.ipi.tpspringbootmonTP.PartieEnCours;
import com.igs.ipi.tpspringbootmonTP.model.GameModel;
import com.igs.ipi.tpspringbootmonTP.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/game")
public class GameController {

    private GameService gameService = new GameService();

    @Autowired
    private PartieEnCours partie;

    @GetMapping("/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView("game")
                .addObject("title","Nouveau Puissance4")
                .addObject("body", "test")
                .addObject("route","/game/new")
                .addObject("j1", gameService.newGame().getNom1())
                .addObject("j2", gameService.newGame().getNom2())
                .addObject("tab", gameService.newGame().getTab())
                ;
        return mav;
    }

    @GetMapping("/game")
    public ModelAndView game() {

        String showedName;

        GameModel game = partie.getGm();

        if (game.getPlayerTurn() == 1) {
            showedName = game.getNom1();
        } else showedName = game.getNom2();

        if (game.getWinner() != 0) {
            showedName = showedName + " is the winner";
        }


        ModelAndView modelAndView = new ModelAndView("game");
        modelAndView
                .addObject("game", game)
                .addObject("showedName", showedName);
        return modelAndView;
    }

}