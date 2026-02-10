package edu.jorge.pardo.V2.ui;

import edu.jorge.pardo.V2.process.Calculadora;
import edu.jorge.pardo.V2.process.RaizCuadrada;

import java.util.Scanner;

public class CLI {

    private static final Calculadora calculadora = new Calculadora();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            showMenu();
            option = scanner.nextInt();

            if (option == 0) break;

            try {
                calculadora.setOperacion(option);
                aplicarOperacion(scanner, calculadora);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("bye");
    }

    public static void aplicarOperacion(Scanner scanner, Calculadora calculadora) {
        System.out.println("Introduce el primer valor: ");
        int a = scanner.nextInt();

        int b = 0;

        // Raíz solo necesita un valor
        if (!(calculadora.operacion instanceof RaizCuadrada)) {
            System.out.println("Introduce el segundo valor: ");
            b = scanner.nextInt();
        }

        int resultado = calculadora.operacion.apply(a, b);
        System.out.println("El resultado es: " + resultado);
    }

    public static void showMenu() {
        System.out.println("Elige una de las siguientes operaciones: ");
        System.out.println("1: Suma ");
        System.out.println("2: Resta ");
        System.out.println("3: Multiplicacion ");
        System.out.println("4: Potencia ");
        System.out.println("5: Division ");
        System.out.println("6: Logaritmo ");
        System.out.println("7: Modulo ");
        System.out.println("8: RaizCuadrada ");
        System.out.println("0: Salir ");
    }
}
