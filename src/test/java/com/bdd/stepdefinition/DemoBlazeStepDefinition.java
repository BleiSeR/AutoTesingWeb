package com.bdd.stepdefinition;

import com.bdd.step.DemoBlazeStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoBlazeStepDefinition {

    @Steps
    DemoBlazeStep demoblazeStep;

    @Dado("que aperturamos la web demoBlaze en el navegador Chrome")
    public void que_aperturamos_la_web_demoBlaze_en_el_navegador_Chrome(){
        demoblazeStep.que_aperturamos_la_web_demoBlaze_en_el_navegador_Chrome();
    }

    @Cuando("^realizamos click en Sign Up$")
    public void realizamosClickEnSignUp() {
        demoblazeStep.realizamosClickEnSignUp();
    }

    @Y("^Escribimos Paolo123 en el cuadro de texto Username$")
    public void escribimosPaolo123EnElCuadroDeTextoUsername() {
        demoblazeStep.escribimosPaolo123EnElCuadroDeTextoUsername();
    }

    @Y("^escribimos asdqwe en el cuadro de texto Contraseña$")
    public void escribimosAsdqweEnElCuadroDeTextoContraseña() {
        demoblazeStep.escribimosAsdqweEnElCuadroDeTextoContraseña();
    }

    @Y("^hacemos click en Sign Up$")
    public void hacemosClickEnSignUp() {
        demoblazeStep.hacemosClickEnSignUp();
    }

    @Entonces("^Validamos que el usuario se haya registrado exitosamente$")
    public void validamosQueElUsuarioSeHayaRegistradoExitosamente() {
        demoblazeStep.validamosQueElUsuarioSeHayaRegistradoExitosamente();
    }


    @Dado("^que aperturamos la pagina demoBlaze en el navegador \"([^\"]*)\"$")
    public void queAperturamosLaPaginaDemoBlazeEnElNavegador(String navegador) throws Throwable {
        demoblazeStep.queAperturamosLaPaginaDemoBlazeEnElNavegador(navegador);
    }

    @Cuando("^seleccionamos \"([^\"]*)\"$")
    public void seleccionamos(String categoria) throws Throwable {
        demoblazeStep.seleccionamos(categoria);
    }

    @Y("^luego hacemos click en \"([^\"]*)\" para ver su detalle$")
    public void luegoHacemosClickEnParaVerSuDetalle(String productos) throws Throwable {
        demoblazeStep.luegoHacemosClickEnParaVerSuDetalle(productos);
    }

    @Y("^luego hacemos click en Add to cart$")
    public void luegoHacemosClickEnAddToCart() {
        demoblazeStep.luegoHacemosClickEnAddToCart();
    }

    @Y("^aceptamos el mensaje de alerta$")
    public void aceptamosElMensajeDeAlerta() {
        demoblazeStep.aceptamosElMensajeDeAlerta();
    }

    @Y("^hacemos click en Cart$")
    public void hacemosClickEnCart() {
        demoblazeStep.hacemosClickEnCart();
    }

    @Y("^luego hacemos click en Place Order$")
    public void luegoHacemosClickEnPlaceOrder() {
        demoblazeStep.luegoHacemosClickEnPlaceOrder();
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Name$")
    public void escribimosEnElCuadroDeTextoName(String name) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoName(name);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Country$")
    public void escribimosEnElCuadroDeTextoCountry(String country) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoCountry(country);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto City$")
    public void escribimosEnElCuadroDeTextoCity(String city) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoCity(city);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Credit Card$")
    public void escribimosEnElCuadroDeTextoCreditCard(String creditCard) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoCreditCard(creditCard);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Month$")
    public void escribimosEnElCuadroDeTextoMonth(String month) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoMonth(month);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Year$")
    public void escribimosEnElCuadroDeTextoYear(String year) throws Throwable {
        demoblazeStep.escribimosEnElCuadroDeTextoYear(year);
    }

    @Y("^luego hacemos click en purchase$")
    public void luegoHacemosClickEnPurchase() {
        demoblazeStep.luegoHacemosClickEnPurchase();
    }

    @Entonces("^Validamos que se realizado el proceso correctamente$")
    public void validamosQueSeRealizadoElProcesoCorrectamente() {
        demoblazeStep.validamosQueSeRealizadoElProcesoCorrectamente();
    }



}
