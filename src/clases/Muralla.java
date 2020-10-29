package clases;


public class Muralla extends Edificio {
	
	private int[] factorDefensa = {0, 4, 8, 12, 16, 20, 24, 29, 34, 39, 44, 49, 55, 60, 66, 72, 79, 85, 92, 99, 107};//porcentaje de aumento


	public Muralla() {
		nivel = 0;
		nivelMax = 20;
		codigoEdificio = 9;
		int[][] c = {{0, 0, 0}, {50, 100, 20}, {63, 127, 25}, {79, 163, 32}, {100, 207, 40}, {126, 264, 50}, {159, 337, 64}, {200, 430, 80}, {252, 548, 101}, {318, 698, 127}, {400, 890, 160}, {504, 1135, 204}, {635, 1447, 254}, {801, 1846, 320}, {1009, 2353, 404}, {1271, 3000, 508}, {1602, 3825, 641}, {2018, 4877, 807}, {2543, 6218, 1017}, {3204, 7928, 1281}, {4037, 10109, 1615}};
		int[] t = {0, 5, 6, 7, 8, 9, 11, 13, 15, 18, 21, 24, 28, 33, 38, 45, 53, 62, 72, 84, 99};
		costoPorNivel = c;
		trabajadoresUtilizados = t;
	}
	
	
	
	public int getFactorDefensa() {
		// TODO Auto-generated method stub
		return factorDefensa[nivel];
	}
	
	

}
