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
public class Aliquota {

    double[] faixa01 = {1903.98, 1903.99, 2826.65, 2826.66, 3751.05, 3751.06, 4664.68, 4664.68};
    double dependente = 189.59;

    double salarioliquido;
    double aliquota;
    double deducao;
    double irrf;
    Inss inss = new Inss();
    
    
    
    
     
    public double Salarioliquido(double salario,double pensao,int qtdependente){
        
        
         if (qtdependente >= 1 || pensao>0) {

         return   salarioliquido = salario - (qtdependente * dependente) - inss.CalculaInss(salario) - pensao;
        
         }else
           return salarioliquido = salario - inss.CalculaInss(salario);
             
        
    }
    
    
    

    public double AliquotaIrrf(double salario,double pensao,int qtdependente) {
     
        
   salarioliquido =   this.Salarioliquido( salario, pensao,qtdependente);
        
        
        if (salarioliquido < faixa01[0]) {

            return aliquota = 0;

        } else if (salarioliquido >= faixa01[1] && salarioliquido <= faixa01[2]) {

            return aliquota = 7.5;

        } else if (salarioliquido >= faixa01[3] && salarioliquido <= faixa01[4]) {
            return aliquota = 15;

        } else if (salarioliquido >= faixa01[5] && salarioliquido <= faixa01[6]) {

            return aliquota = 22.50;

        } else if (salarioliquido >= faixa01[7]) {

            return aliquota = 27.05;

        }
        return 0;

    }

    public double Dependentes() {
        return dependente;

    }

    public double Deducao(double aliquota) {

        if (aliquota == 0) {

            return 0;
        } else if (aliquota == 7.5) {
            return deducao = 142.80;

        }
        if (aliquota == 15) {
            return deducao = 354.80;

        } else if (aliquota == 22.50) {
            return deducao = 636.13;

        }
        if (aliquota == 27.50) {
            return deducao = 869.36;

        }
        return 0;

    }

    
   
    
    
    
    
   

    public double CalculaIRRF(double salario,double pensao,int qtdependente) {
        if (qtdependente >= 1) {

            irrf = salario - (qtdependente * dependente) - inss.CalculaInss(salario) - pensao;

           irrf *= this.AliquotaIrrf(salario,pensao,qtdependente) / 100;
          return irrf -= this.Deducao(this.AliquotaIrrf(salario,pensao,qtdependente));
        } else {

            irrf = salario - inss.CalculaInss(salario);
           irrf *= this.AliquotaIrrf(salario,pensao,qtdependente) / 100;
            return irrf -= this.Deducao(this.AliquotaIrrf(salario,pensao,qtdependente));

        }
        
    }
    

}
