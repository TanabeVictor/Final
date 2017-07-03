package Controle;

import Entidades.Imovel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ControleImoveis {
    private Vector listaImovel = new Vector();

    //Inserção do imóvel
    public void setImovel(int codigo, String tipo, String descricao, String nomeVendedor, String data, double preco) throws Exception {
        Imovel objImovel = new Imovel(codigo, tipo, descricao, nomeVendedor, data, preco);
        listaImovel.add(objImovel);
    }

    //Remoção do imóvel; limite passa o código como parâmetro após a venda para que ele seja removido da lista
    public void removeImovel(int codigo) {
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getCodigo() == codigo) {
                listaImovel.remove(objImovel);
            }
        }
    }
    
    public String getImovel(int codigo) {
     String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
                if(codigo == objImovel.getCodigo()){
                informacao =objImovel.getCodigo()
                        + "\n"+ objImovel.getDescricao()
                        + "\n"+ objImovel.getTipo()
                        + "\n"+ objImovel.getNomeVendedor()
                        + "\n"+ objImovel.getData()
                        + "\n"+ objImovel.getPreco()
                        + "\n";}}
        
        return informacao;}
    
    //Lista imóveis do tipo casa
    public String getImoveisCasa() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Casa")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";}}
        return informacao;}

    //Lista imóveis do tipo apartamento
    public String getImoveisApartamento() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Apartamento")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";
            }
        }
        return informacao;
    }

    //Lista imóveis do tipo sala comercial
    public String getImoveisSalaComercial() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Sala Comercial")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";}}
        return informacao;}

    //Lista imóveis do tipo lote
    public String getImoveisLote() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Lote")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";
            }
        }
        return informacao;
    }

    //Lista imóveis do tipo chácara
    public String getImoveisChacara() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Chácara")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";
            }
        }
        return informacao;
    }

    //Lista imóveis do tipo sítio
    public String getImoveisSitio() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Sítio")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";
            }
        }
        return informacao;
    }

    //Lista imóveis do tipo fazenda
    public String getImoveisFazenda() {
        String informacao = "";
        Imovel objImovel = null;
        for (int intIdx = 0; intIdx < listaImovel.size(); intIdx++) {
            objImovel = (Imovel) listaImovel.elementAt(intIdx);
            if (objImovel.getTipo().equals("Fazenda")) {
                informacao += "Código: " + objImovel.getCodigo()
                        + "\nDescrição: " + objImovel.getDescricao()
                        + "\nNome do vendedor: " + objImovel.getNomeVendedor()
                        + "\nData de cadastro: " + objImovel.getData()
                        + "\nPreço: R$ " + objImovel.getPreco()
                        + "\n\n";
            }
        }
        return informacao;
    }

    private void gravaImovel() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Imoveis.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaImovel);
        objOS.flush();
        objOS.close();
    }

    private void recuperImovel() throws Exception {
        File objFile = new File("Imoveis.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Imoveis.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaImovel = (Vector) objIS.readObject();
            objIS.close();
        }
    }
}
