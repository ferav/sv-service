/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.CategoriaDto;
import edu.umss.dip.svservice.dto.ClienteDto;
import edu.umss.dip.svservice.dto.DtoBase;
import edu.umss.dip.svservice.model.Categoria;
import edu.umss.dip.svservice.model.Cliente;
import edu.umss.dip.svservice.service.CategoriaService;
import edu.umss.dip.svservice.service.ClienteService;
import edu.umss.dip.svservice.service.GenericService;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Path("/categorias")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class CategoriaController extends GenericController<Categoria, CategoriaDto> {
    private CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<CategoriaDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Path("/{id}/imagen")
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadFile(@PathParam("id") String id,
                               @FormDataParam("file") InputStream file,
                               @FormDataParam("file") FormDataContentDisposition fileDisposition) {
        service.saveImage(Long.valueOf(id), file);
        return Response.ok("Data uploaded successfully !!").build();
    }
    /*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */


}
