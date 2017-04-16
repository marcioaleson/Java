package conta;

public class contaSimples {
	protected int númeroConta;
	protected double saldo;

	public boolean testeNúmeroConta(int número) {
		if ((número >= 100) && (número <= 1000)) {
			this.númeroConta = número;
			return true;
		} else {
			return false;
		}
	}

	private boolean testeSaque(double valor) {
		if (this.saldo - valor < 0) {
			return false;
		} else {
			return true;
		}
	}

	private boolean testeDeposito(double valor) {
		if (valor >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deposito(double valor) {
		if (testeDeposito(valor) == true) {
			this.saldo = this.saldo + valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean saque(double valor) {
		if (testeSaque(valor) == true) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

}
