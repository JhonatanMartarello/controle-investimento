package br.com.investimento.resource;

import javax.ws.rs.Produces;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.investimento.dto.ProventosDTO;
import br.com.investimento.processarArquivo.LerArquivoCsv;
import br.com.investimento.processarArquivo.entity.arquivoCei.ProventosCeiVO;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/proventos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ProventosResource {
    
    @POST
    @Path("/ler/{nomeArquivo}")
    public Response lerArquivoProventos(@PathParam("nomeArquivo") String nomeArquivo){
        LerArquivoCsv lerArquivoCsv = new LerArquivoCsv();
        lerArquivoCsv.lerArquivoCsv(nomeArquivo);
        return Response.ok("Leitura realizada com sucesso").build();
    }

    @GET
    @Path("/ler/{nomeArquivo}")
    public Response lerArquivoProventosTeste(@PathParam("nomeArquivo") String nomeArquivo){
        LerArquivoCsv lerArquivoCsv = new LerArquivoCsv();
        lerArquivoCsv.lerArquivoCsv(nomeArquivo);
        return Response.ok("Leitura realizada com sucesso!").build();
    }

    @GET
    @Path("/listar")
    public List<ProventosDTO> findAll(){
        return new ProventosDTO().transformaEmDTO(ProventosCeiVO.listAll());
    }



}
