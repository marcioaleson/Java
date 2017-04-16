package locadora;

class passeio extends locadora {
	
	private double valorSeguro;
	private double alugel;
	private int númeroDePassageiros;
	

	passeio(String marca, String modelo, String anoFabricação,
			double valorDiaria, double valorBem) {
		super(marca, modelo, anoFabricação, valorDiaria, valorBem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSeguro(double valorBem) {
		// TODO Auto-generated method stub
		this.valorSeguro=(valorBem*0.05)/365;
	}
	
	public double getSeguro(){
		return this.valorSeguro;
	}

	@Override
	public void alugelVeiculo(int quantidadeDias) {
		// TODO Auto-generated method stub
		this.alugel=(super.valorDiaria+this.valorSeguro)*quantidadeDias;
	}
	
	public double getAlugel() {
		return this.alugel;
	}
	
	
	public void depreciação(){
		super.valorBem-=valorBem*0.01;
	}

    public void almento(){
    	super.valorDiaria*=0.10;
    }

	public int getNúmeroDePassageiros() {
		return númeroDePassageiros;
	}

	public void setNúmeroDePassageiros(int númeroDePassageiros) {
		this.númeroDePassageiros = númeroDePassageiros;
	}

}
