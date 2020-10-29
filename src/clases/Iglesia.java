package clases;


public class Iglesia extends Edificio{
	
	
	final private int[] radioDeAccion = {0,4,6,8};
	
	
	public Iglesia() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 3;
		codigoEdificio = 12;
		
		int[][] c = {{0,0,0},{16000,20000,5000},{20160,25600,6300},{ 25402,32768,7938}};
		int[] t = {0,5000,2750,4263};
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
		
	}

	

	public int getRadioDeAccion() {
		return radioDeAccion[nivel];
	}

	

}
