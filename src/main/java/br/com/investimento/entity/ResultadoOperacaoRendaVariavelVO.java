package br.com.investimento.entity;

import java.math.BigDecimal;

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
@Table(name = "tb_resultado_operacao_renda_variavel")
public class ResultadoOperacaoRendaVariavelVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name = "ror_cod_resultado_operacao_renda_variavel")
    private Long codResultadoOperacaoRendaVariavel;

    @OneToOne
    @JoinColumn(name = "ror_movimento_renda_variavel", referencedColumnName = "mrv_cod_movimento_renda_variavel")
    private MovimentoRendaVariavelVO movimentoRendaVariavel;

    @ManyToOne
    @JoinColumn(name = "ror_ativo")
    private AtivoVO ativo;

    @Column(name = "ror_preco_compra")
    private BigDecimal precoCompra;

    @Column(name = "ror_preco_venda")
    private BigDecimal precoVenda;

    @Column(name = "ror_quantidade_ativo")
    private Integer quantidadeAtivo;

    @Column(name = "ror_resultado")
    private BigDecimal resultado;

    @Column(name = "ror_imposto_devido")
    private BigDecimal impostoDevido;

    public ResultadoOperacaoRendaVariavelVO(){    
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
        result = prime * result
                + ((codResultadoOperacaoRendaVariavel == null) ? 0 : codResultadoOperacaoRendaVariavel.hashCode());
        result = prime * result + ((impostoDevido == null) ? 0 : impostoDevido.hashCode());
        result = prime * result + ((movimentoRendaVariavel == null) ? 0 : movimentoRendaVariavel.hashCode());
        result = prime * result + ((precoCompra == null) ? 0 : precoCompra.hashCode());
        result = prime * result + ((precoVenda == null) ? 0 : precoVenda.hashCode());
        result = prime * result + ((quantidadeAtivo == null) ? 0 : quantidadeAtivo.hashCode());
        result = prime * result + ((resultado == null) ? 0 : resultado.hashCode());
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
        ResultadoOperacaoRendaVariavelVO other = (ResultadoOperacaoRendaVariavelVO) obj;
        if (ativo == null) {
            if (other.ativo != null)
                return false;
        } else if (!ativo.equals(other.ativo))
            return false;
        if (codResultadoOperacaoRendaVariavel == null) {
            if (other.codResultadoOperacaoRendaVariavel != null)
                return false;
        } else if (!codResultadoOperacaoRendaVariavel.equals(other.codResultadoOperacaoRendaVariavel))
            return false;
        if (impostoDevido == null) {
            if (other.impostoDevido != null)
                return false;
        } else if (!impostoDevido.equals(other.impostoDevido))
            return false;
        if (movimentoRendaVariavel == null) {
            if (other.movimentoRendaVariavel != null)
                return false;
        } else if (!movimentoRendaVariavel.equals(other.movimentoRendaVariavel))
            return false;
        if (precoCompra == null) {
            if (other.precoCompra != null)
                return false;
        } else if (!precoCompra.equals(other.precoCompra))
            return false;
        if (precoVenda == null) {
            if (other.precoVenda != null)
                return false;
        } else if (!precoVenda.equals(other.precoVenda))
            return false;
        if (quantidadeAtivo == null) {
            if (other.quantidadeAtivo != null)
                return false;
        } else if (!quantidadeAtivo.equals(other.quantidadeAtivo))
            return false;
        if (resultado == null) {
            if (other.resultado != null)
                return false;
        } else if (!resultado.equals(other.resultado))
            return false;
        return true;
    }

    public Long getCodResultadoOperacaoRendaVariavel() {
        return codResultadoOperacaoRendaVariavel;
    }

    public void setCodResultadoOperacaoRendaVariavel(Long codResultadoOperacaoRendaVariavel) {
        this.codResultadoOperacaoRendaVariavel = codResultadoOperacaoRendaVariavel;
    }

    public MovimentoRendaVariavelVO getMovimentoRendaVariavel() {
        return movimentoRendaVariavel;
    }

    public void setMovimentoRendaVariavel(MovimentoRendaVariavelVO movimentoRendaVariavel) {
        this.movimentoRendaVariavel = movimentoRendaVariavel;
    }

    public AtivoVO getAtivo() {
        return ativo;
    }

    public void setAtivo(AtivoVO ativo) {
        this.ativo = ativo;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidadeAtivo() {
        return quantidadeAtivo;
    }

    public void setQuantidadeAtivo(Integer quantidadeAtivo) {
        this.quantidadeAtivo = quantidadeAtivo;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }

    public BigDecimal getImpostoDevido() {
        return impostoDevido;
    }

    public void setImpostoDevido(BigDecimal impostoDevido) {
        this.impostoDevido = impostoDevido;
    }

    
}
