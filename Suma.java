import java.util.Scanner;

public class Suma {
// Función recursiva para calcular la suma de 1 hasta n
public static int sumaConsecutivos(int n) {
    if (n == 1) {
        return 1;
    } 
    else {
        return n + sumaConsecutivos(n - 1);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número entero: ");
    int n = scanner.nextInt();

    if (n >= 1) {
        int resultado = sumaConsecutivos(n); 
        System.out.println("La suma es: " + resultado); 
    } else {
        System.out.println("ingresar un número mayor o igual a 1."); 
    }

    scanner.close();
}
}