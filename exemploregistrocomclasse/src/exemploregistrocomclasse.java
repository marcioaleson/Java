public class exemploregistrocomclasse {
	public static void main(String[] args) {
	produto p=new produto();	
    p.setnum(1);
    p.setnome("Geladeira");
    p.setpre�o(800);
    System.out.println("Quantidade="+p.getnum());
    System.out.println("Nome do produto="+p.getnome());
    System.out.println("Pre�o do produto="+p.getpre�o());
	}

}
