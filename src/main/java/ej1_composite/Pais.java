package ej1_composite;

public class Pais extends Composite{
    public Pais(String nombre) {
        super(nombre);
    }
    @Override
    public void showInfo() {
        System.out.println("Habitantes en el pais "+getNombre()+": "+getHabitantes());
    }
}
