package com.poli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poli.interfaceService.iPersonaService;
import com.poli.modelo.persona;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private iPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<persona>personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
}
