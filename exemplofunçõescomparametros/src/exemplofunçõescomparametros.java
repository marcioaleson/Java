import java.util.Scanner;
public class exemplofun��escomparametros {
	public static void main(String[] args) {
		int a,b;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		a=valor.nextInt();
		System.out.println("Digite o segundo n�mero:");
        b=valor.nextInt();
       calcularmedia(a,b);       
	}
	public static void calcularmedia(float n1,float n2){
		float media;
		media=(n1+n2)/2;
		System.out.println("Media:"+media);
	}
}
