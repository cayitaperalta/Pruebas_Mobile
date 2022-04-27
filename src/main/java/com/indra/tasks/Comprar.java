package com.indra.tasks;


import com.indra.interactions.Scroll;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import java.time.Duration;
import static com.indra.enums.Direccion.ABAJO;
import static com.indra.user_interfaces.ProductosUI.*;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;


public class Comprar {

    public static Performable productos(){
        return Task.where("{0} compra dos productos",
                Click.on(BOTON_COMPRAR_2.waitingForNoMoreThan(Duration.ofSeconds(15))),
                Click.on(BOTON_COMPRAR_1)

        );
    }


    public static Performable Producto(Actor actor) {
        return Task.where("{0} compra el Producto",
                Scroll.toElement(ARTICULO_COMPRA.resolveFor(actor), as(actor).getDriver(), ABAJO, 10),
                Click.on(ARTICULO_COMPRA),
                Scroll.toElement(BOTON_ADD_CAR.resolveFor(actor), as(actor).getDriver(), ABAJO, 10),
                Click.on(BOTON_ADD_CAR)

        );

    }
}
