package com.poli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poli.interfaceService.iPersonaService;
import com.poli.interfaces.IPersona;
import com.poli.modelo.persona;

@Service
public class PersonaService implements iPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<persona> listar() {
		
		return (List<persona>)data.findAll();
	}

}
