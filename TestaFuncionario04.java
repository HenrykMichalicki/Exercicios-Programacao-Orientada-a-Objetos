package br.com.generation.classeobjeto;

public class TestaFuncionario04 {

	public static void main(String[] args) {
		
		// criado o objeto funcionario
		Funcionario04 funcionario = new Funcionario04 ();
		
		funcionario.nome = "Henryk";
		funcionario.idade = 29;
		funcionario.cargo = "Dev Java Pleno";
		funcionario.salario = 4500;
		funcionario.tempoEmpresa = 2;
		funcionario.bonus = 0;
		
		//Ações que a  variável pode fazer?
		funcionario.bonus();
		
		//Imprimir
		System.out.println("\n====Dados do Funcionário====");
		System.out.println("Nome do funcionário: " + funcionario.nome);
		System.out.println("Idade: " + funcionario.idade);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Salário atual: " + funcionario.salario);
		System.out.println("Tempo de empresa: " + funcionario.tempoEmpresa + " anos");
		System.out.println("Bônus: " + funcionario.bonus);
	
		
		
		
		
		
		
		
		

	}

}
