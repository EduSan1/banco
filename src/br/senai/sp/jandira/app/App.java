package br.senai.sp.jandira.app;

import java.util.Scanner;

import br.senai.sp.jandira.lista.TipoDeConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta do Jorginho
		Conta contaJorginho = new Conta();
		contaJorginho.setTipo(TipoDeConta.CORRENTE);
		contaJorginho.setAgencia("1332-1");
		contaJorginho.setTitular("Jorginho da Silva");
		contaJorginho.setNumero("7845-8" );
		contaJorginho.depositar(120);

		// Criação da conta do Cleidismar
		Conta contaCleidismar = new Conta();
		contaCleidismar.setAgencia("1332-1");
		contaCleidismar.setTipo(TipoDeConta.SALARIO);
		contaCleidismar.setTitular("Cleidismar Santos");
		contaCleidismar.setNumero("6547-6");
		contaCleidismar.depositar(200);

		// Criação da conta da Jordisvania
		Conta contaJordisvania = new Conta();
		contaJordisvania.setAgencia("1332-1");
		contaJordisvania.setTipo(TipoDeConta.POUPANÇA);
		contaJordisvania.setTitular("Jordisvania Gomes");
		contaJordisvania.setNumero("23145-9");
		contaJordisvania.depositar(10000);

		// Exibir os detalhes das contas

		contaJorginho.exibirDetalhes();
		contaCleidismar.exibirDetalhes();
		contaJordisvania.exibirDetalhes();

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		
		System.out.println(contaJordisvania.getTipo());
		System.out.println(contaJordisvania.getAgencia());

		// depositar dinheiro na conta da Jordisvania

		System.out.print("Quanto você deseja depositar?");
		Scanner ler = new Scanner(System.in);
		double deposito = ler.nextDouble();

		contaJordisvania.depositar(deposito);
		contaJordisvania.exibirDetalhes();

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();

		// depositar dinheiro na conta da Jordisvania

		System.out.print("Quanto você deseja Sacar?");
		double sacar = ler.nextDouble();

		contaJordisvania.sacar(sacar);
		contaJordisvania.exibirDetalhes();

		// Transferir 200 reais da conta da Jordisvania para a conta do Jorginho

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		System.out.print("Quanto você deseja transferir?");
		double transferencia = ler.nextDouble();
		contaJordisvania.transferir(contaJorginho, transferencia);
		ler.close();

		contaJordisvania.exibirDetalhes();
		contaJorginho.exibirDetalhes();
		

	}

}
