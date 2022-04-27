package com.indra.steps_definitions;


import com.indra.tasks.Comprar;
import com.indra.tasks.Validar;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import static com.indra.user_interfaces.ProductosUI.CARRITO_COMPRAS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ComprasStep {

    @Managed(driver = "appium")
    AppiumDriver driver;
    private Actor elvis =Actor.named("Elvis");

    @Before
    public void inicializarEscenario(){
        Stage stage = OnStage.setTheStage(new OnlineCast());
        elvis.can(BrowseTheWeb.with(driver));
    }

    @Then("el deberia poder comprar productos")
    public void elDeberiaPoderComprarProductos() {
        elvis.attemptsTo(Comprar.productos());

    }

    @And("validar el carrito de compras")
    public void validarElCarritoDeCompras() {
        elvis.attemptsTo((Ensure.that(CARRITO_COMPRAS).text().isEqualTo("2")));

    }


    @Then("el deberia poder comprar el Producto")
    public void elDeberiaPoderComprarElProducto() {
        elvis.attemptsTo(Comprar.Producto(elvis));
    }

    @And("validar el producto en el carrito de compras")
    public void validarElProductoEnElCarritoDeCompras() {
        elvis.attemptsTo(Validar.CarritoCompras());


    }
}
