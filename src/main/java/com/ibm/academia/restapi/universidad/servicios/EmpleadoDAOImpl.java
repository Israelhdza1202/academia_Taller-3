package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.AlumnoRepository;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO
{
	@Autowired
	public EmpleadoDAOImpl(@Qualifier("repositorioAlumno")PersonaRepository repository)
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
	public Iterable<Persona> findEmpleadoByTipoEmpleado(String tipoEmpleado) {
		return ((EmpleadoRepository)repository).findEmpleadoByTipoEmpleado(TipoEmpleado.valueOf(tipoEmpleado));
	}
}