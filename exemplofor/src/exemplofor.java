import java.util.*;
public class exemplofor {
	public static void main(String[] args) {
	int idade;
	Scanner entrada;
	entrada=new Scanner(System.in);
	System.out.println("Digite a idade:");
	idade=entrada.nextInt();
	for(int i=idade+1;i<=18;i++){
		System.out.println("A idade no ano seguinte é:"+i);
		if(i==18){
			System.out.println("Maioridade!");
		}
	}
	}
}
