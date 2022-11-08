#language: es
@FEATURE_DEMOBLAZE

Característica: Validar el funcionamiento de los formularios de DemoBlaze
  Como automatizador web
  Quiero validar el funcionamiento de los formularios
  Para lanzarlo a producción

  @ESCENARIO_DEMOBLAZE_01
  Escenario: Validar el funcionamiento del registro exitoso de un usuario de la página DemoBLAZE
    Dado que aperturamos la web demoBlaze en el navegador Chrome
    Cuando realizamos click en Sign Up
    Y Escribimos Paolo123 en el cuadro de texto Username
    Y escribimos asdqwe en el cuadro de texto Contraseña
    Y hacemos click en Sign Up
    Entonces Validamos que el usuario se haya registrado exitosamente

  @ESCENARIO_DEMOBLAZE_02
  Esquema del escenario: Validar el correcto funcionamiento de la compra exitosa de la pagina DemoBlaze
    Dado que aperturamos la pagina demoBlaze en el navegador "<Navegador>"
    Cuando seleccionamos "<Categorías>"
    Y luego hacemos click en "<Productos>" para ver su detalle
    Y luego hacemos click en Add to cart
    Y aceptamos el mensaje de alerta
    Y hacemos click en Cart
    Y luego hacemos click en Place Order
    Y escribimos "<Name>" en el cuadro de texto Name
    Y escribimos "<Country>" en el cuadro de texto Country
    Y escribimos "<City>" en el cuadro de texto City
    Y escribimos "<Credit Card>" en el cuadro de texto Credit Card
    Y escribimos "<Month>" en el cuadro de texto Month
    Y escribimos "<Year>" en el cuadro de texto Year
    Y luego hacemos click en purchase
    Entonces Validamos que se realizado el proceso correctamente

    Ejemplos:
      | Navegador | Categorías | Productos    | Name           | Country | City     | Credit Card | Month | Year |
      | chrome    | Monitors   | ASUS Full HD | Paolo Coaquira | Perú    | Trujillo | 147852369   | Junio | 2022 |
      | chrome    | Laptops    | MacBook Pro  | Mauro García   | Perú    | Trujillo | 159875321   | Mayo  | 2022 |
