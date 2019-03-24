/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;





import edu.umss.dip.svservice.model.Equipo;

import java.io.InputStream;

public interface EquipoService extends GenericService<Equipo> {
    void saveImage(Long id, InputStream inputStream);
}

    