package main.tela;

import java.util.Scanner;
/**
 * 
 * @author joao.soares
 * Matricula : 116110572
 * Disciplina: Laboratorio de Programacao 2 
 * Lab02 - 2017.1
 */
public class Tela {
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Menu menu = new Menu();
		
		while (true) {
			
			System.out.println("\n(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air");
			System.out.print("\nOpcao> ");
			
			String entrada = input.nextLine();
			if(entrada.equalsIgnoreCase("s")){
				break;
			}else if(entrada.equalsIgnoreCase("c")){
				System.out.print(menu.Cadastro());		
			}else if(entrada.equalsIgnoreCase("l")){
				System.out.println(menu.imprimiAgenda());
			}else if(entrada.equalsIgnoreCase("e")){
				System.out.println(menu.imprimiPorPosicao());
			}else{
				System.out.print("OPCAO INVALIDA!\n \n");
			}
			
		}
	}
}
