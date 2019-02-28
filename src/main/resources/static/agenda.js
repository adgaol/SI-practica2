$(document).ready(function(){
	var botonAgenda=$("#agenda");
	botonAgenda.click(anadirAgenda);
	function anadirAgenda(){
		$("#contenido").load("calendar.html");
		alert("mierda");
	}
}
)
