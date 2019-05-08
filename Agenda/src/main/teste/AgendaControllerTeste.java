package main.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.controller.AgendaController;
import main.elementos.Contato;
import main.exception.ElementoInvalido;
import main.exception.NumeroInvalido;

public class AgendaControllerTeste {
	Contato contato1;
	Contato contato2;
	Contato contato3;
	AgendaController agenda;

	@Before
	public void setup() throws Exception {
		contato1 = new Contato("Joao", "Henrique", "(83) 9613-7813");
		contato2 = new Contato("Redson", "Farias", "(83) xxxx-xxxx");
		contato3 = new Contato("Geovana", "xxx", "(83) 8xxx-xxx");
		agenda = new AgendaController();
	}

	/**
	 * Testa o metodo AdicionaContato
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdicionaContato() throws Exception {
		try {
			agenda.adicionaContato(" ", "Henrique", "(83) 9613-7813", 1);
			fail("Nome invalido (vazio ou null)");
		} catch (ElementoInvalido e) {
			assertEquals("Nome invalido (vazio ou null)", e.getMessage());
		}
		try {
			agenda.adicionaContato("Joao", "", "(83) 9613-7813", 1);
			fail("Sobrenome invalido (vazio ou null)");
		} catch (ElementoInvalido e) {
			assertEquals("Sobrenome invalido (vazio ou null)", e.getMessage());

		}
		try {
			agenda.adicionaContato("Joao", "Henrique", "         ", 1);
			fail("Numero do telefone invalido (vazio ou null)");
		} catch (NumeroInvalido e) {
			assertEquals("Numero do telefone invalido (vazio ou null)", e.getMessage());

		}
		assertTrue(agenda.adicionaContato("Joao", "Henrique", "(83) 9613-7813",1));
		assertFalse(agenda.adicionaContato("Redson", "Farias","(83) xxxx-xxxx", 101));
		assertFalse(agenda.adicionaContato("Geovana", "xxx", "(83) 8xxx-xxx", 0));
		assertTrue(agenda.adicionaContato("Geovana", "xxx", "(83) 8xxx-xxx",100));

	}

	/**
	 * Testa o metodo ImprimiListaDeContato
	 * 
	 * @throws Exception
	 */
	@Test
	public void testImprimiListaDeContato() throws Exception {
		agenda.adicionaContato("Joao", "Henrique", "(83) 9613-7813", 1);
		assertEquals("1 - Joao Henrique\n", agenda.imprimiListaDeContato());
		agenda.adicionaContato("Redson", "Farias", "(83) xxxx-xxxx", 2);
		assertEquals("1 - Joao Henrique\n2 - Redson Farias\n",agenda.imprimiListaDeContato());
		agenda.adicionaContato("Geovana", "xxx", "(83) 8xxx-xxx", 100);
		assertEquals("1 - Joao Henrique\n2 - Redson Farias\n100 - Geovana xxx\n",agenda.imprimiListaDeContato());
		agenda.adicionaContato("Geovana", "xxx", "(83) 8xxx-xxx", 1000);
		assertEquals("1 - Joao Henrique\n2 - Redson Farias\n100 - Geovana xxx\n",agenda.imprimiListaDeContato());

	}

	/**
	 * Testa o metodo ImprimiPorPosicao
	 * 
	 * @throws Exception
	 */
	@Test
	public void testImprimiPorPosicao() throws Exception {
		agenda.adicionaContato("Joao", "Henrique", "(83) 9613-7813", 5);
		agenda.adicionaContato("Redson", "Farias", "(83) xxxx-xxxx", 1);
		agenda.adicionaContato("Redson", "Farias", "(83) xxxx-xxxx", 3);
		assertEquals("POSIÇÃO INVÁLIDA!", agenda.imprimiPorPosicao(0));
		assertEquals("POSIÇÃO INVÁLIDA!", agenda.imprimiPorPosicao(101));
		assertEquals("" + contato2, agenda.imprimiPorPosicao(1));
		assertEquals("" + contato2, agenda.imprimiPorPosicao(3));
		assertEquals("" + contato1, agenda.imprimiPorPosicao(5));
	}

}
