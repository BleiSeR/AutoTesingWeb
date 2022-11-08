package com.bdd.step;

import com.bdd.page.DemoBlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoBlazeStep extends ScenarioSteps {

    DemoBlazePage DemoblazePage;

    @Step
    public void que_aperturamos_la_web_demoBlaze_en_el_navegador_Chrome() {
        DemoblazePage.que_aperturamos_la_web_demoBlaze_en_el_navegador_Chrome();
    }
    @Step
    public void realizamosClickEnSignUp() {
        DemoblazePage.realizamosClickEnSignUp();
    }
    @Step
    public void escribimosPaolo123EnElCuadroDeTextoUsername() {
        DemoblazePage.escribimosPaolo123EnElCuadroDeTextoUsername();
    }
    @Step
    public void escribimosAsdqweEnElCuadroDeTextoContraseña() {
        DemoblazePage.escribimosAsdqweEnElCuadroDeTextoContraseña();
    }
    @Step
    public void hacemosClickEnSignUp() {
        DemoblazePage.hacemosClickEnSignUp();
    }
    @Step
    public void validamosQueElUsuarioSeHayaRegistradoExitosamente() {
        DemoblazePage.validamosQueElUsuarioSeHayaRegistradoExitosamente();
    }
    @Step
    public void queAperturamosLaPaginaDemoBlazeEnElNavegador(String navegador) {
        DemoblazePage.queAperturamosLaPaginaDemoBlazeEnElNavegador(navegador);
    }
    @Step
    public void seleccionamos(String categoria) {
        DemoblazePage.seleccionamos(categoria);
    }
    @Step
    public void luegoHacemosClickEnParaVerSuDetalle(String productos) {
        DemoblazePage.luegoHacemosClickEnParaVerSuDetalle(productos);
    }
    @Step
    public void luegoHacemosClickEnAddToCart() {
        DemoblazePage.luegoHacemosClickEnAddToCart();
    }
    @Step
    public void aceptamosElMensajeDeAlerta() {
        DemoblazePage.aceptamosElMensajeDeAlerta();
    }
    @Step
    public void hacemosClickEnCart() {
        DemoblazePage.hacemosClickEnCart();
    }
    @Step
    public void luegoHacemosClickEnPlaceOrder() {
        DemoblazePage.luegoHacemosClickEnPlaceOrder();
    }
    @Step
    public void escribimosEnElCuadroDeTextoName(String name) {
        DemoblazePage.escribimosEnElCuadroDeTextoName(name);
    }
    @Step
    public void escribimosEnElCuadroDeTextoCountry(String country) {
        DemoblazePage.escribimosEnElCuadroDeTextoCountry(country);
    }
    @Step
    public void escribimosEnElCuadroDeTextoCity(String city) {
        DemoblazePage.escribimosEnElCuadroDeTextoCity(city);
    }
    @Step
    public void escribimosEnElCuadroDeTextoCreditCard(String creditCard) {
        DemoblazePage.escribimosEnElCuadroDeTextoCreditCard(creditCard);
    }
    @Step
    public void escribimosEnElCuadroDeTextoMonth(String month) {
        DemoblazePage.escribimosEnElCuadroDeTextoMonth(month);
    }
    @Step
    public void escribimosEnElCuadroDeTextoYear(String year) {
        DemoblazePage.escribimosEnElCuadroDeTextoYear(year);
    }
    @Step
    public void luegoHacemosClickEnPurchase() {
        DemoblazePage.luegoHacemosClickEnPurchase();
    }
    @Step
    public void validamosQueSeRealizadoElProcesoCorrectamente() {
        DemoblazePage.validamosQueSeRealizadoElProcesoCorrectamente();
    }



}
