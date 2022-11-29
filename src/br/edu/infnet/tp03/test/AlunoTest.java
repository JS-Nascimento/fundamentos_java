package br.edu.infnet.tp03.test;

import br.edu.infnet.tp03.domain.entities.Aluno;
import br.edu.infnet.tp03.domain.enums.Sexo;

public class AlunoTest {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(2, "Carlito Tavis", "444.666.777-88", Sexo.MASCULINO, "Desenvolvimento Java", true );
		
		System.out.println(aluno.toString());
		
		Aluno aluno2 = new Aluno(8011, "Monica Maravilhosa", "888.445.666-7", Sexo.FEMININO, "Orientação a Objeto e UML", false );
		
		System.out.println(aluno2.toString());
		

	}

}
