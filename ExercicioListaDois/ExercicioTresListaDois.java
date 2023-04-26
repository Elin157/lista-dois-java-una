import java.util.Scanner;
public class ExercicioTresListaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x, x1, x2, x0;

        System.out.println("\nInforme o valor de A na equação: ");
        a = scanner.nextDouble();
        System.out.println("\nInforme o valor de B na equação:");
        b = scanner.nextDouble();
        System.out.println("\nInforme o valor de C na equação:");
        c = scanner.nextDouble();

        delta = b*b - 4 * a * c;
        x = -c/b;

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("\nCoeficientes informados incorretamente!");
        }

        else if (a == 0 && b != 0) {
            System.out.println("\nEssa é uma equação de primeiro grau, o valor da sua raiz real é:" + x  );
        }

        else if (delta < 0) {
            System.out.println("\nEssa equação não possui raízes reais.");
        }

        else if (delta == 0) {
            x0 = -b/(2*a);
            System.out.println("\nEsta equação possui duas raízes reais iguais, que são: X1= " + x0 + " e X2= " + x0);
        }

        else {  
            x1 = (-b + Math.sqrt(delta)) / ( 2 * a);
            x2 = (-b - Math.sqrt(delta)) / ( 2 * a);
            System.out.println("\nEsta equação possui duas raízes reais diferentes, que são: X1= " + x1 + " e X2= " + x2);
            scanner.close();
        }
    } 
}
