#language: es
@FEATURE_SISTEMAFIXED

Característica: Validar el funcionamiento de los formularios de SistemaFixed
  Como automatizador web
  Quiero validar el funcionamiento de los formularios
  Para lanzarlo a producción

  @ESCENARIO_SISTEMAFIXED_01
  Esquema del escenario: Validar el correcto funcionamiento de la creación de cliente de la pagina SistemaFixed
    Dado que aperturamos la pagina SistemaFixed en el navegador "<Navegador>"
    Cuando le hacemos click a Desplegar Panel
    Y luego hacemos click en Clientes
    Y luego hacemos click en el submenu ver mis clientes
    Y luego hacemos click en Agregar Cliente
    Y seleccionamos "<Tipo de documento>" en el combo Tipo de documento
    Y escribimos "<Documento>" en el cuadro de texto Número de documento
    Y seleccionamos "<Pais>" en el combo Pais
    Y escribimos "<Razon social>" en el cuadro de texto Razon social
    Y escribimos "<Nombre>" en el cuadro de texto Nombre
    Y escribimos "<Direccion>" en el cuadro de texto Direccion
    Y escribimos "<Localidad>" en el cuadro de texto Localidad
    Y escribimos "<Departamento>" en el cuadro de texto Departamento
    Y escribimos "<Domicilio de entrega>" en el cuadro de texto Domicilio de entrega
    Y escribimos "<Descuento>" en el cuadro de texto Descuento
    Y escribimos "<Mail factura>" en el cuadro de texto Mail envio factura
    Y luego seleccionamos "<Proveedor>" en el checkbox Proveedor
    Y luego seleccionamos "<Cliente>" en el checkbox Cliente
    Y luego hacemos click en Agregar
    Entonces Validamos que se ha realizado el proceso correctamente

    Ejemplos:
      | Navegador | Tipo de documento | Documento | Pais  | Razon social | Nombre | Direccion | Localidad | Departamento | Domicilio de entrega | Descuento | Mail factura       | Proveedor | Cliente |
      | chrome    | Otros             | 12345678  | Perú  | Trabajo      | Paolo  | Salaverry | Trujillo  | La Libertad  | Salaverry 124        | 35        | pao_lo@nttdata.com | SI        | NO      |
      | chrome    | Otros             | 87654321  | Chile | Visita       | Mauro  | Molino    | Trujillo  | La Libertad  | Molino 124           | 50        | mau_ro@nttdata.com | NO        | SI      |
