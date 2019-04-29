package model;

import java.sql.Time;


public class Funcionario {
   

    private boolean inss;
    private String nome;
    private double salarioBruto;
    private double salarioLiquido;
    private double horasExtras; 
    private int  nivelDeInsalubridade; 
    private boolean  periculosidade;
    private int Filhos;

    public Funcionario(String nome, double salarioBruto, double salarioLiquido, double horasExtras, int quantidadeDeFilhos, int nivelDeInsalubridade,
            Boolean periculosidade, Boolean inss) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.Filhos = quantidadeDeFilhos;
        this.nivelDeInsalubridade = nivelDeInsalubridade;
        this.horasExtras = horasExtras;
        this.periculosidade = periculosidade;
        this.inss = inss;
    }

    
    
    
    public Funcionario(){ 
    }
    
    
    
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }
   
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalarioLiquido(double salarioLiquido){
        this.salarioLiquido = salarioLiquido;
    }
    public double getSalarioLiquido(){
        return salarioLiquido;
    }
    
    public void setFilhos(int quantidadeDeFilhos){
        this.Filhos = quantidadeDeFilhos;
    }
    public int getQuantidadeDeFilhos() {
        return Filhos ;
    }

    public void setNivelDeInsalubridade(int nivelDeInsalubridade){
        this.nivelDeInsalubridade = nivelDeInsalubridade;
    }
    
   public int getNivelDeInsalubridade() {
       return nivelDeInsalubridade ;
   }
   
   public void setHorasExtras(double horasExtras){
       this.horasExtras = horasExtras;
   }
   public double getHorasExtras(){
       return horasExtras;
   }
   
   
   
   public void setPericulosidade(Boolean periculosidade){
       this.periculosidade = periculosidade;
   }
   public Boolean getPericulosidade(){
       return periculosidade;
       
   }
   
   public void setInss(Boolean inss){
       this.inss = inss;
   }
   
   public Boolean getInss(){
       return inss;
       
   }
   
   
}
