/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author vitau
 */
public class Corretor {
    private int creci;
    private String nome;
    
    public Corretor(String nome, int creci){
    setNome(nome);
    setCreci(creci);}
    
    public void setCreci(int creci){
    this.creci = creci;}
    
    public void setNome(String nome){
    this.nome = nome;}
    
    public int getCreci(){
    return this.creci;}
    
    public String getNome(){
    return this.nome;}}
