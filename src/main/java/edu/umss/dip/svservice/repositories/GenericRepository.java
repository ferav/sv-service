package edu.umss.dip.svservice.repositories;


import edu.umss.dip.svservice.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("rawtypes")
public interface GenericRepository<T extends ModelBase> extends JpaRepository<T, Long> {
}