$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/DemoBlaze.feature");
formatter.feature({
  "name": "Validar el funcionamiento de los formularios de DemoBlaze",
  "description": "  Como automatizador web\n  Quiero validar el funcionamiento de los formularios\n  Para lanzarlo a producción",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar el correcto funcionamiento de la compra exitosa de la pagina DemoBlaze",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@ESCENARIO_DEMOBLAZE_02"
    }
  ]
});
formatter.step({
  "name": "que aperturamos la pagina demoBlaze en el navegador \"\u003cNavegador\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "seleccionamos \"\u003cCategorías\u003e\"",
  "keyword": "Cuando "
});
formatter.step({
  "name": "luego hacemos click en \"\u003cProductos\u003e\" para ver su detalle",
  "keyword": "Y "
});
formatter.step({
  "name": "luego hacemos click en Add to cart",
  "keyword": "Y "
});
formatter.step({
  "name": "aceptamos el mensaje de alerta",
  "keyword": "Y "
});
formatter.step({
  "name": "hacemos click en Cart",
  "keyword": "Y "
});
formatter.step({
  "name": "luego hacemos click en Place Order",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cName\u003e\" en el cuadro de texto Name",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cCountry\u003e\" en el cuadro de texto Country",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cCity\u003e\" en el cuadro de texto City",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cCredit Card\u003e\" en el cuadro de texto Credit Card",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cMonth\u003e\" en el cuadro de texto Month",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cYear\u003e\" en el cuadro de texto Year",
  "keyword": "Y "
});
formatter.step({
  "name": "luego hacemos click en purchase",
  "keyword": "Y "
});
formatter.step({
  "name": "Validamos que se realizado el proceso correctamente",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "Navegador",
        "Categorías",
        "Productos",
        "Name",
        "Country",
        "City",
        "Credit Card",
        "Month",
        "Year"
      ]
    },
    {
      "cells": [
        "chrome",
        "Monitors",
        "ASUS Full HD",
        "Paolo Coaquira",
        "Perú",
        "Trujillo",
        "147852369",
        "Junio",
        "2022"
      ]
    },
    {
      "cells": [
        "chrome",
        "Laptops",
        "MacBook Pro",
        "Mauro García",
        "Perú",
        "Trujillo",
        "159875321",
        "Mayo",
        "2022"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar el correcto funcionamiento de la compra exitosa de la pagina DemoBlaze",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    },
    {
      "name": "@ESCENARIO_DEMOBLAZE_02"
    }
  ]
});
formatter.step({
  "name": "que aperturamos la pagina demoBlaze en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.queAperturamosLaPaginaDemoBlazeEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos \"Monitors\"",
  "keyword": "Cuando "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.seleccionamos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en \"ASUS Full HD\" para ver su detalle",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnParaVerSuDetalle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en Add to cart",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnAddToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aceptamos el mensaje de alerta",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.aceptamosElMensajeDeAlerta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacemos click en Cart",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.hacemosClickEnCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en Place Order",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnPlaceOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Paolo Coaquira\" en el cuadro de texto Name",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Perú\" en el cuadro de texto Country",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCountry(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Trujillo\" en el cuadro de texto City",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"147852369\" en el cuadro de texto Credit Card",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCreditCard(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Junio\" en el cuadro de texto Month",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoMonth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"2022\" en el cuadro de texto Year",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoYear(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en purchase",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validamos que se realizado el proceso correctamente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.validamosQueSeRealizadoElProcesoCorrectamente()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar el correcto funcionamiento de la compra exitosa de la pagina DemoBlaze",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_DEMOBLAZE"
    },
    {
      "name": "@ESCENARIO_DEMOBLAZE_02"
    }
  ]
});
formatter.step({
  "name": "que aperturamos la pagina demoBlaze en el navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.queAperturamosLaPaginaDemoBlazeEnElNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos \"Laptops\"",
  "keyword": "Cuando "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.seleccionamos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en \"MacBook Pro\" para ver su detalle",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnParaVerSuDetalle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en Add to cart",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnAddToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aceptamos el mensaje de alerta",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.aceptamosElMensajeDeAlerta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacemos click en Cart",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.hacemosClickEnCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en Place Order",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnPlaceOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Mauro García\" en el cuadro de texto Name",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Perú\" en el cuadro de texto Country",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCountry(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Trujillo\" en el cuadro de texto City",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"159875321\" en el cuadro de texto Credit Card",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoCreditCard(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Mayo\" en el cuadro de texto Month",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoMonth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"2022\" en el cuadro de texto Year",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.escribimosEnElCuadroDeTextoYear(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luego hacemos click en purchase",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.luegoHacemosClickEnPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validamos que se realizado el proceso correctamente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.validamosQueSeRealizadoElProcesoCorrectamente()"
});
formatter.result({
  "status": "passed"
});
});