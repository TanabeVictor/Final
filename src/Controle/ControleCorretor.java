package Controle;

import Entidades.Contratado;
import Entidades.Comissionado;
import Entidades.Venda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ControleCorretor {
    private Vector listaCorretorComissionado = new Vector();
    private Vector listaCorretorContratado = new Vector();
    
    
    public Vector getVectorComissionado(){
        return listaCorretorComissionado;
    }

    public Vector getListaCorretorContratado() {
        return listaCorretorContratado;
    }
    
    //Cadastro de um corretor contratado
    public void setCorretorContratado(double salario, String dataAdmissao, int creci, String nome) {
        Contratado objCorretor = new Contratado(salario, dataAdmissao, creci, nome);
        listaCorretorContratado.add(objCorretor);}
    
    //Cadastro de um corretor comissionado
    public void setCorretorComissionado(double percentual, int creci, String nome) {
        Comissionado objCorretor = new Comissionado(percentual, creci, nome);
        listaCorretorComissionado.add(objCorretor);}
    
    //Relatório de lucro dos vendedores
    public String getLucroVendedores(Vector listaVenda) {
        double lucro;
        String resultado = "";
        Venda objVenda = null;
        Contratado objContratado = null;
        Comissionado objComissionado = null;
        for (int intIdx = 0; intIdx < this.getVectorComissionado().size(); intIdx++) {
            lucro = 0;
            objComissionado = (Comissionado) this.getVectorComissionado().elementAt(intIdx);
            for (int intIdx2 = 0; intIdx < listaVenda.size(); intIdx2++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx2);
                if (objVenda.getNroCreci() == objComissionado.getCreci())
                    lucro += objVenda.getValorReal() * objComissionado.getPercentual();
            }
            resultado += objComissionado.getNome() + " (" + objComissionado.getCreci() + ") - R$ " + lucro + "\n";
        }
        for (int intIdx = 0; intIdx < this.getListaCorretorContratado().size(); intIdx++) {
            lucro = 0;
            objContratado = (Contratado) this.getListaCorretorContratado().elementAt(intIdx);
            for (int intIdx3 = 0; intIdx < listaVenda.size(); intIdx3++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx3);
                if (objVenda.getNroCreci() == objContratado.getCreci())
                    lucro += objVenda.getValorReal() * 0.01;
            }
            resultado += objContratado.getNome() + " (" + objContratado.getCreci() + ") - R$ " + lucro + "\n";
        }
        
        return resultado;
    }
    
    //Relatório de faturamento dos corretores (quanto cada um trouxe)
    public String getFaturamentoVendedores(Vector listaVenda, int mes, int ano) {
        double lucro;
        String resultado = "";
        Venda objVenda = null;
        Contratado objContratado = null;
        Comissionado objComissionado = null;
        for (int intIdx = 0; intIdx < this.getVectorComissionado().size(); intIdx++) {
            lucro = 0;
            objComissionado = (Comissionado) this.getVectorComissionado().elementAt(intIdx);
            for (int intIdx2 = 0; intIdx < listaVenda.size(); intIdx2++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx2);
                if (objVenda.getNroCreci() == objComissionado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 9)) == ano)
                    lucro += objVenda.getValorReal();
            }
            resultado += objComissionado.getNome() + " (" + objComissionado.getCreci() + ") - R$ " + lucro + "\n";
        }
        for (int intIdx = 0; intIdx < this.getListaCorretorContratado().size(); intIdx++) {
            lucro = 0;
            objContratado = (Contratado) this.getListaCorretorContratado().elementAt(intIdx);
            for (int intIdx3 = 0; intIdx < listaVenda.size(); intIdx3++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx3);
                if (objVenda.getNroCreci() == objContratado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 9)) == ano)
                    lucro += objVenda.getValorReal();
            }
            resultado += objContratado.getNome() + " (" + objContratado.getCreci() + ") - R$ " + lucro + "\n";
        }
        
        return resultado;
    }

    public String getContratado(int creci) {
     String informacao = "";
        Contratado objContratado = null;
        for (int intIdx = 0; intIdx < listaCorretorContratado.size(); intIdx++) {
            objContratado = (Contratado) listaCorretorContratado.elementAt(intIdx);
              if(creci == objContratado.getCreci()){
                informacao =objContratado.getCreci()
                        + "\n"+ objContratado.getNome()
                        + "\n"+ "Contratado"
                        + "\n"+ objContratado.getDataAdmissao()
                        + "\n"+ objContratado.getSalario()
                        + "\n"+ "-"
                        + "\n";}} 
              
        return informacao;}
    
    public String getComissionado(int creci) {
     String informacao = "";
        Comissionado objComissionado = null;
        for (int intIdx = 0; intIdx < listaCorretorComissionado.size(); intIdx++) {
            objComissionado = (Comissionado) listaCorretorComissionado.elementAt(intIdx);
            if(creci == objComissionado.getCreci()){
              
                informacao = objComissionado.getCreci()
                        + "\n"+ objComissionado.getNome()
                        + "\n"+ "Comissionado"
                        + "\n"+ "-"
                        + "\n"+ "-"
                        + "\n"+ objComissionado.getPercentual()+ "%"
                        + "\n";}}
        
        return informacao;}
    
    private void gravaContratado() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Contratado.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCorretorContratado);
        objOS.flush();
        objOS.close();}

    private void recuperaContratado() throws Exception {
        File objFile = new File("Contratado.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Contratado.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCorretorContratado = (Vector) objIS.readObject();
            objIS.close();}}
    
    private void gravaComissionado() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Comissionado.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCorretorComissionado);
        objOS.flush();
        objOS.close();}

    private void recuperaComissionado() throws Exception {
        File objFile = new File("Comissionado.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Comissionado.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCorretorComissionado = (Vector) objIS.readObject();
            objIS.close();}}}
