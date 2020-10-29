package clases;


public class Escondrijo extends Edificio {
	
	
	private int[] capacidadPorNivel = {0, 150, 200, 267, 356, 474, 632, 843, 1125, 1500, 2000};
	
	
	public Escondrijo() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 10;
		codigoEdificio = 7;
		
		int[][] c = {{0, 0, 0}, {50, 60, 50}, {63, 75, 63}, {78, 94, 78}, {98, 117, 98}, {122, 146, 122}, {153, 183, 153}, {191, 229, 191}, {238, 286, 238}, {298, 358, 298}, {373, 447, 373}};
		int[] t = {0, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8};
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
		
	}
	
	
	
	
	public int getCapacidadPorNivel() {
		return capacidadPorNivel[nivel];
	}

	
	
}
