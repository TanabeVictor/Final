package Entidades;

public class Pagamento {

    private int nroVendas;
    private int nroCreci;

    public Pagamento(int nroVendas, int nroCreci) {
        this.nroVendas = nroVendas;
        this.nroCreci = nroCreci;
    }

    public void setNroCreci(int nroCreci) {
        this.nroCreci = nroCreci;
    }

    public int getNroCreci() {
        return this.nroCreci;
    }

    public void setNroVendas(int nroVendas) {
        this.nroVendas = nroVendas;
    }

    public int getNroVendas() {
        return this.nroVendas;
    }
}
