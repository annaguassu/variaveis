package com.variaveis.variaveis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.variaveis.variaveis.models.Pessoa;
import com.variaveis.variaveis.repository.variaveisRepository;

@RestController
@RequestMapping(value="/variaveis")
public class VariaveisController {

	@Autowired
	variaveisRepository variaveisRepository;
	
	//lista todo mundo
	@GetMapping
	public List<Pessoa> pessoas(){
		return variaveisRepository.findAll();
	}
	
	//lista quem eu quero pelo cpf
	@GetMapping(value="/{cpf}")
	public Pessoa pessoaCpf(@PathVariable(value="cpf") String cpf){
		return variaveisRepository.findByCpf(cpf);
	}
}
