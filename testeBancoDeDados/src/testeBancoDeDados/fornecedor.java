package testeBancoDeDados;

import java.util.LinkedList;
import java.util.ListIterator;

public class fornecedor{
	public  String nomeFornecedor;
	public int c�digoFornecedor;
	public  LinkedList<produtos> lista=new LinkedList<produtos>();

	public boolean setFornecedor(String nomeFornecedor, int c�digoFornecedor){
		boolean sucesso=false;
		if(c�digoFornecedor>=0 && (nomeFornecedor.length()>=1 && nomeFornecedor.length()<=45)){
		this.c�digoFornecedor = c�digoFornecedor;
		this.nomeFornecedor = nomeFornecedor;
	    sucesso=true;
		}
		else{
			 sucesso=false;
		}
		return sucesso;

}

	public void inserirProdutoFornecido(produtos produto){
	lista.add(produto);	
	}
	
	public produtos pesquisarProdutos(String descri��o){
		 ListIterator<produtos> iterador = lista.listIterator(0);
		    while(iterador.hasNext()){  
		      produtos produto = iterador.next(); 
		      if(descri��o==produto.descri��o){
		    	  return produto;
		      }
	}
		    return null;

}}
