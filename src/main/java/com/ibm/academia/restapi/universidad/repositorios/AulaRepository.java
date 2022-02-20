package com.ibm.academia.restapi.universidad.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@NoRepositoryBean
public interface AulaRepository extends CrudRepository<Aula, Long> {

	//@Query("select a from Aula a where upper(a.tipo_pizarron) like upper(&?1%)")
	public Iterable<Aula> findAulabyTipoPizarronAfter(TipoPizarron tipoPizarron);

	//@Query("select a from Aula a  where upper(a.pabellon) like upper(&?1%)")
	public Iterable<Aula> findAulabyNombrePabellonAfter(String nombre);

	//@Query("select a from Aula a  where upper(a.numero_aula) like upper(&?1%)")
	public Iterable<Aula> findAulabyNumeroAulaAfter(String numeroAula);

}
