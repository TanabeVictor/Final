package Entidades;

import java.io.Serializable;

public class Venda implements Serializable {
    private String nomeComprador, dataVenda;
    private double valorReal, valorAnunciado;
    private int nroCreci, codImovel;

    public Venda(String nomeComprador, String dataVenda, double valorReal, double valorAnunciado, int nroCreci, int codImovel) {
        setNomeComprador(nomeComprador);
        setDataVenda(dataVenda);
        setValorReal(valorReal);
        setValorAnunciado(valorAnunciado);
        setNroCreci(nroCreci);
        setCodImovel(codImovel);}
    
    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorAnunciado() {
        return valorAnunciado;
    }

    public void setValorAnunciado(double valorAnunciado) {
        this.valorAnunciado = valorAnunciado;
    }

    public int getNroCreci() {
        return nroCreci;
    }

    public void setNroCreci(int nroCreci) {
        this.nroCreci = nroCreci;
    }

    public int getCodImovel() {
        return codImovel;
    }

    public void setCodImovel(int codImovel) {
        this.codImovel = codImovel;
    }
    
    
    
}
