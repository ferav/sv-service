/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Costo extends ModelBase {
    private double costoEquipo;
    private double costoAduana;
    private double costoImportacion;

    @OneToOne(optional = false)
    private Equipo equipo;


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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
