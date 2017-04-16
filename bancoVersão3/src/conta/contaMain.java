package conta;

import java.io.IOException;

public class contaMain {
	public static void main(String[] args) throws IOException {
		listaDeConta lista=new listaDeConta();
		lista.setLista(100,1000);
		lista.setLista(101,1000);
		lista.setLista(102,1000);
		lista.getLista();

	}

}
