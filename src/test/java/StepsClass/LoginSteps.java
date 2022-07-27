package StepsClass;

import GyManager.PageObjectChrome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static GyManager.PageObjectChrome.*;


public class LoginSteps {
    @Given("Ingresa a la url {string}")
    public void ingresaALaUrlUrl(String url) {
        System.out.println("[INFO] Ingresamos a la la URL: " + url);
        setUP(url);
        espera();

    }

    @When("hace clic")
    public void haceClic() {
        espera();

    }

    @Then("ve el mensaje {string}")
    public void veElMensajeMensaje(String msj) {
        System.out.println("Ingresa mensaje: " + msj);
        cerrar();
    }

    @And("ingresamos el {string} y {string}")
    public void ingresamosElUsuarioYPass(String usuario,String pass) {
        PageObjectChrome.getWebElemento("email").sendKeys(usuario);
        PageObjectChrome.getWebElemento("password").sendKeys(pass);

    }
}
