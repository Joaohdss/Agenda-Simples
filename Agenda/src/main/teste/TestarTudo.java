package main.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Testa Todos os testes de uma vez 
 * 
 * @author joao.soares
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AgendaControllerTeste.class, ContatoTeste.class })
public class TestarTudo {

}
