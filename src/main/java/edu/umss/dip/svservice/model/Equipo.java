/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;





import edu.umss.dip.svservice.dto.EquipoDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Equipo extends ModelBase<EquipoDto> {
    private String modelo;
    private String codigo;
    private boolean vendido;
    private double precio;
    private String marca;
    private String descripcion;
    private long anio;
    @Lob
    private Byte[] imagen;
    //@OneToOne(optional = false)
    //private Categoria categoria;
    @ManyToOne(fetch=FetchType.LAZY)
    private Categoria categoria;

    @OneToMany(mappedBy = "equipo", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Imagen> imagenes = new ArrayList<>();





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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getAnio() {
        return anio;
    }

    public void setAnio(long anio) {
        this.anio = anio;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
