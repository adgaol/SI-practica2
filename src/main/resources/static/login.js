var usuario;
function identificar(){
    var password=inputPassword.value;
    
    $.ajax({
		url: "http://localhost:8080/usuarios/search/findByPassword?password="+password,
		dataType: 'json'
	}).then(function(data) {
		usuario=data;
		
		if(usuario["perfil"]==("PROFESIONAL")){
			var posId=data._links.usuario.href.split("/").length-1;
			var id=data._links.usuario.href.split("/")[posId];
			location.href = "HomeProfesional.html?usuario="+id;
 		}
		if(usuario["perfil"]==("ANALYST")){
			var posId=data._links.usuario.href.split("/").length-1;
			var id=data._links.usuario.href.split("/")[posId];
			location.href = "HomeAnalyst.html?usuario="+id;
 		} 
		if(usuario["perfil"]==("CUSTOMER")){
			var posId=data._links.usuario.href.split("/").length-1;
			var id=data._links.usuario.href.split("/")[posId];
			location.href = "HomeUser.html?usuario="+id;
 		} 
			
		

		
	});
    
}

$(document).ready(function(){
    /*var botonEnviar=$("#enviarLogin");
    botonEnviar.click(identificar);*/
	var inputUser=$("#inputUser");
    var inputPassword=$("#inputPassword");
})