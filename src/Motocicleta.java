public class Motocicleta extends Vehiculo {
    private String tipoDeManillar;

    public  Motocicleta (String marca, String modelo,Integer año, double kilometraje,String tipoDeManillar) {
        super(marca, modelo,año,kilometraje);
        this.tipoDeManillar = tipoDeManillar;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando una motocicleta de la marca "+ getMarca() +" con manillar tipo " + tipoDeManillar + ".");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo una motocicleta de la marca"+ getMarca() +".");
    }

    // Métodos específicos
    public String getTipoDeManillar() {
        return tipoDeManillar;
    }
}
