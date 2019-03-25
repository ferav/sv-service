/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.VentaDto;
import edu.umss.dip.svservice.model.Venta;
import edu.umss.dip.svservice.service.ClienteService;
import edu.umss.dip.svservice.service.GenericService;
import edu.umss.dip.svservice.service.VentaService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/ventas")
@Produces(MediaType.APPLICATION_JSON)
public class VentaController extends GenericController<Venta, VentaDto> {
    private VentaService service;
    private ClienteService clienteService;

    public VentaController(VentaService service, ClienteService clienteService) {
        this.service = service;
        this.clienteService = clienteService;
    }

    @Override
    @GET
    public List<VentaDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Venta toModel(VentaDto dto) {
        Venta venta = super.toModel(dto);
        // recuperamos a travez del servicio de empleado al modelo employee y lo fijamos al modelo de accident
        venta.setCliente(clienteService.findById(dto.getClienteId()));
        return venta;
    }
}