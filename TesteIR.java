public class TesteIR {

    public static void main(String[] args) {

        double salario = 4000;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("O seu salário se encaixa na aliquota de 7.5% e o valor máximo a ser deduzido é de R$ 142,00");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("O seu salário se encaixa na aliquota de 15% e o valor máximo a ser deduzido é de R$ 350,00");
        } else if (salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("O seu salário se encaixa na aliquota de 22.5% e o valor máximo a ser deduzido é de R$ 636,00");
        }
    }
}