package model;

import java.util.ArrayList;

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
}
