package com.padroes.projeto.strategy.enums;

public enum TipoConta {

    POUPANCA,
    CORRENTE,
    PREMIUM;

    public static TipoConta findByAbbr(TipoConta abbr){
        for(TipoConta v : values()){
            if( v.equals(abbr)){
                return v;
            }
        }
        return null;
    }

}
