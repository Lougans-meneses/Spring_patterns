package com.padroes.projeto.decorator.core;

import com.padroes.projeto.decorator.core.contrato.GerenciamentoGeral;
import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("gerenciarPessoaFisica")
public class GerenciarPessoaFisica implements GerenciamentoGeral {

    @Override
    public Pessoa criarPessoaValida(PessoaCadastro pessoaCadastro) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaCadastro.getNome());
        pessoa.setDataNascimento(pessoaCadastro.getDataNascimento());
        pessoa.setNumeroFiscal(pessoaCadastro.getNumeroFiscal());

        return pessoa;
    }
}
