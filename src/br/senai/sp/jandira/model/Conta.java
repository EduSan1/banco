package br.senai.sp.jandira.model;

public class Conta {

	private String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;

	public Conta(String numero, String tipo) {
		
		this.numero = numero;
		this.tipo = tipo;
		
	}

	public void depositar(double valorDeposito) {

		if (valorDeposito <= 0) {

			System.out.println(
					"\nPara depositar você deve colocar um valor maior do que zero. " + 
			"\nPor favor digite novamente");

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
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
