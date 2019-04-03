/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Imagen;

import java.io.InputStream;


public interface ImagenService extends GenericService<Imagen> {
    void saveImage(Long id, InputStream inputStream);
}

    