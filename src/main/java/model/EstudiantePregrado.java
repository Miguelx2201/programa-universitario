package model;

public class EstudiantePregrado extends Estudiante{
    private boolean esBecado;
    private double promedioAcomulado;

    public EstudiantePregrado(String id, String nombre, String documento, int semestreActual, Programa programa, boolean esBecado, double promedioAcomulado) {
        super(id, nombre, documento, semestreActual, programa);
        this.esBecado = esBecado;
        this.promedioAcomulado = promedioAcomulado;
    }

    public boolean isEsBecado() {
        return esBecado;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    public double getPromedioAcomulado() {
        return promedioAcomulado;
    }

    public void setPromedioAcomulado(double promedioAcomulado) {
        this.promedioAcomulado = promedioAcomulado;
    }
}
