package br.com.generation.classeobjeto;

public class Funcionario04 {
	
	//Atributos
	
	String nome;
	int idade;
	String cargo;
	double salario;
	double tempoEmpresa;
	double bonus;
	
	//m�todo para dar aumento
	void bonus () {
		bonus = salario * (tempoEmpresa / 10);
		salario = salario + bonus;
	}
	

}
