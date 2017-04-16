package contasBanco;

public class contasBanco {
	private int númeroConta;
	private  double saldoConta;
	
	public boolean númeroValido(int numeroConta){
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
	
	public boolean setNúmeroConta(int numeroConta){
		if(númeroValido(numeroConta)){
		this.númeroConta=numeroConta;
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
	/*public int getNúmeroConta(){
		return this.númeroConta;
	}
	
	public double getSaldoConta(){
		return this.saldoConta;
	}*/
	

}
