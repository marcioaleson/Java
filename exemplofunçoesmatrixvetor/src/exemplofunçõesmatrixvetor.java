import java.util.Scanner;
public class exemplofunçõesmatrixvetor {
	public static void main(String[] args) {
		int i,j;
		float matrix[][],vetor[];
		matrix=new float[2][2];
		vetor=new float[2];
		Scanner valor;
		valor=new Scanner(System.in);
		for(i=0;i<2;i++){
			vetor[i]=0;
			for(j=0;j<2;j++){
				System.out.println("Digite o elemento "+i+"-"+j+":");
				matrix[i][j]=valor.nextFloat();
			}
		}
			somalinhas(matrix,vetor);
			for(i=0;i<2;i++){
				System.out.println("Soma da linha "+i+"="+vetor[i]);
			}
		}
	
		public static void somalinhas(float m[][] , float v[]){
			int i1,j1;
			for(i1=0;i1<2;i1++){
				for(j1=0;j1<2;j1++){
					v[i1]=v[i1]+m[i1][j1];
				}
			}
		}
}
			
		

	
