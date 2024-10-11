package Calculando;

public interface ICalculadora {
    double soma(double valorUm, double valorDois);

    static double subtracao(double valorUm, double valorDois) {
        return 0;
    }

    double multiplicacao(double valorUm, double valorDois);
    double divisao(double valorUm, double valorDois);
}
