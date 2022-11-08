package com.bdd.step;

import com.bdd.page.DemoQAPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoQAStep extends ScenarioSteps {

    DemoQAPage demoqaPage;

    @Step
    public void que_aperturamos_la_web_DemoQA_en_el_navegador_Chrome(){

        demoqaPage.que_aperturamos_la_web_DemoQA_en_el_navegador_Chrome();
    }

    @Step
    public void realizamosClickEnElements() {
        demoqaPage.realizamosClickEnElements();
    }
    @Step
    public void realizamosUnClickEnElMenuTextBox() {

        demoqaPage.realizamosUnClickEnElMenuTextBox();
    }
    @Step
    public void escribimosPaoloEnElCuadroDeTextoFullName() {
        demoqaPage.escribimosPaoloEnElCuadroDeTextoFullName();
    }
    @Step
    public void escribimosPao_loNttdataComEnElCuadroDeTextoEmail() {
        demoqaPage.escribimosPao_loNttdataComEnElCuadroDeTextoEmail();
    }
    @Step
    public void escribimosTrujilloEnElCuadroDeTextoCurrentAddress() {
        demoqaPage.escribimosTrujilloEnElCuadroDeTextoCurrentAddress();
    }
    @Step
    public void escribimosLimaEnElCuadroDeTextoPermanentAddress() {
        demoqaPage.escribimosLimaEnElCuadroDeTextoPermanentAddress();
    }
    @Step
    public void hacemosClickEnSubmit() {
        demoqaPage.hacemosClickEnSubmit();
    }
    @Step
    public void validamosQueLosDatosSeMuestrenEnLaParteInferior() {
        demoqaPage.validamosQueLosDatosSeMuestrenEnLaParteInferior();
    }
    @Step
    public void validamosQueLosDatosSeMuestrenEnLaParteInferior2() {
        demoqaPage.validamosQueLosDatosSeMuestrenEnLaParteInferior2();
    }
    @Step
    public void queAperturamosLaPaginaDemoQAEnElNavegador(String navegador) {
        demoqaPage.queAperturamosLaPaginaDemoQAEnElNavegador(navegador);
    }
    @Step
    public void hacemosClickEnForms() {
        demoqaPage.hacemosClickEnForms();
    }
    @Step
    public void luegoHacemosClickEnElSubmenuPracticeForm() {
        demoqaPage.luegoHacemosClickEnElSubmenuPracticeForm();
    }
    @Step
    public void escribimosEnElCuadroDeTextoFirstName(String firstName) {
        demoqaPage.escribimosEnElCuadroDeTextoFirstName(firstName);
    }
    @Step
    public void escribimosEnElCuadroDeTextoLastName(String lastName) {
        demoqaPage.escribimosEnElCuadroDeTextoLastName(lastName);
    }
    @Step
    public void escribimosEnElCuadroDeTextoCorreo(String email) {
        demoqaPage.escribimosEnElCuadroDeTextoCorreo(email);
    }
    @Step
    public void seleccionamosElGenero(String gender) {
        demoqaPage.seleccionamosElGenero(gender);
    }
    @Step
    public void escribimosElNumeroDeTelefono(String mobile) {
        demoqaPage.escribimosElNumeroDeTelefono(mobile);
    }
    @Step
    public void elegimosLaFechaDeNacimiento(String dateBirth) {
        demoqaPage.elegimosLaFechaDeNacimiento(dateBirth);
    }
    @Step
    public void escribimosComoAsignaturas(String subjects) {
        demoqaPage.escribimosComoAsignaturas(subjects);
    }
    @Step
    public void elegirComoHobbies(String hobbies) {
        demoqaPage.elegirComoHobbies(hobbies);
    }
    @Step
    public void seleccionamosUnArchivoDeLaRuta(String picture) {
        demoqaPage.seleccionamosUnArchivoDeLaRuta(picture);
    }
    @Step
    public void escribimosEnElCuadroDeTextoCurrentAddress(String currentAddress) {
        demoqaPage.escribimosEnElCuadroDeTextoCurrentAddress(currentAddress);
    }
    @Step
    public void seleccionamosComoEstadoYComoCiudad(String state, String city) {
        demoqaPage.seleccionamosComoEstadoYComoCiudad(state,city);
    }
    @Step
    public void hacemosClickEnElBotonSubmit() {
        demoqaPage.hacemosClickEnElBotonSubmit();
    }
    @Step
    public void validamosQueSeHayaRegistradoCorrectamente() {
        demoqaPage.validamosQueSeHayaRegistradoCorrectamente();
    }
}
