package model;

import java.util.ArrayList;

public abstract class Materia {
    private String codigo;
    private String nombre;
    private int numHorasSemanales;
    private int creditos;
    private int semestre;
    private Profesor profesor;
    private ArrayList<Estudiante> listaEstudiantes;
    private Programa programa;

    public Materia(String codigo, String nombre, int numHorasSemanales, int creditos, int semestre, Profesor profesor, Programa programa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numHorasSemanales = numHorasSemanales;
        this.creditos = creditos;
        this.semestre = semestre;
        this.profesor = profesor;
        this.programa = programa;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHorasSemanales() {
        return numHorasSemanales;
    }

    public void setNumHorasSemanales(int numHorasSemanales) {
        this.numHorasSemanales = numHorasSemanales;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numHorasSemanales=" + numHorasSemanales +
                ", creditos=" + creditos +
                ", semestre=" + semestre +
                ", profesor=" + profesor.getNombre() +
                ", listaEstudiantes=" + listaEstudiantes +
                ", programa=" + programa.getNombre() +
                '}';
    }

    public int calcularTotalHoras() {
        return numHorasSemanales;
    }
    public String agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
        estudiante.getListaMaterias().add(this);
        return "El estudiante ha sido añadido correctamente";
    }
    public String agregarEstudiantes(ArrayList<Estudiante> estudiantes) {
        estudiantes.forEach(this::agregarEstudiante);
        return "Los estudiantes han sido añadidos exitosamente";
    }
    public String listarEstudiantesMatriculados() {
        StringBuilder resultado = new StringBuilder();
        for (Estudiante estudiante : listaEstudiantes) {
            resultado.append("Estudiante: ").append(estudiante.getNombre()).append("\n");
        }
        return resultado.toString();
    }
}
