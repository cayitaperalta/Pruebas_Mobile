package com.indra.utils;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class Swipe {

    public static void down(WebDriver facade) {

        WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
        TouchAction actions = new TouchAction((PerformsTouchActions) driver);

        int puntoInicialX = facade.manage().window().getSize().width / 2;
        int puntoInicialY = (int) (facade.manage().window().getSize().height * 0.8);
        int puntoFinalY = facade.manage().window().getSize().height / 2;

        actions
                .longPress(PointOption.point(puntoInicialX, puntoInicialY))
                .moveTo(PointOption.point(puntoInicialX, puntoFinalY))
                .release()
                .perform();

    }

    public static void up(WebDriver facade) {

        WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
        TouchAction actions = new TouchAction((PerformsTouchActions) driver);

        int puntoInicialX = facade.manage().window().getSize().width / 2;
        int puntoInicialY = facade.manage().window().getSize().height / 2;
        int puntoFinalY = (int) (facade.manage().window().getSize().height * 0.8);

        actions
                .longPress(PointOption.point(puntoInicialX, puntoInicialY))
                .moveTo(PointOption.point(puntoInicialX, puntoFinalY))
                .release()
                .perform();

    }

//    public static void toElement(WebElementFacade element, WebDriver driver, Direccion direccion, int intentosMaximos) {
//        int contador = 0;
//
//        while (!element.isVisible() && contador <intentosMaximos) {
//            if (direccion == ARRIBA) {
//                up(driver);
//            } else if (direccion== ABAJO) {
//                down(driver);
//            }
//            contador++;
}

////    }
//
//}
