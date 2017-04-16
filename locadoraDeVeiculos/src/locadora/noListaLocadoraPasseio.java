package locadora;

public class noListaLocadoraPasseio {
		passeio infoP=new passeio(null, null, null, 0, 0);
		private noListaLocadoraPasseio prox;

		public locadora getInfoP() {
			return this.infoP;
		}

		public void setInfoP(passeio veiculo) {
			this.infoP = veiculo;
		}

		public noListaLocadoraPasseio getProxP() {
			return this.prox;
		}

		public void setProxP(noListaLocadoraPasseio prox) {
			this.prox = prox;
		}

}
