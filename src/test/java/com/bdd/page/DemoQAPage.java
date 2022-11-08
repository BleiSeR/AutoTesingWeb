package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.reports.remoteTesting.BrowserStackLinkGenerator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://demoqa.com/")
public class DemoQAPage extends PageObject {



    @FindBy(xpath = "(//div[@class='card-up'])[1]")
    WebElement btn_Element;

    @FindBy(xpath = "//span[text()='Text Box']")
    WebElement btn_textbox;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    WebElement txt_fullname;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement txt_Email;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement txt_currentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement txt_permanentAddress;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement btn_submit;

    @FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
    WebElement panel_resultado;

    @FindBy(xpath = "(//p[@id])[1]")
    WebElement lbl_name;

    @FindBy(xpath = "(//p[@id])[2]")
    WebElement lbl_email;

    @FindBy(xpath = "(//p[@id])[3]")
    WebElement lbl_currentAddress;

    @FindBy(xpath = "(//p[@id])[4]")
    WebElement lbl_permanentAddress;

    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement btn_forms;

    @FindBy(xpath = "//span[text()='Practice Form']")
    WebElement btn_practiceForm;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement txt_firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement txt_lastName;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement txt_email;

    @FindBy(xpath = "//label[text()='Other']|//label[text()='Male']|//label[text()='Female']")
    List<WebElement> rbtn_generos;

    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement txt_mobile;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement txt_dateBirth;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    WebElement txt_subjects;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    WebElement btn_uploadPicture;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement txta_currentAdrress;

    @FindBy(xpath = "(//input[@autocapitalize='none'])[2]")
    WebElement txt_state;

    @FindBy(xpath = "(//input[@autocapitalize='none'])[3]")
    WebElement txt_city;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement btn_submit_formulario;

    @FindBy(xpath = "//div[@class='fade modal show']")
    WebElement formulario_final;


    public void que_aperturamos_la_web_DemoQA_en_el_navegador_Chrome() {
        Browser.Start(this,"chrome");

    }

    public void realizamosClickEnElements() {
        //Browser.Scroll(this,100);<<<El scroll es para que la página vaya abajo o arriba, es importante ya que lo que se presiona se debe de ver, mayor que 0 va abajo
        btn_Element.click();
    }

    public void realizamosUnClickEnElMenuTextBox() {
        btn_textbox.click();
    }

    public void escribimosPaoloEnElCuadroDeTextoFullName() {
        txt_fullname.sendKeys("Paolo");
        /*try{
            Thread.sleep(4000);
        }catch(Exception e){}*/
    }

    public void escribimosPao_loNttdataComEnElCuadroDeTextoEmail() {
        txt_Email.sendKeys("pao_lo@nttdata.com");
    }

    public void escribimosTrujilloEnElCuadroDeTextoCurrentAddress() {
        txt_currentAddress.sendKeys("Trujillo");
    }

    public void escribimosLimaEnElCuadroDeTextoPermanentAddress() {
        Browser.js_sendkeys(this,txt_permanentAddress,"Lima");
        //txt_permanentAddress.sendKeys("Trujillo");
    }

    public void hacemosClickEnSubmit() {
        btn_submit.click();
    }

    public void validamosQueLosDatosSeMuestrenEnLaParteInferior() {
        try{
            panel_resultado.isDisplayed();
            Assert.assertTrue(true);
        }catch (Exception e){
            Assert.fail("El formulario no se ha llenado correctamente.");
        }
    }

    public void validamosQueLosDatosSeMuestrenEnLaParteInferior2() {
        String full_name="Paolo";
        String email="pao_lo@nttdata.com";
        String currentAddress="Trujillo";
        String permanentAddress="Lima";

        String resultado_fullname = lbl_name.getText();
        String resultado_email = lbl_email.getText();
        String resultado_currentAddress = lbl_currentAddress.getText();
        String resultado_permanentAddress = lbl_permanentAddress.getText();

        if(resultado_fullname.contains(full_name) && resultado_email.contains(email) && resultado_currentAddress.contains(currentAddress) && resultado_permanentAddress.contains(permanentAddress)){
            Assert.assertTrue(true);
        }else{
            Assert.fail("El formulario ha fallado");
        }

    }

    public void queAperturamosLaPaginaDemoQAEnElNavegador(String navegador) {
        Browser.Start(this,navegador);
    }

    public void hacemosClickEnForms() {
        btn_forms.click();
    }

    public void luegoHacemosClickEnElSubmenuPracticeForm() {
        btn_practiceForm.click();
    }

    public void escribimosEnElCuadroDeTextoFirstName(String firstName) {
        txt_firstName.sendKeys(firstName);
    }

    public void escribimosEnElCuadroDeTextoLastName(String lastName) {
        txt_lastName.sendKeys(lastName);
    }

    public void escribimosEnElCuadroDeTextoCorreo(String email) {
        txt_email.sendKeys(email);
    }

    public void seleccionamosElGenero(String gender) {
        for(WebElement radiobutton :rbtn_generos){
            if(radiobutton.getText().equals(gender)){
                radiobutton.click();
                break;
            }
        }

    }

    public void escribimosElNumeroDeTelefono(String mobile) {
        txt_mobile.sendKeys(mobile);
    }

    public void elegimosLaFechaDeNacimiento(String dateBirth) {
        txt_dateBirth.click();
        txt_dateBirth.sendKeys(Keys.CONTROL+ "a");
        txt_dateBirth.sendKeys(dateBirth);
        txt_dateBirth.sendKeys(Keys.ENTER);
    }

    public void escribimosComoAsignaturas(String subjects) {

        String[] Lista_Subjects = subjects.split(",");

        for(String subject: Lista_Subjects){
            txt_subjects.sendKeys(subject);
            txt_subjects.sendKeys(Keys.ENTER);
        }
    }

    public void elegirComoHobbies(String hobbies) {
        String[] lista_hobbies = hobbies.split(",");

        for(String hobbie : lista_hobbies){
            WebElement checkbox = this.getDriver().findElement(By.xpath("//div[@id='hobbiesWrapper']//label[text()='"+ hobbie +"']"));
            checkbox.click();
        }
    }


    public void seleccionamosUnArchivoDeLaRuta(String picture) {
        btn_uploadPicture.sendKeys(picture);
    }

    public void escribimosEnElCuadroDeTextoCurrentAddress(String currentAddress) {
        txta_currentAdrress.sendKeys(currentAddress);
    }

    public void seleccionamosComoEstadoYComoCiudad(String state, String city) {

        //txt_state.click();
        Browser.js_click(this,txt_state);
        txt_state.sendKeys(state);
        txt_state.sendKeys(Keys.ENTER);

        Browser.js_click(this,txt_city);
        txt_city.sendKeys(city);

    }

    public void hacemosClickEnElBotonSubmit() {
        Browser.js_click(this,btn_submit_formulario);
    }

    public void validamosQueSeHayaRegistradoCorrectamente() {
        try{
            formulario_final.isDisplayed();
            Assert.assertTrue(true);
        }catch (Exception e){
            Assert.fail("Error");
        }


    }
}
