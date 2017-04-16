public class exemploregistrocomclasse {
	public static void main(String[] args) {
	produto p=new produto();	
    p.setnum(1);
    p.setnome("Geladeira");
    p.setpreço(800);
    System.out.println("Quantidade="+p.getnum());
    System.out.println("Nome do produto="+p.getnome());
    System.out.println("Preço do produto="+p.getpreço());
	}

}
