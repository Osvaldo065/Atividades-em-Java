package familia;

import java.util.Scanner;

public class arvore {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Recebendo a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		//Exibindo o na tela do usuário 
		System.out.println("Teste de DNA do Ratinho!\n");
		//Solicitando que o usuário digite o  nome do membro da familia
		System.out.println("Informe o nome do membro da familia:\n");
		String nome = scanner.nextLine();//Variavel recebendo o valor digitado

		mae mn = new mae(); // Objeto mae recebendo new mae 
        filha fl = new filha();// objeto filha recebendo new filha
		Avos ln = new Avos(); //Obejto avos recebendo new avos

        if (nome.equalsIgnoreCase(mn.nomeMae)) {
            System.out.println("Membro: " + mn.nomeMae);
            System.out.println(mn.nomeMae + " é mãe de: " + mn.nomeFilha);
            System.out.println(mn.nomeMae + " é esposa de : " + mn.nomePai);
        } else if (nome.equalsIgnoreCase(fl.nomeFilha)) {
            System.out.println("Membro: " + fl.nomeFilha);
            System.out.println(fl.nomeFilha + " é filha de: " + mn.nomeMae);
            System.out.println(fl.nomeFilha + " é filha de: " + mn.nomePai);
        } else if (nome.equalsIgnoreCase(mn.nomePai)) {
            System.out.println("Membro: " + mn.nomePai);
            System.out.println(mn.nomePai + " é pai de: " + mn.nomeFilha);
            System.out.println(mn.nomePai + " é marido de: " + mn.nomeMae);
        } else if (nome.equalsIgnoreCase(ln.nome_Avó)){
			System.out.println("Membro: " + ln.nome_Avó);
			System.out.println(ln.nome_Avó + "é avó de:" + mn.nomeFilha);
			System.out.println(ln.nome_Avó + " é mae de:" + mn.nomePai);
			System.out.println(ln.nome_Avó + "é sogra de:" + mn.nomeMae);
		} else if (nome.equalsIgnoreCase(ln.nome_Avô)) {
			System.out.println("Membro: " + ln.nome_Avô);
			System.out.println(ln.nome_Avô + "é avô de:" + mn.nomeFilha);
			System.out.println(ln.nome_Avô + " é pai de:" + mn.nomePai);
			System.out.println(ln.nome_Avô + "é sogro de:" + mn.nomeMae);
			
		} else {
            System.out.println("Membro não encontrado.");
        }

        scanner.close();
    }

}
