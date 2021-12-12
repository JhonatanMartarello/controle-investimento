package br.com.investimento.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.com.investimento.entity.AtivoVO;

@ApplicationScoped
public class AtivoController {

    public AtivoVO update(Long codAtivo, AtivoVO ativo){
        AtivoVO ativoEntity = AtivoVO.findById(codAtivo);

        if(ativoEntity == null) {
           throw new WebApplicationException("Ativo com o código " + codAtivo + " não encontrado!", Response.Status.NOT_FOUND);
        }

        ativoEntity.setCodigoNegociacao(ativo.getCodigoNegociacao());
        ativoEntity.setNome(ativo.getNome());
        ativoEntity.setCnpj(ativo.getCnpj());
        ativoEntity.setTipoAtivo(ativo.getTipoAtivo());

        return ativoEntity;
    }

    public boolean isNomeAtivoIsNotEmpty(AtivoVO ativo) {
        return ativo.getNome().isEmpty();
    }
    
}
