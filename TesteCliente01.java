package br.com.generation.classeobjeto;


public class TesteCliente01 {

	public static void main(String[] args) {
	
	//  cria��o do Objeto
	Cliente01 Cliente02 = new Cliente01();
	
	// adiciona valores aos atributos/caracter�sticas da vari�vel	
	Cliente02.nome = "Dalva Straus";
	Cliente02.numPassaporte = "DS785965";
	Cliente02.idade = 82;
	Cliente02.Nacionalidade = "Polonesa";
	
	//A��es que a  vari�vel pode fazer?
	Cliente02.comprarPassagem();
	Cliente02.obterVisto();
	Cliente02.tomarCafe();
	
	//Imprime 
	System.out.println("Nome do cliente: " + Cliente02.nome);
	System.out.println("Npumero do passaporte: " + Cliente02.numPassaporte);
	System.out.println("Idade: " + Cliente02.idade);
	System.out.println("Nacionalidade: " + Cliente02.Nacionalidade);
	
	}

}
