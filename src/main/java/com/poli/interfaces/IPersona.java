package com.poli.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.modelo.persona;

@Repository
public interface IPersona extends CrudRepository<persona, Integer> {
	
}
