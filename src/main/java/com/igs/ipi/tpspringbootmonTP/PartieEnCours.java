package com.igs.ipi.tpspringbootmonTP;

import com.igs.ipi.tpspringbootmonTP.model.GameModel;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PartieEnCours{

    private GameModel gm;
    public GameModel getGm() {return gm;}
    public void setGm(GameModel gm) {
        this.gm = gm;
    }
}