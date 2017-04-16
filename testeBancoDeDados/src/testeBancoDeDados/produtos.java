package testeBancoDeDados;

public class produtos extends fornecedor{
    public int código;
    public String descrição;
    public int quantidade;
    public float valor;
    public String fornecedor;

	public boolean setProduto(int código, String descrição, int quantidade,
			float valor,String fornecedor){
		boolean sucesso=false;
     	if (código >= 1
				&& (descrição.length() >= 1 && descrição.length() <= 45)
				&& quantidade >= 0 && valor >= 0) {
			this.código = código;
			this.descrição = descrição;
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
