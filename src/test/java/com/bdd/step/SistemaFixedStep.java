package com.bdd.step;

import com.bdd.page.SistemaFixedPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SistemaFixedStep extends ScenarioSteps{

    SistemaFixedPage sistemaFixedPage;

    @Step
    public void queAperturamosLaPaginaSistemaFixedEnElNavegador(String navegador) {
        sistemaFixedPage.queAperturamosLaPaginaSistemaFixedEnElNavegador(navegador);
    }
    @Step
    public void leHacemosClickADesplegarPanel() {
        sistemaFixedPage.leHacemosClickADesplegarPanel();
    }
    @Step
    public void luegoHacemosClickEnClientes() {
        sistemaFixedPage.luegoHacemosClickEnClientes();
    }
    @Step
    public void luegoHacemosClickEnElSubmenuVerMisClientes() {
        sistemaFixedPage.luegoHacemosClickEnElSubmenuVerMisClientes();
    }
    @Step
    public void luegoHacemosClickEnAgregarCliente() {
        sistemaFixedPage.luegoHacemosClickEnAgregarCliente();
    }
    @Step
    public void seleccionamosEnElComboTipoDeDocumento(String tipoDocumento) {
        sistemaFixedPage.seleccionamosEnElComboTipoDeDocumento(tipoDocumento);
    }
    @Step
    public void escribimosEnElCuadroDeTextoNúmeroDeDocumento(String documento) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoNúmeroDeDocumento(documento);
    }
    @Step
    public void seleccionamosEnElComboPais(String pais) {
        sistemaFixedPage.seleccionamosEnElComboPais(pais);
    }
    @Step
    public void escribimosEnElCuadroDeTextoRazonSocial(String razonSocial) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoRazonSocial(razonSocial);
    }
    @Step
    public void escribimosEnElCuadroDeTextoNombre(String nombre) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoNombre(nombre);
    }
    @Step
    public void escribimosEnElCuadroDeTextoDireccion(String direccion) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoDireccion(direccion);
    }
    @Step
    public void escribimosEnElCuadroDeTextoLocalidad(String localidad) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoLocalidad(localidad);
    }
    @Step
    public void escribimosEnElCuadroDeTextoDepartamento(String departamento) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoDepartamento(departamento);
    }
    @Step
    public void escribimosEnElCuadroDeTextoDomicilioDeEntrega(String domicilio) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoDomicilioDeEntrega(domicilio);
    }
    @Step
    public void escribimosEnElCuadroDeTextoDescuento(String descuento) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoDescuento(descuento);
    }
    @Step
    public void escribimosEnElCuadroDeTextoMailEnvioFactura(String mailFactura) {
        sistemaFixedPage.escribimosEnElCuadroDeTextoMailEnvioFactura(mailFactura);
    }
    @Step
    public void luegoSeleccionamosEnElCheckboxProveedor(String proveedor) {
        sistemaFixedPage.luegoSeleccionamosEnElCheckboxProveedor(proveedor);
    }
    @Step
    public void luegoSeleccionamosEnElCheckboxCliente(String cliente) {
        sistemaFixedPage.luegoSeleccionamosEnElCheckboxCliente(cliente);
    }
    @Step
    public void luegoHacemosClickEnAgregar() {
        sistemaFixedPage.luegoHacemosClickEnAgregar();
    }
    @Step
    public void validamosQueSeHaRealizadoElProcesoCorrectamente() {
        sistemaFixedPage.validamosQueSeHaRealizadoElProcesoCorrectamente();
    }



}
