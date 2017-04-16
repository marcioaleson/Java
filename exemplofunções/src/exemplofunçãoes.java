import java.util.Scanner;
public class exemplofunçãoes {

	public static void main(String[] args) {
		soma();

	}
	public static void soma(){
		int a,b,soma;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o primerio número:");
		a=valor.nextInt();
		System.out.println("Digite o segundo número:");
		b=valor.nextInt();
		soma=a+b;
		System.out.println("A soma é:"+soma);
	}
}
