import java.util.Scanner;
public class exemplofun��escomparametroecomretorno {
	public static void main(String[] args) {
		float a,b,resposta;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o valor do dividendo:");
		a=valor.nextFloat();
		System.out.println("Digite o valor do divisor:");
		b=valor.nextFloat();
		resposta=divis�o(a,b);
		System.out.println("O resultado da divis�o � "+resposta);
	}
	public static float divis�o(float n1,float n2){
		float resposta;
		resposta=n1/n2;
		return resposta;
	}

}
