/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Categoria;

import java.io.InputStream;

public interface CategoriaService extends GenericService<Categoria> {
    void saveImage(Long id, InputStream inputStream);

}

    