package contasBanco;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class contasBancoTeste {

	@Test
	public void test() {
		contasBanco conta=new contasBanco();
		Assert.assertEquals(false,conta.setNúmeroConta(99));
		Assert.assertEquals(true,conta.setNúmeroConta(100));
		Assert.assertEquals(false,conta.setSaldoConta(999));
		Assert.assertEquals(true,conta.setSaldoConta(1000));

		
	}

}
