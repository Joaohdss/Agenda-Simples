package main.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.elementos.Contato;

public class ContatoTeste {
	Contato contato1;
	Contato contato2;
	Contato contato3;
	
	@Before
	public void setup() throws Exception {
		contato1 = new Contato("Joao", "Henrique", "(83) 9613-7813");
		contato2 = new Contato("Redson", "Farias", "(83) xxxx-xxxx");
		contato3 = new Contato("Geovana", "xxx", "(83) 8xxx-xxx");
		
	}
	@Test
	public void testGetNome() {
		assertEquals("Joao", contato1.getNome());
		assertEquals("Redson", contato2.getNome());
		assertEquals("Geovana", contato3.getNome());
		
	}
	@Test
	public void testGetSobrenome() {
		assertEquals("Henrique", contato1.getSobrenome());
		assertEquals("Farias", contato2.getSobrenome());
		assertEquals("xxx", contato3.getSobrenome());
		
	}
	@Test
	public void testGetTelefone() {
		assertEquals("(83) 9613-7813", contato1.getTelefone());
		assertEquals("(83) xxxx-xxxx", contato2.getTelefone());
		assertEquals("(83) 8xxx-xxx", contato3.getTelefone());
		
	}
	@Test
	public void testToString(){
		assertEquals(contato1.getNome() + " " + contato1.getSobrenome() + " - " + contato1.getTelefone(), contato1.toString());
	}

}
