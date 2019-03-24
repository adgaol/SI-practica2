
function loadMisServicios(){
	
    $("#contenido").load("misServicios.html");
    
    loadServicios();
    //getUsuarios();
}
function eliminarServicio(){
	var formData = {};

	var servicioID=$("#servicioID").val();
	formData['id'] = servicioID;

	$.ajax({
		type: "DELETE",
		url:"http://localhost:8080/control/borrarServicios/"+servicioID,
		
		// El objeto hay que convertirlo a texto
		
		});

}
function loadServicios(){
	 
	var user="http://localhost:8080/usuarios/"+id;
    $.ajax({
		url: "http://localhost:8080/servicios/search/findByProfesional?profesional="+user,
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
	var botonMisServicios=$("#misServicios");
	
	botonMisServicios.click(loadMisServicios);
	id = getParameterByName('usuario');
	
	
	
})
/*<tr  th:each="servicio : ${servicios}">
    <td th:text="${servicio.nombre}"></td>
    <td th:text="${servicio.descripcion}"></td> 
    <td th:text="${servicio.categoria}"></td>
    <td th:text=" ${servicio.duracion}"></td>
    <td th:text=" ${servicio.precio}"></td>
    <td>50</td>
    <td><button>Aceptar</button> </td>
    <td><input type="text"></input><button>Denegar</button> </td>
  </tr>*/