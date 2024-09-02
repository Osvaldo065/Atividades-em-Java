
package paineldebordo; // Nome do Projeto se repete em todos arquivos

import java.util.Scanner; // Importa a biblioteca que captura dados de entrada

public class PainelDeBordo { // inicia a Classe (Filho) Principal PainelDeBordo

    public static void main(String[] args) { // Cria uma classe estatica > (STATIC) sem retorno -> (Void) que inicia antes de qualquer outra classe -> (MAIN)

      Carro car = new Carro(); // Construindo a classe chamada Carro e atribuindo o apelido 'car', herdando os objetos da classe pai de mesmo nome -> NEW é o método construtor que cria a classe.

      
      Scanner entrada = new Scanner(System.in);
      System.out.println("Entre com a Opcao do Menu 1 - Entrar | 0 - Sair: "); 
      car.menu = entrada.nextInt();
      car.modelo = "sedan"; 
      car.cor = "Vermelho";
      car.abrir();
      car.fechar();
      car.ligar();
      car.status();
      
    }
}
