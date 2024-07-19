package com.padroes.projeto.strategy.repositorys;

import com.padroes.projeto.strategy.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
