package ej2_decorator;

public class Client {
    public static void main(String[] args) {
        Celular cel = new Xiaomi("8.0", 2000);
        cel.showInfo();

        cel = new MemoriaRam(cel, 4, "Asus", 500);
        cel.showInfo();

        cel = new Audifonos(cel, "Samsung", 1000);
        cel.showInfo();

        cel = new MemoriaRam(cel, 2, "Motorola", 200);
        cel.showInfo();

        cel = new Cargador(cel, "Apple", 500);
        cel.showInfo();


        Celular cel2 = new Huawei("10.0", 5000);
        cel2 = new Cargador(cel2, "Xiaomi", 100);
        cel2.showInfo();

    }
}
