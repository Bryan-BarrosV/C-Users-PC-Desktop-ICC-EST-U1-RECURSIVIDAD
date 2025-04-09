import java.util.Scanner;

public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        Fibonacci fib = new Fibonacci();
        System.out.print("La secuencia Fibonacci es: ");
        for (int i = 0; i < numero; i++) {
            System.out.print(fib.fibonacci(i) + " ");
        }

        scanner.close();
    }
}
