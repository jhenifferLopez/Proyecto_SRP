package co.uniquindio.edu.cocinar;
public class Main {
    public static void main(String[] args) {

        InformacionPlato infoPlato = new InformacionPlato("Chef Jheniffer", "pizza");
        Cocinero cocinero = new Cocinero(infoPlato);

        cocinero.cocinar(infoPlato);

        // Modificamos la información del plato usando los métodos setter
        infoPlato.setNombrePlato("patacon");
        cocinero.cocinar(infoPlato);  // Imprimirá "Cocinando el plato: patacon"
    }
}