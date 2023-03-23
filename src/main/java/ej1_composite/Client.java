package ej1_composite;

public class Client {
    public static void main(String[] args) {
        Zona z1 = new Zona("Miraflores", 100);
        Zona z2 = new Zona("Max Paredes", 50);
        Zona z3 = new Zona("Villa Victoria", 80);
        Zona z4 = new Zona("Calacoto", 200);
        Zona z5 = new Zona("Alto Obrajes", 150);

        z1.showInfo();
        z3.showInfo();

        Urbanizacion u1 = new Urbanizacion("Zona Sur");
        u1.add(z4).add(z5);
        Urbanizacion u2 = new Urbanizacion("Centro");
        u2.add(z1).add(z2).add(z3);

        u1.showInfo();
        u2.showInfo();

        Departamento lp = new Departamento("La Paz");
        lp.add(u1).add(u2);

        lp.showInfo();
    }
}
