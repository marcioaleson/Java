package conta;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class contaEspecialTeste {

	@Test
	public void test() {
		contaEspecial conta = new contaEspecial();
		Assert.assertEquals(true, conta.testeNúmeroConta(100));
		Assert.assertEquals(false, conta.testeNúmeroConta(99));
		Assert.assertEquals(true, conta.deposito(1000));
		Assert.assertEquals(false, conta.deposito(-1));
		Assert.assertEquals(true, conta.bonus());
		Assert.assertEquals(true, conta.saque(1000));
		Assert.assertEquals(false, conta.saque(100));
		Assert.assertEquals(false, conta.bonus());
	}

}
