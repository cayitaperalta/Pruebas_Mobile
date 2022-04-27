package com.indra.tasks;

import com.indra.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.indra.user_interfaces.LogoutUI.BOTON_MENU;
import static com.indra.user_interfaces.LogoutUI.LOGOUT;

public class Cerrar {

    public static Performable sesion(){
        return Task.where("{0} cierra sesion",
                Click.on(BOTON_MENU),
                Click.on(LOGOUT)
                );
    }
}
