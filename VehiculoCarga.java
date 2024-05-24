public class VehiculoCarga extends vehiculo {
    private int capacidadCarga;

    // Constructor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;

    }

    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void SetCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;

    }

    // sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
    }

}
