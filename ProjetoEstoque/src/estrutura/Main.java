package estrutura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produtos;

public class Main {

	public static void main(String[] args) {

		int opc = 0;
		Scanner sc = new Scanner(System.in);
		List<Produtos> list = new ArrayList<>();

		do {
			System.out.println("===== ESTOQUE =====");
			System.out.print("1 - Cadastrar produto\n");
			System.out.print("2 - Listar produtos\n");
			System.out.print("3 - Adicionar ao estoque\n");
			System.out.print("4 - Remover do estoque\n");
			System.out.print("5 - Sair\n");

			System.out.print("\nEscolha uma opção: ");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.print("\n");
				System.out.print("Quantos itens deseja cadastrar? ");
				int qtItem = sc.nextInt();
				System.out.println("\n--- Dados para cadastro ---");
				for (int i = 0; i < qtItem; i++) {
					System.out.printf("Digite o id: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.printf("Nome: ");
					String nome = sc.nextLine();
					System.out.printf("Preco: ");
					double preco = sc.nextDouble();
					System.out.printf("Quantidade: ");
					int qtd = sc.nextInt();
					Produtos prod = new Produtos(id,nome, preco, qtd);
					list.add(prod);
					System.out.printf("Produto cadastrado com sucesso!\n");
				}
				break;
			case 2:
					System.out.print("--- Dados do produdo cadastrado ---\n");
					System.out.println(list.toString());
					System.out.println("\n");
				break;
			case 3:
				sc.nextLine();
				System.out.printf("Produto pelo id: ");
				int idProdAdd = sc.nextInt();
				Produtos prod = list.stream().filter(x -> x.getId() == idProdAdd).findFirst().orElse(null);
				if(prod == null) {
					System.out.println("Item não encontrado no sistema!");
				}else {
					System.out.printf("Quantidade: ");
					int qtAdd = sc.nextInt();
					prod.addEstoque(qtAdd);
					System.out.printf("Adição executada com sucesso!\n");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.printf("Produto pelo id: ");
				int idProdRemov = sc.nextInt();
				Produtos prod1 = list.stream().filter(x -> x.getId() == idProdRemov).findFirst().orElse(null);
				if(prod1 == null) {
					System.out.println("Item não encontrado no sistema!");
				}else {
					System.out.printf("Quantidade: ");
					int qtAddRemov = sc.nextInt();
					prod1.removEstoque(qtAddRemov);
					System.out.printf("Remoção executada com sucesso!\n");
				}
				break;
			case 5:
				System.out.print("Encerrando menu.");
				break;
			default:
				System.out.print("Valor Inválido!\n\n");
			}
		} while (opc != 5);
		sc.close();
	}
}
