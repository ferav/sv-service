/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.service;


import edu.umss.dip.svservice.model.Cliente;
import edu.umss.dip.svservice.repositories.ClienteRepository;
import edu.umss.dip.svservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente> implements ClienteService {
    private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Cliente> getRepository() {
        return repository;
    }


}
