package ej3_bridge;

public class SistemaUniversidad extends SistemaInscripcion{
    public SistemaUniversidad(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    public void inscribirEstudiante(Estudiante e) {
        addEstudiante(e);
        getRedSocial().publicar("Universidad "+getNombre()+" ha inscrito al estudiante "+e.getNombre());
    }
}
