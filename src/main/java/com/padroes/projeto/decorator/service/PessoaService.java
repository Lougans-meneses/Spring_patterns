package com.padroes.projeto.decorator.service;

import com.padroes.projeto.decorator.core.contrato.GerenciamentoGeral;
import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;
import com.padroes.projeto.decorator.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    @Qualifier("gerenciarDadosInconsistentes")
    private GerenciamentoGeral gerenciamentoGeral;

    public Pessoa salvarPessoaFisica(PessoaCadastro pessoaCadastro) {

        Pessoa newPessoa = gerenciamentoGeral.criarPessoaValida(pessoaCadastro);

        return pessoaRepository.saveAndFlush(newPessoa);
    }

}
