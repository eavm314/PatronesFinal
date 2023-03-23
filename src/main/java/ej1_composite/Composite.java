package ej1_composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements IComponent{
    private String nombre;
    private int habitantes;
    private String poa;

    private List<IComponent> components = new ArrayList<>();
    public Composite(String nombre) {
        this.nombre = nombre;
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

    public Composite add(IComponent c){
        components.add(c);
        return this;
    }

    public Composite remove(IComponent c){
        components.remove(c);
        return this;
    }

    @Override
    public int getHabitantes() {
        habitantes = components.stream().mapToInt(IComponent::getHabitantes).sum();
        return habitantes;
    }
}
