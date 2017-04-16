package locadora;

public class listaLocadoraMain {
	public static void main(String[] args) {
		listaLocadoraMoto listaM=new listaLocadoraMoto();
		moto moto1=new moto("Honda", "Estrada","20/06/13",10,10000);
		moto1.setCilindrada(1000);
		moto moto2=new moto("Yamara", "Ofrold","20/06/13",10,10000);
		moto2.setCilindrada(1100);
		listaM.add(moto1);
		listaM.add(moto2);
		listaM.print();
		listaM.pesquisa(300);
		listaLocadoraCarga listaC=new listaLocadoraCarga();
		carga carga1=new carga("Mercedes","Escanha","20/06/13",100,100000);
		carga1.setCapacidadeDeCarga(10000);
		carga carga2=new carga("Volvo","Casamba","20/06/13",100,100000);
		carga2.setCapacidadeDeCarga(11000);
		listaC.add(carga1);
		listaC.add(carga2);
		listaC.print();
		listaC.pesquisa(10000);
		listaLocadoraPasseio listaP=new listaLocadoraPasseio();
		passeio passeio1=new passeio("Honda","Sedam","20/06/13",50,30000);
		passeio1.setNúmeroDePassageiros(4);
		passeio passeio2=new passeio("Chevrole","Hatch","20/06/13",50,30000);
		passeio2.setNúmeroDePassageiros(5);
		listaP.add(passeio1);
		listaP.add(passeio2);
		listaP.print();
		listaP.pesquisa(3);
	}

}
