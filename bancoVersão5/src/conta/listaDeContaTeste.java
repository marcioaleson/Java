package conta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class listaDeContaTeste {
	@Test
	public void testGetProximo() {
		listaDeConta lista = new listaDeConta();
		assertEquals(null, lista.getProximo());
	}

	@Test
	public void testSetProximo() {
		listaDeConta lista = new listaDeConta();
		Assert.assertEquals(lista, lista.setProximo(lista));
	}

	@Test
	public void testGetConta() {
		listaDeConta lista = new listaDeConta();
		conta conta = new conta();
		lista.setConta(conta);
		Assert.assertEquals(conta, lista.getConta());
	}

	@Test
	public void testSetConta() {
		listaDeConta lista = new listaDeConta();
		conta conta = new conta();
		lista.setConta(conta);
		Assert.assertEquals(conta, lista.setConta(conta));
	}

	@Test
	public void testAdicionarLista() {
		listaDeConta lista = new listaDeConta();
		Assert.assertEquals(true, lista.adicionarLista(lista, 100, 1000));
		Assert.assertEquals(false, lista.adicionarLista(lista, 99, 1000));
		Assert.assertEquals(false, lista.adicionarLista(lista, 100, -1));
	}

	@Test
	public void testImprimirLista() {
		listaDeConta list = new listaDeConta();
		Assert.assertEquals(true, list.imprimirLista(list));
		list.adicionarLista(list, 100, 1000);
		Assert.assertEquals(true, list.imprimirLista(list));
	}

	@Test
	public void testRemoçãoLista() {
		listaDeConta listaRemoção = new listaDeConta();
		listaRemoção.adicionarLista(listaRemoção, 100, 1000);
		Assert.assertEquals(true, listaRemoção.remoçãoLista(listaRemoção));
		Assert.assertEquals(true, listaRemoção.remoçãoLista(listaRemoção));

	}

}
