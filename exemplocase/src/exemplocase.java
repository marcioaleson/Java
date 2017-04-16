import java.util.*;
public class exemplocase {
	public static void main(String[] args) {
		int valor;
		boolean sair=true;
		Scanner opção;
		opção=new Scanner(System.in);
		while(sair){
		System.out.println("Digite uma opção entre 1 a 3?\nDigite 4 para sair!");
		valor=opção.nextInt();
		switch(valor){
		case 1:
			System.out.println("Você escolheu a opção 1!");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2!");
			break;
		case 3:
			System.out.println("Você escolheu a opção 3!");
			break;
		case 4:
			sair=false;
			break;
			default:
				System.out.println("Opção invalida!");
				break;
		}
    	}

	}}

