import java.util.Scanner;

public class Potencia {
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = potencia(base, exponente);

        System.out.println(base + " elevado a " + exponente + " es: " + resultado);

        scanner.close();
    }
}
