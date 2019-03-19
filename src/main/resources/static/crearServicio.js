$(document).ready(function(){
	loadCrearServicio();
	var botonHome=$("#home");
	botonHome.click(loadCrearServicio);
	function loadCrearServicio(){
		$("#contenido").load("crearServicio.html");
		
	}
}
)