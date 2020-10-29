package clases;

import interfaces.EdificioCreacion;

public class Taller extends Edificio implements EdificioCreacion {
	
	private int[] factorTiempo = {0, 63, 59, 56, 53, 50, 47, 44, 42, 39, 37, 35, 33, 31, 29, 28};

	
	public Taller() {
		nivel =0;
		nivelMax = 15;
		codigoEdificio = 10;
		
		int[][] c = {{0, 0, 0}, {200, 240, 260}, {378, 307, 328}, {476, 393, 413}, {600, 503, 520}, {756, 644, 655}, {953, 825, 826}, {1200, 1056, 1040}, {1513, 1351, 1311}, {1906, 1729, 1652}, {2401, 2214, 2081}, {3026, 2833, 2622}, {3812, 3627, 3304}, {4804, 4642, 4163}, {6053, 5942, 5246}, {7626, 7606, 6609}};
	
		int[] t = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72};
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
	}
	
	
	@Override
	public int getFactorTiempo() {
		// TODO Auto-generated method stub
		return factorTiempo[nivel];
	}

	

}
