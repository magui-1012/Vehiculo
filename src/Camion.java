public class Camion extends Vehiculo {
    private Integer capacidadDeCarga;

    public  Camion (String marca, String modelo,Integer año, int kilometraje,Integer capacidadDeCarga) {
        super(marca, modelo,año,kilometraje);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando un camión de la marca"+getMarca()+" con capacidad de carga de " + capacidadDeCarga + " kg.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo un camión de la marca."+getMarca());
    }

    // Métodos específicos
    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }
}
