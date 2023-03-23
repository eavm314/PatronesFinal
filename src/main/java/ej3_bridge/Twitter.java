package ej3_bridge;

public class Twitter implements IRedSocial{
    @Override
    public void publicar(String publicacion) {
        System.out.println(">>> Twitter >>>");
        System.out.println(publicacion);
    }
}
