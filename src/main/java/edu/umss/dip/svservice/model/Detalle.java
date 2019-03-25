/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;


import edu.umss.dip.svservice.dto.DetalleDto;
import edu.umss.dip.svservice.dto.VentaDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Detalle extends ModelBase<DetalleDto> {

    @ManyToOne(fetch=FetchType.LAZY)
    private Venta venta;
    @OneToOne(optional = false)
    private Equipo equipo;


    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}