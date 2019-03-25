/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends ModelBase {

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Equipo> equipos = new ArrayList<>();
    private String nombre;



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

}
