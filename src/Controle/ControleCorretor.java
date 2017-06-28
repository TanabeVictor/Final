package Controle;

import Entidades.Contratado;
import Entidades.Comissionado;
import java.util.*;

public class ControleCorretor {
    private Vector listaCorretor = new Vector();
    
    //Cadastro de um corretor contratado
    public void setCorretorContratado(double salario, String dataAdmissao, int creci, String nome) {
        Contratado objCorretor = new Contratado(salario, dataAdmissao, creci, nome);
        listaCorretor.add(objCorretor);
    }
    
    //Cadastro de um corretor comissionado
    public void setCorretorComissionado(double percentual, int creci, String nome) {
        Comissionado objCorretor = new Comissionado(percentual, creci, nome);
        listaCorretor.add(objCorretor);
    }

    public Vector getListaCorretor() {
        return listaCorretor;
    }
    
}
