package br.com.investimento.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.com.investimento.controller.AtivoController;
import br.com.investimento.dto.AtivoDTO;
import br.com.investimento.entity.AtivoVO;

@Path("/ativo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AtivoResource {

    @Inject
    private AtivoController ativoController;

    @GET
    public List<AtivoDTO> findAll(){
        return new AtivoDTO().transformaEmDTO(AtivoVO.listAll());
    }

    @GET
    @Path("{codAtivo}")
    public Response findById(@PathParam("codAtivo") Long codAtivo){

        AtivoVO ativoVO = AtivoVO.findById(codAtivo);
        if(ativoVO == null){
            return Response.ok("Ativo não foi encontrado").type(MediaType.APPLICATION_JSON_TYPE).build();
        }

        return Response.ok(AtivoDTO.transformaEmDTO(ativoVO)).build();
    }

    @POST
    @Transactional
    public Response create(AtivoDTO ativoDTO) {
        AtivoVO.persist(new AtivoVO().transformaEmObjeto(ativoDTO));
        return Response.ok(ativoDTO).status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("{codAtivo}")
    @Transactional
    public Response update(@PathParam("codAtivo") Long codAtivo, AtivoVO ativo){

        if(ativoController.isNomeAtivoIsNotEmpty(ativo)){
            return Response.ok("Ativo não foi encontrado").type(MediaType.APPLICATION_JSON_TYPE).build();
        }

        AtivoVO ativoEntity = ativoController.update(codAtivo, ativo);

        return Response.ok(AtivoDTO.transformaEmDTO(ativoEntity)).build();
    }

    @DELETE
    @Path("{codAtivo}")
    @Transactional
    public Response delete(@PathParam("codAtivo") Long codAtivo) {

        AtivoVO ativoEntity = AtivoVO.findById(codAtivo);

        if(ativoEntity == null) {
            throw new WebApplicationException("Ativo com o código " + codAtivo + " não encontrado!", Response.Status.NOT_FOUND);
        };

        ativoEntity.delete();

        return Response.status(Response.Status.NO_CONTENT).build();
    }
    
}
