import java.util.*;
public class exemplocase {
	public static void main(String[] args) {
		int valor;
		boolean sair=true;
		Scanner op��o;
		op��o=new Scanner(System.in);
		while(sair){
		System.out.println("Digite uma op��o entre 1 a 3?\nDigite 4 para sair!");
		valor=op��o.nextInt();
		switch(valor){
		case 1:
			System.out.println("Voc� escolheu a op��o 1!");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o 2!");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o 3!");
			break;
		case 4:
			sair=false;
			break;
			default:
				System.out.println("Op��o invalida!");
				break;
		}
    	}

	}}

