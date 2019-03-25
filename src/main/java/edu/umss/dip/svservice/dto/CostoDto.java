/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.dto;


import edu.umss.dip.svservice.model.Costo;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class CostoDto extends DtoBase<Costo> {
    private Long equipoId;
    private double costoEquipo;
    private double costoAduana;
    private double costoImportacion;

    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

    public double getCostoEquipo() {
        return costoEquipo;
    }

    public void setCostoEquipo(double costoEquipo) {
        this.costoEquipo = costoEquipo;
    }

    public double getCostoAduana() {
        return costoAduana;
    }

    public void setCostoAduana(double costoAduana) {
        this.costoAduana = costoAduana;
    }

    public double getCostoImportacion() {
        return costoImportacion;
    }

    public void setCostoImportacion(double costoImportacion) {
        this.costoImportacion = costoImportacion;
    }

    @Override
    public DtoBase toDto(Costo element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setEquipoId(element.getEquipo().getId());
        return this;
    }
}