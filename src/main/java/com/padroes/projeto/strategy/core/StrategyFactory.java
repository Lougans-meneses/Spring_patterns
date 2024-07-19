package com.padroes.projeto.strategy.core;

import com.padroes.projeto.strategy.enums.TipoConta;
import com.padroes.projeto.strategy.core.contract.AcoesConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {

    private Map<TipoConta, AcoesConta> strategies;

    @Autowired
    public StrategyFactory(Set<AcoesConta> strategySet) {
        createStrategy(strategySet);
    }

    public AcoesConta findStrategy(TipoConta strategyName) {
        return strategies.get(strategyName);
    }
    private void createStrategy(Set<AcoesConta> strategySet) {
        strategies = new HashMap<TipoConta, AcoesConta>();
        strategySet.forEach(strategy ->strategies.put(strategy.getStrategyName(), strategy));
    }

}
