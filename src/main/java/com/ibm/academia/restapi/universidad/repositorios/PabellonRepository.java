package com.ibm.academia.restapi.universidad.repositorios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PabellonRepository extends CrudRepository<Aula, Long> {

	@Query("select p from Pabellon a where upper(a.localidad) like upper(&?1%)")
	public Iterable<Aula> findPabellonbyLocalidadAfter(String localidadn);

	@Query("select p from Pabellon a where upper(a.nombre) like upper(&?1%)")
	public Iterable<Aula> findPabellonbyNombreAfter(String nombre);
}

