package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@DefaultUrl("https://sistema.fixed.uy/demo-85")
public class SistemaFixedPage extends PageObject{


    @FindBy(xpath = "//a[@onclick='actualizarMenuFijo()']")
    WebElement btn_desplegar;

    @FindBy(xpath = "//button[text()='Agregar Cliente']")
    WebElement btn_agregarClientes;

    @FindBy(xpath = "(//button[@class='multiselect dropdown-toggle btn btn-default'])[1]")
    WebElement btn_documento;

    @FindBy(xpath = "(//label[@class='radio']//input[@value='4'])[1]")
    WebElement lbl_otros;

    @FindBy(xpath = "//input[@name='Número-de-documento']")
    WebElement txt_documento;

    @FindBy(xpath = "(//button[@title='Seleccionar'])[1]")
    WebElement btn_pais;

    @FindBy(xpath = "//input[@name='Razón-Social']")
    WebElement txt_razonSocial;

    @FindBy(xpath = "//input[@name='Nombre']")
    WebElement txt_nombre;

    @FindBy(xpath = "//input[@name='Dirección']")
    WebElement txt_direccion;

    @FindBy(xpath = "//input[@name='Localidad']")
    WebElement txt_localidad;

    @FindBy(xpath = "//input[@name='Departamento']")
    WebElement txt_departamento;

    @FindBy(xpath = "//input[@name='Dirección-entrega']")
    WebElement txt_direccionEntrega;

    @FindBy(xpath = "//input[@name='Descuento']")
    WebElement txt_descuento;

    @FindBy(xpath = "//input[@name='Mail-envio-factura']")
    WebElement txt_mailFactura;

    @FindBy(xpath = "(//div[@class='checkbox checkbox-styled'])[1]//label")
    WebElement chk_proveedor;

    @FindBy(xpath = "(//div[@class='checkbox checkbox-styled'])[2]//label")
    WebElement chk_cliente;

    @FindBy(xpath = "//button[text()='Agregar']")
    WebElement btn_agregar;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement confirmacion_formulario;

    public void queAperturamosLaPaginaSistemaFixedEnElNavegador(String navegador) {
        Browser.Start(this,navegador);
    }

    public void leHacemosClickADesplegarPanel() {
        btn_desplegar.click();
    }

    public void luegoHacemosClickEnClientes() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        this.getDriver().findElement(By.xpath("//div[@class='menubar-scroll-panel']//span[text()='Clientes']")).click();
    }

    public void luegoHacemosClickEnElSubmenuVerMisClientes() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        this.getDriver().findElement(By.xpath("//div[@class='menubar-scroll-panel']//span[text()='Ver mis clientes']")).click();
    }

    public void luegoHacemosClickEnAgregarCliente() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        btn_agregarClientes.click();
    }

    public void seleccionamosEnElComboTipoDeDocumento(String tipoDocumento) {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        btn_documento.click();
        lbl_otros.click();


    }

    public void escribimosEnElCuadroDeTextoNúmeroDeDocumento(String documento) {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        txt_documento.sendKeys(documento);
    }

    public void seleccionamosEnElComboPais(String pais) {
        //Select selectBox = new Select(this.getDriver().findElement(By.name("pais")));
        //selectBox.selectByValue(pais);
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        btn_pais.click();
        this.getDriver().findElement(By.xpath("(//ul[@class='multiselect-container dropdown-menu'])[3]//*[contains(text(),'"+pais+"')]")).click();

    }

    public void escribimosEnElCuadroDeTextoRazonSocial(String razonSocial) {
        txt_razonSocial.sendKeys(razonSocial);
    }

    public void escribimosEnElCuadroDeTextoNombre(String nombre) {
        txt_nombre.sendKeys(nombre);
    }

    public void escribimosEnElCuadroDeTextoDireccion(String direccion) {
        txt_direccion.sendKeys(direccion);
    }

    public void escribimosEnElCuadroDeTextoLocalidad(String localidad) {
        txt_localidad.click();
        txt_localidad.sendKeys(Keys.CONTROL+"a");
        txt_localidad.sendKeys(localidad);
    }

    public void escribimosEnElCuadroDeTextoDepartamento(String departamento) {
        txt_departamento.click();
        txt_departamento.sendKeys(Keys.CONTROL+"a");
        txt_departamento.sendKeys(departamento);
    }

    public void escribimosEnElCuadroDeTextoDomicilioDeEntrega(String domicilio) {
        txt_direccionEntrega.sendKeys(domicilio);
    }

    public void escribimosEnElCuadroDeTextoDescuento(String descuento) {
        txt_descuento.sendKeys(descuento);
    }

    public void escribimosEnElCuadroDeTextoMailEnvioFactura(String mailFactura) {
        txt_mailFactura.sendKeys(mailFactura);
        try{
            Thread.sleep(1000);
        }catch (Exception e){}
    }

    public void luegoSeleccionamosEnElCheckboxProveedor(String proveedor) {
        if(proveedor.equals("SI")){
            Browser.js_click(this,chk_proveedor);
        }else {

        }
    }

    public void luegoSeleccionamosEnElCheckboxCliente(String cliente) {
        if(cliente.equals("NO")){
            Browser.js_click(this,chk_cliente);
        }else {

        }
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
    }

    public void luegoHacemosClickEnAgregar() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        btn_agregar.click();
    }

    public void validamosQueSeHaRealizadoElProcesoCorrectamente() {
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        try{
            confirmacion_formulario.isDisplayed();
            Assert.assertTrue(true);
        }catch (Exception e){
            Assert.fail("El formulario no se ha completado con éxito");
        }
    }


}
