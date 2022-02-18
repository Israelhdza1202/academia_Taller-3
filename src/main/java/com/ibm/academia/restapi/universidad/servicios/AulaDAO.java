package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

public interface AulaDAO extends GenericoDAO<Aula>
{
	public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombreCarrera);
}