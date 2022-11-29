package br.edu.infnet.tp03.exceptions;

public class InvalidSentenceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidSentenceException(String message) {
		super(message);
	}

}
