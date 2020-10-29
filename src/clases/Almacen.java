package clases;


public class Almacen extends Edificio {
	
	private int nivel, nivelMax;
	
	private int[] capacidadPorNivel = {0,1000,1229,1512,1859,2285,2810,3454,4247,5222,6420,7893,9705,11932,14670,18037,22177,27266,33523,41217,50675,62305,76604,94184,115798,142373,175047,215219,264611,325337,400000};
	
	public Almacen() {
		nivel = 1;
		nivelMax = 30;
		codigoEdificio = 3;
		
		int[][] c = {{0, 0, 0} , { 60 , 50 , 40	},{ 76 , 64 , 50	},{ 96 , 81 , 62	},{ 121 , 102 , 77	},{ 154 , 130 , 96	},{ 194 , 165 , 120	},{ 246 , 210 , 149	},{ 311 , 266 , 185	},{ 393 , 338 , 231	},{ 498 , 430 , 287	},{ 630 , 546 , 358	},{ 796 , 693 , 446	},{ 1007 , 880 , 555	},{ 1274 , 1118 , 691	},{ 1612 , 1420 , 860	},{ 2039 , 1803 , 1071	},{ 2580 , 2290 , 1333	},{ 3264 , 2908 , 1659	},{ 4128 , 3693 , 2066	},{ 5222 , 4691 , 2572	},{ 6606 , 5957 , 3202	},{ 8357 , 7566 , 3987	},{ 10572 , 9608 , 4963	},{ 13373 , 12203 , 6180	},{ 16917 , 15497 , 7694	},{ 21400 , 19682 , 9578	},{ 27071 , 24996 , 11925	},{ 34245 , 31745 , 14847	},{ 43320 , 40316 , 18484	},{ 54799 , 51201 , 23013	}};
		costoPorNivel = c;
		
		
	}
	
	
	
	public int getCapacidadPorNivel() {
		return capacidadPorNivel[nivel];
	}
	
	@Override
	public int getCantidadTrabajadores() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getCantidadTrabajadoresSiguienteNivel() {
		
		return 0;
		
	}

	
}
