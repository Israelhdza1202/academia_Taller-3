package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;

public class PabellonDAOImpl extends PersonaDAOImpl implements PabellonDAO{
    public PabellonDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Pabellon guardar(Pabellon entidad) {
        return null;
    }

    @Override
    public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido) {
        return null;
    }

    @Override
    public Iterable<Aula> findPabellonbyLocalidadAfter(String localidadn) {
        return null;
    }

    @Override
    public Iterable<Aula> findPabellonbyNombreAfter(String nombre) {
        return null;
    }

    @Override
    public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado) {
        return null;
    }

}
