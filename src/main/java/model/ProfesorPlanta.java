package model;

public class ProfesorPlanta extends Profesor{
    private String proyectoInvestigacion;
    private DedicacionProfesor dedicacionProfesor;

    public ProfesorPlanta(String proyectoInvestigacion, DedicacionProfesor dedicacionProfesor) {
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
