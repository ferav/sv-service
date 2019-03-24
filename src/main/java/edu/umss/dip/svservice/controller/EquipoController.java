/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.EquipoDto;
import edu.umss.dip.svservice.model.Equipo;
import edu.umss.dip.svservice.service.EquipoService;
import edu.umss.dip.svservice.service.GenericService;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Path("/equipos")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class EquipoController extends GenericController<Equipo, EquipoDto> {
    private EquipoService service;

    public EquipoController(EquipoService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<EquipoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Path("/{id}/image")
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
