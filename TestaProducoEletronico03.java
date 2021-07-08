package br.com.generation.classeobjeto;

public class TestaProducoEletronico03 {

	public static void main(String[] args) {
		
		//criar o objeto produto
		ProdutoEletronico03 produto =  new ProdutoEletronico03 (); 
		
		//Atribuir
		produto.tipo = "celular";
		produto.marca = "Samsung";
		produto.modelo = "S20 Plus";
		produto.capacidade = "512 Gigas";
		produto.tecnologia = "5G";
		
		//Ações que a  variável pode fazer?
		produto.conectarUsuários();
		produto.otimizarTempo();
		
		//Imprime 
		System.out.println("\n====Produto Eletrônico====");
		System.out.println("Tipo: " + produto.tipo);
		System.out.println("Marca: " + produto.marca);
		System.out.println("Modelo: " + produto.modelo);
		System.out.println("Capacidade: " + produto.capacidade);
		System.out.println("Tecnologia: " + produto.tecnologia);
		
		
		

	}

}
