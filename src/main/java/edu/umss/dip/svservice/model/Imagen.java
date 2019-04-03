/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;


import edu.umss.dip.svservice.dto.ImagenDto;
import javax.persistence.*;

@Entity
public class Imagen extends ModelBase<ImagenDto> {
    @ManyToOne(fetch=FetchType.LAZY)
    private Equipo equipo;
    @Lob
    private Byte[] imagen;


    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }
}