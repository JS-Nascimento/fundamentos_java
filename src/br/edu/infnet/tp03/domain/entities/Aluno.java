package br.edu.infnet.tp03.domain.entities;

import java.util.Objects;

import br.edu.infnet.tp03.domain.enums.Sexo;

public class Aluno extends Pessoa {

	private String disciplina;
	private Boolean monitor;
	public Aluno(Integer id, String nome, String cpf, Sexo sexo, String curso, Boolean monitor) {
		super(id, nome, cpf, sexo);
		this.disciplina = curso;
		this.monitor = monitor;
	}
	
	
	public Aluno() {
		
	}


	public String getCurso() {
		return disciplina;
	}
	public void setCurso(String curso) {
		this.disciplina = curso;
	}
	public Boolean getMonitor() {
		return monitor;
	}
	public void setMonitor(Boolean monitor) {
		this.monitor = monitor;
	}





	@Override
	public String toString() {

		String matricula, monitoria;

		StringBuilder sb = new StringBuilder();

		


			if(super.getSexo()== Sexo.FEMININO) {
				sb = sb.append("Aluna ");

				matricula = "matriculada";
				monitoria = " e ela ";

			}else {

				sb = sb.append("Aluno ");
				matricula = "matriculado";
				monitoria = " e ele ";

			}


			sb  = sb.append( getId() + " - " + getNome() + ", Cpf nº " + getCpf() + " do sexo " + getSexo() + ", está " + matricula +" na disciplina de " + disciplina + monitoria);

			if(this.monitor) {
				sb = sb.append("ainda é monitor da Classe.");

			}else {

				sb = sb.append("ainda não é monitor.");

			}


			return sb.toString();

		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(disciplina);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(disciplina, other.disciplina);
	}



}
