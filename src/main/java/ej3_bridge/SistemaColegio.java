package ej3_bridge;

public class SistemaColegio extends SistemaInscripcion{
    public SistemaColegio(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    public void inscribirEstudiante(Estudiante e) {
        addEstudiante(e);
        getRedSocial().publicar("Colegio "+getNombre()+" ha inscrito al estudiante "+e.getNombre());
    }
}
