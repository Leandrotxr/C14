package br.inatel.cdg.calculadora;

public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por 0");
        }
        return a / b;
    }
}
