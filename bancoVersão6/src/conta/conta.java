package conta;

 class conta extends abstractConta{

	conta(String número) {
		super(número);
		super.saldo=0;
		// TODO Auto-generated constructor stub
	}

	@Override
	void debito(double valor) {
		super.saldo=super.saldo-valor;		
	}



}
