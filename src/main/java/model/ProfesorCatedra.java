package model;

public class ProfesorCatedra extends Profesor{
    private int numHorasContratadas;
    private String empresaTrabaja;

    public ProfesorCatedra(int numHorasContratadas, String empresaTrabaja) {
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
