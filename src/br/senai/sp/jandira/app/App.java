package br.senai.sp.jandira.app;

import java.util.Scanner;

import br.senai.sp.jandira.lista.TipoDeConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// criando agencia

		Agencia agencia = new Agencia();
		agencia.setCidade("Carapicuíba");
		agencia.setNomeGerente("Cleidisvania");
		agencia.setNumero("31132-3");
		agencia.setTelefone("(11) 3636-4512");

		// Criar o cliente Jorginho

		Cliente clienteJorginho = new Cliente();
		clienteJorginho.setNome("Jorginho da Silva");
		clienteJorginho.setEmail("jorginho321123@imail.com");
		clienteJorginho.setSalario("1200 R$");

		// Criação da conta do Jorginho
		Conta contaJorginho = new Conta();
		contaJorginho.setTipo(TipoDeConta.CORRENTE);
		contaJorginho.setCliente(clienteJorginho);
		contaJorginho.setAgencia(agencia);
		contaJorginho.setNumero("7845-8");
		contaJorginho.depositar(120);

		// Criar o cliente Cleidisma

		Cliente clienteCleidismar = new Cliente();
		clienteCleidismar.setNome("Cleidismar Alcantara Bezerra");
		clienteCleidismar.setEmail("cleidisnilson321123@imail.com");
		clienteCleidismar.setSalario("1500 R$");

		// Criação da conta do Cleidismar
		Conta contaCleidismar = new Conta();
		contaCleidismar.setAgencia(agencia);
		contaCleidismar.setTipo(TipoDeConta.SALARIO);
		contaCleidismar.setCliente(clienteCleidismar);
		contaCleidismar.setNumero("6547-6");
		contaCleidismar.depositar(200);

		// Criar o cliente Jordisvania

		Cliente clienteJordisvania = new Cliente();
		clienteJordisvania.setNome("Jordisvania Marceline de Jesus");
		clienteJordisvania.setEmail("jordismarce321123@imail.com");
		clienteJordisvania.setSalario("15000 R$");

		// Criação da conta da Jordisvania
		Conta contaJordisvania = new Conta();
		contaJordisvania.setAgencia(agencia);
		contaJordisvania.setTipo(TipoDeConta.POUPANÇA);
		contaJordisvania.setCliente(clienteJordisvania);
		contaJordisvania.setNumero("23145-9");
		contaJordisvania.depositar(10000);

		// Exibir os detalhes das contas

		contaJorginho.exibirDetalhes();
		contaCleidismar.exibirDetalhes();
		contaJordisvania.exibirDetalhes();

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();

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
