/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.dto;


import edu.umss.dip.svservice.model.Venta;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class VentaDto extends DtoBase<Venta> {
    private Long clienteId;
    private Date date;


    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public DtoBase toDto(Venta element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setClienteId(element.getCliente().getId());
        return this;
    }
}