package ej3_bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class SistemaInscripcion {
    private IRedSocial redSocial = new Facebook();
    private String nombre;
    private int capacidad;
    private List<Estudiante> estudiantes;
    private String requisitos;

    public SistemaInscripcion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = new ArrayList<>(capacidad);
    }

    public IRedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(IRedSocial redSocial) {
        this.redSocial = redSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public SistemaInscripcion addEstudiante(Estudiante e) {
        this.estudiantes.add(e);
        return this;
    }

    public abstract void inscribirEstudiante(Estudiante e);
}
