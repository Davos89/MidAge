package clases;

import interfaces.EdificioCreacion;

public class Corte extends Edificio implements EdificioCreacion {
	
	
	final private float[] factorTiempo = {100, 63};
	
	
	public Corte() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 1;
		codigoEdificio = 13;
		
		int[][] c = {{0, 0, 0}, { 15000,25000,10000}};
		
		costoPorNivel = c;
		
		int[] t = {0, 80};
		trabajadoresUtilizados = t;
		
	}

	@Override
	public int getFactorTiempo() {
		// TODO Auto-generated method stub
		return (int) factorTiempo[nivel];
	}

	
}
