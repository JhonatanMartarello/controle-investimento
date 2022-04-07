package br.com.investimento.processarArquivo.entity.arquivoCei;

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

import br.com.investimento.controller.DominioRegistroController;
import br.com.investimento.entity.RegistroVO;
import br.com.investimento.processarArquivo.bean.arquivoCei.HistoricoNegociacaoCeiBean;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_historico_negociacao_cei")
public class HistoricoNegociacaoCeiVO extends PanacheEntityBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hnc_cod_historico_negociacao_cei")
    private Long codHistoricoNegociacaoCei;

    @Column(name = "hnc_data_negocio")
    private Date dataNegocio;

    @ManyToOne
    @JoinColumn(name = "hnc_tipo_movimentacao")
    private RegistroVO tipoMovimento;

    @ManyToOne
    @JoinColumn(name = "hnc_mercado")
    private RegistroVO mercado;

    @Column(name = "hnc_instituicao")
    private String instituicao;

    @Column(name = "hnc_codigo_negociacao")
    private String codigoNegociacao;

    @Column(name = "hnc_quantidade")
    private Integer quantidade;

    @Column(name = "hnc_preco")
    private BigDecimal preco;

    @Column(name = "hnc_valor")
    private BigDecimal valor;

    public HistoricoNegociacaoCeiVO() {
    }

    public Long getCodHistoricoNegociacaoCei() {
        return codHistoricoNegociacaoCei;
    }

    public void setCodHistoricoNegociacaoCei(Long codHistoricoNegociacaoCei) {
        this.codHistoricoNegociacaoCei = codHistoricoNegociacaoCei;
    }

    public Date getDataNegocio() {
        return dataNegocio;
    }

    public void setDataNegocio(Date dataNegocio) {
        this.dataNegocio = dataNegocio;
    }

    public RegistroVO getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(RegistroVO tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public RegistroVO getMercado() {
        return mercado;
    }

    public void setMercado(RegistroVO mercado) {
        this.mercado = mercado;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public HistoricoNegociacaoCeiVO parse(HistoricoNegociacaoCeiBean bean) {

        DominioRegistroController dominioRegistroFacade = new DominioRegistroController();

        HistoricoNegociacaoCeiVO vo = new HistoricoNegociacaoCeiVO();
        vo.setDataNegocio(bean.getDataNegocio());
        vo.setTipoMovimento(dominioRegistroFacade.carregarRegistroPelaDescricao(bean.getTipoMovimento()));
        vo.setMercado(dominioRegistroFacade.carregarRegistroPelaDescricao(bean.getMercado()));
        vo.setInstituicao(bean.getInstituicao());
        vo.setCodigoNegociacao(bean.getCodigoNegociacao());
        vo.setQuantidade(bean.getQuantidade());
        vo.setPreco(bean.getPreco());
        vo.setValor(bean.getValor());

        return vo;

    }

    
}
