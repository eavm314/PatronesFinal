package ej2_decorator;

public class MemoriaRam extends DecoratorCelular{
    private int capacidad;
    private String marca;
    private int costo;
    public MemoriaRam(Celular celular, int capacidad, String marca, int costo) {
        super(celular);
        this.capacidad = capacidad;
        this.marca = marca;
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public void showInfo() {
        getCelular().setMemoriaRam(getMemoriaRam()+capacidad);
        getCelular().setPrecio(getPrecio()+costo);
        super.showInfo();
        System.out.println("Memoria "+marca+ " agregada "+capacidad +"GB: "+costo+"$");
    }
}
