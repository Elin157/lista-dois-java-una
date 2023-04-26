import java.util.Scanner;
public class ExercicioDoisListaDois{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int nota50, nota20, nota10, nota5, nota2, nota1;
        System.out.println("Digite o valor da compra é: R$");
        int valorCompra = input.nextInt();
        System.out.println("Digite o valor pago é: R$");
        int valorPago = input.nextInt();
        if (valorPago < valorCompra)
        System.out.println("Valor pago insuficiente");
        else{
        int troco = valorPago - valorCompra;
        nota50 = troco / 50;
        troco = troco % 50;
        nota20 = troco / 20;
        troco = troco % 20;
        nota10 = troco / 10;
        troco = troco % 10;
        nota5 = troco / 5;
        troco = troco % 5;
        nota2 = troco / 2;
        troco = troco % 2;
        nota1 = troco;
        System.out.println("O troco é de: " + (valorPago - valorCompra));
        System.out.println("notas de R$50 é: " + nota50);
        System.out.println("notas de R$20 é: " + nota20);
        System.out.println("notas de R$10 é: " + nota10);
        System.out.println("notas de R$5 é: " + nota5);
        System.out.println("notas de R$2 é: " + nota2);
        System.out.println("notas de R$1 é: " + nota1);
        }
       input. close();
    }
}