package Controle;

import Entidades.Venda;
import java.util.*;

public class ControleVendas {
    
    private Vector listaVenda = new Vector();
    
    //Inserção da venda
    public void setVenda(String nomeComprador, String dataVenda, double valorReal, double valorAnunciado, int nroCreci, int codImovel) {
        Venda objVenda = new Venda(nomeComprador, dataVenda, valorReal, valorAnunciado, nroCreci, codImovel);
        listaVenda.add(objVenda);}
    
    
}
