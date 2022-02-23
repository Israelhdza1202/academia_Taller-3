package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PabellonRepository extends CrudRepository<Pabellon, Long> {

    @Query("select p from Pabellon p join fetch p.direccion l  where l.localidad > ?1")
    public Iterable<Pabellon> findPabellonbyLocalidadAfter(String localidad);

    @Query("select p from Pabellon p where p.nombre > ?1")
    public Iterable<Pabellon> findPabellonbyNombreAfter(String nombre);
}
