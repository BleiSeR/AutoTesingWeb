package com.bdd.stepdefinition;

import com.bdd.step.DemoQAStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoQAStepDefinition {

    @Steps
    DemoQAStep demoqaStep;

    @Dado("que aperturamos la web DemoQA en el navegador Chrome")
    public void que_aperturamos_la_web_DemoQA_en_el_navegador_Chrome(){

        demoqaStep.que_aperturamos_la_web_DemoQA_en_el_navegador_Chrome();
    }


    @Cuando("^realizamos click en Elements$")
    public void realizamosClickEnElements() {
        demoqaStep.realizamosClickEnElements();
    }

    @Y("^realizamos un click en el menu TextBox$")
    public void realizamosUnClickEnElMenuTextBox() {
        demoqaStep.realizamosUnClickEnElMenuTextBox();

    }

    @Y("^escribimos Paolo en el cuadro de texto Full Name$")
    public void escribimosPaoloEnElCuadroDeTextoFullName() {
        demoqaStep.escribimosPaoloEnElCuadroDeTextoFullName();
    }

    @Y("^escribimos pao_lo@nttdata\\.com en el cuadro de texto Email$")
    public void escribimosPao_loNttdataComEnElCuadroDeTextoEmail() {
        demoqaStep.escribimosPao_loNttdataComEnElCuadroDeTextoEmail();
    }

    @Y("^escribimos Trujillo en el cuadro de texto Current Address$")
    public void escribimosTrujilloEnElCuadroDeTextoCurrentAddress() {
        demoqaStep.escribimosTrujilloEnElCuadroDeTextoCurrentAddress();
    }

    @Y("^escribimos Lima en el cuadro de texto Permanent Address$")
    public void escribimosLimaEnElCuadroDeTextoPermanentAddress() {
        demoqaStep.escribimosLimaEnElCuadroDeTextoPermanentAddress();
    }

    @Y("^hacemos click en submit$")
    public void hacemosClickEnSubmit() {
        demoqaStep.hacemosClickEnSubmit();
    }

    @Entonces("^Validamos que los datos se muestren en la parte inferior$")
    public void validamosQueLosDatosSeMuestrenEnLaParteInferior() {
        demoqaStep.validamosQueLosDatosSeMuestrenEnLaParteInferior();
    }

    @Entonces("^Validamos que los datos se muestren en la parte inferior 2$")
    public void validamosQueLosDatosSeMuestrenEnLaParteInferior2() {
        demoqaStep.validamosQueLosDatosSeMuestrenEnLaParteInferior2();
    }

    @Dado("^que aperturamos la pagina DemoQA en el navegador \"([^\"]*)\"$")
    public void queAperturamosLaPaginaDemoQAEnElNavegador(String navegador) throws Throwable {
        demoqaStep.queAperturamosLaPaginaDemoQAEnElNavegador(navegador);
    }

    @Cuando("^hacemos click en forms$")
    public void hacemosClickEnForms() {
        demoqaStep.hacemosClickEnForms();
    }

    @Y("^luego hacemos click en el submenu Practice Form$")
    public void luegoHacemosClickEnElSubmenuPracticeForm() {
        demoqaStep.luegoHacemosClickEnElSubmenuPracticeForm();
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto First Name$")
    public void escribimosEnElCuadroDeTextoFirstName(String firstName) throws Throwable {
        demoqaStep.escribimosEnElCuadroDeTextoFirstName(firstName);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Last Name$")
    public void escribimosEnElCuadroDeTextoLastName(String lastName) throws Throwable {
        demoqaStep.escribimosEnElCuadroDeTextoLastName(lastName);
    }

    @Y("^escribimos en el cuadro de texto correo \"([^\"]*)\"$")
    public void escribimosEnElCuadroDeTextoCorreo(String email) throws Throwable {
        demoqaStep.escribimosEnElCuadroDeTextoCorreo(email);
    }

    @Y("^seleccionamos el genero \"([^\"]*)\"$")
    public void seleccionamosElGenero(String gender) throws Throwable {
        demoqaStep.seleccionamosElGenero(gender);
    }

    @Y("^escribimos el numero de telefono \"([^\"]*)\"$")
    public void escribimosElNumeroDeTelefono(String mobile) throws Throwable {
        demoqaStep.escribimosElNumeroDeTelefono(mobile);
    }

    @Y("^elegimos la fecha de nacimiento \"([^\"]*)\"$")
    public void elegimosLaFechaDeNacimiento(String dateBirth) throws Throwable {
        demoqaStep.elegimosLaFechaDeNacimiento(dateBirth);
    }

    @Y("^escribimos \"([^\"]*)\" como asignaturas$")
    public void escribimosComoAsignaturas(String subjects) throws Throwable {
        demoqaStep.escribimosComoAsignaturas(subjects);
    }

    @Y("^elegir \"([^\"]*)\" como hobbies$")
    public void elegirComoHobbies(String hobbies) throws Throwable {
        demoqaStep.elegirComoHobbies(hobbies);
    }

    @Y("^seleccionamos un archivo de la ruta \"([^\"]*)\"$")
    public void seleccionamosUnArchivoDeLaRuta(String picture) throws Throwable {
        demoqaStep.seleccionamosUnArchivoDeLaRuta(picture);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto current address$")
    public void escribimosEnElCuadroDeTextoCurrentAddress(String currentAddress) throws Throwable {
        demoqaStep.escribimosEnElCuadroDeTextoCurrentAddress(currentAddress);
    }

    @Y("^seleccionamos \"([^\"]*)\" como estado y \"([^\"]*)\" como ciudad$")
    public void seleccionamosComoEstadoYComoCiudad(String state, String city) throws Throwable {
        demoqaStep.seleccionamosComoEstadoYComoCiudad(state,city);
    }

    @Y("^hacemos click en el boton submit$")
    public void hacemosClickEnElBotonSubmit() {
        demoqaStep.hacemosClickEnElBotonSubmit();
    }

    @Entonces("^Validamos que se haya registrado correctamente$")
    public void validamosQueSeHayaRegistradoCorrectamente() {
        demoqaStep.validamosQueSeHayaRegistradoCorrectamente();
    }
}
