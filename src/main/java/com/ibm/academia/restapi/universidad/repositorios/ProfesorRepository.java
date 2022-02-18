package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Repository("repositoryProfesor")
public interface ProfesorRepository extends PersonaRepository
{

	@Query("select p from Profesor p join fetch p.carrera c  where c.nombre = ?2")
	public Iterable<Persona> findProfesoresByCarrera(String carrera);

}

