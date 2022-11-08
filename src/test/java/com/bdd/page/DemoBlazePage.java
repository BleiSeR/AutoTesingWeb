package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class DemoBlazePage extends PageObject {

    @FindBy(xpath = "//a[@id='signin2']")
    WebElement btn_signIn;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement txt_username;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement txt_password;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement btn_signUp;

    @FindBy(xpath = "//a[text()='Phones']|//a[text()='Laptops']|//a[text()='Monitors']")
    List<WebElement> btn_categorias;

    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement btn_addToCart;

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement btn_cart;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement btn_placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    WebElement txt_name;

    @FindBy(xpath = "//input[@id='country']")
    WebElement txt_country;

    @FindBy(xpath = "//input[@id='city']")
    WebElement txt_city;

    @FindBy(xpath = "//input[@id='card']")
    WebElement txt_card;

    @FindBy(xpath = "//input[@id='month']")
    WebElement txt_month;

    @FindBy(xpath = "//input[@id='year']")
    WebElement txt_year;

    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement btn_purchase;

    @FindBy(xpath = "//div[@class='sweet-alert  showSweetAlert visible']")
    WebElement confirmacion;




    public void que_aperturamos_la_web_demoBlaze_en_el_navegador_Chrome() {
        Browser.Start(this,"chrome");
    }

    public void realizamosClickEnSignUp() {
        Browser.js_click(this,btn_signIn);
    }

    public void escribimosPaolo123EnElCuadroDeTextoUsername() {
        txt_username.sendKeys("Paolo321435");
    }

    public void escribimosAsdqweEnElCuadroDeTextoContraseña() {
        txt_password.sendKeys("asdqwe");
    }

    public void hacemosClickEnSignUp() {
        Browser.js_click(this,btn_signUp);

    }

    public void validamosQueElUsuarioSeHayaRegistradoExitosamente() {//Si el usuario Paolo123 existe en su sistema,irá a la excepción, si no, el testeo tendrá éxito
        try{
            Thread.sleep(4000);
        }catch (Exception e){}

        Alert alert = this.getDriver().switchTo().alert();
        String alertaMensaje = alert.getText();
        String mensaje= "Sign up successful.";
        if(alertaMensaje.equals(mensaje)){
            alert.accept();
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
            Assert.assertTrue(true);
        }else {
            Assert.fail("No se ha registrado correctamente o el usuario ya existe, por favor escribir un usuario diferente");
        }



    }

    public void queAperturamosLaPaginaDemoBlazeEnElNavegador(String navegador) {
        Browser.Start(this,navegador);
    }

    public void seleccionamos(String categoria) {
        for(WebElement radiobutton :btn_categorias){
            if(radiobutton.getText().equals(categoria)){
                radiobutton.click();
                break;
            }
        }

    }
    public void luegoHacemosClickEnParaVerSuDetalle(String productos) {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        this.getDriver().findElement(By.xpath("//div[@id='tbodyid']//a[text()='"+productos+"']")).click();


    }


    public void luegoHacemosClickEnAddToCart() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        Browser.js_click(this,btn_addToCart);
    }

    public void aceptamosElMensajeDeAlerta() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        Alert alert = this.getDriver().switchTo().alert();
        alert.accept();
    }

    public void hacemosClickEnCart() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        Browser.js_click(this,btn_cart);
    }

    public void luegoHacemosClickEnPlaceOrder() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        Browser.js_click(this,btn_placeOrder);
    }

    public void escribimosEnElCuadroDeTextoName(String name) {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        txt_name.sendKeys(name);
    }

    public void escribimosEnElCuadroDeTextoCountry(String country) {
        txt_country.sendKeys(country);
    }

    public void escribimosEnElCuadroDeTextoCity(String city) {
        txt_city.sendKeys(city);
    }

    public void escribimosEnElCuadroDeTextoCreditCard(String creditCard) {
        txt_card.sendKeys(creditCard);
    }

    public void escribimosEnElCuadroDeTextoMonth(String month) {
        txt_month.sendKeys(month);
    }

    public void escribimosEnElCuadroDeTextoYear(String year) {
        txt_year.sendKeys(year);
    }

    public void luegoHacemosClickEnPurchase() {
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
        Browser.js_click(this,btn_purchase);
    }

    public void validamosQueSeRealizadoElProcesoCorrectamente() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        try{
            confirmacion.isDisplayed();
            Assert.assertTrue(true);
        }catch (Exception e){
            Assert.fail("Error");
        }
    }



}
