package conta;

 class conta extends abstractConta{

	conta(String n�mero) {
		super(n�mero);
		super.saldo=0;
		// TODO Auto-generated constructor stub
	}

	@Override
	void debito(double valor) {
		super.saldo=super.saldo-valor;		
	}



}
