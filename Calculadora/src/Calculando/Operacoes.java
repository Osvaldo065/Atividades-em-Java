package Calculando;

public class Operacoes implements ICalculadora {

    public double soma(double valorUm, double valorDois) {
        return valorUm + valorDois;
    }

    public double subtracao(double valorUm, double valorDois) {
        return valorUm - valorDois;
    }

    public double multiplicacao(double valorUm, double valorDois) {
        return valorUm * valorDois;
    }

    public double divisao(double valorUm, double valorDois) {
        if (valorDois == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return valorUm / valorDois;
    }
}