package ej2_decorator;

public abstract class Celular {
    private String androidVersion;
    private int memoriaRam = 4;
    private String store = "PlayStore";
    private int numChips = 2;
    private int precio;

    public Celular(String androidVersion, int precio) {
        this.androidVersion = androidVersion;
        this.precio = precio;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getNumChips() {
        return numChips;
    }

    public void setNumChips(int numChips) {
        this.numChips = numChips;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo() {
        System.out.println("Version Android: "+getAndroidVersion());
        System.out.println("Memoria RAM: "+getMemoriaRam());
        System.out.println("Precio: "+getPrecio());
    }
}
