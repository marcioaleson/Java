import java.util.Scanner;
public class exemplofun��oes {

	public static void main(String[] args) {
		soma();

	}
	public static void soma(){
		int a,b,soma;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o primerio n�mero:");
		a=valor.nextInt();
		System.out.println("Digite o segundo n�mero:");
		b=valor.nextInt();
		soma=a+b;
		System.out.println("A soma �:"+soma);
	}
}
