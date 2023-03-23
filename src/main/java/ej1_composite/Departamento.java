package ej1_composite;

public class Departamento extends Composite{
    public Departamento(String nombre) {
        super(nombre);
    }
    @Override
    public void showInfo() {
        System.out.println("Habitantes en el departamento "+getNombre()+": "+getHabitantes());
    }
}
