package conta;

public abstract class abstractConta {
protected String número;
protected double saldo;


void setDeposito(double valor){
	this.saldo=valor;
}

double getSaldo(){
return this.saldo;
}

abstract void debito(double valor);


 abstractConta(String número){
	this.número=número;
	this.saldo=0;
}
}


