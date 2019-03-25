/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;


import edu.umss.dip.svservice.dto.VentaDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Venta extends ModelBase<VentaDto> {
    @OneToOne(optional = false)
    private Cliente cliente;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}