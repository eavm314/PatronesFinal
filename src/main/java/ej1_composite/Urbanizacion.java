package ej1_composite;

public class Urbanizacion extends Composite{
    public Urbanizacion(String nombre) {
        super(nombre);
    }

    @Override
    public void showInfo() {
        System.out.println("Habitantes en la urbanizacion "+getNombre()+": "+getHabitantes());
    }
}
