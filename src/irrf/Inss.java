/*
     Segue o link das aliquotas vigente de INSS, ano 2019.

      https://www.inss.gov.br/servicos-do-inss/calculo-da-guia-da-previdencia-social-gps/tabela-de-contribuicao-mensal/
      
      se deseja altere as faixa no codigo abaixo, os valores ficam depois dos operadores <= e >= .


 */
package irrf;

/**
 *
 * @author Erbson
 */
public class Inss {

    double aliquota8;
    double aliquota9;
    double aliquota11;

    double inss;

    public double AliquotaInss(double salario) {

        if (salario > 0 && salario <= 1751.81) {

            return aliquota8 = 8;

        } else if (salario >= 1751.82 && salario <= 2919.72) {

            return aliquota9 = 9;

        }
        if (salario >= 2919.73 && salario <= 5839.45) {

            return aliquota11 = 11;

        }

        return 0;

    }

    public double CalculaInss(double salario) {

        return inss = (salario * AliquotaInss(salario)) / 100;

    }

}
