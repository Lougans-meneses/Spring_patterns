package com.padroes.projeto.decorator.exceptions;

public class PessoaCadastradaException extends RuntimeException {

    public PessoaCadastradaException(String message, String nome) {
        super(message.concat(" - Nome: ".concat(nome)));
    }
}
