package br.com.generation.classeobjeto;

public class TestaPaciente07 {

	public static void main(String[] args) {

		Paciente07 paciente = new Paciente07 ();
		
		paciente.nome = "Felipe";
		paciente.idade = 31;
		paciente.convenio = "Amil400 QC";
		paciente.covid = "SIM";
		paciente.internacao = "URGENTE!!!";
		
		paciente.consulta();
		paciente.saude();
		paciente.vacina();
		
		System.out.println("\n====DADOS PACIENTE====");
		System.out.println("Nome: " + paciente.nome);
		System.out.println("Idade: " + paciente.idade + " anos");
		System.out.println("Convenio: " + paciente.convenio);
		System.out.println("COVID? STATUS ==> " + paciente.covid);
		System.out.println("Necessita de internação? " + paciente.internacao);
	}

}
