function profesionalesDemandados(){
	
    $("#contenido").load("profesionalesDemandados.html");
    
    loadProfesionalesDemandados();
    //getUsuarios();
}
function loadProfesionalesDemandados(){
	 
	
    $.ajax({
		url: "http://localhost:8080/profesionalesDemandados/search/alls",
		dataType: 'json'
	}).then(function(data) {
		var patata=data;
		var servicios=data["_embedded"]["profesionalesDemandados"];
		var size=servicios.length;
		for(var i=size-1;i>=0;i--){
			
			var servicio=servicios[i];
			var posId=servicio._links.profesionalesDemandados.href.split("/").length-1;
			var id=servicio._links.profesionalesDemandados.href.split("/")[posId];
			/*var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];*/
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["nombre"]+"</td><td>"+servicio["count"]+"</td><td>"
                +"<a id=enlace"+id+" value="+id+" href=misServicios.html?usuario="+id+">servicios de "+
                servicio["nombre"]+"</a></td></tr>"
            ); 
			
			//$('#enlace'+id).click(loadServUser(id));
			$('#enlace'+id).on('click', function(e){
				e.preventDefault();
				var id1=e.target.attributes.value.value;
				loadServUser(id1)
			});
			
		}
		

		
	});
}
function loadServUser( id){
	
		
	    $("#contenido").load("servUser.html");
	    
	    loadServicios(id);
	    //getUsuarios();
	
}
function loadServicios(id){
	 var patata=id;
	//var user="http://localhost:8080/usuarios/"+id;
    $.ajax({
		url: "http://localhost:8080/servUser/search/alls?id="+id,
		dataType: 'json'
	}).then(function(data) {
		var servicios=data["_embedded"]["servUser"];
		var size=servicios.length;
		for(var i=0;i<size;i++){
			
			var servicio=servicios[i];
			/*var posId=servicio._links.servicio.href.split("/").length-1;
			var servicioId=servicio._links.servicio.href.split("/")[posId];*/
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["fecha"]+"</td><td>"+servicio["nombre"]+"</td><td>"+servicio["estado"]
                +"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonProfesionalesMasDemandados=$("#profesionalesMasDemandados");
	
	botonProfesionalesMasDemandados.click(profesionalesDemandados);
	
	
	
	
})