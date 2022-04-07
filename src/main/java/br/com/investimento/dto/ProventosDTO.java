package br.com.investimento.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.investimento.processarArquivo.entity.arquivoCei.ProventosCeiVO;

public class ProventosDTO {
    private Long codProventos;
    private String entradaSaida;
    private Date data;
    private String papel;
    private String tipoMovimentacao;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal valorOperacao;

    public static ProventosDTO transformaEmDTO(ProventosCeiVO proventosCei) {
        return new ProventosDTO(proventosCei.getCodProventosCei(), proventosCei.getEntradaSaida(),
                proventosCei.getData(), proventosCei.getPapel(),
                proventosCei.getTipoMovimentacao() != null ? proventosCei.getTipoMovimentacao().getDescricao() : "",
                proventosCei.getQuantidade(), proventosCei.getPrecoUnitario(), proventosCei.getPrecoUnitario());
    }

    public List<ProventosDTO> transformaEmDTO(List<ProventosCeiVO> listaProventosCei) {
        List<ProventosDTO> listaProventosDTO = new ArrayList<>();
        for (ProventosCeiVO proventos : listaProventosCei) {
            listaProventosDTO.add(ProventosDTO.transformaEmDTO(proventos));
        }
        return listaProventosDTO;
    }

    public ProventosDTO(Long codProventos, String entradaSaida, Date data, String papel, String tipoMovimentacao,
            Integer quantidade, BigDecimal precoUnitario, BigDecimal valorOperacao) {
        this.codProventos = codProventos;
        this.entradaSaida = entradaSaida;
        this.data = data;
        this.papel = papel;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorOperacao = valorOperacao;
    }

    public ProventosDTO() {

    }

    public Long getCodProventos() {
        return codProventos;
    }

    public void setCodProventos(Long codProventos) {
        this.codProventos = codProventos;
    }

    public String getEntradaSaida() {
        return entradaSaida;
    }

    public void setEntradaSaida(String entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(BigDecimal valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

}
