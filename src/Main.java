import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tema = "Manejo de \"String\"";

        System.out.println("tema = " + tema);
        // Ejercicio 1: Imprimir un mensaje en consola
        System.out.println("Hola, bienvenido a la guía de ejercicios en Java.");

        // Ejercicio 2: Declarar e imprimir una variable de tipo entero
        int numero = 10;
        System.out.println("El número es: " + numero);

        // Ejercicio 3: Declarar e imprimir una variable de tipo flotante
        float numeroFloat = 3.14f;
        System.out.println("El número flotante es: " + numeroFloat);

        // Ejercicio 4: Pedir al usuario que ingrese un número y luego imprimirlo
        System.out.print("Por favor ingresa un número entero: ");
        int numeroIngresado = scanner.nextInt();
        System.out.println("El número ingresado es: " + numeroIngresado);

        // Ejercicio 5: Realizar una suma de dos números ingresados por el usuario e imprimir el resultado
        System.out.print("Por favor ingresa el primer número para sumar: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ahora ingresa el segundo número: ");
        int segundoNumero = scanner.nextInt();
        int suma = primerNumero + segundoNumero;
        System.out.println("La suma de los dos números es: " + suma);

        // Ejercicio 6: Realizar un bucle que imprima los números del 1 al 10
        System.out.println("Imprimiendo los números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // Ejercicio 7: Realizar un bucle que imprima los números pares del 1 al 20
        System.out.println("Imprimiendo los números pares del 1 al 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        // Ejercicio 8: Realizar una función que calcule el área de un rectángulo y la imprima
        int base = 5;
        int altura = 3;
        int areaRectangulo = calcularAreaRectangulo(base, altura);
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // Ejercicio 9: Realizar una función que determine si un número es par o impar
        System.out.print("Por favor ingresa un número para determinar si es par o impar: ");
        int num = scanner.nextInt();
        if (esPar(num)) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // Ejercicio 10: Realizar una función que calcule el factorial de un número
        System.out.print("Por favor ingresa un número para calcular su factorial: ");
        int n = scanner.nextInt();
        int factorial = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + factorial);

        // Ejercicio 11: Realizar una función que imprima la serie de Fibonacci hasta un número dado
        System.out.print("Por favor ingresa un número para imprimir la serie de Fibonacci hasta ese número: ");
        int limite = scanner.nextInt();
        System.out.println("La serie de Fibonacci hasta " + limite + " es:");
        for (int i = 0; i < limite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        System.out.println(); // Salto de línea

        scanner.close();
    }

    // Función para calcular el área de un rectángulo
    public static int calcularAreaRectangulo(int base, int altura) {
        return base * altura;
    }

    // Función para determinar si un número es par
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    // Función para calcular el factorial de un número
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // Función para calcular el n-ésimo término de la serie de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, fibonacci = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}
