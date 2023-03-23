package ej2_decorator;

public class Huawei extends Celular{
    public Huawei(String androidVersion, int precio) {
        super(androidVersion, precio);
    }

    @Override
    public void showInfo() {
        System.out.println("*************************************");
        System.out.println("Especificaciones Huawei");
        super.showInfo();
    }
}
