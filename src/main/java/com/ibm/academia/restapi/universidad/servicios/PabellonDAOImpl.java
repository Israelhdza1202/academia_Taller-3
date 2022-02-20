package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;

public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO{
    public PabellonDAOImpl(PabellonRepository repository) {
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


}
