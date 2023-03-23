package ej3_bridge;

public class SistemaEscuela extends SistemaInscripcion{
    public SistemaEscuela(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    public void inscribirEstudiante(Estudiante e) {
        addEstudiante(e);
        getRedSocial().publicar("Escuela "+getNombre()+" ha inscrito al estudiante "+e.getNombre());
    }
}
