package br.com.investimento.entity;

import java.math.BigDecimal;

public class ResultadoOperacaoRendaVariavelVO {
    private Long codResultadoOperacaoRendaVariavel;
    private MovimentoRendaVariavelVO movimentoRendaVariavel;
    private AtivoVO ativo;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;
    private Integer quantidadeAtivo;
    private BigDecimal custoTotal;
    private BigDecimal resultado;
}
