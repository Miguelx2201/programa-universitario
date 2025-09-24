package model;

import java.util.ArrayList;
import java.util.Optional;

public class Programa {
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Profesor> listaProfesores;

    public Programa(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
        this.listaMaterias = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public Optional<Profesor> buscarProfesor(String id) {
        return listaProfesores.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
    public String añadirProfesor(Profesor profesor) {
        Optional<Profesor> encontrado = buscarProfesor(profesor.getId());
        if(encontrado.isEmpty()) {
            listaProfesores.add(profesor);
            return "El profesor "+profesor.getNombre()+" ha sido añadido exitosamente";
        } else return "El profesor ya esta registrado";
    }
    public String eliminarProfesor(String id) {
        Optional<Profesor> encontrado = buscarProfesor(id);
        if(encontrado.isPresent()) {
            listaProfesores.remove(encontrado.get());
            return "El profesor "+encontrado.get().getNombre()+" ha sido eliminado exitosamente";
        } else return "El profesor no ha sido encontrado";
    }
    public String actualizarProfesor(String id, String nombre) {
        Optional<Profesor> encontrado = buscarProfesor(id);
        if(encontrado.isPresent()) {
            encontrado.get().setNombre(nombre);
            encontrado.get().setId(id);
            return "El profesor ha sido actualizado exitosamente";
        } else return "El profesor no ha sido encontrado";
    }

    public Optional<Estudiante> buscarEstudiante(String id) {
        return listaEstudiantes.stream().filter(e -> e.getId().equals(id)).findFirst();
    }
    public String agregarEstudiante(Estudiante estudiante) {
        Optional<Estudiante> encontrado = buscarEstudiante(estudiante.getId());
        if(encontrado.isEmpty()) {
            listaEstudiantes.add(estudiante);
            return "El estudiante "+estudiante.getNombre()+" ha sido agregado exitosamente";
        } else return "El estudiante ya esta registrado";
    }
    public String eliminarEstudiante(String id) {
        Optional<Estudiante> encontrado = buscarEstudiante(id);
        if(encontrado.isPresent()) {
            listaEstudiantes.remove(encontrado.get());
            return "El estudiante ha sido eliminado exitosamente";
        } else return "El estudiante no ha sido encontrado";
    }
    public String actualizarEstudiante(String id, String nombre) {
        Optional<Estudiante> encontrado = buscarEstudiante(id);
        if(encontrado.isPresent()) {
            encontrado.get().setNombre(nombre);
            encontrado.get().setId(id);
            return "El estudiante ha sido actualizado exitosamente";
        } else return "El estudiante no ha sido encontrado";
    }
    public Optional<Materia> buscarMateria(String codigo) {
        return listaMaterias.stream().filter(m -> m.getCodigo().equals(codigo)).findFirst();
    }
    public String agregarMateria(Materia materia) {
        Optional<Materia> encontrado = buscarMateria(materia.getCodigo());
        if(encontrado.isEmpty()) {
            listaMaterias.add(materia);
            return "La materia ha sido añadida exitosamente";
        } else return "La materia ya esta registrada";
    }
    public String eliminarMateria(String codigo) {
        Optional<Materia> encontrado = buscarMateria(codigo);
        if(encontrado.isPresent()) {
            listaMaterias.remove(encontrado.get());
            return "La materia ha sido eliminado exitosamente";
        } else return "La materia no ha sido encontrado";
    }
    public String actualizarMateria(String codigo, String nombre, int horasSemanales, int creditos) {
        Optional<Materia> encontrado = buscarMateria(codigo);
        if(encontrado.isPresent()) {
            encontrado.get().setNombre(nombre);
            encontrado.get().setCodigo(codigo);
            encontrado.get().setNumHorasSemanales(horasSemanales);
            encontrado.get().setCreditos(creditos);
            return "La materia ha sido actualizado exitosamente";
        } else return "La materia no ha sido encontrada";
    }
}
