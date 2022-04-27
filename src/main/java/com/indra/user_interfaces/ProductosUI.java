package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {

    public static final Target TITULO_SECCION = Target.the("titulo de la seccion")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Cart drop zone']/android.view.ViewGroup/android.widget.TextView");
    public static final Target BOTON_COMPRAR_1 = Target.the("comprar backpack")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]/android.widget.TextView");
    public static final Target BOTON_COMPRAR_2 = Target.the("comprar bike light")
            .locatedBy("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[2]/android.widget.TextView");
    public static final Target CARRITO_COMPRAS = Target.the("carrito de compras")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.TextView");
    public static final Target BOTON_ADD_CAR = Target.the("boton adicionar a carrito de compras")
            .locatedBy("//*[@text='ADD TO CART']");
    public static final Target ARTICULO_COMPRA = Target.the("producto del carrito")
            .locatedBy("//*[@text='Sauce Labs Fleece Jacket']");


}