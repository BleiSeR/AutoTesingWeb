#language: es
@FEATURE_DEMOQA

Característica: Validar el funcionamiento de los formularios de DemoQA
  Como automatizador web
  Quiero validar el funcionamiento de los formularios
  Para lanzarlo a producción

  @ESCENARIO_DEMOQA_01
  Escenario: Validar el funcionamiento del formulario TextBox de la página DemoQA
    Dado que aperturamos la web DemoQA en el navegador Chrome
    Cuando realizamos click en Elements
    Y realizamos un click en el menu TextBox
    Y escribimos Paolo en el cuadro de texto Full Name
    Y escribimos pao_lo@nttdata.com en el cuadro de texto Email
    Y escribimos Trujillo en el cuadro de texto Current Address
    Y escribimos Lima en el cuadro de texto Permanent Address
    Y hacemos click en submit
    #Entonces Validamos que los datos se muestren en la parte inferior
    Entonces Validamos que los datos se muestren en la parte inferior 2

  @ESCENARIO_DEMOQA_02
  Esquema del escenario: Validar el correcto funcionamiento del formulario de la pagina DemoQA
    Dado que aperturamos la pagina DemoQA en el navegador "<Navegador>"
    Cuando hacemos click en forms
    Y luego hacemos click en el submenu Practice Form
    Y escribimos "<First Name>" en el cuadro de texto First Name
    Y escribimos "<Last Name>" en el cuadro de texto Last Name
    Y escribimos en el cuadro de texto correo "<Email>"
    Y seleccionamos el genero "<Gender>"
    Y escribimos el numero de telefono "<Mobile>"
    Y elegimos la fecha de nacimiento "<Date Birth>"
    Y escribimos "<Subjects>" como asignaturas
    Y elegir "<Hobbies>" como hobbies
    Y seleccionamos un archivo de la ruta "<Picture>"
    Y escribimos "<Current Address>" en el cuadro de texto current address
    Y seleccionamos "<State>" como estado y "<City>" como ciudad
    Y hacemos click en el boton submit
    Entonces Validamos que se haya registrado correctamente

    Ejemplos:
      | Navegador | First Name | Last Name | Email              | Gender | Mobile     | Date Birth | Subjects            | Hobbies       | Picture                                      | Current Address | State   | City   |
      | chrome    | Paolo      | Coaquira  | pao_lo@nttdata.com | Male   | 9738451234 | 06/22/2000 | Maths,Commerce      | Sports,Music  | C:\Users\USUARIO\OneDrive\Escritorio\KRU.jpg | Trujillo        | NCR     | Delhi  |
      | chrome    | Mauro      | García    | mau_ga@nttdata.com | Other  | 9738451234 | 06/22/1998 | Maths,Commerce,Arts | Music,Reading | C:\Users\USUARIO\OneDrive\Escritorio\KRU.jpg | Trujillo        | Haryana | Karnal |
