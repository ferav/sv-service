/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Categoria;
import edu.umss.dip.svservice.repositories.CategoriaRepository;
import edu.umss.dip.svservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class CategoriaServiceImpl extends GenericServiceImpl<Categoria> implements CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaServiceImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Categoria> getRepository() {
        return repository;
    }

    @Override
    public void saveImage(Long id, InputStream file) {
        Categoria categoriaPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            categoriaPersisted.setImagen(bytes);
            getRepository().save(categoriaPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }


}
