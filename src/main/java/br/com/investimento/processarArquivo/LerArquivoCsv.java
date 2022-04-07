package br.com.investimento.processarArquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import br.com.investimento.processarArquivo.bean.arquivoCei.ProventosCeiBean;
import br.com.investimento.processarArquivo.facade.arquivoCei.ProventosCeiFacade;

public class LerArquivoCsv {

    final String PROCENTOS_CEI = "movimentacao-2022-03-07-21-05-02.csv";

    final String PATH_ARQUIVO_FCA = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\fca_cia_aberta_2021\\";
    final String PATH_ARQUIVO_CEI = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\historico_cei_2021\\";

    public void lerArquivoCsv(String nomeArquivo) {

        if (PROCENTOS_CEI.equals(nomeArquivo)) {
            System.out.println("Iniciando leitura do arquivo: " + nomeArquivo);
            List<ProventosCeiBean> beans = this.arquivoCsvParaBean(ProventosCeiBean.class,
                    PATH_ARQUIVO_CEI + nomeArquivo);
            new ProventosCeiFacade().processarArquivoProventosCei(beans);            
        }
    }

    public <T> List<T> arquivoCsvParaBean(Class<T> T, String caminhoArquivo) {
        try {
            List<T> beans = new CsvToBeanBuilder<T>(new FileReader(caminhoArquivo)).withSeparator(';').withType(T).build()
                    .parse();

            return beans;

        } catch (IllegalStateException | FileNotFoundException e) {
            System.out.println("Error" + e.getStackTrace());
        }

        return null;

    }

}
