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
public class Contratado extends Corretor{
     private double salario;
     private String data;
     
    public Contratado(){
    }
    
    public void setSalario(double salario){
    this.salario = salario;}
    
    public void setData(String data){
    this.data = data;}
    
    public double getSalario(){
    return this.salario;}
    
    public String getData(){
    return this.data;}
}
