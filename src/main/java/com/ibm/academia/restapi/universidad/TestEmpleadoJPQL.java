package com.ibm.academia.restapi.universidad;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;
import com.ibm.academia.restapi.universidad.servicios.EmpleadoDAO;
import com.ibm.academia.restapi.universidad.servicios.PersonaDAO;
import com.ibm.academia.restapi.universidad.servicios.ProfesorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestEmpleadoJPQL implements CommandLineRunner
{
	@Autowired
	private CarreraDAO carreraDao;

	@Autowired
	@Qualifier("empleadoDAOImpl")
	private PersonaDAO personaDao;

	public TestEmpleadoJPQL(CarreraDAO carreraDao) {
		this.carreraDao = carreraDao;
	}

	@Override
	public void run(String... args) throws Exception 
	{

		Optional<Carrera> sistemas = carreraDao.buscarPorId(1L);
		Iterable<Persona> empleadoCarrera = ((EmpleadoDAO)personaDao).findEmpleadoByTipoEmpleado(sistemas.get().getNombre());
		empleadoCarrera.forEach(System.out::println);
	}
}