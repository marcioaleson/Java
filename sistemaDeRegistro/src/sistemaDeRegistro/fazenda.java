package sistemaDeRegistro;

abstract class fazenda {

	protected String nomeFazenda;
	protected int númeroFazenda;
	protected int bovinoMacho, bovinoMachoAdulto, bovinoFemia,
			bovinoFemiaAdulto, suinoMacho, suinoMachoAdulto, suinoFemia,
			suinoFemiaAdulto, caprinoMacho, caprinoMachoAdulto, caprinoFemia,
			caprinoFemiaAdulto;

    abstract  boolean setfazenda(String fazenda, int número);

	public int listaResumoDeAnimais(int tipo, boolean jovem, boolean macho) {
		if (tipo == 1 && jovem == true && macho == true) {
			return this.bovinoMacho;
		}
		if (tipo == 1 && jovem == true && macho == false) {
			return this.bovinoFemia;
		}
		if (tipo == 1 && jovem == false && macho == true) {
			return this.bovinoMachoAdulto;
		}
		if (tipo == 1 && jovem == false && macho == false) {
			return this.bovinoFemiaAdulto;
		}

		if (tipo == 2 && jovem == true && macho == true) {
			return this.suinoMacho;
		}
		if (tipo == 2 && jovem == true && macho == false) {
			return this.suinoFemia;
		}
		if (tipo == 2 && jovem == false && macho == true) {
			return this.suinoMachoAdulto;
		}
		if (tipo == 2 && jovem == false && macho == false) {
			return this.suinoFemiaAdulto;
		}

		if (tipo == 3 && jovem == true && macho == true) {
			return this.caprinoMacho;
		}
		if (tipo == 3 && jovem == true && macho == false) {
			return this.caprinoFemia;
		}
		if (tipo == 3 && jovem == false && macho == true) {
			return this.caprinoMachoAdulto;
		}
		if (tipo == 3 && jovem == false && macho == false) {
			return this.caprinoFemiaAdulto;
		}
		return -1;

	}

}
