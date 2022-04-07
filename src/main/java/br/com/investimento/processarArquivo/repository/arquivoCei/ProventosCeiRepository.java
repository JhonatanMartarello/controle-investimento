package br.com.investimento.processarArquivo.repository.arquivoCei;

import javax.enterprise.context.ApplicationScoped;

import br.com.investimento.processarArquivo.entity.arquivoCei.ProventosCeiVO;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ProventosCeiRepository implements PanacheRepository<ProventosCeiVO>{
    public void incluir(ProventosCeiVO proventosCeiVO) {
        proventosCeiVO.persist();
    }
}
