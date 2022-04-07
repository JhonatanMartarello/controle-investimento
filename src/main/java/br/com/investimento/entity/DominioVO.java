package br.com.investimento.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dominio")
public class DominioVO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dom_cod_dominio")
    private Long codDominio;

    @Column(name = "dom_descricao")
    private String descricao;

    @OneToMany(mappedBy = "codDominio")
    private List<RegistroVO> listaRegistro;
    
    public DominioVO() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codDominio == null) ? 0 : codDominio.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((listaRegistro == null) ? 0 : listaRegistro.hashCode());
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
        DominioVO other = (DominioVO) obj;
        if (codDominio == null) {
            if (other.codDominio != null)
                return false;
        } else if (!codDominio.equals(other.codDominio))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (listaRegistro == null) {
            if (other.listaRegistro != null)
                return false;
        } else if (!listaRegistro.equals(other.listaRegistro))
            return false;
        return true;
    }



    public Long getCodDominio() {
        return codDominio;
    }

    public void setCodDominio(Long codDominio) {
        this.codDominio = codDominio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<RegistroVO> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<RegistroVO> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }
    
}
