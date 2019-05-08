package main.controller;
import main.elementos.Contato;

public class AgendaController {
	Contato[] arrayAgenda;

	public AgendaController() {
		this.arrayAgenda = new Contato[100];

	}
	/**
	 * Metodo criado para adicionar contado em um array
	 * return true se a posicao for menor que 100 e maior ou igual a 0(zero).
	 * @param nome - nome do contato
	 * @param sobrenome - sobrenome do contato
	 * @param telefone - telefone do contato
	 * @param posicao - posicao do elemento no Array
	 * @throws Exception 
	 */
	public boolean adicionaContato(String nome,String sobrenome,String telefone,int posicao) throws Exception{
		Contato contato = new Contato(nome, sobrenome, telefone);
		if(posicao <= 100 && posicao > 0){
			arrayAgenda[posicao-1] = contato;
			return true;
		}
		return false;
		
	}
	/**
	 * Metodo criado para imprimir a lista completa 
	 * de contatos cadastrados de acordo com sua posicao
	 */
	public String imprimiListaDeContato(){
		String contatoDaAgenda = "";
		for (int i = 0; i < arrayAgenda.length; i++) {
			if(arrayAgenda[i] != null){
				contatoDaAgenda += ((i+ 1) +" - " + arrayAgenda[i].getNome() + " " + arrayAgenda[i].getSobrenome()+"\n");
			}
		}
		return contatoDaAgenda;
	}
	/**
	 * metodo feito para imprimir lista de acordo com o sua posicao
	 * retorna true se a posicao for valida
	 */
	public String imprimiPorPosicao(int posicao){
		
		String contatoDaAgenda = "POSIÇÃO INVÁLIDA!";
		if(posicao <= 100 && posicao > 0){
			return contatoDaAgenda =""+ arrayAgenda[posicao-1];
		}
		return contatoDaAgenda;

	}
	

}
