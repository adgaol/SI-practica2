var id;
function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
    results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}
function loadCrearServicio(){
		$("#contenido").load("crearServicio.html");
		//getUsuarios();
	}
	/*function getUsuarios() {
	var usuarios;
	$.ajax({
		url: "http://localhost:8080/usuarios/",
		dataType: 'json'
	}).then(function(data) {
		usuarios=data["_embedded"]["usuarios"];
		var size=usuarios.length;
		for(var i=0;i<size;i++){
			
			var usuario=usuarios[i];
			
			$('#profesional').append($("<option></option>").attr("value",usuario["nombre"]).text(usuario["nombre"])); 
		}
		

		return usuarios;
	});
	
	}*/
	function sendServicio(){
		// Primero se captan los datos del formulario y pasan a un objeto.
		var formData = {};
		formData['nombre'] = $('#nombre').val();
		formData['descripcion'] = $('#descripcion').val();
		formData['categoria'] = $('#categoria').val();
		formData['duracion'] = $('#duracion').val();
		formData['precio'] = $('#precio').val();
		
		// Para el director hay que enviar la URI completa al objeto existente:
		formData['profesional'] = 'http://localhost:8080/usuarios/'+id/*$('#profesional').val()*/;
		$.ajax({
			type: "POST",
			url: 'http://localhost:8080/servicios/',
			dataType: 'json',
			async: false,
			// El objeto hay que convertirlo a texto
			data: JSON.stringify(formData),
			contentType: 'application/json'
		});
	}
$(document).ready(function(){
	//loadCrearServicio;
	var botonHome=$("#home");
	
	botonHome.click(loadCrearServicio);
	id = getParameterByName('usuario');
	
	
	
}

)