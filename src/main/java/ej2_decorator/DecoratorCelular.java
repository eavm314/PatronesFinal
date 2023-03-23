package ej2_decorator;

public abstract class DecoratorCelular extends Celular{
    private Celular celular;
    public DecoratorCelular(Celular celular) {
        super(celular.getAndroidVersion(), celular.getPrecio());
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void showInfo() {
        celular.showInfo();
    }
}
