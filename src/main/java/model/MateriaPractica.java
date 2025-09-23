package model;

public class MateriaPractica extends Materia{
    private int horasPracticaSemanal;
    private int numLaboratorioSemestre;

    public MateriaPractica(String codigo, String nombre, int numHorasSemanales, int creditos, int semestre, Profesor profesor, Programa programa, int horasPracticaSemanal, int numLaboratorioSemestre) {
        super(codigo, nombre, numHorasSemanales, creditos, semestre, profesor, programa);
        this.horasPracticaSemanal = horasPracticaSemanal;
        this.numLaboratorioSemestre = numLaboratorioSemestre;
    }

    public int getHorasPracticaSemanal() {
        return horasPracticaSemanal;
    }

    public void setHorasPracticaSemanal(int horasPracticaSemanal) {
        this.horasPracticaSemanal = horasPracticaSemanal;
    }

    public int getNumLaboratorioSemestre() {
        return numLaboratorioSemestre;
    }

    public void setNumLaboratorioSemestre(int numLaboratorioSemestre) {
        this.numLaboratorioSemestre = numLaboratorioSemestre;
    }
}
