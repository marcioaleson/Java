package contasBanco;

public class contasBanco {
	private int n�meroConta;
	private  double saldoConta;
	
	public boolean n�meroValido(int numeroConta){
		if(numeroConta<100 || numeroConta>1000){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean saldoValido(double saldoConta){
		if(saldoConta<1000){
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean setN�meroConta(int numeroConta){
		if(n�meroValido(numeroConta)){
		this.n�meroConta=numeroConta;
		return true;
		}else{
			return false;
		}
	}
	public boolean setSaldoConta(double saldoConta){
		if(saldoValido(saldoConta)){
		this.saldoConta=saldoConta;
		return true;
	 }else{
		 return false;
	 }
	}
	/*public int getN�meroConta(){
		return this.n�meroConta;
	}
	
	public double getSaldoConta(){
		return this.saldoConta;
	}*/
	

}
