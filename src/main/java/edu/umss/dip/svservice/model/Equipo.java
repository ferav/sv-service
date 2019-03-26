/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;





import edu.umss.dip.svservice.dto.EquipoDto;

import javax.persistence.*;


@Entity
public class Equipo extends ModelBase<EquipoDto> {
    private String modelo;
    private String codigo;
    private boolean vendido;
    private double precio;
    private Byte[] imagen;
    //@OneToOne(optional = false)
    //private Categoria categoria;
    @ManyToOne(fetch=FetchType.LAZY)
    private Tipo tipo;





    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
