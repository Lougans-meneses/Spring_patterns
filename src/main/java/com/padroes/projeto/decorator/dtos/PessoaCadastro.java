package com.padroes.projeto.decorator.dtos;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PessoaCadastro {

    private String nome;
    private String numeroFiscal;
    private OffsetDateTime dataNascimento;

}
