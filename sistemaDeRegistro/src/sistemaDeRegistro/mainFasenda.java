package sistemaDeRegistro;

public class mainFasenda {

	public static void main(String[] args) {
		sistemaDeRegistro r=new sistemaDeRegistro();
		r.setfazenda("a",111);
		r.setAnimalBovino(0,"boi", 21, 06, 8, "macho");
		System.out.print(r.númeroFazenda);
		System.out.print(r.nomeFazenda);
	}

}
