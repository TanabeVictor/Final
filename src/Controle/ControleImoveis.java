package Controle;

import Entidades.Imovel;
import java.util.*;

public class ControleImoveis {
    
    private Vector listaImovel = new Vector();
    
    //Inserção do imóvel
    public void setImovel(int codigo, String tipo, String descricao, String nomeVendedor, String data, double preco) throws Exception {
        Imovel objImovel = new Imovel(codigo, tipo, descricao, nomeVendedor, data, preco);
        listaImovel.add(objImovel);
    }
}
