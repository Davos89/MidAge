package clases;

public abstract class Edificio {
	
	
	
	protected int nivel, nivelMax, codigoEdificio;
	
	protected int[][] costoPorNivel;
	protected int[] trabajadoresUtilizados;
	
	
	
	
	public void subirNivel() {
		if (nivel<nivelMax) {
			nivel++;
		}
	}

	
	public int getNivel() {
		return nivel;
	}

	
	public int getMaxNivel() {
		// TODO Auto-generated method stub
		return nivelMax;
	}

	
	public int getCantidadTrabajadores() {
		// TODO Auto-generated method stub
		return trabajadoresUtilizados[nivel];
	}

	
	public int[] getCostoSubirNivel() {
		// TODO Auto-generated method stub
		if ((nivel +1)<=nivelMax) {
			return costoPorNivel[nivel + 1];
		} else {
			int c[]= {0,0,0};
			return c;
		}
	}

	
	public int getCantidadTrabajadoresSiguienteNivel() {
		if ((nivel + 1) <= nivelMax) {
			return trabajadoresUtilizados[nivel + 1] - trabajadoresUtilizados[nivel];
		} else {
			return 0;
		}
	}
	
	public boolean estaEnMaximoNivel() {
		
		int[] costo = getCostoSubirNivel();
		if (costo[0] == 0) {
			return true;
		} else {
			return false;
		}
		
	}


}
