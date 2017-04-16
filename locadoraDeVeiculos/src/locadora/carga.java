package locadora;

class carga extends locadora {

	private double valorSeguro;
	private double alugel;
	private int capacidadeDeCarga;

	carga(String marca, String modelo, String anoFabrica��o,
			double valorDiaria, double valorBem) {
		super(marca, modelo, anoFabrica��o, valorDiaria, valorBem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSeguro(double valorBem) {
		// TODO Auto-generated method stub
		this.valorSeguro = (valorBem * 0.08) / 365;
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

	public void deprecia��o() {
		super.valorBem -= valorBem * 0.01;
	}

	public void almento() {
		super.valorDiaria *= 0.10;
	}
	
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

}
