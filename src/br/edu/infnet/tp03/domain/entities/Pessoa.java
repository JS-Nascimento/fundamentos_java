package br.edu.infnet.tp03.domain.entities;

import java.util.Objects;


import br.edu.infnet.tp03.domain.enums.Sexo;
import br.edu.infnet.tp03.exceptions.InvalidSentenceException;

public abstract class Pessoa {

	private Integer id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private Sexo sexo;
	public Pessoa(Integer id, String nome, String cpf, Sexo sexo) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	public Pessoa() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws InvalidSentenceException {
		if(nome == null) {
			throw new  InvalidSentenceException("Preencha o nome corretamente.");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0 || posFinal < 0) {
			throw new InvalidSentenceException("Preencha o nome corretamente.");
		}

		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		
	}
	
	
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
}
