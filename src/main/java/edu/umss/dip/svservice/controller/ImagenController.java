/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.ImagenDto;
import edu.umss.dip.svservice.dto.VentaDto;
import edu.umss.dip.svservice.model.Imagen;
import edu.umss.dip.svservice.model.Venta;
import edu.umss.dip.svservice.service.*;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Controller
@Path("/imagenes")
@Produces(MediaType.APPLICATION_JSON)
public class ImagenController extends GenericController<Imagen, ImagenDto> {
    private ImagenService service;
    private EquipoService equipoService;

    public ImagenController(ImagenService service, EquipoService equipoService) {
        this.service = service;
        this.equipoService = equipoService;
    }

    @Override
    @GET
    public List<ImagenDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Imagen toModel(ImagenDto dto) {
        Imagen imagenG = super.toModel(dto);
        // recuperamos a travez del servicio de empleado al modelo employee y lo fijamos al modelo de accident
        imagenG.setEquipo(equipoService.findById(dto.getEquipoId()));
        return imagenG;
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
}