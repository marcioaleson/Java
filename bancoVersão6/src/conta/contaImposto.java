package conta;

 class contaImposto extends abstractConta {

	contaImposto(String número) {
		super(número);
		super.saldo=0;
	}

	@Override
	void debito(double valor) {
	saldo=saldo-(saldo*valor);	
	}
}
