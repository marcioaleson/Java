package conta;

public class conta {
	private int n�meroDaConta;
	private double saldoConta;

	private boolean testeN�meroDaConta(int n�mero) {
		if (n�mero >= 100 && (n�mero <= 1000)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean n�meroConta(int n�mero) {
		if (testeN�meroDaConta(n�mero)) {
			this.n�meroDaConta = n�mero;
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

	public int getN�meroConta() {
		return this.n�meroDaConta;
	}

	public double getSaldo() {
		return this.saldoConta;
	}

}
