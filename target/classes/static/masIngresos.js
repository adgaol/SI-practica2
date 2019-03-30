function serviciosMasIngresos(){
	
    $("#contenido").load("masIngresos.html");
    
    loadMasIngresos();
    //getUsuarios();
}
function loadMasIngresos(){
	 
	
    $.ajax({
		url: "http://localhost:8080/masIngresos/search/alls",
		dataType: 'json'
	}).then(function(data) {
		var patata=data;
		var servicios=data["_embedded"]["masIngresos"];
		var size=servicios.length;
		for(var i=size-1;i>=0;i--){
			
			var servicio=servicios[i];
			/*var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];*/
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["nombreserv"]+"</td><td>"+servicio["nombre"]+"</td><td>"+servicio["ingresos"]+"</td><td>"+servicio["count"]+"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonServiciosConMasIngresos=$("#serviciosConMasIngresos");
	
	botonServiciosConMasIngresos.click(serviciosMasIngresos);
	
	
	
	
})