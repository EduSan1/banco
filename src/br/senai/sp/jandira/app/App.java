package br.senai.sp.jandira.app;

import java.util.Scanner;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta do Jorginho
		Conta contaJorginho = new Conta("7845-8", "Corrente");
		contaJorginho.titular = "Jorginho da Silva";
		contaJorginho.depositar(120);
		contaJorginho.numeroAgencia = "4214-9";

		// Criação da conta do Cleidismar
		Conta contaCleidismar = new Conta("6547-6", "Poupança");
		contaCleidismar.titular = "Cleidismar Santos";
		contaCleidismar.depositar(200);
		contaCleidismar.numeroAgencia = "4214-9";

		// Criação da conta da Jordisvania
		Conta contaJordisvania = new Conta("23145-9", "Corrente");
		contaJordisvania.titular = "Jordisvania Gomes";
		contaJordisvania.depositar(10000);
		contaJordisvania.numeroAgencia = "4214-9";

		// Exibir os detalhes das contas

		contaJorginho.exibirDetalhes();
		contaCleidismar.exibirDetalhes();
		contaJordisvania.exibirDetalhes();

		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");

		// depositar dinheiro na conta da Jordisvania

		System.out.print("Quanto você deseja depositar?");
		Scanner ler = new Scanner(System.in);
		double deposito = ler.nextDouble();

		contaJordisvania.depositar(deposito);
		contaJordisvania.exibirDetalhes();

		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("");

		// depositar dinheiro na conta da Jordisvania

		System.out.print("Quanto você deseja Sacar?");
		double sacar = ler.nextDouble();
		ler.close();

		contaJordisvania.sacar(sacar);
		contaJordisvania.exibirDetalhes();

		// Transferir 200 reais da conta da Jordisvania para a conta do Jorginho

		contaJordisvania.transferir(contaJorginho, 11000);

		contaJordisvania.exibirDetalhes();
		contaJorginho.exibirDetalhes();

	}

}
