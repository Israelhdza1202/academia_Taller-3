package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.AlumnoRepository;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{
	@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioAlumno")PersonaRepository repository)
	{
		super(repository);
	}

	@Override
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
		return null;
	}

	@Override
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido) {
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarProfesorPorNombreCarrera(String nombreCarrera)
	{
		return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombreCarrera);
	}



}