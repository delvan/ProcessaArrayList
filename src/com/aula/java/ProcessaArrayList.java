package com.aula.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessaArrayList {
	static ArrayList<String> listProdutos = new ArrayList<String>();
	static ArrayList<Double> listPrecos = new ArrayList<Double>();
	static int opcao;
	static Scanner teclado = new Scanner(System.in);

	static void cadProduto() {

		System.out.println("---------Você entrou na opcão CADASTRO----------");
		int tamanho = 4;

		String[] produto = new String[tamanho];
		Double[] preco = new Double[tamanho];

		for (int j = 1; j < tamanho  ; j++) {

			System.out.println("Digite o nome do " + (j) + "º produto que deseja cadastrar: ");
			produto[j] = teclado.next();

			System.out.println("Digite o preço do " + (j) + "º produto :");
			preco[j] = teclado.nextDouble();

			listProdutos.add(produto[j]);
			listPrecos.add(preco[j]);

		}

		Scanner tecl = new Scanner(System.in);

		int v;

		System.out.println("Digite :" + 
		"\n2 CONSULTAR " + 
		"\n3 VISUALIZAR " + 
		"\n4 EXCLUSÃO " + 
		 "\n5 MODIFICAR");
		v = tecl.nextInt();

		switch (v) {
		case 2:
			int num;
			System.out.println("Digite 1, 2 ou 3 para consultar ");
			num = teclado.nextInt();

			switch (num) {
			case 1:
				System.out.println(" PRODUTO: " + listProdutos.get(num) + 
						" PREÇO: " + listPrecos.get(num));
				
				break;
				
			case 2:
				System.out.println(" PRODUTO: " + listProdutos.get(num) + 
						" PREÇO: " + listPrecos.get(num));
				
				break;
				
			case 3: 
				System.out.println(" PRODUTO: " + listProdutos.get(num) + 
						" PREÇO: " + listPrecos.get(num));

				break;
			default:
				System.out.println("Porduto não cadastrado");
				break;
			}
			break;

		case 3:
			System.out.println(" --VISUALIZAR--");
			System.out.println("Produto: " +listProdutos);
			System.out.println("Preço: " +listPrecos);

			break;

		case 4:
			
			int num2;
			System.out.println("Digite 1, 2 ou 3 para para excluir registro ");
			num2 = teclado.nextInt();
			
			System.out.println("Produto que foi removido = "+ listProdutos.get(num2));
			listProdutos.remove(num2);
			listPrecos.remove(num2);

			break;

		case 5:
			
			int num3;
			String nomeProd;
			double novoPrec;
			
			System.out.println("Digite o numero 1, 2, ou 3 para inicializar ");
			num3 = teclado.nextInt();
			System.out.println("Agora digite nome do novo produto para modificar");
			nomeProd = teclado.next();	
			System.out.println("Agora digite o novo PREÇO produto para modificar");
			novoPrec = teclado.nextDouble();
			
			System.out.println(" Produto Anterior: "+listProdutos.get(num3)+ " "
					+ "preco anterior: " + listPrecos.get(num3));
			System.out.println("-------------------------------------");
			listProdutos.set(num3, nomeProd);
			listPrecos.set(num3, novoPrec);
			System.out.println(" Novo produto: "+ listProdutos.get(num3) + 
					" Novo preco: " + listPrecos.get(num3));
		
			break;

		default:
			break;
		}

	}

	public static void main(String[] args) {
		cadProduto();

	}
}
