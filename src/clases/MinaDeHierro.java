package clases;

import interfaces.EdificioProduccion;

public class MinaDeHierro extends Edificio implements EdificioProduccion {
	
	private int[] produccionPorNivel = {0, 30, 35, 41, 47, 55, 64, 74, 86, 100, 117, 136, 158, 184, 214, 249, 289, 337, 391, 455, 530, 616, 717, 833, 969, 1127, 1311, 1525, 1774, 2063, 2400};
	
	
	public MinaDeHierro() {
		nivel = 1;
		nivelMax = 30;
		codigoEdificio = 2;
		
		int[][] c = {{0, 0, 0}, {75, 65, 70}, {94, 83, 87}, {118, 106, 108}, {147, 135, 133}, {184, 172, 165}, {231, 219, 205}, {289, 279, 254}, {362, 356, 316}, {453, 454, 391}, {567, 579, 485}, {710, 738, 602}, {889, 941, 746}, {1113, 1200, 925}, {1393, 1529, 1147}, {1744, 1950, 1422}, {2183, 2486, 1764}, {2734, 3170, 2187}, {3422, 4042, 2712}, {4285, 5153, 3363}, {5365, 6571, 4170}, {6717, 8378, 5170}, {8409, 10681, 6411}, {10528, 13619, 7950}, {13181, 17364, 9858}, {16503, 22139, 12224}, {20662, 28227, 15158}, {25869, 35990, 18796}, {32388, 45887, 23307}, {40549, 58506, 28900}, {50768, 74595, 35837}};
	
		int[] t = {0, 10, 12, 14, 16, 19, 22, 26, 30, 35, 41, 48, 56, 66, 77, 90, 105, 123, 144, 169, 197, 231, 270, 316, 370, 433, 507, 593, 693, 811, 949};
	
		
		costoPorNivel = c;
		trabajadoresUtilizados = t; 
	}

	
	@Override
	public int getProduccionPorNivel() {
		
		return produccionPorNivel[nivel];
	}

	
}