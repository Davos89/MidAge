package clases;

import interfaces.EdificioCreacion;

public class Cuartel extends Edificio implements EdificioCreacion {
	
	public static final int LANCERO = 0;
	public static final int SOLDADOESPADA = 1;
	public static final int SOLDADOHACHA = 2;
	public static final int ARQUERO = 3;
	
	
	
	private float[] factorTiempo = {100, 63, 59, 56, 53, 50, 47, 44, 42, 39, 37, 35, 33, 31, 29, 28, 26, 25, 23, 22, 21, 20, 19, 17, 16, 15};
	final private int[] costoLancero = {50,30,10};
	final private int[] costoSoldadoEspada = {30,30,70};
	final private int[] costoSoldadoHacha = {60,30,40};
	final private int[] costoArquero = {100,30,60};
	private int cantLancero, atkLancero, defLancero, velLancero, botinLancero;
	private int cantSoldadoEspada, atkSoldadoEspada, defSoldadoEspada, velSoldadoEspada, botinSoldadoEspada;
	private int cantSoldadoHacha, atkSoldadoHacha, defSoldadoHacha, velSoldadoHacha, botinSoldadoHacha;
	private int cantArquero, atkArquero, defArquero, velArquero, botinArquero;
	private float tiempoCreacionLancero;
	private float tiempoCreacionSoldadoEspada;
	private float tiempoCreacionSoldadoHacha;
	private float tiempoCreacionArquero;
	

	
	public Cuartel() {
		// TODO Auto-generated constructor stub
		nivel = 0;
		nivelMax = 25;
		codigoEdificio = 6;
		int[][] c = {{0, 0, 0}, {200, 170, 90}, {252, 218, 113}, {318, 279, 143}, {400, 357, 180}, {504, 456, 227}, {635, 584, 286}, {800, 748, 360}, {1008, 957, 454}, {1271, 1225, 572}, {1601, 1568, 720}, {2017, 2007, 908}, {2542, 2569, 1144}, {3202, 3288, 1441}, {4035, 4209, 1816}, {5084, 5388, 2288}, {6406, 6896, 2883}, {8072, 8827, 3632}, {10170, 11298, 4577}, {12814, 14462, 5767}, {16146, 18511, 7266}, {20344, 23695, 9155}, {25634, 30329, 11535}, {32298, 38821, 14534}, {40696, 49691, 18313}, {51277, 63605, 23075}};
		costoPorNivel = c;
		int[] t = {0, 7, 8, 10, 11, 13, 15, 18, 21, 25, 29, 34, 39, 46, 54, 63, 74, 86, 101, 118, 138, 162, 189, 221, 259, 303};
		trabajadoresUtilizados = t;
		
		cantLancero = 0;
		cantSoldadoEspada = 0;
		cantSoldadoHacha = 0;
		cantArquero = 0;
		
		tiempoCreacionLancero = 5;
		tiempoCreacionSoldadoEspada= 5;
		tiempoCreacionSoldadoHacha = 5;
		tiempoCreacionArquero = 5;
		
		atkLancero = 10;
		defLancero = 15;
		velLancero = 18;
		botinLancero = 25;
		
		atkSoldadoEspada = 25;
		defSoldadoEspada = 50;
		velSoldadoEspada = 22;
		botinSoldadoEspada = 15;
		
		atkSoldadoHacha = 40;
		defSoldadoHacha = 10;
		velSoldadoHacha = 18;
		botinSoldadoHacha = 10;
		
		atkArquero = 15;
		defArquero = 50;
		velArquero = 18;
		botinArquero = 10;
		
	}
	
	public void crearLancero() {
		
		cantLancero++;

	}
	
	public void crearSoldadoEspada() {
		
		cantSoldadoEspada++;

	}

	public void crearSoldadoHacha() {
		
		cantSoldadoHacha++;
	
	}

	public void crearArquero() {
		
		cantArquero++;
	
	}
	
	
	public int getTiempoCreacionLancero() {
		return (int)(tiempoCreacionLancero * ((factorTiempo[nivel] / 100)));
	}

	public int getTiempoCreacionSoldadoEspada() {
		return (int)(tiempoCreacionSoldadoEspada * ((factorTiempo[nivel] / 100)));
	}

	public int getTiempoCreacionSoldadoHacha() {
		return (int)(tiempoCreacionSoldadoHacha * ((factorTiempo[nivel] / 100)));
	}

	public int getTiempoCreacionArquero() {
		return (int)(tiempoCreacionArquero * ((factorTiempo[nivel] / 100)));
	}

	
	
	public int[] getCostoLancero() {
		return costoLancero;
	}

	public int[] getCostoSoldadoEspada() {
		return costoSoldadoEspada;
	}

	public int[] getCostoSoldadoHacha() {
		return costoSoldadoHacha;
	}

	public int[] getCostoArquero() {
		return costoArquero;
	}

	public int getCantLancero() {
		return cantLancero;
	}

	public int getCantSoldadoEspada() {
		return cantSoldadoEspada;
	}

	public int getCantSoldadoHacha() {
		return cantSoldadoHacha;
	}

	public int getCantArquero() {
		return cantArquero;
	}

	@Override
	public int getFactorTiempo() {
		// TODO Auto-generated method stub
		return (int) factorTiempo[nivel];
	}

	

	public int getAtkLancero() {
		return atkLancero;
	}

	public int getDefLancero() {
		return defLancero;
	}

	public int getVelLancero() {
		return velLancero;
	}

	public int getBotinLancero() {
		return botinLancero;
	}

	public int getAtkSoldadoEspada() {
		return atkSoldadoEspada;
	}

	public int getDefSoldadoEspada() {
		return defSoldadoEspada;
	}

	public int getVelSoldadoEspada() {
		return velSoldadoEspada;
	}

	public int getBotinSoldadoEspada() {
		return botinSoldadoEspada;
	}

	public int getAtkSoldadoHacha() {
		return atkSoldadoHacha;
	}

	public int getDefSoldadoHacha() {
		return defSoldadoHacha;
	}

	public int getVelSoldadoHacha() {
		return velSoldadoHacha;
	}

	public int getBotinSoldadoHacha() {
		return botinSoldadoHacha;
	}

	public int getAtkArquero() {
		return atkArquero;
	}

	public int getDefArquero() {
		return defArquero;
	}

	public int getVelArquero() {
		return velArquero;
	}

	public int getBotinArquero() {
		return botinArquero;
	}

	public void eliminarTodosLosSoldados() {
		
		cantArquero = 0;
		cantLancero = 0;
		cantSoldadoEspada = 0;
		cantSoldadoHacha = 0;
		
	}

	public void eliminarLanceros(int i) {
		
		cantLancero -= i;
		
	}

	public void eliminarSoldadosEspada(int i) {
		
		cantSoldadoEspada -= i;
		
	}

	public void eliminarSoldadosHacha(int i) {

		cantSoldadoHacha -= i;
		
	}

	public void eliminarArqueros(int i) {

		cantArquero -= i;
		
	}

	public void agregarEjercitoVictorioso(int[] ejercitoVictorioso) {
		
		cantLancero += ejercitoVictorioso[0];
		cantSoldadoEspada += ejercitoVictorioso[1];
		cantSoldadoHacha += ejercitoVictorioso[2];
		cantArquero += ejercitoVictorioso[3];
		
	}
	
	
}
