package sistemaDeRegistro;

public class sistemaDeRegistro extends animal {

	public boolean cadastraFazenda(fazenda f) {
		fazenda nova = null;
		nova.setfazenda(f.nomeFazenda,f.n�meroFazenda);
		if(nova.nomeFazenda!=null && nova.n�meroFazenda!=0){
		return true;	
		}
		else{
			return false;
		}

	}

	public boolean cadastraAnimal(animal a, fazenda f, String tipo) {
		animal novo = new animal();
		if (tipo == "bovino") {
			novo.setAnimalBovino(a.n�meroAnimalBovino, a.nomeAnimalBovino,
					a.diaNacimentoBovino, a.m�sNacimentoBovino,
					a.anoNacimentoBovino, a.generoBovino);
			a.setfazenda(f.nomeFazenda, f.n�meroFazenda);
			return true;
		}
		if (tipo == "caprino") {
			novo.setAnimalBovino(a.n�meroAnimalCaprino, a.nomeAnimalCaprino,
					a.diaNacimentoCaprino, a.m�sNacimentoCaprino,
					a.anoNacimentoCaprino, a.generoCaprino);
			a.setfazenda(f.nomeFazenda, f.n�meroFazenda);
			return true;
		}
		if (tipo == "Suino") {
			novo.setAnimalBovino(a.n�meroAnimalSuino, a.nomeAnimalSuino,
					a.diaNacimentoSuino, a.m�sNacimentoSuino,
					a.anoNacimentoSuino, a.generoSuino);
			a.setfazenda(f.nomeFazenda, f.n�meroFazenda);
			return true;
		}
        return false;
	}

	public boolean comprar(int n�meroAnimal, int IDFazenda, animal a, String tipo,
			fazenda f, int anoVenda) {
		animal novo = new animal();
		if (tipo == "bovino") {
			novo.setAnimalBovino(a.n�meroAnimalBovino, a.nomeAnimalBovino,
					a.diaNacimentoBovino, a.m�sNacimentoBovino,
					a.anoNacimentoBovino, a.generoBovino);
			novo.n�meroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
		if (tipo == "caprino") {
			novo.setAnimalBovino(a.n�meroAnimalCaprino, a.nomeAnimalCaprino,
					a.diaNacimentoCaprino, a.m�sNacimentoCaprino,
					a.anoNacimentoCaprino, a.generoCaprino);
			novo.n�meroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
		if (tipo == "Suino") {
			novo.setAnimalBovino(a.n�meroAnimalSuino, a.nomeAnimalSuino,
					a.diaNacimentoSuino, a.m�sNacimentoSuino,
					a.anoNacimentoSuino, a.generoSuino);
			novo.n�meroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
        return false;

	}

	public boolean vender(int n�meroAnimal, animal a, String tipo, fazenda f,
			int anoVenda) {
		if (tipo == "bovino")
			if (a.podeSerComercializadoBovino(anoVenda) == true) {
	        a.n�meroFazenda=f.n�meroFazenda;
	        a.nomeFazenda=f.nomeFazenda;
	        a.n�meroAnimalBovino=n�meroAnimal;
				return true;

			}
		if (tipo == "caprino")
			if (a.podeSerComercializadoCaprino(anoVenda)) {
		        a.n�meroFazenda=f.n�meroFazenda;
		        a.nomeFazenda=f.nomeFazenda;
		        a.n�meroAnimalCaprino=n�meroAnimal;
				return true;
			}
		if (tipo == "suino")
			if (a.podeSerComercializadoSuino(anoVenda)) {
		        a.n�meroFazenda=f.n�meroFazenda;
		        a.nomeFazenda=f.nomeFazenda;
		        a.n�meroAnimalSuino=n�meroAnimal;
				return true;
			}
		return false;
	}

	public boolean abater(int n�meroAnimal, int IDFazenda, animal a, String tipo,
			int dia, int m�s, int ano) {
		if (tipo == "bovino") {
			a.abateBovino(dia, m�s, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.abateCaprino(dia, m�s, ano);
			return true;
		}
		if (tipo == "suino") {
			a.abateSuino(dia, m�s, ano);
			return true;
		}
		return false;

	}

   public boolean morte(int n�meroAnimal, int IDFazenda, animal a, String tipo, int dia,
			int m�s, int ano) {
		if (tipo == "bovino") {
			a.morteBovino(dia, m�s, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.morteCaprino(dia, m�s, ano);
			return true;
		}
		if (tipo == "suino") {
			a.morteSuino(dia, m�s, ano);
			return true;
		}
		return false;

	}

	void listaResumoDeAnimais(int IDFazenda, int tipo, boolean jovem,
			boolean macho,fazenda f) {
		f.listaResumoDeAnimais(tipo, jovem, macho);

	}

	public boolean vacinar(int n�meroAnimal, int IDFazenda, animal a, String tipo,
			int dia, int m�s, int ano) {
		if (tipo == "bovino") {
			a.vacinaBovino(dia, m�s, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.vacinaCaprino(dia, m�s, ano);
			return true;
		}
		if (tipo == "suino") {
			a.vacinaSuino(dia, m�s, ano);
			return true;
		}
		return false;

	}
}
