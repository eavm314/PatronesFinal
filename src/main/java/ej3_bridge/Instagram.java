package ej3_bridge;

public class Instagram implements IRedSocial{
    @Override
    public void publicar(String publicacion) {
        System.out.println(">>> Instagram >>>");
        System.out.println(publicacion);
    }
}
