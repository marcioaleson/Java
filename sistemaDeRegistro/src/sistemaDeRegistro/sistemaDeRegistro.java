package sistemaDeRegistro;

public class sistemaDeRegistro extends animal {

	public boolean cadastraFazenda(fazenda f) {
		fazenda nova = null;
		nova.setfazenda(f.nomeFazenda,f.númeroFazenda);
		if(nova.nomeFazenda!=null && nova.númeroFazenda!=0){
		return true;	
		}
		else{
			return false;
		}

	}

	public boolean cadastraAnimal(animal a, fazenda f, String tipo) {
		animal novo = new animal();
		if (tipo == "bovino") {
			novo.setAnimalBovino(a.númeroAnimalBovino, a.nomeAnimalBovino,
					a.diaNacimentoBovino, a.mêsNacimentoBovino,
					a.anoNacimentoBovino, a.generoBovino);
			a.setfazenda(f.nomeFazenda, f.númeroFazenda);
			return true;
		}
		if (tipo == "caprino") {
			novo.setAnimalBovino(a.númeroAnimalCaprino, a.nomeAnimalCaprino,
					a.diaNacimentoCaprino, a.mêsNacimentoCaprino,
					a.anoNacimentoCaprino, a.generoCaprino);
			a.setfazenda(f.nomeFazenda, f.númeroFazenda);
			return true;
		}
		if (tipo == "Suino") {
			novo.setAnimalBovino(a.númeroAnimalSuino, a.nomeAnimalSuino,
					a.diaNacimentoSuino, a.mêsNacimentoSuino,
					a.anoNacimentoSuino, a.generoSuino);
			a.setfazenda(f.nomeFazenda, f.númeroFazenda);
			return true;
		}
        return false;
	}

	public boolean comprar(int númeroAnimal, int IDFazenda, animal a, String tipo,
			fazenda f, int anoVenda) {
		animal novo = new animal();
		if (tipo == "bovino") {
			novo.setAnimalBovino(a.númeroAnimalBovino, a.nomeAnimalBovino,
					a.diaNacimentoBovino, a.mêsNacimentoBovino,
					a.anoNacimentoBovino, a.generoBovino);
			novo.númeroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
		if (tipo == "caprino") {
			novo.setAnimalBovino(a.númeroAnimalCaprino, a.nomeAnimalCaprino,
					a.diaNacimentoCaprino, a.mêsNacimentoCaprino,
					a.anoNacimentoCaprino, a.generoCaprino);
			novo.númeroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
		if (tipo == "Suino") {
			novo.setAnimalBovino(a.númeroAnimalSuino, a.nomeAnimalSuino,
					a.diaNacimentoSuino, a.mêsNacimentoSuino,
					a.anoNacimentoSuino, a.generoSuino);
			novo.númeroFazenda = IDFazenda;
			novo.vendaBovino(f);
			novo.compraBovino(f, anoVenda);
			return true;
		}
        return false;

	}

	public boolean vender(int númeroAnimal, animal a, String tipo, fazenda f,
			int anoVenda) {
		if (tipo == "bovino")
			if (a.podeSerComercializadoBovino(anoVenda) == true) {
	        a.númeroFazenda=f.númeroFazenda;
	        a.nomeFazenda=f.nomeFazenda;
	        a.númeroAnimalBovino=númeroAnimal;
				return true;

			}
		if (tipo == "caprino")
			if (a.podeSerComercializadoCaprino(anoVenda)) {
		        a.númeroFazenda=f.númeroFazenda;
		        a.nomeFazenda=f.nomeFazenda;
		        a.númeroAnimalCaprino=númeroAnimal;
				return true;
			}
		if (tipo == "suino")
			if (a.podeSerComercializadoSuino(anoVenda)) {
		        a.númeroFazenda=f.númeroFazenda;
		        a.nomeFazenda=f.nomeFazenda;
		        a.númeroAnimalSuino=númeroAnimal;
				return true;
			}
		return false;
	}

	public boolean abater(int númeroAnimal, int IDFazenda, animal a, String tipo,
			int dia, int mês, int ano) {
		if (tipo == "bovino") {
			a.abateBovino(dia, mês, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.abateCaprino(dia, mês, ano);
			return true;
		}
		if (tipo == "suino") {
			a.abateSuino(dia, mês, ano);
			return true;
		}
		return false;

	}

   public boolean morte(int númeroAnimal, int IDFazenda, animal a, String tipo, int dia,
			int mês, int ano) {
		if (tipo == "bovino") {
			a.morteBovino(dia, mês, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.morteCaprino(dia, mês, ano);
			return true;
		}
		if (tipo == "suino") {
			a.morteSuino(dia, mês, ano);
			return true;
		}
		return false;

	}

	void listaResumoDeAnimais(int IDFazenda, int tipo, boolean jovem,
			boolean macho,fazenda f) {
		f.listaResumoDeAnimais(tipo, jovem, macho);

	}

	public boolean vacinar(int númeroAnimal, int IDFazenda, animal a, String tipo,
			int dia, int mês, int ano) {
		if (tipo == "bovino") {
			a.vacinaBovino(dia, mês, ano);
			return true;
		}
		if (tipo == "caprino") {
			a.vacinaCaprino(dia, mês, ano);
			return true;
		}
		if (tipo == "suino") {
			a.vacinaSuino(dia, mês, ano);
			return true;
		}
		return false;

	}
}
