package testeBancoDeDados;

public class produtos extends fornecedor{
    public int c�digo;
    public String descri��o;
    public int quantidade;
    public float valor;
    public String fornecedor;

	public boolean setProduto(int c�digo, String descri��o, int quantidade,
			float valor,String fornecedor){
		boolean sucesso=false;
     	if (c�digo >= 1
				&& (descri��o.length() >= 1 && descri��o.length() <= 45)
				&& quantidade >= 0 && valor >= 0) {
			this.c�digo = c�digo;
			this.descri��o = descri��o;
			this.quantidade = quantidade;
			this.valor = valor;
			this.fornecedor=fornecedor;
		     sucesso=true;
		} else {
			sucesso=false;
		}
     	return sucesso;
	}
}
