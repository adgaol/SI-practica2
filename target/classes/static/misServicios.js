
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
	loadMisServicios();
}
function updatedServicio(){
	// Primero se captan los datos del formulario y pasan a un objeto.
	var formData = {};
	if($('#nombre').val()!="")
		var nombre = $('#nombre').val();
	else
		var nombre="null";
	if($('#descripcion').val()!="")
		var descripcion = $('#descripcion').val();
	else
		var descripcion="null";
	if($('#categoria').val()!="")
		var categoria = $('#categoria').val();
	else
		var categoria="null";
	if($('#duracion').val()!="")
		var duracion = $('#duracion').val();
	else
		var duracion="null";
	if($('#precio').val()!="")
		var precio = $('#precio').val();
	else
		var precio="null";
	if($('#id').val()!=null)
		var servicioId = $('#id').val();
	else
		var servicioId="null";
	// Para el director hay que enviar la URI completa al objeto existente:
	
	$.ajax({
		type: "PUT",
		url: 'http://localhost:8080/control/updatedServicios/'+servicioId+"/"+nombre+"/"+descripcion+"/"+categoria+"/"+duracion+"/"+precio,
		dataType: 'json',
		async: false,
		// El objeto hay que convertirlo a texto
		data: JSON.stringify(formData),
		contentType: 'application/json'
	});
	loadMisServicios();
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