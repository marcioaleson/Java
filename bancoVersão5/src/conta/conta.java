package conta;

public class conta {
	private int númeroDaConta;
	private double saldoConta;

	private boolean testeNúmeroDaConta(int número) {
		if (número >= 100 && (número <= 1000)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean númeroConta(int número) {
		if (testeNúmeroDaConta(número)) {
			this.númeroDaConta = número;
			return true;
		} else {
			return false;
		}
	}

	private boolean testeDeposito(double valor) {
		if (valor < 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean depositoConta(double valor) {
		if (testeDeposito(valor)) {
			this.saldoConta = valor;
			return true;
		} else {
			return false;
		}
	}

	private boolean testeSaque(double valor) {
		if (this.saldoConta - valor < 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean saqueConta(double valor) {
		if (testeSaque(valor)) {
			this.saldoConta -= valor;
			return true;
		} else {
			return false;
		}

	}

	public int getNúmeroConta() {
		return this.númeroDaConta;
	}

	public double getSaldo() {
		return this.saldoConta;
	}

}
