package com.padroes.projeto.strategy.core.contract;

import com.padroes.projeto.strategy.entities.Conta;
import com.padroes.projeto.strategy.enums.TipoConta;

public interface AcoesConta {

    void criarConta(Conta conta);

    TipoConta getStrategyName();

}
