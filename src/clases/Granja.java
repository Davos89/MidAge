package clases;



public class Granja extends Edificio{
	
	
	
	private int[] poblacionMaxPorNivel = {0,240,281,329,386,452,530,622,729,854,1002,1174,1376,1613,1891,2216,2598,3045,3569,4183,4904,5748,6737,7896,9255,10848,12715,14904,17469,20476,24000};
	
	public Granja() {
		
		nivel = 1;
		nivelMax = 30;
		codigoEdificio = 16;
		
		int[][] c = {{0, 0, 0}, {45,40,30}, {59, 53, 39}, {76, 70, 50}, {99, 92, 64}, {129 , 121 , 83}, {167 , 160 , 107}, {217 , 212 , 138}, {282 , 279 , 178}, {367 , 369 , 230}, {477 , 487 , 297}, 
				{620 , 642 , 383}, {806 , 848 , 494}, {1048 , 1119 , 637}, {1363 , 1477 , 822}, {1772 , 1950 , 1060}, {2303 , 2574 , 1368}, {2994 , 3398 , 1764	}, {3893 , 4486 , 2276}, {5060 , 5921 , 2936	}, {6579 , 7816 , 3787}, 
				{8552 , 10317 , 4886}, { 11118 , 13618 , 6302}, {14453 , 17976 , 8130	}, {18789 , 23728 , 10488}, {24426 , 31321 , 13529}, {31754 , 41344 , 17453}, {41280 , 54574 , 22514}, { 53664 , 72037 , 29043}, {69763 , 95089 , 37466}, {90692 , 125517 , 48331}};
		
		int[] t = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
		
	}
	
	
	
	public int getPoblacionMaxima() {
		return poblacionMaxPorNivel[nivel];
	}




	@Override
	public int getCantidadTrabajadoresSiguienteNivel() {
		
			return 0;
		
		
	}



	

}