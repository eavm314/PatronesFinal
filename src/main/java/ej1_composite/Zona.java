package ej1_composite;

public class Zona implements IComponent{
    private String nombre;
    private int habitantes;
    private String poa;

    public Zona(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getPoa() {
        return poa;
    }

    public void setPoa(String poa) {
        this.poa = poa;
    }

    @Override
    public int getHabitantes() {
        return habitantes;
    }
}
