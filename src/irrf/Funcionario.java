/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irrf;

/**
 *
 * @author Erbson
 */
public class Funcionario {
    
  private String nome;
  private String matricula;
  private double salario;
  
  private int dependentes;
  
  public String getNome(){
    
    return this.nome;
    
    
  }
  
  public void setNome(String nome){
    
    this.nome = nome;
    
    
  }
  
  public String getMatricula(){
    
    return matricula;
    
  }
  
  public void setMatricula(String matricula){
    
    
   this.matricula = matricula; 
    
    
  }
  
  public double getSalario(){
    
        return salario;
        
  }
  
  public void setSalario(double salario){
    
    this.salario = salario;
    
    
    
    
    
  }
  
  public int getDependentes(){
    
     return dependentes;
    
    
    
  }
  
  
  public void setDependentes(int dependentes){
    
   this.dependentes = dependentes; 
    
  }
          
          
         
        
    
  
  
  
  
    
    
    
}
