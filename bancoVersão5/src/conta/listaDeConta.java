package conta;

public class listaDeConta {
	conta conta = new conta();
	listaDeConta prox;

	public listaDeConta getProximo() {
		return this.prox;
	}

	public listaDeConta setProximo(listaDeConta proximo) {
		return this.prox = proximo;
	}

	public conta getConta() {
		return this.conta;
	}

	public conta setConta(conta conta) {
		return this.conta = conta;
	}

	public boolean adicionarLista(listaDeConta lista, int número, double valor) {
		listaDeConta temp = new listaDeConta();
		conta conta = new conta();
		if (conta.númeroConta(número) == true
				&& conta.depositoConta(valor) == true) {
			temp.setConta(conta);
			temp.setProximo(lista.getProximo());
			lista.setProximo(temp);
			return true;
		} else {
			return false;
		}

	}

	public boolean imprimirLista(listaDeConta lista) {
		listaDeConta temp = new listaDeConta();
		if (lista != null) {
			temp = lista.getProximo();
			while (temp != null) {
				System.out.println("Número:" + temp.conta.getNúmeroConta()
						+ "\n" + temp.conta.getSaldo());
				temp = temp.getProximo();
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean remoçãoLista(listaDeConta lista) {
		listaDeConta temp = new listaDeConta();
		if (lista != null) {
			temp = lista.getProximo();
			lista.setProximo(temp.getProximo());
			temp = null;
			return true;
		} else {
			return false;
		}

	}

}