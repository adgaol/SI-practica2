$(document).ready(function(){
	var botonPendientes=$("#pendientes");
	botonPendientes.click(anadirPendientes);
	function anadirPendientes(){
		$("#contenido").load("serviciosPendientes.html");
		alert("mierda");
	}
	function recogerPendientes(){
		/*<![CDATA[*/
		
		var	 pendientes=/*[[${servicio.Name}]]*/null;
		/*]]>*/
	}
}
)
