package conta;

 class poupança extends abstractConta {

	poupança(String número) {
		super(número);
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
