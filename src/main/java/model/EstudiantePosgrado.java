package model;

public class EstudiantePosgrado extends Estudiante{
    private String temaInvestigacion;
    private TipoPosgrado tipoPosgrado;

    public EstudiantePosgrado(String id, String nombre, String documento, int semestreActual, Programa programa, String temaInvestigacion, TipoPosgrado tipoPosgrado) {
        super(id, nombre, documento, semestreActual, programa);
        this.temaInvestigacion = temaInvestigacion;
        this.tipoPosgrado = tipoPosgrado;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public TipoPosgrado getTipoPosgrado() {
        return tipoPosgrado;
    }

    public void setTipoPosgrado(TipoPosgrado tipoPosgrado) {
        this.tipoPosgrado = tipoPosgrado;
    }
}
