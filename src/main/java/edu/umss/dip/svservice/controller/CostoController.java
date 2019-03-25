/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.controller;


import edu.umss.dip.svservice.dto.CostoDto;
import edu.umss.dip.svservice.model.Costo;
import edu.umss.dip.svservice.service.CostoService;
import edu.umss.dip.svservice.service.EquipoService;
import edu.umss.dip.svservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/costos")
@Produces(MediaType.APPLICATION_JSON)
public class CostoController extends GenericController<Costo, CostoDto> {
    private CostoService service;
    private EquipoService equipoService;

    public CostoController(CostoService service, EquipoService equipoService) {
        this.service = service;
        this.equipoService = equipoService;
    }

    @Override
    @GET
    public List<CostoDto> getAll() {
        return super.getAll();
    }

    @Override
    protected GenericService getService() {
        return service;
    }

    @Override
    protected Costo toModel(CostoDto dto) {
        Costo costo = super.toModel(dto);
        // recuperamos a travez del servicio de empleado al modelo employee y lo fijamos al modelo de accident
        costo.setEquipo(equipoService.findById(dto.getEquipoId()));
        return costo;
    }
}