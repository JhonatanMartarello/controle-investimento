package br.com.investimento.processarArquivo.facade.arquivoCei;

import java.util.List;

import javax.transaction.Transactional;

import br.com.investimento.constantes.Constantes;
import br.com.investimento.processarArquivo.bean.arquivoCei.ProventosCeiBean;
import br.com.investimento.processarArquivo.entity.arquivoCei.ProventosCeiVO;
import br.com.investimento.processarArquivo.repository.arquivoCei.ProventosCeiRepository;

@Transactional
public class ProventosCeiFacade {
    public void processarArquivoProventosCei(List<ProventosCeiBean> beans){

        beans.sort((ProventosCeiBean bean1, ProventosCeiBean bean2) -> bean1.getDataProvento().compareTo(bean2.getDataProvento()));

        ProventosCeiRepository proventosCeiRepository = new ProventosCeiRepository();
        for(ProventosCeiBean bean : beans){
            ProventosCeiVO vo = new ProventosCeiVO().parse(bean);
            if(vo.getTipoMovimentacao() != null && Constantes.MOVIMENTACAO_RENDIMENTO.equals(vo.getTipoMovimentacao().getIdRegistro())) {
                proventosCeiRepository.persist(vo);
            }
        }
    }
}
