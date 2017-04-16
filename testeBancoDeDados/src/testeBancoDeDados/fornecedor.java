package testeBancoDeDados;

import java.util.LinkedList;
import java.util.ListIterator;

public class fornecedor{
	public  String nomeFornecedor;
	public int códigoFornecedor;
	public  LinkedList<produtos> lista=new LinkedList<produtos>();

	public boolean setFornecedor(String nomeFornecedor, int códigoFornecedor){
		boolean sucesso=false;
		if(códigoFornecedor>=0 && (nomeFornecedor.length()>=1 && nomeFornecedor.length()<=45)){
		this.códigoFornecedor = códigoFornecedor;
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
	
	public produtos pesquisarProdutos(String descrição){
		 ListIterator<produtos> iterador = lista.listIterator(0);
		    while(iterador.hasNext()){  
		      produtos produto = iterador.next(); 
		      if(descrição==produto.descrição){
		    	  return produto;
		      }
	}
		    return null;

}}
