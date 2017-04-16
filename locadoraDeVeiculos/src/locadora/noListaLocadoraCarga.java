package locadora;

public class noListaLocadoraCarga {

   carga infoC=new carga(null, null, null, 0,0);
	private noListaLocadoraCarga prox;

	public locadora getInfoC() {
		return this.infoC;
	}

	public void setInfoC(carga veiculo) {
		this.infoC = veiculo;
	}

	public noListaLocadoraCarga getProxC() {
		return this.prox;
	}

	public void setProxC(noListaLocadoraCarga prox) {
		this.prox = prox;
	}
}