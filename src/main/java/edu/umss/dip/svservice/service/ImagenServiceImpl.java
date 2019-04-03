/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Equipo;
import edu.umss.dip.svservice.model.Imagen;
import edu.umss.dip.svservice.repositories.GenericRepository;
import edu.umss.dip.svservice.repositories.ImagenRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class ImagenServiceImpl extends GenericServiceImpl<Imagen> implements ImagenService {
    private final ImagenRepository repository;

    public ImagenServiceImpl(ImagenRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Imagen> getRepository() {
        return repository;
    }

    @Override
    public void saveImage(Long id, InputStream file) {
        Imagen imagenPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            imagenPersisted.setImagen(bytes);
            getRepository().save(imagenPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }
}
