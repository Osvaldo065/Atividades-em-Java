package Calculando;
import java.util.Scanner;

public class Entrada {
    private Scanner scanner = new Scanner(System.in);

    public double lerNumero() {
        System.out.print("Digite um número: ");
        return scanner.nextDouble();
    }

    public int lerOpcao() {
        System.out.println("Selecione a opção do calculo:");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[5] - Sair");
        return scanner.nextInt();
    }
}
