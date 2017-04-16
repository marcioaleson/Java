package conta;

class contaEspecial extends contaSimples {
	private double taxa = 0.05;
	private double bonus;

	private boolean testeBonus() {
		if (super.saldo != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean bonus() {
		if (testeBonus() == true) {
			this.bonus = super.saldo * taxa;
			return true;
		} else {
			return false;
		}
	}
}
