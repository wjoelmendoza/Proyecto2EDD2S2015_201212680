//demostracion delos eventos focus y blur.
var arregloAyuda = ["Escriba su nombre en este cuadro de entrada.",
	"Escriba su direccion de e-mail en el formato usuario@dominio.com",
	"Ingrese su contraseña, debe de tener almenos 6 caractes",
	"Ingrese nuevamente su contraseña",
        "Esta Aceptando que los datos son correctos",""];
	
var textoAyuda;
	
function inic() {
	textoAyuda = document.getElementById("textoAyuda");
	//registrar componentes de escucha
        
	registrarEscuchas(document.getElementById("nombre"), 0 );
	registrarEscuchas(document.getElementById("email"), 1 );
	registrarEscuchas(document.getElementById("password"), 2 );
	registrarEscuchas(document.getElementById("rPassword"), 3 );
	registrarEscuchas(document.getElementById("btnAceptar"), 4 );
	//registrarEscuchas(document.getElementById("reiniciar"), 5 );
}

function registrarEscuchas( objeto, numeroMensaje ) {
	objeto.addEventListener("focus", function () { textoAyuda.innerHTML = arregloAyuda[ numeroMensaje];}, false);
	objeto.addEventListener("blur", function () {textoAyuda.innerHTML = arregloAyuda[5];},false);
}

window.addEventListener( "load", inic, false);