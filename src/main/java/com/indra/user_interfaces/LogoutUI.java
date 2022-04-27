package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutUI {

    public static final Target BOTON_MENU = Target.the("boton menu")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target LOGOUT = Target.the("boton cerrar sesion")
            .locatedForAndroid(By.xpath("(//android.widget.TextView[@content-desc='test-Price'])[1]"))
            .locatedForIOS(By.xpath("//foo[]"));
}
