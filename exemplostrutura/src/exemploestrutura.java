public class exemploestrutura {
	private static class produto{
		private int num;
		private String nome;
		private float pre�o;
	}
	public static void main(String[] args) {
		produto p;
		p=new produto();
		p.num=1;
		p.nome="geladeira";
		p.pre�o=800;
		System.out.println("Quantidade="+p.num);
		System.out.println("Nome de produto="+p.nome);
		System.out.println("Valor="+p.pre�o);		
	}
}
