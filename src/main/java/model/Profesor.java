package model;

import java.util.ArrayList;

public abstract class Profesor {
    private String id;
    private String nombre;
    private String tituloAcademico;
    private int añosExp;
    private ArrayList<Materia> listaMaterias;
    private Programa programa;
}
