package br.com.investimento.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.com.investimento.dto.AtivoDTO;
import br.com.investimento.entity.AtivoVO;

@ApplicationScoped
public class AtivoController {

    public AtivoVO update(Long codAtivo, AtivoDTO ativoDTO){
        AtivoVO ativoEntity = AtivoVO.findById(codAtivo);

        if(ativoEntity == null) {
           throw new WebApplicationException("Ativo com o código " + codAtivo + " não encontrado!", Response.Status.NOT_FOUND);
        }

        AtivoVO ativoAlterado = new AtivoVO().transformaEmObjeto(ativoDTO);

        ativoEntity.setCodigoNegociacao(ativoAlterado.getCodigoNegociacao());
        ativoEntity.setNome(ativoAlterado.getNome());
        ativoEntity.setCnpj(ativoAlterado.getCnpj());
        ativoEntity.setTipoAtivo(ativoAlterado.getTipoAtivo());

        return ativoEntity;
    }

    public boolean isNomeAtivoIsNotEmpty(AtivoVO ativo) {
        return ativo.getNome().isEmpty();
    }
    
}
