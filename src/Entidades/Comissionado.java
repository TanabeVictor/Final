package Entidades;

public class Comissionado extends Corretor {

    private double percentual;

    public Comissionado(double percentual, int creci, String nome) {
        super(creci, nome);
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

}
