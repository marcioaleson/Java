import java.util.Scanner;
public class exemplofun��escomretorno {
	public static void main(String[] args) {
		float resposta;
		resposta=multiplica��o();
		System.out.println("O produto � "+resposta);
	}
	public static float multiplica��o(){
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
