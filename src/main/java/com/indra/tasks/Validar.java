package com.indra.tasks;

import com.indra.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;


import static com.indra.user_interfaces.ProductosUI.*;
import static java.time.Duration.ofSeconds;


public class Validar implements Task {
        @Override
        @Step("{0} valida producto comprado")
        public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                        Click.on(CARRITO_COMPRAS),
                        Check.whether(ARTICULO_COMPRA.waitingForNoMoreThan(ofSeconds(20)).resolveFor(actor).isDisplayed()),
                        Espera.esperaSeg(10)
                );
        }

        public static Validar CarritoCompras() {
                return Tasks.instrumented(Validar.class);
        }


}
