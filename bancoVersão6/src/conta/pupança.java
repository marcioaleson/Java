package conta;

 class poupan�a extends abstractConta {

	poupan�a(String n�mero) {
		super(n�mero);
		super.saldo=0;
		// TODO Auto-generated constructor stub
	}

	@Override
	void debito(double valor) {
		super.saldo=super.saldo-valor;		
	}
	
	void juros(double taxa){
		this.debito(this.saldo*taxa);
	}



}
