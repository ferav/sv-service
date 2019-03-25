/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.ClienteDto;
import edu.umss.dip.svservice.model.Cliente;
import edu.umss.dip.svservice.service.ClienteService;
import edu.umss.dip.svservice.service.GenericService;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class ClienteController extends GenericController<Cliente, ClienteDto> {
    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @Override
    @GET
    public List<ClienteDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }


    /*
    https://www.getpostman.com/collections/cb9764af6c5d5bcaa0c9
    */
}
