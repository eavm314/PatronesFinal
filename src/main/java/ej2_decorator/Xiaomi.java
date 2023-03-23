package ej2_decorator;

public class Xiaomi extends Celular{
    public Xiaomi(String androidVersion, int precio) {
        super(androidVersion, precio);
    }

    @Override
    public void showInfo() {
        System.out.println("*************************************");
        System.out.println("Especificaciones Xiaomi");
        super.showInfo();
    }
}
