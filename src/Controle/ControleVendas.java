package Controle;

import Entidades.Venda;
import Entidades.Comissionado;
import Entidades.Contratado;
import java.util.*;

public class ControleVendas {

    private Vector listaVenda = new Vector();

    public Vector getVector() {
        return listaVenda;
    }

    //Inserção da venda
    public void setVenda(String nomeComprador, String dataVenda, double valorReal, double valorAnunciado, int nroCreci, int codImovel) {
        Venda objVenda = new Venda(nomeComprador, dataVenda, valorReal, valorAnunciado, nroCreci, codImovel);
        listaVenda.add(objVenda);
    }

    //Relatório do faturamento da imobiliária
    public double getFaturamentoImobiliaria() {
        double faturamento = 0;
        Venda objVenda = null;
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            faturamento += objVenda.getValorReal() * 0.05;
        }
        return faturamento;
    }
    
    //Relatório do lucro da imobiliária
    public double getLucroImobiliaria(Vector listaCorretorComissionado, Vector listaCorretorContratado) {
        double lucro = 0;
        Venda objVenda = null;
        Comissionado objCorretorComissionado = null;
        Contratado objCorretorContratado = null;
        
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            lucro += objVenda.getValorReal() * 0.05;
        }
        
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            for (int intIdx2 = 0; intIdx2 < listaCorretorComissionado.size(); intIdx2++) {
                objCorretorComissionado = (Comissionado) listaCorretorComissionado.elementAt(intIdx2);
                if (objVenda.getNroCreci() == objCorretorComissionado.getCreci())
                    lucro -= objVenda.getValorReal() * objCorretorComissionado.getPercentual();
            }
            for (int intIdx3 = 0; intIdx3 < listaCorretorContratado.size(); intIdx3++) {
                objCorretorContratado = (Contratado) listaCorretorContratado.elementAt(intIdx3);
                if (objVenda.getNroCreci() == objCorretorContratado.getCreci())
                    lucro -= objVenda.getValorReal() * 0.01;
            }
        }     
        return lucro;}

    public String getImoveisVendidos() {
        String vendidos = "";
        Venda objVenda = null;
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
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
