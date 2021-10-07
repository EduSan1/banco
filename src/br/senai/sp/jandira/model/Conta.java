package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoDeConta;

public class Conta {

	private TipoDeConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private double saldo;

	public Conta() {

	}

	public void setTipo(TipoDeConta tipo) {

		this.tipo = tipo;

	}

	public TipoDeConta getTipo() {

		return tipo;

	}

	public void setAgencia(Agencia agencia) {

		this.agencia = agencia;

	}

	public Agencia getAgencia() {

		return agencia;

	}

	public void setNumero(String numero) {

		this.numero = numero;

	}

	public void setCliente(Cliente cliente) {

		this.cliente = cliente;

	}

	public Cliente getCliente() {

		return cliente;
	}

	public void depositar(double valorDeposito) {

		if (valorDeposito <= 0) {

			System.out.println(
					"\nPara depositar você deve colocar um valor maior do que zero. " + "\nPor favor digite novamente");

		} else {

			saldo += valorDeposito;

		}
	}

	public boolean sacar(double valorSaque) {

		if (valorSaque <= 0) {
			System.out.println("");
			System.out.println("Digite um numero valido para poder Sacar");
			return false;

		} else if (valorSaque > saldo) {
			System.out.println("");
			System.out.println("Desculpe mas não trabalhamos com limite\n"
					+ "Por favor digite um numero maior ou igual ao seu saldo");
			return false;

		} else {

			saldo -= valorSaque;
			return true;
		}
	}

	public void transferir(Conta contaDestino, double valorTranferencia) {

		boolean resultado = sacar(valorTranferencia);

		if (resultado) {

			contaDestino.depositar(valorTranferencia);

		} else {
			System.out.println("");
			System.out.println("Não foi possivel fazer a tranferência");
		}

	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("----------- CONTA ----------");
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumero());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
