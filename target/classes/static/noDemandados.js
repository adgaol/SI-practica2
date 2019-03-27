function serviciosNoDemandados(){
	
    $("#contenido").load("noDemandados.html");
    
    loadNoDemandados();
    //getUsuarios();
}
function loadNoDemandados(){
	 
	
    $.ajax({
		url: "http://localhost:8080/servicios/search/noDemandados",
		dataType: 'json'
	}).then(function(data) {
		var servicios=data["_embedded"]["servicios"];
		var size=servicios.length;
		for(var i=0;i<size;i++){
			
			var servicio=servicios[i];
			var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicioId+"</td><td>"+servicio["nombre"]+"</td><td>"+servicio["descripcion"]+"</td><td>"+servicio["categoria"]
                +"</td><td>"+servicio["duracion"]+"</td><td>"+servicio["precio"]+"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonServiciosNoDemandados=$("#serviciosNoDemandados");
	
	botonServiciosNoDemandados.click(serviciosNoDemandados);
	
	
	
	
})