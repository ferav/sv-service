/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.dto;


import edu.umss.dip.svservice.model.Detalle;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class DetalleDto extends DtoBase<Detalle> {
    private Long ventaId;
    private Long equipoId;


    public Long getVentaId() {
        return ventaId;
    }

    public void setVentaId(Long ventaId) {
        this.ventaId = ventaId;
    }

    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

    @Override
    public DtoBase toDto(Detalle element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setVentaId(element.getVenta().getId());
        setEquipoId(element.getEquipo().getId());
        return this;
    }
}