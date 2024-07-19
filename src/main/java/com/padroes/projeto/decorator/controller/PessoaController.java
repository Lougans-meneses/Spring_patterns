package com.padroes.projeto.decorator.controller;

import com.padroes.projeto.decorator.dtos.PessoaCadastro;
import com.padroes.projeto.decorator.entities.Pessoa;
import com.padroes.projeto.decorator.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa cadastrar(@RequestBody PessoaCadastro pessoaCadastro) {
        return pessoaService.salvarPessoaFisica(pessoaCadastro);
    }

}
