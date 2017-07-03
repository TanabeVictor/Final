package Entidades;

import java.io.Serializable;

public class Corretor implements Serializable {

    private int creci;
    private String nome;

    public Corretor(int creci, String nome) {
        this.creci = creci;
        this.nome = nome;
    }

    public int getCreci() {
        return creci;
    }

    public void setCreci(int creci) {
        this.creci = creci;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
