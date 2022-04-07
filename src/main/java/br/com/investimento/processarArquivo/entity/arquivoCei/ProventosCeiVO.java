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
import br.com.investimento.processarArquivo.bean.arquivoCei.ProventosCeiBean;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_proventos_cei")
public class ProventosCeiVO extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prc_cod_proventos_cei")
    private Long codProventosCei;

    @Column(name = "prc_entrada_saida")
    private String entradaSaida;

    @Column(name = "prc_data")
    private Date data;

    @Column(name = "prc_papel")
    private String papel;

    @ManyToOne
    @JoinColumn(name = "prc_tipo_movimentacao")
    private RegistroVO tipoMovimentacao;

    @Column(name = "prc_instituicao")
    private String instituicao;

    @Column(name = "prc_quantidade")
    private Integer quantidade;

    @Column(name = "prc_preco_unitario")
    private BigDecimal precoUnitario;

    @Column(name = "prc_valor_operacao")
    private BigDecimal valorOperacao;

    public ProventosCeiVO() {
    }

    public Long getCodProventosCei() {
        return codProventosCei;
    }

    public void setCodProventosCei(Long codProventosCei) {
        this.codProventosCei = codProventosCei;
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

	public RegistroVO getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(RegistroVO tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
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

    public ProventosCeiVO parse(ProventosCeiBean bean) {

        DominioRegistroController dominioRegistroFacade = new DominioRegistroController();

        ProventosCeiVO vo = new ProventosCeiVO();
        
        vo.setData(bean.getDataProvento());
        vo.setEntradaSaida(bean.getEntradaSaida());
        vo.setTipoMovimentacao(dominioRegistroFacade.carregarRegistroPelaDescricao(bean.getMovimentacao()));
        vo.setPapel(bean.getProduto().substring(0, 6));
        vo.setInstituicao(bean.getInstituicao());
        vo.setQuantidade(bean.getQuantidade());
        vo.setPrecoUnitario(bean.getPrecoUnitario());
        vo.setValorOperacao(bean.getValorOperacao());

        return vo;

    }


}
