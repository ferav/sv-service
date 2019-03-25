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
    @ManyToOne(fetch=FetchType.LAZY)
    private Cliente cliente;
    //@OneToOne(optional = false)
    //private Cliente cliente;
    @OneToMany(mappedBy = "venta", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Detalle> detalles = new ArrayList<>();


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

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
}