package conta;

import java.io.IOException;

public class listaDeConta {

private static class lista{
	private double saldoConta;
	private int númeroConta;
	lista prox;
}

lista inicio=null;
lista fim=null;
lista anterior=null;
lista aux;

public boolean setLista(int número,double saldo){
if((número>=100 && número<=1000) && (saldo>=1000)){
	lista novo=new lista();
	novo.númeroConta=número;
	novo.saldoConta=saldo;
	inicio=novo;
	fim=inicio;
	novo.prox=null;
	return true;
}
else{
	return false;
}
}

public boolean removeLista(int número){
	if(inicio==null){
		return false;
	}
	else{
	aux=inicio;
	while(aux!=null){
		if(aux.númeroConta==número){
		  if(inicio==aux){
			inicio=aux.prox;
			aux=inicio;
		  }else if(aux==fim){
			  anterior.prox=null;
			  fim=anterior;
			  aux=null;
		  }
		  else{
			  anterior.prox=aux.prox;
			  aux=aux.prox;
		  }
	}
	}
	return true;
}}

 void getLista() throws IOException{
	if(inicio==null){
		System.out.println("Lista está vazia.");
	}
	else{
		aux=inicio;
		while(aux!=null){
			System.out.println("Número:"+aux.númeroConta+"Saldo:"+aux.saldoConta);
			System.in.read();
			aux=aux.prox;
		}
		
		
	}
}

}






