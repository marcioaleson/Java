import java.io.IOException;

public class exemploregistrocommatrizes {
	public static void main(String[] args)throws IOException {
		produto p[][]=new produto[2][3];
        int i,j;
        for(i=0;i<2;i++){
        	for(j=0;j<3;j++){
        		p[i][j]=new produto();
        		p[i][j].setnum((i+1)*(j+1));
        		p[i][j].setnome("Produto "+i+"-"+j);
        		p[i][j].setpre�o((i+1)*(j+1));
        	}
        }
        
        for(i=0;i<2;i++){
        	for(j=0;j<3;j++){
        		System.out.println("C�digo="+p[i][j].getnum());
        		System.out.println("Descri��o="+p[i][j].getnome());
        		System.out.println("Pre�o="+p[i][j].getpre�o());
        		System.in.read();

        	}
        }
        
	}

	
	
}
