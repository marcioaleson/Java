package conta;

public abstract class abstractConta {
protected String n�mero;
protected double saldo;


void setDeposito(double valor){
	this.saldo=valor;
}

double getSaldo(){
return this.saldo;
}

abstract void debito(double valor);


 abstractConta(String n�mero){
	this.n�mero=n�mero;
	this.saldo=0;
}
}


