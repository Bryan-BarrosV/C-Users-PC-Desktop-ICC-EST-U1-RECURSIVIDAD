import java.util.Scanner;

public class Recursiva {

    static int llamadaRecursiva = 1;

    public static int sumaConsecutivos(int n) {
        int idActual = llamadaRecursiva++;
        System.out.println("Llamada recursiva: " + idActual + ", n: " + n);

        if (n == 1) {
            System.out.println("Llamada recursiva: " + idActual + ", caso base alcanzado n: " + n);
            return 1;
        }

        System.out.println("Llamada recursiva: " + idActual + ", n: " + n + ", llamando a sumaConsecutivos(" + (n - 1) + ")");
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        System.out.println("Llamada recursiva: " + idActual + ", sumando: " + n + " + " + resultadoParcial + " = " + resultado);

        return resultado;
    }

    public static int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para sumar consecutivos desde 1: ");
        int n = scanner.nextInt();
        if (n >= 1) {
            llamadaRecursiva = 1;
            int resultadoSuma = sumaConsecutivos(n);
            System.out.println("La suma es: " + resultadoSuma);
        } else {
            System.out.println("Debes ingresar un número mayor o igual a 1.");
        }

        System.out.print("\nIngresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        int resultadoPotencia = potencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + resultadoPotencia);

        System.out.print("\nIngresa un número para sumar sus dígitos: ");
        int numeroParaDigitos = scanner.nextInt();
        System.out.println("La suma de los dígitos es: " + sumaDigitos(numeroParaDigitos));

        System.out.print("\nIngresa un número para la secuencia Fibonacci: ");
        int numeroFibonacci = scanner.nextInt();
        System.out.print("La secuencia Fibonacci es: ");
        for (int i = 0; i < numeroFibonacci; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
