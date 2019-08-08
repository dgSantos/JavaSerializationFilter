package br.com.onew.rmi;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNone() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
		
}