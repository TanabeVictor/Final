package Entidades;

import java.io.Serializable;

public class Contratado extends Corretor implements Serializable {

    private double salario;
    private String dataAdmissao;

    public Contratado(double salario, String dataAdmissao, int creci, String nome) {
        super(creci, nome);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
