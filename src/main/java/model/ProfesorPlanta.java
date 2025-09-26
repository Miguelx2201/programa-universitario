package model;

public class ProfesorPlanta extends Profesor{
    private String proyectoInvestigacion;
    private DedicacionProfesor dedicacionProfesor;

    public ProfesorPlanta(String id, String nombre, String tituloAcademico, int añosExp, Programa programa, String proyectoInvestigacion, DedicacionProfesor dedicacionProfesor) {
        super(id, nombre, tituloAcademico, añosExp, programa);
        this.proyectoInvestigacion = proyectoInvestigacion;
        this.dedicacionProfesor = dedicacionProfesor;
    }

    public String getProyectoInvestigacion() {
        return proyectoInvestigacion;
    }

    public void setProyectoInvestigacion(String proyectoInvestigacion) {
        this.proyectoInvestigacion = proyectoInvestigacion;
    }

    public DedicacionProfesor getDedicacionProfesor() {
        return dedicacionProfesor;
    }

    public void setDedicacionProfesor(DedicacionProfesor dedicacionProfesor) {
        this.dedicacionProfesor = dedicacionProfesor;
    }
}
