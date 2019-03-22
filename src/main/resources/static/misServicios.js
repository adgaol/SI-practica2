var servicios;
function loadMisServicios(){
    $("#contenido").load("misServicios.html");
    loadServicios();
    //getUsuarios();
}
function loadServicios(){
    $.ajax({
		url: "http://localhost:8080/servicios/",
		dataType: 'json'
	}).then(function(data) {
		servicios=data["_embedded"]["servicios"];
		var size=servicios.length;
		for(var i=0;i<size;i++){
			
			var servicio=servicios[i];
			
			$('#misServiciosCabeceraTabla').after(
                "<tr><td>"+servicio["nombre"]+"</td><td>"+servicio["descripcion"]+"</td><td>"+servicio["categoria"]
                +"</td><td>"+servicio["duracion"]+"</td><td>"+servicio["precio"]+"</td></tr>"
            ); 
		}
		

		
	});
}
$(document).ready(function(){
	//loadCrearServicio();
	var botonMisServicios=$("#misServicios");
	
	botonMisServicios.click(loadMisServicios);
	
	
	
	
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