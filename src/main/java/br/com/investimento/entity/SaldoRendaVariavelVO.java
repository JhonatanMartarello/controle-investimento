package br.com.investimento.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_saldo_renda_variavel")
public class SaldoRendaVariavelVO {
    @Id
    @Column(name = "srv_cod_resultado")
    private Long codResultadoRendaVariavel;

    @Column(name = "srv_data_saldo")
    private Date dataSaldo;

    @OneToOne
    @JoinColumn(name = "srv_ativo", referencedColumnName = "ati_cod_ativo")
    private AtivoVO ativo;

    @Column(name = "srv_quantidade_ativo")
    private Integer quantidadeAtivo;

    @Column(name = "srv_valor_investido")
    private BigDecimal valorInvestido;

    @Column(name = "srv_dividendos_recebidos")
    private BigDecimal dividendosRecebidos;

    @Column(name = "srv_preco_medio")
    private BigDecimal precoMedio;

    @Column(name = "srv_resultado_total")
    private BigDecimal resultadoTotal;

    @OneToMany(mappedBy = "codSaldoRendaVariavel")
    private List<MovimentoRendaVariavelVO> movimentosRendaVariavel;

    public SaldoRendaVariavelVO() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
        result = prime * result + ((codResultadoRendaVariavel == null) ? 0 : codResultadoRendaVariavel.hashCode());
        result = prime * result + ((dataSaldo == null) ? 0 : dataSaldo.hashCode());
        result = prime * result + ((dividendosRecebidos == null) ? 0 : dividendosRecebidos.hashCode());
        result = prime * result + ((precoMedio == null) ? 0 : precoMedio.hashCode());
        result = prime * result + ((quantidadeAtivo == null) ? 0 : quantidadeAtivo.hashCode());
        result = prime * result + ((resultadoTotal == null) ? 0 : resultadoTotal.hashCode());
        result = prime * result + ((valorInvestido == null) ? 0 : valorInvestido.hashCode());
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
        SaldoRendaVariavelVO other = (SaldoRendaVariavelVO) obj;
        if (ativo == null) {
            if (other.ativo != null)
                return false;
        } else if (!ativo.equals(other.ativo))
            return false;
        if (codResultadoRendaVariavel == null) {
            if (other.codResultadoRendaVariavel != null)
                return false;
        } else if (!codResultadoRendaVariavel.equals(other.codResultadoRendaVariavel))
            return false;
        if (dataSaldo == null) {
            if (other.dataSaldo != null)
                return false;
        } else if (!dataSaldo.equals(other.dataSaldo))
            return false;
        if (dividendosRecebidos == null) {
            if (other.dividendosRecebidos != null)
                return false;
        } else if (!dividendosRecebidos.equals(other.dividendosRecebidos))
            return false;
        if (precoMedio == null) {
            if (other.precoMedio != null)
                return false;
        } else if (!precoMedio.equals(other.precoMedio))
            return false;
        if (quantidadeAtivo == null) {
            if (other.quantidadeAtivo != null)
                return false;
        } else if (!quantidadeAtivo.equals(other.quantidadeAtivo))
            return false;
        if (resultadoTotal == null) {
            if (other.resultadoTotal != null)
                return false;
        } else if (!resultadoTotal.equals(other.resultadoTotal))
            return false;
        if (valorInvestido == null) {
            if (other.valorInvestido != null)
                return false;
        } else if (!valorInvestido.equals(other.valorInvestido))
            return false;
        return true;
    }

    public Long getCodResultadoRendaVariavel() {
        return codResultadoRendaVariavel;
    }

    public void setCodResultadoRendaVariavel(Long codResultadoRendaVariavel) {
        this.codResultadoRendaVariavel = codResultadoRendaVariavel;
    }

    public Date getDataSaldo() {
        return dataSaldo;
    }

    public void setDataSaldo(Date dataSaldo) {
        this.dataSaldo = dataSaldo;
    }

    public AtivoVO getAtivo() {
        return ativo;
    }

    public void setAtivo(AtivoVO ativo) {
        this.ativo = ativo;
    }

    public Integer getQuantidadeAtivo() {
        return quantidadeAtivo;
    }

    public void setQuantidadeAtivo(Integer quantidadeAtivo) {
        this.quantidadeAtivo = quantidadeAtivo;
    }

    public BigDecimal getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(BigDecimal valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public BigDecimal getDividendosRecebidos() {
        return dividendosRecebidos;
    }

    public void setDividendosRecebidos(BigDecimal dividendosRecebidos) {
        this.dividendosRecebidos = dividendosRecebidos;
    }

    public BigDecimal getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(BigDecimal precoMedio) {
        this.precoMedio = precoMedio;
    }

    public BigDecimal getResultadoTotal() {
        return resultadoTotal;
    }

    public void setResultadoTotal(BigDecimal resultadoTotal) {
        this.resultadoTotal = resultadoTotal;
    }        
    
}
