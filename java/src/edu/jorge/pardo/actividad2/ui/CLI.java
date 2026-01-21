package edu.jorge.pardo.actividad2.ui;

import edu.jorge.pardo.actividad2.process.Calculadora;

import java.util.Scanner;

public class CLI {
    private final Calculadora calc = new Calculadora();
    private final Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.println("=== Calculadora Aritmética (CLI) ===");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) División (entera)");
            System.out.println("5) Módulo");
            System.out.println("6) Potencia");
            System.out.println("7) Raíz cuadrada");
            System.out.println("8) Logaritmo (entero exacto)");
            System.out.println("9) Salir");

            int op = leerEntero("Elige opción: ");

            if (op == 9) {
                System.out.println("Fin. (La calculadora no se cansa, tú sí 😄)");
                break;
            }

            try {
                int res;

                switch (op) {
                    case 1 -> {
                        int a = leerEntero("a: ");
                        int b = leerEntero("b: ");
                        res = calc.sumar(a, b);
                        System.out.println("Resultado: " + res);
                    }
                    case 2 -> {
                        int a = leerEntero("a: ");
                        int b = leerEntero("b: ");
                        res = calc.restar(a, b);
                        System.out.println("Resultado: " + res);
                    }
                    case 3 -> {
                        int a = leerEntero("a: ");
                        int b = leerEntero("b: ");
                        res = calc.multiplicar(a, b);
                        System.out.println("Resultado: " + res);
                    }
                    case 4 -> {
                        int a = leerEntero("a: ");
                        int b = leerEntero("b: ");
                        res = calc.dividir(a, b);
                        System.out.println("Resultado: " + res);
                    }
                    case 5 -> {
                        int a = leerEntero("a: ");
                        int b = leerEntero("b: ");
                        res = calc.modulo(a, b);
                        System.out.println("Resultado: " + res);
                    }
                    case 6 -> {
                        int base = leerEntero("Base: ");
                        int exp = leerEntero("Exponente (>=0): ");
                        res = calc.potencia(base, exp);
                        System.out.println("Resultado: " + res);
                    }
                    case 7 -> {
                        int indice = leerEntero("Índice (solo 2): ");
                        int opnd = leerEntero("Operando: ");
                        res = calc.raizCuadrada(indice, opnd);
                        System.out.println("Resultado: " + res);
                    }
                    case 8 -> {
                        int base = leerEntero("Base (>1): ");
                        int opnd = leerEntero("Operando (>0): ");
                        res = calc.logaritmo(base, opnd);
                        System.out.println("Resultado: " + res);
                    }
                    default -> System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException ignored) {
                System.out.println("Ingresa un entero válido.");
            }
        }
    }
}