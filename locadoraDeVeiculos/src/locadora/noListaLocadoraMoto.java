package locadora;

public class noListaLocadoraMoto {
    moto infoM=new moto(null, null, null, 0,0);
	private noListaLocadoraMoto prox;

	public locadora getInfoM() {
		return this.infoM;
	}

	public void setInfoM(moto veiculo) {
		this.infoM = veiculo;
	}

	public noListaLocadoraMoto getProxM() {
		return this.prox;
	}

	public void setProxM(noListaLocadoraMoto prox) {
		this.prox = prox;
	}



}
