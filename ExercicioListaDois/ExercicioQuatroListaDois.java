import java.util.Scanner;
public class ExercicioQuatroListaDois{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 3: ");
        int numeroUm = input.nextInt();
        System.out.println("Digite o valor do raio: ");
        double raio = input.nextDouble();
        switch (numeroUm) {
            case 1:
                double perimetro = 2 * (Math.PI * raio);
                System.out.printf("O perimetro é: %.2f" , perimetro);
                break;
            case 2:
                double area = Math.PI * Math.pow(raio , 2);
                System.out.printf("A área é: %.2f" , area);
                break;
            case 3:
                double volume = 4/3 * (Math.PI * Math.pow(raio, 3));
                System.out.printf("o volume é: %.2f" , volume);
            default:
                System.out.println("Codigo invalido!");
                break;
        }
        input.close();
    }
}