package model;

public class MateriaTeorica extends Materia{
    public MateriaTeorica(String codigo, String nombre, int numHorasSemanales, int creditos, int semestre, Profesor profesor, Programa programa) {
        super(codigo, nombre, numHorasSemanales, creditos, semestre, profesor, programa);
    }
}
