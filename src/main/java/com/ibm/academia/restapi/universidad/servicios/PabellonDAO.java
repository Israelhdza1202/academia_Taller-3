package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import org.springframework.data.jpa.repository.Query;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
    public Iterable<Aula> findPabellonbyLocalidadAfter(String localidadn);


    public Iterable<Aula> findPabellonbyNombreAfter(String nombre);
}
