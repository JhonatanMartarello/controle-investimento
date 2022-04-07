package br.com.investimento.controller;

import br.com.investimento.entity.RegistroVO;
import br.com.investimento.repository.RegistroRepository;

public class DominioRegistroController {

    public RegistroVO carregarRegistroPelaDescricao(String descricao) {
        return new RegistroRepository().carregarRegistroPelaDescricao(descricao);
    }

    public RegistroVO carregarRegistroPeloDominioRegistro(Long codDominio, Long codRegistro) {
        return new RegistroRepository().carregarRegistroPeloDominioRegistro(codDominio, codRegistro);
    }

}
