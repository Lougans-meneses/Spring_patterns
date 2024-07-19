package com.padroes.projeto.decorator.core;

import com.padroes.projeto.decorator.core.contrato.GerenciamentoGeral;
import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;
import com.padroes.projeto.decorator.exceptions.PessoaCadastradaException;
import com.padroes.projeto.decorator.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("gerenciarDadosExistente")
public class GerenciarDadosExistente implements GerenciamentoGeral {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    @Qualifier("gerenciarPessoaFisica")
    private GerenciamentoGeral gerenciamentoGeral;

    @Override
    public Pessoa criarPessoaValida(PessoaCadastro pessoaCadastro) {

        pessoaRepository.findByNumeroFiscal(pessoaCadastro.getNumeroFiscal()).ifPresent(pessoa -> {
            throw new PessoaCadastradaException("Pessoa ja cadastrada", pessoa.getNome());
        });

        return gerenciamentoGeral.criarPessoaValida(pessoaCadastro);
    }
}
