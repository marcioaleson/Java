package conta;

 class contaImposto extends abstractConta {

	contaImposto(String n�mero) {
		super(n�mero);
		super.saldo=0;
	}

	@Override
	void debito(double valor) {
	saldo=saldo-(saldo*valor);	
	}
}
