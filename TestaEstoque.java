package br.com.generation.collections.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.generation.collections.Aluno;

public class TestaEstoque {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> produtos = new ArrayList<>();
		do {
			System.out.println("Op��o 1: Add  ------- Op��o 2: Remover  -------  Op��o 3: Listar ----- Op��o 4: Sair ");
			opcao = leia.nextInt();

			if (opcao == 1) {

				System.out.println("Quantos Produtos voce deseja add: ");
				int numeroProdutos = leia.nextInt();

				for (int i = 0; i < numeroProdutos; i++) {

					leia.nextLine();
					System.out.println("Qual produto: ");
					String produto = leia.nextLine();
					leia.nextLine();
					System.out.println("C�digo do Produto: ");
					String codProduto = leia.nextLine();
					leia.nextLine();
					System.out.println("Marca do Produto: ");
					String marcaProduto = leia.nextLine();
					leia.nextLine();
					System.out.println("Pre�o do Produto:R$ ");
					String precoProduto = leia.nextLine();

					produtos.add(new Estoque(produto, codProduto, marcaProduto, precoProduto));
				}
			} else if (opcao == 2) {
				System.out.println();

				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(i + "Posi��o: " + produtos.get(i));
				}

				System.out.println("Qual dessas posi��es voc� quer remover? ");
				int excluir = leia.nextInt();
				produtos.remove(excluir);

			} else if (opcao == 3) {

				for (Estoque prod1 : produtos) {
					System.out.println(produtos);
					System.out.println("O produto �: " + prod1.getProduto());
					System.out.println("O c�digo do produto �: " + prod1.getCodProduto());
					System.out.println("A marca do produto �: " + prod1.getMarcaProduto());
					System.out.println("O Pre�o do produto �: " + prod1.getPre�oProduto());
				}
			}

		} while (opcao != 4);
	}
}
