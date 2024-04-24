import java.util.Scanner;

public class NumeroMasGrande {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Los tres números son iguales.");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer número (" + numero1 + ") es el más grande.");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo número (" + numero2 + ") es el más grande.");
        } else {
            System.out.println("El tercer número (" + numero3 + ") es el más grande.");
        }

        scanner.close();
    }
}

