/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.bootsptrap;

import edu.umss.dip.svservice.model.*;
import edu.umss.dip.svservice.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private EquipoRepository equipoRepository;
    private CategoriaRepository categoriaRepository;
    private ClienteRepository clienteRepository;

    public DevBootstrap(EquipoRepository equipoRepository
             ) {

        this.equipoRepository = equipoRepository;


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

    }
}
