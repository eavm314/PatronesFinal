package ej3_bridge;

public class Client {
    public static void main(String[] args) {
        SistemaInscripcion colegio = new SistemaColegio("San Antonio", 2000);
        SistemaInscripcion escuela = new SistemaEscuela("Marien Garden", 500);
        SistemaInscripcion uni = new SistemaUniversidad("UPB", 1000);

        Estudiante e1 = new Estudiante("Horacio", "1234");
        Estudiante e2 = new Estudiante("Antonio", "7483");
        Estudiante e3 = new Estudiante("Emily", "2131");
        Estudiante e4 = new Estudiante("Sarai", "9800");
        Estudiante e5 = new Estudiante("Enrique", "2381");

        colegio.inscribirEstudiante(e1);
        colegio.inscribirEstudiante(e2);

        colegio.setRedSocial(new Instagram());
        colegio.inscribirEstudiante(e3);

        uni.setRedSocial(new Twitter());
        uni.inscribirEstudiante(e4);
        uni.inscribirEstudiante(e5);
    }
}
