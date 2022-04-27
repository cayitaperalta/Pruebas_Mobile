package com.indra.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Espera implements Interaction {

    private int seg;
    public Espera(int seg) {
        this.seg=seg*1000;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Espera esperaSeg(int seg){
        return new Espera(seg);
    }
}