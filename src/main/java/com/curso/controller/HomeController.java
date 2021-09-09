package com.curso.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String saludar(Model model) {
		model.addAttribute("saludo", "Bienvenido a nuestra tienda online!");
		model.addAttribute("linea1", "Los mejores productos ");
		return "inicio";//nombre de la pagina.jsp
	}
	@RequestMapping("/adios")
	public String despedirse(Model model) {
		model.addAttribute("adios", "Adios, gracias por comprar!");
		model.addAttribute("linea1", "Los mejores productos ");
		return "inicio";
	}
     
        
        
}
