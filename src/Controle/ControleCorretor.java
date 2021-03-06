package Controle;

import Entidades.*;
import java.io.*;
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
    public void setCorretorContratado(double salario, String dataAdmissao, int creci, String nome){
        Contratado objCorretor = new Contratado(salario, dataAdmissao, creci, nome);
        listaCorretorContratado.add(objCorretor);}
    
    //Cadastro de um corretor comissionado
    public void setCorretorComissionado(double percentual, int creci, String nome){
        Comissionado objCorretor = new Comissionado(percentual, creci, nome);
        listaCorretorComissionado.add(objCorretor);}
    
    public Vector retornaContratado(){
    return listaCorretorContratado;}
    
    public Vector retornaComissionado(){
    return listaCorretorComissionado;}
    
    //Relatório de lucro dos vendedores
    public String getLucroVendedores(Vector listaVenda, int mes, int ano) {
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
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
                    lucro += objVenda.getValorReal() * objComissionado.getPercentual();
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
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
                    lucro += objVenda.getValorReal() * 0.01;
            }
            resultado += objContratado.getNome() + " (" + objContratado.getCreci() + ") - R$ " + lucro + "\n";
        }
        
        return resultado;
    }
    
    //Relatório do melhor corretor do mês
    public String getMelhorCorretor(Vector listaVenda, int mes, int ano) {
        double maiorContratado = 0, maiorComissionado = 0, atualContratado = 0, atualComissionado = 0;
        String resultado = "";
        Venda objVenda = null;
        Contratado objContratado = null, objMelhorContratado = null;
        Comissionado objComissionado = null, objMelhorComissionado = null;
        for (int intIdx = 0; intIdx < this.getVectorComissionado().size(); intIdx++) {
            atualComissionado = 0;
            objComissionado = (Comissionado) this.getVectorComissionado().elementAt(intIdx);
            for (int intIdx2 = 0; intIdx < listaVenda.size(); intIdx2++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx2);
                if (objVenda.getNroCreci() == objComissionado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
                    atualComissionado += objVenda.getValorReal() * objComissionado.getPercentual();
            }
            if (atualComissionado > maiorComissionado) {
                objMelhorComissionado = objComissionado;
                maiorComissionado = atualComissionado;
            }
        }
        for (int intIdx = 0; intIdx < this.getListaCorretorContratado().size(); intIdx++) {
            atualContratado = 0;
            objContratado = (Contratado) this.getListaCorretorContratado().elementAt(intIdx);
            for (int intIdx3 = 0; intIdx < listaVenda.size(); intIdx3++) {
                objVenda = (Venda) listaVenda.elementAt(intIdx3);
                if (objVenda.getNroCreci() == objContratado.getCreci()
                        && Integer.parseInt(objVenda.getDataVenda().substring(3, 5)) == mes
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
                    atualContratado += objVenda.getValorReal() * 0.01;
            }
            if (atualContratado > maiorContratado) {
                objMelhorContratado = objContratado;
                maiorContratado = atualContratado;
            }
        }
        if (maiorContratado > maiorComissionado) {
            resultado += objMelhorContratado.getNome() + " (" + objMelhorContratado.getCreci() + ") - R$ " + maiorContratado + "\n";
        } else {
            resultado += objMelhorComissionado.getNome() + " (" + objMelhorComissionado.getCreci() + ") - R$ " + maiorComissionado + "\n";
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
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
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
                        && Integer.parseInt(objVenda.getDataVenda().substring(6, 10)) == ano)
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
    
    public String getListaContratado() {
     String informacao = "";
        Contratado objContratado = null;
        for (int intIdx = 0; intIdx < listaCorretorContratado.size(); intIdx++) {
            objContratado = (Contratado) listaCorretorContratado.elementAt(intIdx);
                informacao +=objContratado.getCreci()
                        + "\n"+ objContratado.getNome()
                        + "\n"+ "Contratado"
                        + "\n"+ objContratado.getDataAdmissao()
                        + "\n"+ objContratado.getSalario()
                        + "\n"+ "-"
                        + "\n";} 
              
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
    
    public String getListaComissionado() {
     String informacao = "";
        Comissionado objComissionado = null;
        for (int intIdx = 0; intIdx < listaCorretorComissionado.size(); intIdx++) {
            objComissionado = (Comissionado) listaCorretorComissionado.elementAt(intIdx);
              
                informacao += objComissionado.getCreci()
                        + "\n"+ objComissionado.getNome()
                        + "\n"+ "Comissionado"
                        + "\n"+ "-"
                        + "\n"+ "-"
                        + "\n"+ objComissionado.getPercentual()+ "%"
                        + "\n";}
        
        return informacao;}
    
    public void gravaContratado() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Contratado.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCorretorContratado);
        objOS.flush();
        objOS.close();}

    public void recuperaContratado() throws Exception {
        File objFile = new File("Contratado.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Contratado.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCorretorContratado = (Vector) objIS.readObject();
            objIS.close();}}
    
    public void gravaComissionado() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Comissionado.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCorretorComissionado);
        objOS.flush();
        objOS.close();}

    public void recuperaComissionado() throws Exception {
        File objFile = new File("Comissionado.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Comissionado.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCorretorComissionado = (Vector) objIS.readObject();
            objIS.close();}}}