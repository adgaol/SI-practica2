function serviciosMasDemandados(){
	
    $("#contenido").load("masDemandados.html");
    
    loadMasDemandados();
    //getUsuarios();
}
function loadMasDemandados(){
	 
	
    $.ajax({
		url: "http://localhost:8080/masDemandados/search/alls",
		dataType: 'json'
	}).then(function(data) {
		var patata=data;
		var servicios=data["_embedded"]["masDemandados"];
		var size=servicios.length;
		for(var i=size-1;i>=0;i--){
			
			var servicio=servicios[i];
			/*var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];*/
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["nombreserv"]+"</td><td>"+servicio["nombre"]+"</td><td>"+servicio["count"]+"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonServiciosMasDemandados=$("#serviciosMasDemandados");
	
	botonServiciosMasDemandados.click(serviciosMasDemandados);
	
	
	
	
})