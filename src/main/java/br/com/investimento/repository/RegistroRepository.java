package br.com.investimento.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.investimento.entity.RegistroVO;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class RegistroRepository implements PanacheRepository<RegistroVO> {

    public RegistroVO carregarRegistroPelaDescricao(String descricao) {
        return RegistroVO.find("descricao", descricao).firstResult();
    }

    public RegistroVO carregarRegistroPeloDominioRegistro(Long codDominio, Long codRegistro) {
        return RegistroVO
                .find("FROM RegistroVO re where re.codDominio = :codDominio and re.codRegistro = :codRegistro ",
                        codDominio, codRegistro)
                .singleResult();
    }

}
