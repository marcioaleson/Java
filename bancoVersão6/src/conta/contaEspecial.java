package conta;

class contaEspecial extends abstractConta {

	private double bonus;
	
	contaEspecial(String n�mero) {
		super(n�mero);
		super.saldo=0;
	}

	@Override
	void debito(double valor) {
	this.bonus=bonus*valor;
	}


}
