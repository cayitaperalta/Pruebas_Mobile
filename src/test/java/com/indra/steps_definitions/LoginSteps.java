package com.indra.steps_definitions;

import com.indra.tasks.Cerrar;
import com.indra.tasks.Iniciar;
import com.indra.user_interfaces.ProductosUI;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.time.Duration;

import static com.indra.user_interfaces.LoginUI.LOGIN;

public class LoginSteps {

    @Managed(driver = "appium")
    AppiumDriver driver;
    private Actor elvis =Actor.named("Elvis");

    @Before
    public void inicializarEscenario(){
        Stage stage = OnStage.setTheStage(new OnlineCast());
        elvis.can(BrowseTheWeb.with(driver));
    }

    @Given("el esta en la pantalla de inicio de sesion")
    public void elEstaEnLaPantallaDeInicioDeSesion() {
        elvis.attemptsTo();

    }

    @When("el ingresa el usuario {string} y el password {string}")
    public void elIngresaElUsuarioYElPassword(String usuario, String password) {
        elvis.attemptsTo(
                Iniciar.sesionConLasCredenciales(usuario, password)
        );
    }

    @Then("el deberia poder ingresar a la aplicacion")
    public void elDeberiaPoderIngresarALaAplicacion() {
        elvis.attemptsTo(Ensure.that(ProductosUI.TITULO_SECCION.waitingForNoMoreThan(Duration.ofSeconds(20))).isDisplayed());

    }

    @Then("el deberia poder cerrar la sesion")
    public void elDeberiaPoderCerrarLaSesion() {
        elvis.attemptsTo(Cerrar.sesion());

    }

    @And("el deberia poder ver la pantalla de login")
    public void elDeberiaPoderVerLaPantallaDeLogin() {
        elvis.attemptsTo(Ensure.that(LOGIN.waitingForNoMoreThan(Duration.ofSeconds(20))).isDisplayed());

    }

    @When("el inicia sesion con el usuario generico")
    public void elIniciaSesionConElUsuarioGenerico() {
        elvis.attemptsTo(Iniciar.sesionConUsuarioGenerico());
    }

}
