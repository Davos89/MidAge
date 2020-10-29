package clases;

import interfaces.EdificioCreacion;

public class Cuadra extends Edificio implements EdificioCreacion {
	
	private int[] factorTiempo = {0, 63, 59, 56, 53, 50, 47, 44, 42, 39, 37, 35, 33, 31, 29, 28, 26, 25, 23, 22, 21};
	
	
	public Cuadra() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 20;
		codigoEdificio = 5;
		
		int[][] c = {{0, 0, 0}, {270, 240, 260}, {340, 307, 328}, {429, 393, 413}, {540, 503, 520}, {681, 644, 655}, {857, 825, 826}, {1080, 1056, 1040}, {1361, 1351, 1311}, {1715, 1729, 1652}, {2161, 2214, 2081}, {2723, 2833, 2622}, {3431, 3627, 3304}, {4323, 4642, 4163}, {5447, 5942, 5246}, {6864, 7606, 6609}, {8648, 9736, 8328}, {10897, 12462, 10493}, {13730, 15951, 13221}, {17300, 20417, 16659}, {21797, 26134, 20990}};
		
		costoPorNivel = c;
		
		int[] t = {0, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72, 84, 99, 115, 135, 158};
		
		trabajadoresUtilizados = t;
	}
	
	@Override
	public int getFactorTiempo() {
		// TODO Auto-generated method stub
		return factorTiempo[nivel];
	}

	
}
