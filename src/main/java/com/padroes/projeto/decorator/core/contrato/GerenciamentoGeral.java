package com.padroes.projeto.decorator.core.contrato;

import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;

public interface GerenciamentoGeral {

    Pessoa criarPessoaValida(PessoaCadastro pessoaCadastro);

}
