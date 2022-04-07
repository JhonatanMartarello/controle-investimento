package br.com.investimento.processarArquivo.bean.arquivoCei;

import java.math.BigDecimal;
import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

public class HistoricoNegociacaoCeiBean {
    
    @CsvBindByName(column = "Data do Negócio")
    @CsvDate("dd/MM/yyyy")
    private Date dataNegocio;

    @CsvBindByName(column = "Tipo de Movimentação")
    private String tipoMovimento;

    @CsvBindByName(column = "Mercado")
    private String mercado;

    @CsvBindByName(column = "Prazo/Vencimento")
    private String prazoVencimento;

    @CsvBindByName(column = "Instituição")
    private String instituicao;

    @CsvBindByName(column = "Código de Negociação")
    private String codigoNegociacao;

    @CsvBindByName(column = "Quantidade")
    private int quantidade;

    @CsvBindByName(column = "Preço", locale = "pt-BR")
    @CsvNumber(value = " R$###.###,## ")
    private BigDecimal preco;

    @CsvBindByName(column = "Valor", locale = "pt-BR")
    @CsvNumber(value = " R$###.###,## ")
    private BigDecimal valor;

    public Date getDataNegocio() {
        return dataNegocio;
    }

    public void setDataNegocio(Date dataNegocio) {
        this.dataNegocio = dataNegocio;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getPrazoVencimento() {
        return prazoVencimento;
    }

    public void setPrazoVencimento(String prazoVencimento) {
        this.prazoVencimento = prazoVencimento;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
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

    
    
}
