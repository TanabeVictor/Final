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
public class Imovel {
  private int codigo;
  private String tipo, descricao, nomeVendedor, data;
  private double preco;
  private String tipos[] = {"Casa", "Apartamento", "Sala Comercial", "Lote", "Chácara", "Sítio", "Fazenda"};
          
  public Imovel(int codigo, String tipo, String descricao, String nomeVendedor, String data, double preco) throws Exception{
  setCodigo(codigo);
  setTipo(tipo);
  setDescricao(descricao);
  setNomeVendedor(nomeVendedor);
  setData(data);
  setPreco(preco);}
  
  public void setCodigo(int codigo){
  this.codigo = codigo;}
  
  public void setTipo(String tipo) throws Exception{
  if(tipo.equals(preco)){
  //Condicional
  }
  this.tipo = tipo;}
  
  public void setDescricao(String descricao){
  this.descricao = descricao;}
  
  public void setNomeVendedor(String nomeVendedor){
  this.nomeVendedor = nomeVendedor;}
  
  public void setData(String data){
  this.data = data;}
  
  public void setPreco(double preco){
  this.preco = preco;}
  
  public int getCodigo(){
  return this.codigo;}
  
  public String getTipo(){
  return this.tipo;}
  
  public String getDescricao(){
  return this.descricao;}
  
  public String getNomeVendedor(){
  return this.nomeVendedor;}
  
  public String getData(){
  return this.data;}
  
  public double getPreco(){
  return this.preco;}}
