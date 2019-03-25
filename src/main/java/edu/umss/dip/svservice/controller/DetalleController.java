/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.DetalleDto;
import edu.umss.dip.svservice.dto.VentaDto;
import edu.umss.dip.svservice.model.Detalle;
import edu.umss.dip.svservice.model.Venta;
import edu.umss.dip.svservice.service.*;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/detalles")
@Produces(MediaType.APPLICATION_JSON)
public class DetalleController extends GenericController<Detalle, DetalleDto> {
    private DetalleService service;
    private VentaService ventaService;
    private EquipoService equipoService;

    public DetalleController(DetalleService service, VentaService ventaService,EquipoService equipoService) {
        this.service = service;
        this.ventaService = ventaService;
        this.equipoService = equipoService;
    }

    @Override
    @GET
    public List<DetalleDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Detalle toModel(DetalleDto dto) {
        Detalle detalle = super.toModel(dto);
        // recuperamos a travez del servicio de empleado al modelo employee y lo fijamos al modelo de accident
        detalle.setVenta(ventaService.findById(dto.getVentaId()));
        detalle.setEquipo(equipoService.findById(dto.getEquipoId()));
        return detalle;
    }
}