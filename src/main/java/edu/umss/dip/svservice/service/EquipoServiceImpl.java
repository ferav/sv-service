/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;




import edu.umss.dip.svservice.model.Equipo;
import edu.umss.dip.svservice.repositories.EquipoRepository;
import edu.umss.dip.svservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class EquipoServiceImpl extends GenericServiceImpl<Equipo> implements EquipoService {
    private final EquipoRepository repository;

    public EquipoServiceImpl(EquipoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveImage(Long id, InputStream file) {
        Equipo equipoPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            equipoPersisted.setImagen(bytes);
            getRepository().save(equipoPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }

    @Override
    protected GenericRepository<Equipo> getRepository() {
        return repository;
    }
}
