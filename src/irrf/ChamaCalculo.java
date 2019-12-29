/*

 */
package irrf;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Erbson
 */
public class ChamaCalculo {

    int dependente;
    double valorDependente;
    double salario;
    double salarioliquido;
    double salarioantesdoirrf;

    double pensao;

    String nome;
    String matricula;

    private int dependentes;

    public void calculafolha() {

        Funcionario funcionario = new Funcionario();
        Aliquota irrf = new Aliquota();
        Inss inss = new Inss();

        nome = "Jose Batista";
        matricula = "2019072132";
        salario = 5000.00;
        dependente = 5;
        pensao = 100;
        // esse metodo salarioliquido é na verdade o metodo que calcula as deduçoes 
        //para se chegar na base de IRRF não é o liquido que o funcionario ira receber.
        irrf.Salarioliquido(salario, pensao, dependente);
        DecimalFormat converte = new DecimalFormat("#.00");

        // essa variavel salarioliquido é o valor total que o funcionario ira receber, ela receber o resultado do calculo :
        // salarioliquido = salario - pensao alimenticia  -irrf - inss.
        salarioliquido = salario - inss.CalculaInss(salario) - pensao - irrf.CalculaIRRF(salario, pensao, dependente);

        System.out.println("-----------------------------------HOLERITE-------------------------------------\n");
        System.out.println("|EMPRESA:: SOFTWARE CODE SA \n");
        System.out.println("|FUNCIONARIO ::\t" + nome + "\t :: MATRICULA \t" + matricula + " \t DEPARTAMENTO :: DESENVOLVIMENTO DE SISTEMAS\t \t \t \t \t \t \t \t \t \t \t \t \n");
        System.out.println("____________________________________________________________________________________\n");
        System.out.println("|PROVENTOS:------------------------------DESCONTOS \t \t \n");
        System.out.println("| SALARIO  " + salario + "--------------------- INSS\t" + inss.CalculaInss(salario) + "\t \t \n");
        System.out.println("|--------------------------------\t IRRF " + converte.format(irrf.CalculaIRRF(salario, pensao, dependente)) + "\t \t \n");
        System.out.println("|--------------------------------\t PENSAO ALIMENTICIA " + pensao + "\n");
        System.out.println("| \n");

        System.out.println("|\n");
        System.out.println("|--------------------------------\t SALARIO LIQUIDO " + converte.format(salarioliquido) + "\n");
        System.out.println("-----------------------------------------------------------------------------------------\n");

    }

}
