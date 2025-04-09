import java.util.Scanner;
public class Suma2 {
    public static int sumaDigitos(int numero) {
        if (numero < 10) { 
            return numero;
        } else {  
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        System.out.println("La suma de los dígitos es: " + sumaDigitos(numero));
    }
}
