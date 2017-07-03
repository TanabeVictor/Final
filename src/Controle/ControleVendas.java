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
    public double getFaturamentoImobiliaria(int mes, int ano) {
        double faturamento = 0;
        Venda objVenda = null;
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            if (Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                    && Integer.parseInt(objVenda.getDataVenda().substring(7, 10)) == ano)
                faturamento += objVenda.getValorReal() * 0.05;
        }
        return faturamento;
    }
    
    //Relatório do lucro da imobiliária
    public double getLucroImobiliaria(Vector listaCorretorComissionado, Vector listaCorretorContratado, int mes, int ano) {
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
                if (objVenda.getNroCreci() == objCorretorComissionado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(7, 10)) == ano)
                    lucro -= objVenda.getValorReal() * objCorretorComissionado.getPercentual();
            }
            for (int intIdx3 = 0; intIdx3 < listaCorretorContratado.size(); intIdx3++) {
                objCorretorContratado = (Contratado) listaCorretorContratado.elementAt(intIdx3);
                if (objVenda.getNroCreci() == objCorretorContratado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(7, 10)) == ano)
                    lucro -= objVenda.getValorReal() * 0.01;
            }
        }     
        return lucro;}

    //Relatório de imóveis vendidos
    public String getImoveisVendidos(int mes, int ano) {
        String vendidos = "";
        Venda objVenda = null;
        for (int intIdx = 0; intIdx < listaVenda.size(); intIdx++) {
            objVenda = (Venda) listaVenda.elementAt(intIdx);
            if (Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                    && Integer.parseInt(objVenda.getDataVenda().substring(7, 10)) == ano)
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
