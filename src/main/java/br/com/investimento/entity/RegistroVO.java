package br.com.investimento.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reg_registro")
public class RegistroVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reg_cod_registro")
    private Long codRegistro;

    @ManyToOne
    @JoinColumn(name = "reg_cod_dominio")
    private DominioVO codDominio;

    @Column(name = "reg_id_registro")
    private Long idRegistro;

    @Column(name = "reg_descricao")
    private String descricao;

    @Column(name = "reg_complemento")
    private String complemento;

    public RegistroVO(){    
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codDominio == null) ? 0 : codDominio.hashCode());
        result = prime * result + ((codRegistro == null) ? 0 : codRegistro.hashCode());
        result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((idRegistro == null) ? 0 : idRegistro.hashCode());
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
        RegistroVO other = (RegistroVO) obj;
        if (codDominio == null) {
            if (other.codDominio != null)
                return false;
        } else if (!codDominio.equals(other.codDominio))
            return false;
        if (codRegistro == null) {
            if (other.codRegistro != null)
                return false;
        } else if (!codRegistro.equals(other.codRegistro))
            return false;
        if (complemento == null) {
            if (other.complemento != null)
                return false;
        } else if (!complemento.equals(other.complemento))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (idRegistro == null) {
            if (other.idRegistro != null)
                return false;
        } else if (!idRegistro.equals(other.idRegistro))
            return false;
        return true;
    }

    public DominioVO getCodDominio() {
        return codDominio;
    }

    public void setCodDominio(DominioVO codDominio) {
        this.codDominio = codDominio;
    }

    public Long getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(Long codRegistro) {
        this.codRegistro = codRegistro;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    
}
