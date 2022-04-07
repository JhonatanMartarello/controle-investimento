package br.com.investimento.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.investimento.entity.AtivoVO;
import br.com.investimento.entity.RegistroVO;

public class AtivoDTO {
    private Long codAtivo;
    private String codigoNegociacao;
    private String nome;
    private Long cnpj;
    private String tipoAtivo;

    public static AtivoDTO transformaEmDTO(AtivoVO ativo){
        return new AtivoDTO(ativo.getCodAtivo(), ativo.getCodigoNegociacao(), ativo.getNome(), ativo.getCnpj(), ativo.getTipoAtivo());
    }

    public List<AtivoDTO> transformaEmDTO(List<AtivoVO> listAtivo){
        List<AtivoDTO> listaAtivoDTO = new ArrayList<>();
        for(AtivoVO ativo : listAtivo){
            listaAtivoDTO.add(AtivoDTO.transformaEmDTO(ativo));
        }
        return listaAtivoDTO;
    }

    public AtivoDTO(Long codAtivo, String codigoNegociacao, String nome, Long cnpj, RegistroVO tipoAtivo) {
        this.codAtivo = codAtivo;
        this.codigoNegociacao = codigoNegociacao;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoAtivo = tipoAtivo != null ? tipoAtivo.getDescricao() : "";
    }

    public AtivoDTO(){
        
    }

    public Long getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(Long codAtivo) {
        this.codAtivo = codAtivo;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoAtivo() {
        return tipoAtivo;
    }

    public void setTipoAtivo(String tipoAtivo) {
        this.tipoAtivo = tipoAtivo;
    }
}
