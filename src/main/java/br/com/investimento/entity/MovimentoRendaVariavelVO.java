package br.com.investimento.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mrv_movimento_renda_variavel")
public class MovimentoRendaVariavelVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mrv_cod_movimento_renda_variavel")
    private Long codMovimentoRendaVariavel;

    @ManyToOne
    @JoinColumn(name = "mrv_cod_saldo_renda_variavel")
    private SaldoRendaVariavelVO codSaldoRendaVariavel;

    @Column(name = "mrv_data_hora_movimento")
    private Timestamp dataHoraMovimento;

    @Column(name = "mrv_quantidade_ativo")
    private Integer quantidadeAtivo;

    @Column(name = "mrv_preco_ativo")
    private BigDecimal precoAtivo;

    @Column(name = "mrv_taxa_liquidacao")
    private BigDecimal taxaLiquidacao;    

    @Column(name = "mrv_emolumentos")
    private BigDecimal emolumentos;

    @Column(name = "mrv_corretagem")
    private BigDecimal corretagem;

    @Column(name = "mrv_custo_total")
    private BigDecimal custoTotal;

    @ManyToOne
    @JoinColumn(name = "mrv_tipo_movimento")
    private RegistroVO tipoMovimento;

    @OneToOne
    @JoinColumn(name = "mrv_cod_movimento_renda_variavel", referencedColumnName = "ror_movimento_renda_variavel")
    private ResultadoOperacaoRendaVariavelVO resultadoOperacaoRendaVariavel;

    
    public MovimentoRendaVariavelVO() {
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codMovimentoRendaVariavel == null) ? 0 : codMovimentoRendaVariavel.hashCode());
        result = prime * result + ((codSaldoRendaVariavel == null) ? 0 : codSaldoRendaVariavel.hashCode());
        result = prime * result + ((corretagem == null) ? 0 : corretagem.hashCode());
        result = prime * result + ((custoTotal == null) ? 0 : custoTotal.hashCode());
        result = prime * result + ((dataHoraMovimento == null) ? 0 : dataHoraMovimento.hashCode());
        result = prime * result + ((emolumentos == null) ? 0 : emolumentos.hashCode());
        result = prime * result + ((precoAtivo == null) ? 0 : precoAtivo.hashCode());
        result = prime * result + ((quantidadeAtivo == null) ? 0 : quantidadeAtivo.hashCode());
        result = prime * result + ((taxaLiquidacao == null) ? 0 : taxaLiquidacao.hashCode());
        result = prime * result + ((tipoMovimento == null) ? 0 : tipoMovimento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MovimentoRendaVariavelVO other = (MovimentoRendaVariavelVO) obj;
        if (codMovimentoRendaVariavel == null) {
            if (other.codMovimentoRendaVariavel != null)
                return false;
        } else if (!codMovimentoRendaVariavel.equals(other.codMovimentoRendaVariavel))
            return false;
        if (codSaldoRendaVariavel == null) {
            if (other.codSaldoRendaVariavel != null)
                return false;
        } else if (!codSaldoRendaVariavel.equals(other.codSaldoRendaVariavel))
            return false;
        if (corretagem == null) {
            if (other.corretagem != null)
                return false;
        } else if (!corretagem.equals(other.corretagem))
            return false;
        if (custoTotal == null) {
            if (other.custoTotal != null)
                return false;
        } else if (!custoTotal.equals(other.custoTotal))
            return false;
        if (dataHoraMovimento == null) {
            if (other.dataHoraMovimento != null)
                return false;
        } else if (!dataHoraMovimento.equals(other.dataHoraMovimento))
            return false;
        if (emolumentos == null) {
            if (other.emolumentos != null)
                return false;
        } else if (!emolumentos.equals(other.emolumentos))
            return false;
        if (precoAtivo == null) {
            if (other.precoAtivo != null)
                return false;
        } else if (!precoAtivo.equals(other.precoAtivo))
            return false;
        if (quantidadeAtivo == null) {
            if (other.quantidadeAtivo != null)
                return false;
        } else if (!quantidadeAtivo.equals(other.quantidadeAtivo))
            return false;
        if (taxaLiquidacao == null) {
            if (other.taxaLiquidacao != null)
                return false;
        } else if (!taxaLiquidacao.equals(other.taxaLiquidacao))
            return false;
        if (tipoMovimento == null) {
            if (other.tipoMovimento != null)
                return false;
        } else if (!tipoMovimento.equals(other.tipoMovimento))
            return false;
        return true;
    }

    public Long getCodMovimentoRendaVariavel() {
        return codMovimentoRendaVariavel;
    }
    public void setCodMovimentoRendaVariavel(Long codMovimentoRendaVariavel) {
        this.codMovimentoRendaVariavel = codMovimentoRendaVariavel;
    }
    public SaldoRendaVariavelVO getCodSaldoRendaVariavel() {
        return codSaldoRendaVariavel;
    }
    public void setCodSaldoRendaVariavel(SaldoRendaVariavelVO codSaldoRendaVariavel) {
        this.codSaldoRendaVariavel = codSaldoRendaVariavel;
    }
    public Timestamp getDataHoraMovimento() {
        return dataHoraMovimento;
    }
    public void setDataHoraMovimento(Timestamp dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }
    public Integer getQuantidadeAtivo() {
        return quantidadeAtivo;
    }
    public void setQuantidadeAtivo(Integer quantidadeAtivo) {
        this.quantidadeAtivo = quantidadeAtivo;
    }
    public BigDecimal getPrecoAtivo() {
        return precoAtivo;
    }
    public void setPrecoAtivo(BigDecimal precoAtivo) {
        this.precoAtivo = precoAtivo;
    }
    public BigDecimal getTaxaLiquidacao() {
        return taxaLiquidacao;
    }
    public void setTaxaLiquidacao(BigDecimal taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }
    public BigDecimal getEmolumentos() {
        return emolumentos;
    }
    public void setEmolumentos(BigDecimal emolumentos) {
        this.emolumentos = emolumentos;
    }
    public BigDecimal getCorretagem() {
        return corretagem;
    }
    public void setCorretagem(BigDecimal corretagem) {
        this.corretagem = corretagem;
    }
    public BigDecimal getCustoTotal() {
        return custoTotal;
    }
    public void setCustoTotal(BigDecimal custoTotal) {
        this.custoTotal = custoTotal;
    }
    public RegistroVO getTipoMovimento() {
        return tipoMovimento;
    }
    public void setTipoMovimento(RegistroVO tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }    
}
