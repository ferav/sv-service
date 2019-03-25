/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Venta;
import edu.umss.dip.svservice.repositories.GenericRepository;
import edu.umss.dip.svservice.repositories.VentaRepository;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl extends GenericServiceImpl<Venta> implements VentaService {
    private final VentaRepository repository;

    public VentaServiceImpl(VentaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Venta> getRepository() {
        return repository;
    }
}
