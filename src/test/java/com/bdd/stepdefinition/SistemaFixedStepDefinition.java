package com.bdd.stepdefinition;

import com.bdd.step.SistemaFixedStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class SistemaFixedStepDefinition {

    @Steps
    SistemaFixedStep sistemafixedStep;

    @Dado("^que aperturamos la pagina SistemaFixed en el navegador \"([^\"]*)\"$")
    public void queAperturamosLaPaginaSistemaFixedEnElNavegador(String navegador) throws Throwable {
        sistemafixedStep.queAperturamosLaPaginaSistemaFixedEnElNavegador(navegador);
    }

    @Y("^luego hacemos click en el submenu ver mis clientes$")
    public void luegoHacemosClickEnElSubmenuVerMisClientes() {
        sistemafixedStep.luegoHacemosClickEnElSubmenuVerMisClientes();
    }

    @Y("^luego hacemos click en Agregar Cliente$")
    public void luegoHacemosClickEnAgregarCliente() {
        sistemafixedStep.luegoHacemosClickEnAgregarCliente();
    }

    @Y("^seleccionamos \"([^\"]*)\" en el combo Tipo de documento$")
    public void seleccionamosEnElComboTipoDeDocumento(String tipoDocumento) throws Throwable {
        sistemafixedStep.seleccionamosEnElComboTipoDeDocumento(tipoDocumento);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Número de documento$")
    public void escribimosEnElCuadroDeTextoNúmeroDeDocumento(String documento) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoNúmeroDeDocumento(documento);
    }

    @Y("^seleccionamos \"([^\"]*)\" en el combo Pais$")
    public void seleccionamosEnElComboPais(String pais) throws Throwable {
        sistemafixedStep.seleccionamosEnElComboPais(pais);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Razon social$")
    public void escribimosEnElCuadroDeTextoRazonSocial(String razonSocial) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoRazonSocial(razonSocial);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Nombre$")
    public void escribimosEnElCuadroDeTextoNombre(String nombre) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoNombre(nombre);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Direccion$")
    public void escribimosEnElCuadroDeTextoDireccion(String direccion) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoDireccion(direccion);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Localidad$")
    public void escribimosEnElCuadroDeTextoLocalidad(String localidad) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoLocalidad(localidad);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Departamento$")
    public void escribimosEnElCuadroDeTextoDepartamento(String departamento) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoDepartamento(departamento);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Domicilio de entrega$")
    public void escribimosEnElCuadroDeTextoDomicilioDeEntrega(String domicilio) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoDomicilioDeEntrega(domicilio);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Descuento$")
    public void escribimosEnElCuadroDeTextoDescuento(String descuento) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoDescuento(descuento);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Mail envio factura$")
    public void escribimosEnElCuadroDeTextoMailEnvioFactura(String mailFactura) throws Throwable {
        sistemafixedStep.escribimosEnElCuadroDeTextoMailEnvioFactura(mailFactura);
    }

    @Y("^luego seleccionamos \"([^\"]*)\" en el checkbox Proveedor$")
    public void luegoSeleccionamosEnElCheckboxProveedor(String proveedor) throws Throwable {
        sistemafixedStep.luegoSeleccionamosEnElCheckboxProveedor(proveedor);
    }

    @Y("^luego seleccionamos \"([^\"]*)\" en el checkbox Cliente$")
    public void luegoSeleccionamosEnElCheckboxCliente(String cliente) throws Throwable {
        sistemafixedStep.luegoSeleccionamosEnElCheckboxCliente(cliente);
    }

    @Y("^luego hacemos click en Agregar$")
    public void luegoHacemosClickEnAgregar() {
        sistemafixedStep.luegoHacemosClickEnAgregar();
    }

    @Entonces("^Validamos que se ha realizado el proceso correctamente$")
    public void validamosQueSeHaRealizadoElProcesoCorrectamente() {
        sistemafixedStep.validamosQueSeHaRealizadoElProcesoCorrectamente();
    }

    @Cuando("^le hacemos click a Desplegar Panel$")
    public void leHacemosClickADesplegarPanel() {
        sistemafixedStep.leHacemosClickADesplegarPanel();
    }

    @Y("^luego hacemos click en Clientes$")
    public void luegoHacemosClickEnClientes() {
        sistemafixedStep.luegoHacemosClickEnClientes();
    }


}
