/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Detalle;
import edu.umss.dip.svservice.repositories.DetalleRepository;
import edu.umss.dip.svservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl extends GenericServiceImpl<Detalle> implements DetalleService {
    private final DetalleRepository repository;

    public DetalleServiceImpl(DetalleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Detalle> getRepository() {
        return repository;
    }
}
