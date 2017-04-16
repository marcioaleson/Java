package locadora;

class moto extends locadora {
	private double valorSeguro;
	private double alugel;
	private int cilindradaMoto;

	moto(String marca, String modelo, String anoFabricação, double valorDiaria,
			double valorBem) {
		super(marca, modelo, anoFabricação, valorDiaria, valorBem);
		// TODO Auto-generated constructor stub
	}
	
	public void setCilindrada(int cilindrada){
		this.cilindradaMoto+=cilindrada;
	}

	@Override
	public void calcularSeguro(double valorBem) {
		// TODO Auto-generated method stub
		this.valorSeguro = (valorBem * 0.11) / 365;
	}

	public double getSeguro() {
		return this.valorSeguro;
	}

	@Override
	public void alugelVeiculo(int quantidadeDias) {
		// TODO Auto-generated method stub
		this.alugel = (super.valorDiaria + this.valorSeguro) * quantidadeDias;
	}

	public double getAlugel() {
		return this.alugel;
	}

	public void depreciação() {
		super.valorBem -= valorBem * 0.01;
	}

	void almento() {
		super.valorDiaria *= 0.10;
	}

	public int getCilindradaMoto() {
		return cilindradaMoto;
	}

	public void setCilindradaMoto(int cilindradaMoto) {
		this.cilindradaMoto = cilindradaMoto;
	}

}
