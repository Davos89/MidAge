package clases;


public class Estatua extends Edificio {


	public Estatua() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 1;
		codigoEdificio = 14;
		
		int[][] c = {{0, 0, 0}, { 220,220,220}};
		int[] t = {0, 10};
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
		
	}

	

	

}
