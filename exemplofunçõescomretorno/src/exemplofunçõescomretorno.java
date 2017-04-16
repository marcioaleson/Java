import java.util.Scanner;
public class exemplofunçõescomretorno {
	public static void main(String[] args) {
		float resposta;
		resposta=multiplicação();
		System.out.println("O produto é "+resposta);
	}
	public static float multiplicação(){
		float multiplicando,multiplicador,produto;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite o multiplicando:");
		multiplicando=valor.nextFloat();
		System.out.println("Digite o multiplicador:");
		multiplicador=valor.nextFloat();
		produto=multiplicando*multiplicador;
		return produto;
	}

}
