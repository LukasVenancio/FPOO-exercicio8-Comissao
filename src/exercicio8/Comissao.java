package exercicio8;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double vendas, tempo, comissao;
		String nome;

		System.out.print("Qual � o nome do vendedor? ");
		nome = leitor.next();
		System.out.print("A quantos anos " + nome + " trabalha na empresa? ");
		tempo = leitor.nextDouble();
		System.out.print("Qual foi o seu total de vendas de " + nome + " ? ");
		vendas = leitor.nextDouble();

		leitor.close();
 
		// Sempre que for comparar dois n�meros , comece pelo maior, o que eu n�o fiz ksks. Ou seja, seria melhor ter come�ado pelo 20000 para diminuir as regras.
		if (vendas >= 10000 && vendas < 20000 && tempo >= 1) {
			comissao = (vendas * 5) / 100;

		} else if (vendas >= 20000 && tempo >= 1) {
			comissao = (vendas * 10) / 100;

		} else {
			comissao = (vendas * 3) / 100;

		}

		System.out.println("");
		System.out.println("*****************************************************");
		System.out.println("O valor da comiss�o de " + nome + " �: R$" + comissao);

	}

}
