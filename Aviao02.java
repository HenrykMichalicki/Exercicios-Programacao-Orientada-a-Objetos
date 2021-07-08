package br.com.generation.classeobjeto;

// Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
// em seguida crie um objeto avião, defina as instancias deste objeto
// e apresente as informações deste objeto no console.

public class Aviao02 {
	
	String tipoAeronave;
	String tipoClasse;
	String rota;
	int numAeronave;
	
	void voar () { // especifica a ação
		System.out.println("Aeronave decolando...");
	}
	
	void pousar () {
		System.out.println("Aeronave pousando...");
	}
	
}
