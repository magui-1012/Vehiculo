public class Coche extends Vehiculo {

    private Integer numeroDePuertas;

    public  Coche (String marca, String modelo,Integer año, double kilometraje,Integer numeroDePruertas) {
        super(marca, modelo,año,kilometraje);
        this.numeroDePuertas = numeroDePruertas;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando un coche de la marca "+getMarca()+" con " + numeroDePuertas + " puertas.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo un coche de la marca."+ getMarca());
    }

    // Métodos específicos
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
}
