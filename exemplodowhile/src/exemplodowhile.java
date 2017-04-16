import java.util.*;
public class exemplodowhile {
	public static void main(String[] args) {
		int valor,quadrado;
		Scanner quantidade;
		quantidade=new Scanner(System.in);
		System.out.println("Digite um numero:");
		valor=quantidade.nextInt();
		quadrado=valor*valor;
		do{
			System.out.println("Os valores até o quandrado do\nnúmero são:"+valor);
			valor=valor+1;
		}while(valor<=quadrado);
	}

}
