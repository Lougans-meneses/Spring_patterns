package com.padroes.projeto.decorator.core;

import com.padroes.projeto.decorator.core.contrato.GerenciamentoGeral;
import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;
import com.padroes.projeto.decorator.exceptions.DataNascimentoInvalida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
@Qualifier("gerenciarDadosInconsistentes")
public class GerenciarDadosInconsistentes implements GerenciamentoGeral {

    @Autowired
    @Qualifier("gerenciarDadosExistente")
    private GerenciamentoGeral gerenciamentoGeral;

    @Override
    public Pessoa criarPessoaValida(PessoaCadastro pessoaCadastro) {

        if (pessoaCadastro.getDataNascimento().isAfter(OffsetDateTime.now())) {
            throw new DataNascimentoInvalida("Data não pode ser no futuro!!! Digite uma data valida.");
        }

        return gerenciamentoGeral.criarPessoaValida(pessoaCadastro);
    }
}
