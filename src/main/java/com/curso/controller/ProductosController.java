package com.curso.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.domain.Producto;
import com.curso.domain.repository.EnMemoriaProductoRepository;

@Controller
public class ProductosController {
//Crea un producto lo pasa a model y lo lleva a producto jsp
	
	@Autowired
	EnMemoriaProductoRepository repository;
	
	@RequestMapping("/productos")
	public String saludar(Model model) {
//		List <Producto> lista = new ArrayList<Producto>();
//		lista.add(new Producto("34ER", "Gominola", new BigDecimal("2") )) ;
//		lista.add(new Producto("14ER", "Pan", new BigDecimal("1") ));
//		lista.add(new Producto("4Y6R", "Arroz", new BigDecimal("4") ));
		
		model.addAttribute("lista",repository.getAllProductos());
		
		return "productos";//nombre de la pagina.jsp
	}
}
