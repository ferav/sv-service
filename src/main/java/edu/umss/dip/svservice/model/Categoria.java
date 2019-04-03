/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends ModelBase {

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Equipo> equipos = new ArrayList<>();
    private String nombre;
    private String url_Categoria;
    @Lob
    private Byte[] imagen;

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl_Categoria() {
        return url_Categoria;
    }

    public void setUrl_Categoria(String url_Categoria) {
        this.url_Categoria = url_Categoria;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }
}
