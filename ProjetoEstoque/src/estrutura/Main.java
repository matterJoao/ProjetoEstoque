package estrutura;

import java.util.Scanner;

import entidades.Produtos;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		Scanner sc = new Scanner(System.in);
		Produtos[] prod = new Produtos[3];
		
		do {
			System.out.println("===== ESTOQUE =====");
			System.out.print("1 - Cadastrar produto\n");
			System.out.print("2 - Listar produtos\n");
			System.out.print("3 - Sair\n");

			System.out.print("\nEscolha uma opção: ");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Cadastrar!\n");
				System.out.print("Quantos itens deseja cadastrar? ");
				int qtItem = sc.nextInt();
				System.out.println("\n--- Dados para cadastro ---");
				for (int i = 0; i < qtItem; i++) {
					sc.nextLine();
					System.out.printf("Nome: ");
					String nome = sc.nextLine();
					System.out.printf("Preco: ");
					double preco = sc.nextDouble();
					System.out.printf("Quantidade: ");
					int qtd = sc.nextInt();
					prod[i] = new Produtos(nome, preco, qtd);
					System.out.printf("Produto cadastrado com sucesso!\n");
				}
				break;
			case 2:
				// Ignora as posições que não foram utilizadas do vetor.
				for (int i = 0; i < 3; i++) {
					if (prod[i] != null) {
						System.out.print("--- Dados do produdo cadastrado ---\n");
						System.out.println(prod[i].toString());
					}
				}
				break;
			case 3:
				System.out.print("Encerrando menu.");
				break;
			default:
				System.out.print("Valor Inválido!");
			}
		} while (opc != 3);
		sc.close();
	}
}
