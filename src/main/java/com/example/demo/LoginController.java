package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Cliente.*;



@Controller
public class LoginController {
	
	@RequestMapping("/home")
	public String buscador(Model model) {

		

		return "HomeProfesional";
	}
	@RequestMapping("/")
	public String buscador2(Model model) {

		

		return "index";
	}
	/*@RequestMapping("/hc")
	public String homeC(Model model) {

		

		return "homeCliente";
	}
	@RequestMapping("/hp")
	public String homeP(Model model) {

		

		return "HomeProfesional";
	}
	*/@RequestMapping("/log")
	public String log(/*@RequestParam String user, String password, */Model model) {
		/*Usuario p1=new Usuario("p1@correo.es", "p1");
		Cliente c1 = new Cliente("usuario1","c1@correo.es","c1");
		if(user.equals(p1.getUser())&&password.equals(p1.getPassword()))*/
			return "HomeProfesional";
		/*else if ((user.equals(c1.getNombre())&&password.equals(c1.getPassword()))||((user.equals(c1.getCorreo())&&password.equals(c1.getPassword())))) {
			return "homeCliente";
		} else {
			return "";
		}*/

		
	}/**/
}
