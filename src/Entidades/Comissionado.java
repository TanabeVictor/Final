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
public class Comissionado extends Corretor{
    private double percentual;
    
    public void setPercentual(double percentual){
    this.percentual = percentual;}
    
    public double getPercentual(){
    return this.percentual;}
    
}
