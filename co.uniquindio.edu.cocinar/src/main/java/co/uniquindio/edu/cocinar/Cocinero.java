package co.uniquindio.edu.cocinar;

public class Cocinero {
    private String nombreChef;
    private String nombrePlato;

    public Cocinero(InformacionPlato infoPlato) {
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
        return "Cocinero{" +
                "nombreChef='" + nombreChef + '\'' +
                ", nombrePlato='" + nombrePlato + '\'' +
                '}';
    }

    public String obtenerInformacion() {
        return String.format("Chef: %s, Plato: %s", nombreChef, nombrePlato);
    }

    public void cocinar(InformacionPlato infoPlato) {
        System.out.println(infoPlato.obtenerInformacion());
    }
}
