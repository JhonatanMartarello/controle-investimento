package br.com.investimento.entity;

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
@Table(name = "tb_ati_ativo")
public class AtivoVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ati_cod_ativo")
    private Long codAtivo;

    @Column(name = "ati_codigo_ativo")
    private String codigoAtivo;

    @Column(name = "ati_nome")
    private String nome;

    @Column(name = "ati_cnpj")
    private Long cnpj;

    @ManyToOne
    @JoinColumn(name = "ati_tipo_ativo")
    private RegistroVO tipoAtivo;

    @OneToOne
    @JoinColumn(name = "ati_cod_ativo", referencedColumnName = "srv_ativo")
    private SaldoRendaVariavelVO saldoRendaVariavel;

    public AtivoVO (){
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + ((codAtivo == null) ? 0 : codAtivo.hashCode());
        result = prime * result + ((codigoAtivo == null) ? 0 : codigoAtivo.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tipoAtivo == null) ? 0 : tipoAtivo.hashCode());
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
        AtivoVO other = (AtivoVO) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (codAtivo == null) {
            if (other.codAtivo != null)
                return false;
        } else if (!codAtivo.equals(other.codAtivo))
            return false;
        if (codigoAtivo == null) {
            if (other.codigoAtivo != null)
                return false;
        } else if (!codigoAtivo.equals(other.codigoAtivo))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tipoAtivo == null) {
            if (other.tipoAtivo != null)
                return false;
        } else if (!tipoAtivo.equals(other.tipoAtivo))
            return false;
        return true;
    }



    public Long getCodAtivo() {
        return codAtivo;
    }

    public void setCodAtivo(Long codAtivo) {
        this.codAtivo = codAtivo;
    }

    public String getCodigoAtivo() {
        return codigoAtivo;
    }

    public void setCodigoAtivo(String codigoAtivo) {
        this.codigoAtivo = codigoAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegistroVO getTipoAtivo() {
        return tipoAtivo;
    }

    public void setTipoAtivo(RegistroVO tipoAtivo) {
        this.tipoAtivo = tipoAtivo;
    }

    
}
