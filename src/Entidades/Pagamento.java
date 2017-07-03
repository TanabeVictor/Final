package Entidades;

import java.io.Serializable;

public class Pagamento implements Serializable {

    private int nroCreci;
    private double valor;

    public Pagamento(int nroCreci, double valor) {
        this.nroCreci = nroCreci;
        this.valor = valor;
    }

    public int getNroCreci() {
        return this.nroCreci;
    }

    public void setNroCreci(int nroCreci) {
        this.nroCreci = nroCreci;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    
}