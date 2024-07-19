package com.padroes.projeto.decorator.repository;

import com.padroes.projeto.decorator.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Optional<Pessoa> findByNumeroFiscal(String numeroFiscal);

}
