package com.variaveis.variaveis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.variaveis.variaveis.models.Pessoa;

@Repository
public interface variaveisRepository extends JpaRepository<Pessoa, Long>{
	
	Pessoa findByCpf(String cpf);

}
