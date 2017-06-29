package Controle;

import Entidades.Venda;
import java.util.*;

public class ControleVendas {
    
    private Vector listaVenda = new Vector();
    
    //Inserção da venda
    public void setVenda(String nomeComprador, String dataVenda, double valorReal, double valorAnunciado, int nroCreci, int codImovel) {
        Venda objVenda = new Venda(nomeComprador, dataVenda, valorReal, valorAnunciado, nroCreci, codImovel);
        listaVenda.add(objVenda);}
    
    //Relatório do faturamento da imobiliária
    public double getFaturamentoImobiliaria() {
        double faturamento = 0;
        Venda objVenda = null;
        for(int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            faturamento += objVenda.getValorReal()*0.05;
        }
        return faturamento;
    }
    
    public String getImoveisVendidos() {
        String vendidos = "";
        Venda objVenda = null;
        for(int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            vendidos += "Nome do comprador: " + objVenda.getNomeComprador()
                      + "\nData da venda: " + objVenda.getDataVenda()
                      + "\nValor de venda: " + objVenda.getValorReal()
                      + "\nValor anunciado: " + objVenda.getValorAnunciado()
                      + "\nCódigo do corretor: " + objVenda.getNroCreci()
                      + "\nCódigo do imóvel: " + objVenda.getCodImovel()
                      + "\n\n";
        }
        return vendidos;
    }
}
