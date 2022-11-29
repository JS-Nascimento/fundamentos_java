package br.edu.infnet.tp03.test;

import br.edu.infnet.tp03.domain.entities.Professor;
import br.edu.infnet.tp03.domain.enums.Sexo;

public class ProfessorTest  {

	public static void main(String[] args) {

		Professor professor = new Professor(1, "Juracy Peixoto", "111.333.444-55", Sexo.MASCULINO, "Java", 10000.00 );
		
		System.out.println(professor.toString());

	}

}
