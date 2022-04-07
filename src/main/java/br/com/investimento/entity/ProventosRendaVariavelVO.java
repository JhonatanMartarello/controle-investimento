package br.com.investimento.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_proventos_renda_variavel")
public class ProventosRendaVariavelVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prv_cod_provento")
    private Long codProvento;

    @ManyToOne
    @JoinColumn(name = "prv_ativo")
    private AtivoVO ativo;

    @Column(name = "prv_data_com")
    private Date dataCom;

    @Column(name = "prv_data_pagamento")
    private Date dataPagamento;

    @ManyToOne
    @JoinColumn(name = "prv_tipo_provento")
    private RegistroVO tipoProvento;

    @Column(name = "prv_valor_provento")
    private BigDecimal valorProvento;

    @Column(name = "prv_quantidade_ativo")
    private Integer quantidadeAtivo;

    @Column(name = "prv_saldo_total_ativo")
    private BigDecimal saldoTotalAtivo;

    @Column(name = "prv_valor_receber")
    private BigDecimal valorReceber;

    @Column(name = "prv_porcentagem")
    private BigDecimal porcentagemRetorno;

    public ProventosRendaVariavelVO() {
    }
    
    public Long getCodProvento() {
        return codProvento;
    }
    public void setCodProvento(Long codProvento) {
        this.codProvento = codProvento;
    }
    public AtivoVO getAtivo() {
        return ativo;
    }
    public void setAtivo(AtivoVO ativo) {
        this.ativo = ativo;
    }
    public Date getDataCom() {
        return dataCom;
    }
    public void setDataCom(Date dataCom) {
        this.dataCom = dataCom;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public RegistroVO getTipoProvento() {
        return tipoProvento;
    }
    public void setTipoProvento(RegistroVO tipoProvento) {
        this.tipoProvento = tipoProvento;
    }
    public BigDecimal getValorProvento() {
        return valorProvento;
    }
    public void setValorProvento(BigDecimal valorProvento) {
        this.valorProvento = valorProvento;
    }
    public Integer getQuantidadeAtivo() {
        return quantidadeAtivo;
    }
    public void setQuantidadeAtivo(Integer quantidadeAtivo) {
        this.quantidadeAtivo = quantidadeAtivo;
    }
    public BigDecimal getSaldoTotalAtivo() {
        return saldoTotalAtivo;
    }
    public void setSaldoTotalAtivo(BigDecimal saldoTotalAtivo) {
        this.saldoTotalAtivo = saldoTotalAtivo;
    }
    public BigDecimal getValorReceber() {
        return valorReceber;
    }
    public void setValorReceber(BigDecimal valorReceber) {
        this.valorReceber = valorReceber;
    }
    public BigDecimal getPorcentagemRetorno() {
        return porcentagemRetorno;
    }
    public void setPorcentagemRetorno(BigDecimal porcentagemRetorno) {
        this.porcentagemRetorno = porcentagemRetorno;
    }

    
}
