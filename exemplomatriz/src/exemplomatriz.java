import java.util.*;
public class exemplomatriz {
	public static void main(String[] args) {
		int matrix[][]=new int[4][4],i,j;
		Scanner valor;
		valor=new Scanner(System.in);
		System.out.println("Digite os valores da matrix 4x4.");
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				System.out.println(i +"-"+ j);
				matrix[i][j]=valor.nextInt();
			}
		}
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				System.out.println(matrix[i][j]);
			}
		}
	}
}
