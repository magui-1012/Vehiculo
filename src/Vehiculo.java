public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Integer año;
    private int kilometraje;

    public Vehiculo(String marca, String modelo,Integer año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

        // Getters
        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }
        public Integer getAño() {
            return año;
        }
        public int getKilometraje() {
            return kilometraje;
        }

    public void alquilar(){
    }

    public void devolver() {
    }


}
