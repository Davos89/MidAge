package clases;

import interfaces.EdificioCreacion;

public class Herreria extends Edificio implements EdificioCreacion {
	

	
	private int[] factorTiempo = {0, 91, 83, 75, 68, 62, 56, 51, 47, 42, 39, 35, 32, 29, 26, 24, 22, 20, 18, 16, 15};

	
	public Herreria() {
		nivel = 0;
		nivelMax = 20;
		codigoEdificio = 8;
		
		int[][] c = {{0, 0, 0}, {220, 180, 240}, {277, 229, 302}, {349, 293, 381}, {440, 373, 480}, {555, 476, 605}, {699, 606, 762}, {880, 773, 960}, {1109, 986, 1210}, {1398, 1257, 1525}, {1761, 1603, 1921}, {2219, 2043, 2421}, {2796, 2605, 3050}, {3523, 3322, 3843}, {4439, 4236, 4842}, {5593, 5400, 6101}, {7047, 6885, 7687}, {8879, 8779, 9686}, {11187, 11193, 12204}, {14096, 14271, 15377}, {17761, 18196, 19375}};
		
		int[] t = {0, 20, 23, 27, 32, 37, 44, 51, 60, 70, 82, 96, 112, 132, 154, 180, 211, 247, 289, 338, 395};
				
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
	}
	
	

	@Override
	public int getFactorTiempo() {
		// TODO Auto-generated method stub
		return factorTiempo[nivel];
	}

	
	
}
