package br.com.generation.classeobjeto;



public class TestaPatinete05 {

	public static void main(String[] args) {
		
		Patinete05 patinete = new Patinete05();
		
			patinete.tipo = "Adulto";
			patinete.marca = "Caloi";
			patinete.modelo = "A53F";
			patinete.anoFabricacao = 2018;
			patinete.motorizado = "Sim";
			
			
			patinete.brincar();
			patinete.percorrerEspacos();
			
			System.out.println("\n====DADOS PATINETE====");
			System.out.println("Tipo: " + patinete.tipo);
			System.out.println("Marca: " + patinete.marca);
			System.out.println("Modelo: " + patinete.modelo);
			System.out.println("Capacidade: " + patinete.anoFabricacao);
			System.out.println("Motorizado: " + patinete.motorizado);
			
			
		
		

	}

}
