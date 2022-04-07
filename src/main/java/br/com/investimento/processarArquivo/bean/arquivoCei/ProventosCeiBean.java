package br.com.investimento.processarArquivo.bean.arquivoCei;

import java.math.BigDecimal;
import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

public class ProventosCeiBean {
    @CsvBindByName(column = "Entrada/Saída")
    private String entradaSaida;

    @CsvBindByName(column = "Data")
    @CsvDate("dd/MM/yyyy")
    private Date dataProvento;

    @CsvBindByName(column = "Movimentação")
    private String movimentacao;

    @CsvBindByName(column = "Produto")
    private String produto;

    @CsvBindByName(column = "Instituição")
    private String instituicao;

    @CsvBindByName(column = "Quantidade")
    private int quantidade;

    @CsvBindByName(column = "Preço unitário", locale = "pt-BR")
    @CsvNumber(value = " R$###.###,## ")
    private BigDecimal precoUnitario;

    @CsvBindByName(column = "Valor da Operação", locale = "pt-BR")
    @CsvNumber(value = " R$###.###,## ")
    private BigDecimal valorOperacao;

    public String getEntradaSaida() {
        return entradaSaida;
    }

    public void setEntradaSaida(String entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public Date getDataProvento() {
        return dataProvento;
    }

    public void setDataProvento(Date dataProvento) {
        this.dataProvento = dataProvento;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
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
