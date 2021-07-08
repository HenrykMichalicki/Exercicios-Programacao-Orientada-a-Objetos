package br.com.generation.classeobjeto;

public class TesteAviao02 {

	public static void main(String[] args) {
		
		Aviao02 aviao1 = new Aviao02(); 
		
		aviao1.tipoAeronave = "Boeing 787";
		aviao1.numAeronave = 735;
		aviao1.rota = "Internacional";
		aviao1.tipoClasse = "Primeira Classe";
		
		aviao1.voar();
		aviao1.pousar();
		
		System.out.println("====Dados do Avião====");
		System.out.println("Tipo de Aeronave: " + aviao1.tipoAeronave);
		System.out.println("Número da Aeronave: " + aviao1.numAeronave);
		System.out.println("Rota: " + aviao1.rota);
		System.out.println("Tipo da classe: " + aviao1.tipoClasse);
		
	}

}
