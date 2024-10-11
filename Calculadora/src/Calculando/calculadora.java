
package Calculando;

public class calculadora {
    public static void main(String[] args) {

        Operacoes Operacoes= new Operacoes();
        Entrada entrada = new Entrada();

        double valorUm = entrada.lerNumero();
        int opcao = entrada.lerOpcao();
        double valorDois = entrada.lerNumero();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = Operacoes.soma(valorUm, valorDois);
                break;
            case 2:
                resultado = Operacoes.subtracao(valorUm, valorDois);
                break;
            case 3:
                resultado = Operacoes.multiplicacao(valorUm, valorDois);
                break;
            case 4:
                try {
                    resultado = Operacoes.divisao(valorUm, valorDois);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            case 5:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.printf("O resultado é: R = %.2f%n", resultado);
    }
}