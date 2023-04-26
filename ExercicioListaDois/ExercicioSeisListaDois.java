import java.util.Scanner;
import java.util.Random;
public class ExercicioSeisListaDois{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int valorUm, valorDois, maior, menor, aleatorio;
        System.out.println("Digite um valor: ");
        valorUm = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        valorDois = input.nextInt();
        if (valorUm > valorDois){
            maior = valorUm;
            menor = valorDois;
        } else {
            maior = valorDois;
            menor = valorUm;
        }
        aleatorio = gerador.nextInt(menor, maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);
        if (aleatorio % 2 == 0)
        System.out.println("O numero aleatorio: " + aleatorio + "é par");
        else{
            System.out.println("O numero aleatorio: " + aleatorio + "é impar");
        }
    input.close();

    }
}







