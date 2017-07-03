package Entidades;

import java.io.Serializable;

public class Comissionado extends Corretor implements Serializable {

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
