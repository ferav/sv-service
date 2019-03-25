/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;

import edu.umss.dip.svservice.model.Costo;
import edu.umss.dip.svservice.repositories.CostoRepository;
import edu.umss.dip.svservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class CostoServiceImpl extends GenericServiceImpl<Costo> implements CostoService {
    private final CostoRepository repository;

    public CostoServiceImpl(CostoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Costo> getRepository() {
        return repository;
    }
}
