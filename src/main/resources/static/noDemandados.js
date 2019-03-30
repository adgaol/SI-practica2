function serviciosNoDemandados(){
	
    $("#contenido").load("noDemandados.html");
    
    loadNoDemandados();
    //getUsuarios();
}
function loadNoDemandados(){
	 
	
    $.ajax({
		url: "http://localhost:8080/noDemandados/search/alls",
		dataType: 'json'
	}).then(function(data) {
		var patata=data;
		var servicios=data["_embedded"]["noDemandados"];
		var size=servicios.length;
		for(var i=size-1;i>=0;i--){
			
			var servicio=servicios[i];
			/*var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];*/
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["nombreserv"]+"</td><td>"+servicio["nombre"]+"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonServiciosNoDemandados=$("#serviciosNoDemandados");
	
	botonServiciosNoDemandados.click(serviciosNoDemandados);
	
	
	
	
})