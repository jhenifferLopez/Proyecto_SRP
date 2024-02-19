package co.uniquindio.edu.cocinar;

public class InformacionPlato {
    private String nombreChef;
    private String nombrePlato;

    public InformacionPlato(String nombreChef, String nombrePlato) {
        this.nombreChef = nombreChef;
        this.nombrePlato = nombrePlato;
    }

    public String getNombreChef() {
        return nombreChef;
    }

    public void setNombreChef(String nombreChef) {
        this.nombreChef = nombreChef;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    @Override
    public String toString() {
        return "InformacionPlato{" +
                "nombreChef='" + nombreChef + '\'' +
                ", nombrePlato='" + nombrePlato + '\'' +
                '}';
    }

    public String obtenerInformacion() {
        return String.format("Chef: %s, Plato: %s", nombreChef, nombrePlato);
    }
}
