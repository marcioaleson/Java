import java.util.Scanner;
public class exemplofunçõescomparametroecomretorno {
	public static void main(String[] args) {
		float a,b,resposta;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o valor do dividendo:");
		a=valor.nextFloat();
		System.out.println("Digite o valor do divisor:");
		b=valor.nextFloat();
		resposta=divisão(a,b);
		System.out.println("O resultado da divisão é "+resposta);
	}
	public static float divisão(float n1,float n2){
		float resposta;
		resposta=n1/n2;
		return resposta;
	}

}
