package conta;

import java.io.IOException;

public class listaDeConta {

private static class lista{
	private double saldoConta;
	private int n�meroConta;
	lista prox;
}

lista inicio=null;
lista fim=null;
lista anterior=null;
lista aux;

public boolean setLista(int n�mero,double saldo){
if((n�mero>=100 && n�mero<=1000) && (saldo>=1000)){
	lista novo=new lista();
	novo.n�meroConta=n�mero;
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

public boolean removeLista(int n�mero){
	if(inicio==null){
		return false;
	}
	else{
	aux=inicio;
	while(aux!=null){
		if(aux.n�meroConta==n�mero){
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
		System.out.println("Lista est� vazia.");
	}
	else{
		aux=inicio;
		while(aux!=null){
			System.out.println("N�mero:"+aux.n�meroConta+"Saldo:"+aux.saldoConta);
			System.in.read();
			aux=aux.prox;
		}
		
		
	}
}

}






