package clases;

public class MapaMundial {
	
	private int cantidadTotalDePueblosNeutrales;
	private static Poblado ubicacionPueblos[][];
	private Poblado[] pueblosEnemigos;
	
	
	
	public MapaMundial(Poblado puebloJugador, int cantidadEnemigos, int tamanioMapa) {
		
		ubicacionPueblos = new Poblado[tamanioMapa][tamanioMapa];
		
		switch (tamanioMapa) {
		case 4:
			cantidadTotalDePueblosNeutrales = 7 - cantidadEnemigos;
			break;		
		case 5:
			cantidadTotalDePueblosNeutrales = 11 - cantidadEnemigos;
			break;
		case 6:
			cantidadTotalDePueblosNeutrales = 17 - cantidadEnemigos;
			break;
		case 7:
			cantidadTotalDePueblosNeutrales = 20 - cantidadEnemigos;
			break;
		case 8:
			cantidadTotalDePueblosNeutrales = 30 - cantidadEnemigos;
			break;


		default:
			break;
		}
		
		pueblosEnemigos = PuebloEnemigo.getPueblosEnemigos(cantidadEnemigos);//creacion de los pueblos enemigos
		Poblado[] pueblosNeutrales = PuebloNeutral.getPueblosNeutrales(cantidadTotalDePueblosNeutrales);//creacion de los pueblos neutrales
		
		int numAzar1 = (int) (Math.random() * tamanioMapa);
		int numAzar2 = (int) (Math.random() * tamanioMapa);
		
		
		
		
		ubicacionPueblos[numAzar1][numAzar2] = puebloJugador;
		
		for (int i = 0; i < cantidadEnemigos ; i++) {
			
			numAzar1 = (int) (Math.random() * tamanioMapa);
			numAzar2 = (int) (Math.random() * tamanioMapa);
			
			while (ubicacionPueblos[numAzar1][numAzar2] != null) {
				numAzar1 = (int) (Math.random() * tamanioMapa);
				numAzar2 = (int) (Math.random() * tamanioMapa);
				
			}
			
			ubicacionPueblos[numAzar1][numAzar2] = pueblosEnemigos[i];
			int[] ubicacion = new int[] {numAzar1,numAzar2};  
			pueblosEnemigos[i].setUbicacionPoblado(ubicacion);
		}
		
		for (int i = 0; i < cantidadTotalDePueblosNeutrales ; i++) {
			
			numAzar1 = (int) (Math.random() * tamanioMapa);
			numAzar2 = (int) (Math.random() * tamanioMapa);
			
			while (ubicacionPueblos[numAzar1][numAzar2] != null) {
				numAzar1 = (int) (Math.random() * tamanioMapa);
				numAzar2 = (int) (Math.random() * tamanioMapa);
				
			}
			
			ubicacionPueblos[numAzar1][numAzar2] = pueblosNeutrales[i];
			int[] ubicacion = new int[] {numAzar1,numAzar2};  
			pueblosNeutrales[i].setUbicacionPoblado(ubicacion);
			
		}
		
		
	}
	
	public static Poblado[][] getUbicacionPueblos() {
		return ubicacionPueblos;
	}

	public Poblado[] getPueblosEnemigos() {
		return pueblosEnemigos;
	}
	
	

}
