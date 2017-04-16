import java.io.*;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class exemploarquivo {
	public static void main(String[] args)throws IOException{
		File arq=new File("C:\\Users\\win7\\Documents\\Eclipse projetos\\exemploarquivo\\texto.txt");
        if(arq.exists()){
        	System.out.println("Arquivo existemete!");
        	System.in.read();
        }
        else{
        	System.out.println("Arquivo n�o existemte!");
        	System.in.read();
        }
        if(arq.isDirectory()){
        	System.out.println("O arquivo � um diret�rio");
        	System.in.read();
        }
        else{
        	System.out.println("O arquivo n�o � um diret�rio");
        	System.in.read();
        }
        if(arq.isFile()){
        	System.out.println("O arquivo faz refer�ncia a um arquivo");
        	System.in.read();
        }
        else{
        	System.out.println("O arquivo n�o faz refer�ncia a um arquivo");
        	System.in.read();
        }
        if(arq.canWrite()){
        	System.out.println("O arquivo pode ser lido.");
        	System.in.read();
        }
        else{
        	System.out.println("O arquivo n�o pode ser lido.");
        	System.in.read();
        }
        File arq2=new File("exemplo");
        if(arq2.mkdir()){
        	System.out.println("Diret�rio criado com sucesso.");
        	System.in.read();
        }
        else{
        	System.out.println("Diret�rio n�o foi criado.");
        	System.in.read();
        }
        File arq3=new File("C:\\Users\\win7\\Documents\\Eclipse projetos\\exemploarquivo\\exemplo1\\exemplo2\\.exemplo3");
        if(arq3.mkdirs()){
        	System.out.println("Diret�rio criado com sucesso.");
        	System.in.read();
        }
        else{
        	System.out.println("Diret�rio n�o foi criado.");
        	System.in.read();
        }
        File arq4=new File("C:\\Users\\win7\\Documents\\Eclipse projetos\\exemploarquivo\\texto2.txt");
        if(arq4.renameTo(arq4)){
        	System.out.println("O arquivo foi renomeado.");
        	System.in.read();
        }
        else{
        	System.out.println("O arquivo n�o pode ser renomeado.");
        	System.in.read();
        }
        long tamanho;
        tamanho=arq.length();
        System.out.println("O tamanho do arquivo � "+tamanho);
        System.in.read();
        long atualiza��o;
        atualiza��o=arq.lastModified();
        System.out.println("O arquivo foi modificado em "+atualiza��o);
        System.in.read();
        if(arq4.delete()){
        	System.out.println("Arquivo deletado com sucesso.");
        	System.in.read();
        }
        else{
        	System.out.println("Arquivo n�o foi deletado.");
        	System.in.read();
        }
        char teste='x';
        File arq5=new File("C:\\Users\\win7\\Documents\\Eclipse projetos\\exemploarquivo\\dados.txt");
        FileWriter escritor=new FileWriter (arq5,true);
        escritor.write(teste);
        System.in.read();
        escritor.append(teste);
        System.in.read();
        String cadeia;
        cadeia="Exemplo de grava��o.";
        escritor.write(cadeia);
        System.in.read();
        escritor.close();
        char c;
        FileReader leitor=new FileReader("C:\\Users\\win7\\Documents\\Eclipse projetos\\exemploarquivo\\dados.txt");
        c=(char)leitor.read();
        System.out.println("O caracter lido no arquivo � "+c);
        System.in.read();
        char cad[]=new char[30];
        int t=leitor.read(cad);
        for(int i=0;i<t;i++){
        System.out.println("os cacacteres s�o "+cad[i]);
}

        leitor.close();

	}

}
