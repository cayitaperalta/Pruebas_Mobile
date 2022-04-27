package com.indra.interactions;

import com.indra.enums.Direccion;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static com.indra.enums.Direccion.ABAJO;
import static com.indra.enums.Direccion.ARRIBA;
import static com.indra.utils.Swipe.down;
import static com.indra.utils.Swipe.up;

public class Scroll implements Interaction {
    private WebElementFacade element;
    private WebDriver driver;
    private Direccion direccion;
    private int intentosMaximos;

    public Scroll(WebElementFacade element, WebDriver driver, Direccion direccion, int intentosMaximos) {
        this.element = element;
        this.driver = driver;
        this.direccion = direccion;
        this.intentosMaximos = intentosMaximos;
    }

    int contador = 0;

    @Step("{0} realiza un scroll en la direccion #direccion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!element.isVisible() && contador < intentosMaximos) {
            if (direccion == ARRIBA) {
                up(driver);
            } else if (direccion == ABAJO) {
                down(driver);
            }
            contador++;

        }
    }
    public static Scroll toElement(WebElementFacade element, WebDriver driver, Direccion direccion, int intentosMaximos){
        return Tasks.instrumented(Scroll.class, element,driver,direccion,intentosMaximos);
    }
}
