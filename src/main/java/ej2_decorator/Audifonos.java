package ej2_decorator;

public class Audifonos extends DecoratorCelular{
    private String marca;
    private int costo;
    public Audifonos(Celular celular, String marca, int costo) {
        super(celular);
        this.marca = marca;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public void showInfo() {
        getCelular().setPrecio(getPrecio()+costo);
        super.showInfo();
        System.out.println("Audifonos "+marca+ " agregados: "+costo+"$");
    }
}
