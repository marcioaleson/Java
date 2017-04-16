import java.util.Scanner;
import java.io.IOException;
public class exemplostring {
	public static void main(String[] args) throws IOException {
		String texto1=new String("Teste com cadeia de caracteres!");
		System.out.println(texto1);
		System.in.read();
        char texto2[]={'T','e','s','t','e'};
        System.out.println(texto2);
        System.in.read();
        String texto3=new String(texto2,1,4);
        System.out.println(texto3);
        System.in.read();
        StringBuffer texto4 = new StringBuffer("Testes!");
        System.out.println(texto4);
        System.in.read();
        String texto5=new String();
        texto5="Será";
        System.out.println(texto5);
        System.in.read();
        String texto6=new String();
        texto6=texto5;
        System.out.println(texto6);
        System.in.read();
        String texto7;
        Scanner palavra;
        palavra=new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        texto7=palavra.next();
        System.out.println(texto7);
        System.in.read();
        String texto8=new String();
        StringBuffer palavras=new StringBuffer();
        Scanner entrada;
        entrada=new Scanner(System.in);
        System.out.println("Digite uma frase!");
        texto8=entrada.nextLine();
        palavras.append(texto8);
        System.in.read();
        System.out.println(texto8+"Você está aqui!");
        System.in.read();
        //compiando uma strin na outra.
        String str1=new String(),str2="string2",str3="string3";
        str1=str2.substring(3);
        System.out.println(str1);
        System.in.read();
        //compiando a partir de uma posição inicial até uma final
        str1=str2.substring(2,4);
        System.out.println(str1);
        System.in.read();
        //ligando duas string baffer
        StringBuffer str1b=new StringBuffer("stringbuffer1"),str2b=new StringBuffer("stringbuffer2"),str3b=new StringBuffer("stringbuffer3");
        str1b.append(str2b);
        System.out.println(str1b);
        System.in.read();
        str1b.append(str2b,2,5);
        System.out.println(str1b);
        System.in.read();
        //comcatenado cadeias de caracteres
        str1=str2+str3;
        System.out.println(str1);
        System.in.read();
        str1=str2.concat(str3);
        System.out.println(str1);
        System.in.read();
        //comparando cadeias de caracteres
        boolean resposta;
        resposta=str1.equals(str2);
        System.out.println(resposta);
        System.in.read();
        resposta=str1.equalsIgnoreCase(str3);
        System.out.println(resposta);
        System.in.read();
        int valor;
        valor=str2.compareTo(str3);
        System.out.println(valor);
        System.in.read();
        resposta=str1.regionMatches(false,0,str2,0,2);
        System.out.println(resposta);
        System.in.read();
        resposta=str3.startsWith(str2);
        System.out.println(resposta);
        System.in.read();
        resposta=str2.startsWith(str2, 2);
        System.out.println(resposta);
        System.in.read();
        resposta=str2.endsWith(str1);
        System.out.println(resposta);
        System.in.read();
        //número de caracteres de uma cadeia de caracteres
        int tamanho;
        tamanho=str2.length();
        System.out.println(tamanho);
        System.in.read();
        //verificar a posição de uma cadeia de caracteres detro da outra
        tamanho=str1.indexOf(str3);
        System.out.println(tamanho);
        System.in.read();
        tamanho=str1.indexOf(str3,2);
        System.out.println(tamanho);
        System.in.read();
        tamanho=str1.lastIndexOf(str3);
        System.out.println(tamanho);
        System.in.read();
        tamanho=str1.lastIndexOf(str3,3);
        System.out.println(tamanho);
        System.in.read();
        //apagando caractere de uma cadeia de caracatere
        str2b.delete(2,5);
        System.out.println(str2b);
        System.in.read();
        //inserindo caracter em uma cadeia de caracteres
        str1b.insert(0,str2b);
        System.out.println(str1b);
        System.in.read();
        //alterar os caracteres de uma cadeia de caracteres
        str1.replace(str2,str3);
        System.out.println(str2);
        System.in.read();
        str1.replaceAll(str2,str3);
        System.out.println(str2);
        System.in.read();
        str1.replaceFirst(str2,str3);
        System.out.println(str2);
        System.in.read();
        str1.split(str3);
        System.out.println(str1);
        System.in.read();
        str1.trim();
        System.out.println(str1);
        System.in.read();
        char novo[]=texto1.toCharArray();
        System.out.println(novo);
        System.in.read();
        char letra=texto1.charAt(3);
        System.out.println(letra);
        System.in.read();
        str1b.setCharAt(3,letra);
        System.out.println(str1b);
        System.in.read();
        str1b.reverse();
        System.out.println(str1b);
        System.in.read();
        //descobrindo um caracter a partir de seu valor ascii
       char caracter;
       int número=66;
       caracter=(char)número;
        System.out.println(caracter);
        System.in.read();
        número=(int)caracter;
        System.out.println(número);
        System.in.read();
        //descobrindo o caracter sucessor
        System.out.println((char)(caracter+1));
        System.in.read();
        //descobrindo o caracter antecessor
        System.out.println((char)(caracter-1));
        System.in.read();
        //comveretendo para maiúsculo
        System.out.println(str1.toUpperCase());
        System.in.read();
        //comvertendo tudo para minúsculo
        str2.toLowerCase();
        System.out.println(str2.toLowerCase());
        System.in.read();
        //convertendo número para uma string
        str3=String.valueOf(número);
        System.out.println(str3);
        System.in.read();
        //comvertendo um numero para um char
        letra=Character.forDigit(valor, 10);
        System.out.println(letra);
        System.in.read();
        //converter caracter em valor númerico
        valor=Integer.parseInt(texto1);
        System.out.println(valor);
        System.in.read();
        //converter para o tipo long
        long valorlong;
        valorlong=Long.parseLong(texto1);
        System.out.println(valorlong);
        System.in.read();
        //converte para valor float
        float valorfloat;
        valorfloat=Float.parseFloat(texto1);
        System.out.println(valorfloat);
        System.in.read();
        //convertendo para valor double
        double valordouble;
        valordouble=Double.parseDouble(texto1);
        System.out.println(valordouble);
        System.in.read();
        //converter caracter para um número com a base espacificada
        valor=Character.digit(caracter, 10);
        System.out.println(valor);
        System.in.read();
 
	}

}
