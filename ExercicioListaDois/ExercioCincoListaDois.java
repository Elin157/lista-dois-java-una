import java.util.Scanner;
public class ExercioCincoListaDois{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        double numeroUm = input.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numeroDois = input.nextDouble();

        System.out.println("Digite o simbolo da operação, +, -, *, /, ^: ");
        String operacao = input.next();

        double resultado = 0.0;

        switch (operacao) {
            case "+":
                resultado = numeroUm + numeroDois;
                System.out.printf("O valor da operação é: %.2f" , resultado);
                break;
            case "-":
                resultado = numeroUm - numeroDois;
                System.out.printf("O valor da operação é: %.2f" , resultado);
                break;
            case "*":
                resultado = numeroUm * numeroDois;
                System.out.printf("O valor da operação é: %.2f" , resultado);
            case "/":
                resultado = numeroUm / numeroDois;
                System.out.printf("O valor da operação é: %.2f" , resultado);
            case "^":
                resultado = Math.pow(numeroUm , numeroDois);
                System.out.printf("O valor da operação é: %.2f" , resultado);
            default:
            System.out.println("ERRO! simbolo da operação invalido!");
                break;
        }
        input.close();
    }
}