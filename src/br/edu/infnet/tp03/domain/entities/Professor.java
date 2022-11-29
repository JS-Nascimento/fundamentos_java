package br.edu.infnet.tp03.domain.entities;

import java.util.Objects;

import br.edu.infnet.tp03.domain.enums.Sexo;

public class Professor extends Pessoa {
	
	private String especialidade;
	private Double salario;
	



	public Professor(Integer id, String nome, String cpf, Sexo sexo, String especialidade, Double salario) {
		super(id, nome, cpf, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
		
	}
	
	

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	

	

	@Override
	public String toString() {
		return "Professor : " + getId() + " - " + getNome() + ","
				+ " CPF nº " + getCpf() + ", do sexo " + getSexo() + ",  Especialista em " + especialidade + " com o salário de R$ " + salario ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(especialidade);
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
		Professor other = (Professor) obj;
		return Objects.equals(especialidade, other.especialidade);
	}
	
	

}
