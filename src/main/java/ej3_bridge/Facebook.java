package ej3_bridge;

public class Facebook implements IRedSocial{
    @Override
    public void publicar(String publicacion) {
        System.out.println(">>> Facebook >>>");
        System.out.println(publicacion);
    }
}
