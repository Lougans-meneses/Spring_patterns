package com.padroes.projeto.strategy.core;

import com.padroes.projeto.strategy.entities.Conta;
import com.padroes.projeto.strategy.enums.TipoConta;
import com.padroes.projeto.strategy.repositorys.ContaRepository;
import com.padroes.projeto.strategy.core.contract.AcoesConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ContaPremium implements AcoesConta {

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public void criarConta(Conta conta) {
        Random random = new Random();
        conta.setSaldoInicial(10000.00);
        conta.setAgencia("P-".concat(String.valueOf(random.nextInt(20))));
        contaRepository.save(conta);
    }

    @Override
    public TipoConta getStrategyName() {
        return TipoConta.PREMIUM;
    }
}
