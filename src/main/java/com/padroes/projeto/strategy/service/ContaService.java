package com.padroes.projeto.strategy.service;

import com.padroes.projeto.strategy.dtos.ContaPessoaCadastro;
import com.padroes.projeto.strategy.entities.Conta;
import com.padroes.projeto.strategy.enums.TipoConta;
import com.padroes.projeto.strategy.core.StrategyFactory;
import com.padroes.projeto.strategy.core.contract.AcoesConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private StrategyFactory strategyFactory;

    public Conta registrarConta(ContaPessoaCadastro contaPessoaCadastro) {
        final Conta conta = new Conta();
        conta.setNome(contaPessoaCadastro.getNome());

        AcoesConta acoesConta = strategyFactory.findStrategy(TipoConta.findByAbbr(contaPessoaCadastro.getTipoConta()));

        acoesConta.criarConta(conta);

        return conta;
    }

}
