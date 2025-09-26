package model;

import java.util.ArrayList;

public abstract class Estudiante {
    private String id;
    private String nombre;
    private String documento;
    private int semestreActual;
    private ArrayList<Materia> listaMaterias;
    private Programa programa;

    public Estudiante(String id, String nombre, String documento, int semestreActual, Programa programa) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.semestreActual = semestreActual;
        this.programa = programa;
        this.listaMaterias = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", semestreActual=" + semestreActual +
                ", programa=" + programa.getNombre() +
                '}';
    }

    public String calcularCreditosCursando() {
        int resultado = 0;
        for (Materia materia : listaMaterias) {
        resultado += materia.getCreditos();
        }
        return "Los creditos que cursa el estudiante son "+resultado;
    }
}
