import java. util.Scanner;
public class ExercicioUmListaDois {
    public static void main(String [] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = input.nextInt();
        int maior = numero1;
        if (numero2 > maior)
        maior = numero2;
        if(numero3 > maior)
        maior = numero3;

        int menor = numero1;

        if(numero2 < menor)
        menor = numero2;
        if(numero3 < menor)
        menor = numero3;

        int mediaAritmetica = (numero1 + numero2 + numero3) / 3;

        System.out.println("o numero maior é: " +  maior);
        System.out.println("o numero menor é: " +  menor);
        System.out.println("A media aritmetica é " +  mediaAritmetica);
        input.close();
    }
}