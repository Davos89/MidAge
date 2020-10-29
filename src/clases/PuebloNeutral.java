package clases;

public class PuebloNeutral extends Thread{
	
	private static String[] nombresNeutrales = {"Pueblo 1", "Pueblo 2", "Pueblo 3", "Pueblo 4", "Pueblo 5","Pueblo 6","Pueblo 7", "Pueblo 8", "Pueblo 9", "Pueblo 10", "Pueblo 11","Pueblo 12","Pueblo 13", "Pueblo 14", "Pueblo 15", "Pueblo 16", "Pueblo 17","Pueblo 18","Pueblo 19", "Pueblo 20", "Pueblo 21", "Pueblo 22", "Pueblo 23","Pueblo 24", "Pueblo 25", "Pueblo 26", "Pueblo 27", "Pueblo 28","Pueblo 29"};
	private static Poblado[] neutrales;
	
	public static Poblado[] getPueblosNeutrales(int cantidad) {
		
		neutrales = new Poblado[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			
			int numAzar1 = (int) (Math.random() * nombresNeutrales.length);//numero random para elegir nombre
			
			//mientras el nombre elegido esté vacio, sigo creando numeros random
			while (nombresNeutrales[numAzar1] == null) {
				
				numAzar1 = (int) (Math.random() * nombresNeutrales.length);
			}
			//cuando haya nombre disponible, se crea un nuevo pueblo neutral con ese
			//nombre y se elimina el nombre de la lista para evitar repeticiones
			neutrales[i] = new Poblado(nombresNeutrales[numAzar1], "abandonado");
			nombresNeutrales[numAzar1] = null;
			
		}
		return neutrales;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
