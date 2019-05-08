package main.elementos;

import main.exception.ElementoInvalido;
import main.exception.NumeroInvalido;

/**
 * 
 * @author joao.soares
 * Matricula : 116110572
 * Disciplina: Laboratorio de Programacao 2 
 * Lab02 - 2017.1
 */
public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;
	/**
	 * 
	 * @param nome - nome do contato
	 * @param sobrenome - sobrenome do contato
	 * @param telefone - telefone do contato
	 */
	public Contato(String nome, String sobrenome, String telefone)
			throws Exception {
		if (nome.trim().equals("") || nome == null) {
			throw new ElementoInvalido("Nome invalido (vazio ou null)");
		}
		if (sobrenome.trim().equals("") || sobrenome == null) {
			throw new ElementoInvalido("Sobrenome invalido (vazio ou null)");
		}
		if (telefone.trim().equals("") || telefone == null) {
			throw new NumeroInvalido("Numero do telefone invalido (vazio ou null)");
		}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}


	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}

}
