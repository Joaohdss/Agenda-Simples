package main.tela;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



import main.controller.AgendaController;


public class Menu {
	AgendaController agenda = new AgendaController();

	/**
	 * Menu do cadastro
	 */
	public String Cadastro() throws Exception {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nPosicao: ");
		int posicao = Integer.parseInt(input.readLine());
		System.out.print("Nome: ");
		String nome = input.readLine();
		System.out.print("Sobrenome: ");
		String sobrenome = input.readLine();
		System.out.print("Telefone: ");
		String telefone = input.readLine();
	
		if(agenda.adicionaContato(nome, sobrenome, telefone, posicao)){
			return "\nCADASTRO REALIZADO!\n";
		}
		return "\nCADASTRO INVALIDO! / POSIÇÃO INVÁLIDA!\n";
	}
	/**
	 * metodo criado para imprimi um contato pela posicao fornecida 
	 * chama um metodo da class ContatoController.
	 * 
	 */
	public String imprimiPorPosicao() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Contato> ");
		int posicao = input.nextInt();
		return (agenda.imprimiPorPosicao(posicao));
	}
	/**
	 * Metodo criado para imprimir todos da lista 
	 * mantendo a ondem
	 * Chama um metodo da class ContatoController
	 */
	public String imprimiAgenda() {
		return agenda.imprimiListaDeContato();
	}

}
