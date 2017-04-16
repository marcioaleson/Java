package sistemaDeRegistro;

public class animal extends fazenda {

	protected int númeroAnimalBovino;
	protected String nomeAnimalBovino;
	protected int diaNacimentoBovino, mêsNacimentoBovino, anoNacimentoBovino;
	protected String generoBovino;
	protected boolean vacinaBovino, morteBovino, abateBovino;
	protected int idadeEmMesesBovino;

	protected int númeroAnimalCaprino;
	protected String nomeAnimalCaprino;
	protected int diaNacimentoCaprino, mêsNacimentoCaprino,
			anoNacimentoCaprino;
	protected String generoCaprino;
	protected boolean vacinaCaprino, morteCaprino, abateCaprino;
	protected int idadeEmMesesCaprino;

	protected int númeroAnimalSuino;
	protected String nomeAnimalSuino;
	protected int diaNacimentoSuino, mêsNacimentoSuino, anoNacimentoSuino;
	protected String generoSuino;
	protected boolean vacinaSuino, morteSuino, abateSuino;
	protected int idadeEmMesesSuino;

	public boolean setfazenda(String fazenda, int número) {
		super.nomeFazenda = fazenda;
		super.númeroFazenda = número;
		if(super.nomeFazenda==fazenda && super.númeroFazenda==número){
		return true;}
		else{
			return false;
		}

	}

	public int setAnimalBovino(int númeroAnimal, String nomeAnimal,
			int diaNacimeto, int mêsNacimento, int anoNacimento, String genero) {
		this.númeroAnimalBovino = númeroAnimal;
		this.nomeAnimalBovino = nomeAnimal;
		this.diaNacimentoBovino = diaNacimeto;
		this.mêsNacimentoBovino = mêsNacimento;
		this.anoNacimentoBovino = anoNacimento;
		this.generoBovino = genero;
		this.vacinaBovino = false;
		this.morteBovino = false;
		this.abateBovino = false;
		this.idadeEmMesesBovino = (13 - anoNacimento) * 12;

		if (this.idadeEmMesesBovino > 23 && genero == "macho") {
			return super.bovinoMachoAdulto += 1;

		}
		if (this.idadeEmMesesBovino < 23 && genero == "macho") {
			return super.bovinoMacho += 1;

		}
		if (this.idadeEmMesesBovino > 23 && genero == "femia") {
			return super.bovinoFemiaAdulto += 1;

		}
		if (this.idadeEmMesesBovino < 23 && genero == "Femia") {
			return super.bovinoFemia += 1;

		}
		return -1;
	}

	public int setAnimalCaprino(int númeroAnimal, String nomeAnimal,
			int diaNacimeto, int mêsNacimento, int anoNacimento, String genero) {
		this.númeroAnimalCaprino = númeroAnimal;
		this.nomeAnimalCaprino = nomeAnimal;
		this.diaNacimentoCaprino = diaNacimeto;
		this.mêsNacimentoCaprino = mêsNacimento;
		this.anoNacimentoCaprino = anoNacimento;
		this.generoCaprino = genero;
		this.vacinaCaprino = false;
		this.morteCaprino = false;
		this.abateCaprino = false;
		this.idadeEmMesesCaprino = (13 - anoNacimento) * 12;

		if (this.idadeEmMesesCaprino > 18 && genero == "macho") {
			return super.caprinoMachoAdulto += 1;

		}
		if (this.idadeEmMesesCaprino < 18 && genero == "macho") {
			return super.caprinoMacho += 1;

		}
		if (this.idadeEmMesesCaprino > 18 && genero == "femia") {
			return super.caprinoFemiaAdulto += 1;

		}
		if (this.idadeEmMesesCaprino < 18 && genero == "Femia") {
			return super.caprinoFemia += 1;

		}
		return -1;
	}

	public int setAnimalSuino(int númeroAnimal, String nomeAnimal,
			int diaNacimeto, int mêsNacimento, int anoNacimento, String genero) {
		this.númeroAnimalSuino = númeroAnimal;
		this.nomeAnimalSuino = nomeAnimal;
		this.diaNacimentoSuino = diaNacimeto;
		this.mêsNacimentoSuino = mêsNacimento;
		this.anoNacimentoSuino = anoNacimento;
		this.generoSuino = genero;
		this.vacinaSuino = false;
		this.morteSuino = false;
		this.abateSuino = false;
		this.idadeEmMesesSuino = (13 - anoNacimento) * 12;

		if (this.idadeEmMesesSuino > 12 && genero == "macho") {
			return super.suinoMachoAdulto += 1;

		}
		if (this.idadeEmMesesSuino < 12 && genero == "macho") {
			return super.suinoMacho += 1;

		}
		if (this.idadeEmMesesSuino > 12 && genero == "femia") {
			return super.suinoFemiaAdulto += 1;

		}
		if (this.idadeEmMesesSuino < 12 && genero == "Femia") {
			return super.suinoFemia += 1;

		}
		return -1;
	}

	private int idadeBovinoVenda(int anoVenda) {
		return (anoVenda - this.anoNacimentoBovino) * 12;
	}

	private int idadeSuinoVenda(int anoVenda) {
		return (anoVenda - this.anoNacimentoSuino) * 12;
	}

	private int idadeCaprinoVenda(int anoVenda) {
		return (anoVenda - this.anoNacimentoCaprino) * 12;
	}

	public boolean podeSerComercializadoBovino(int anoVenda) {
		if (this.vacinaBovino == true && idadeBovinoVenda(anoVenda) > 23) {
			return true;
		} else if (this.vacinaBovino == false && idadeBovinoVenda(anoVenda) > 23) {
			return false;
		} else {
			return true;
		}
	}

	public boolean podeSerComercializadoCaprino(int anoVenda) {
		if (this.vacinaCaprino == true && idadeCaprinoVenda(anoVenda) > 18) {
			return true;
		} else if (this.vacinaCaprino == false && idadeCaprinoVenda(anoVenda) > 18) {
			return false;
		} else {
			return true;
		}
	}

	public boolean podeSerComercializadoSuino(int anoVenda) {
		if (this.vacinaSuino == true && idadeSuinoVenda(anoVenda) > 12) {
			return true;
		} else if (this.vacinaSuino == false && idadeSuinoVenda(anoVenda) > 12) {
			return false;
		} else {
			return true;
		}
	}

	public boolean vendaBovino(fazenda f) {
		fazenda compradora;
		compradora = f;
		if(compradora.nomeFazenda==f.nomeFazenda){
			return true;
		}else{
			return false;
		}
	}

	public boolean compraBovino(fazenda f, int anoVenda) {
		if (podeSerComercializadoBovino(anoVenda)) {
			this.nomeFazenda = f.nomeFazenda;
			this.númeroFazenda = f.númeroFazenda;
			return true;
		} else {
			return false;
		}
	}

	public boolean abateBovino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaAbate = 0, mêsAbate = 0, anoAbate = 0;
		diaAbate = dia;
		mêsAbate = mês;
		anoAbate = ano;
		return this.abateBovino = true;
	}

	public boolean morteBovino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaMorte = 0, mêsMorte = 0, anoMorte = 0;
		diaMorte = dia;
		mêsMorte = mês;
		anoMorte = ano;
		return this.morteBovino = true;
	}

	public boolean vacinaBovino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaVacina = 0, mêsVacina = 0, anoVacina = 0;
		diaVacina = dia;
		mêsVacina = mês;
		anoVacina = ano;
		return this.vacinaBovino = true;
	}

	public boolean vendaCaprina(fazenda f) {
		@SuppressWarnings("unused")
		fazenda compradora;
		compradora = f;
		if(compradora.nomeFazenda==f.nomeFazenda){
			return true;
		}else{
			return false;
		}
	}

	public boolean compraCaprina(fazenda f, int anoVenda) {
		if (podeSerComercializadoCaprino(anoVenda)) {
			this.nomeFazenda = f.nomeFazenda;
			this.númeroFazenda = f.númeroFazenda;
			return true;
		} else {
			return false;
		}
	}

	public boolean abateCaprino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaAbate = 0, mêsAbate = 0, anoAbate = 0;
		diaAbate = dia;
		mêsAbate = mês;
		anoAbate = ano;
		return this.abateCaprino = true;
	}

	public boolean morteCaprino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaMorte = 0, mêsMorte = 0, anoMorte = 0;
		diaMorte = dia;
		mêsMorte = mês;
		anoMorte = ano;
		return this.morteCaprino = true;
	}

	public boolean vacinaCaprino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaVacina = 0, mêsVacina = 0, anoVacina = 0;
		diaVacina = dia;
		mêsVacina = mês;
		anoVacina = ano;
		return this.vacinaCaprino = true;
	}

	public boolean vendaSuino(fazenda f) {
		@SuppressWarnings("unused")
		fazenda compradora;
		compradora = f;
		if(compradora.nomeFazenda==f.nomeFazenda){
			return true;
		}else{
			return false;
		}
	}

	public boolean compraSuino(fazenda f, int anoVenda) {
		if (podeSerComercializadoSuino(anoVenda)) {
			this.nomeFazenda = f.nomeFazenda;
			this.númeroFazenda = f.númeroFazenda;
			return true;
		} else {
			return false;
		}
	}

	public boolean abateSuino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaAbate = 0, mêsAbate = 0, anoAbate = 0;
		diaAbate = dia;
		mêsAbate = mês;
		anoAbate = ano;
		return this.abateBovino = true;
	}

	public boolean morteSuino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaMorte = 0, mêsMorte = 0, anoMorte = 0;
		diaMorte = dia;
		mêsMorte = mês;
		anoMorte = ano;
		return this.morteSuino = true;
	}

	public boolean vacinaSuino(int dia, int mês, int ano) {
		@SuppressWarnings("unused")
		int diaVacina = 0, mêsVacina = 0, anoVacina = 0;
		diaVacina = dia;
		mêsVacina = mês;
		anoVacina = ano;
		return this.vacinaSuino = true;
	}

}