package br.com.generation.classeobjeto;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria06 conta =  new ContaBancaria06 ();
		
		conta.nome = "Haddad";
		conta.tipo = "Conta Digital";
		conta.nomeBanco = "Nubank";
		conta.CartaoCredito = "Sim!";
		conta.tipoCartaoCredito = "Ultravioleta";
		conta.status = "credor";
		conta.limite = 5000.00;
		
		conta.totalCompras();
		conta.verSaldo();
		
		System.out.println("\n====DADOS CLIENTE====");
		System.out.println("Nome: " + conta.nome);
		System.out.println("Tipo: " + conta.tipo);
		System.out.println("Nome do Banco: " + conta.nomeBanco);
		System.out.println("Cart�o de Cr�dito pr� - aprovado: " + conta.CartaoCredito + " PARAB�NS!!! ");
		System.out.println("Tipo de cart�o aprovado: " + conta.tipoCartaoCredito);
		System.out.println("Status da conta: " + conta.status);
		System.out.println("Valor do limite dispon�vel: R$" + conta.limite);
		

	}

}
