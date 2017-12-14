package com.igs.ipi.tpspringbootmonTP.service;

import com.igs.ipi.tpspringbootmonTP.model.GameModel;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public GameModel newGame(){
        GameModel gm = new GameModel("Julien","Vincent");
        return gm;
    }
}
