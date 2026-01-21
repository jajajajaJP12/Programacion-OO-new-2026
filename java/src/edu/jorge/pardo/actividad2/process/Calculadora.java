package edu.jorge.pardo.actividad2.process;

public class Calculadora {

    public int sumar(int a, int b) { return Suma.realizarOperacion(a, b); }
    public int restar(int a, int b) { return Resta.realizarOperacion(a, b); }
    public int multiplicar(int a, int b) { return Multiplicacion.realizarOperacion(a, b); }
    public int dividir(int a, int b) { return Division.realizarOperacion(a, b); }
    public int modulo(int a, int b) { return Modulo.realizarOperacion(a, b); }
    public int potencia(int a, int b) { return Potencia.realizarOperacion(a, b); }
    public int raizCuadrada(int indice, int operando) { return RaizCuadrada.realizarOperacion(indice, operando); }
    public int logaritmo(int base, int operando) { return Logaritmo.realizarOperacion(base, operando); }
}