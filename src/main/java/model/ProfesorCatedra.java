package model;

public class ProfesorCatedra extends Profesor{
    private int numHorasContratadas;
    private String empresaTrabaja;

    public ProfesorCatedra(String id, String nombre, String tituloAcademico, int añosExp, Programa programa, int numHorasContratadas, String empresaTrabaja) {
        super(id, nombre, tituloAcademico, añosExp, programa);
        this.numHorasContratadas = numHorasContratadas;
        this.empresaTrabaja = empresaTrabaja;
    }

    public int getNumHorasContratadas() {
        return numHorasContratadas;
    }

    public void setNumHorasContratadas(int numHorasContratadas) {
        this.numHorasContratadas = numHorasContratadas;
    }

    public String getEmpresaTrabaja() {
        return empresaTrabaja;
    }

    public void setEmpresaTrabaja(String empresaTrabaja) {
        this.empresaTrabaja = empresaTrabaja;
    }
}
