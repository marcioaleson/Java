package locadora;

public abstract class locadora {
protected String marca;
protected String modelo;
protected String anoFabricação;
protected double valorDiaria;
protected double valorBem;

locadora(String marca,String modelo,String anoFabricação,double valorDiaria,double valorBem){
	this.marca=marca;
	this.modelo=modelo;
	this.anoFabricação=anoFabricação;
	this.valorDiaria=valorDiaria;
	this.valorBem=valorBem;
}

abstract void calcularSeguro(double valorBem);

abstract void alugelVeiculo(int quantidadeDias);

}
 