package clases;

public class Batalla {
	
	
	
	private int lancerosEnviados, soldadosEspadaEnviados, soldadosHachaEnviados, arquerosEnviados;
	private int[] botinRobado;
	private boolean victoria;
	private int resultadoBatalla;
	private Poblado puebloAtacante, puebloDefensor;
	private Cuartel cuartelAtacante;
	private Cuartel cuartelDefensor;
	private int botinGeneral;
	private int[] ejercitoVictorioso;
	private int fuerzaAtaque;
	private int fuerzaDefensa;

	public Batalla(Poblado puebloAtacante, Poblado puebloDefensor) {
		
		this.puebloAtacante = puebloAtacante;
		this.puebloDefensor = puebloDefensor;
		
		cuartelAtacante = puebloAtacante.getCuartel();
		cuartelDefensor = puebloDefensor.getCuartel();
		ejercitoVictorioso = new int[4];
			
		
	}

	public void iniciar() {
		
		fuerzaAtaque = getFuerzaAtaque();
		
		fuerzaDefensa = getFuerzaDefensa();
		
		
		resultadoBatalla = fuerzaAtaque - fuerzaDefensa;

		if (resultadoBatalla > 0) {
			
			cuartelDefensor.eliminarTodosLosSoldados();
			
			//si hay o no defensa
			if (fuerzaDefensa != 0) {
				
				// si la defensa es mayor que el ataque de los lanceros eliminamos todos los
				// lanceros atacantes
				if ((lancerosEnviados * cuartelAtacante.getAtkLancero()) <= fuerzaDefensa) {

					
					fuerzaDefensa -= lancerosEnviados * cuartelAtacante.getAtkLancero();
					lancerosEnviados = 0;

					// si la defensa restante es mayor que el ataque de los soldados con espada eliminamos todos los
					// soldados con espada atacantes
					if ((soldadosEspadaEnviados * cuartelAtacante.getAtkSoldadoEspada()) <= fuerzaDefensa) {

						
						fuerzaDefensa -= soldadosEspadaEnviados * cuartelAtacante.getAtkSoldadoEspada();
						soldadosEspadaEnviados = 0;

						// si la defensa restante es mayor que el ataque de los soldados con hacha eliminamos todos los
						// soldados con hacha atacantes
						if ((soldadosHachaEnviados * cuartelAtacante.getAtkSoldadoHacha()) <= fuerzaDefensa) {

							
							fuerzaDefensa -= soldadosHachaEnviados * cuartelAtacante.getAtkSoldadoHacha();
							soldadosHachaEnviados = 0;

							// si la defensa restante es mayor que el ataque de los arqueros eliminamos todos los
							// arqueros atacantes
							if ((arquerosEnviados * cuartelAtacante.getAtkArquero()) <= fuerzaDefensa) {

								
								fuerzaDefensa -= arquerosEnviados * cuartelAtacante.getAtkArquero();
								arquerosEnviados = 0;


							} else {
								// si la defensa es menor que el ataque de los arqueros eliminamos los
								// arqueros atacantes según la cantidad de puntos de defensa que posea el defensor
								
								int arquerosEliminados = (fuerzaDefensa / cuartelAtacante.getAtkArquero());
								
								arquerosEnviados -= arquerosEliminados;
								
								if((fuerzaDefensa % cuartelAtacante.getAtkArquero()) != 0) {
									arquerosEnviados -= 1;
								}
							} 
							

						} else {
							// si la defensa es menor que el ataque de los soldados con hacha eliminamos los
							// soldados con hacha atacantes según la cantidad de puntos de defensa que posea el defensor
							
							int soldadosHachaEliminados = (fuerzaDefensa / cuartelAtacante.getAtkSoldadoHacha());
							
							soldadosHachaEnviados -= soldadosHachaEliminados;
							
							if((fuerzaDefensa % cuartelAtacante.getAtkSoldadoHacha()) != 0) {
								soldadosHachaEnviados -= 1;
							}
						}

					} else {
						// si la defensa es menor que el ataque de los soldados con espada eliminamos los
						// soldados con espada atacantes según la cantidad de puntos de defensa que posea el defensor
						
						int soldadosEspadaEliminados = (fuerzaDefensa / cuartelAtacante.getAtkSoldadoEspada());
						
						soldadosEspadaEnviados -= soldadosEspadaEliminados;
						
						if((fuerzaDefensa % cuartelAtacante.getAtkSoldadoEspada()) != 0) {
							soldadosEspadaEnviados -= 1;
						}
					} 

				}else {
					// si la defensa es menor que el ataque de los lanceros eliminamos los
					// lanceros atacantes según la cantidad de puntos de defensa que posea el defensor
					
					int lacerosEliminados = (fuerzaDefensa / cuartelAtacante.getAtkLancero());
					
					lancerosEnviados -= lacerosEliminados;
					
					if((fuerzaDefensa % cuartelAtacante.getAtkLancero()) != 0) {
						lancerosEnviados -= 1;
					}
				} 
				
			}
			botinGeneral = getBotinGeneral();
				
			botinRobado = puebloDefensor.robarMercaderias(botinGeneral);
			victoria = true;
			
		} else {
			
			victoria = false;

		}
		
	}

	private int getBotinGeneral() {
		int b = lancerosEnviados * cuartelAtacante.getBotinLancero() +
				soldadosEspadaEnviados * cuartelAtacante.getBotinSoldadoEspada() +
				soldadosHachaEnviados * cuartelAtacante.getBotinSoldadoHacha() +
				arquerosEnviados * cuartelAtacante.getBotinArquero();
		return b;
	}

	private int getFuerzaDefensa() {
		float fuerzaDefensa = (float) (cuartelDefensor.getCantLancero() * cuartelDefensor.getDefLancero() +
				cuartelDefensor.getCantSoldadoEspada() * cuartelDefensor.getDefSoldadoEspada() +
				cuartelDefensor.getCantSoldadoHacha() * cuartelDefensor.getDefSoldadoHacha() +
				cuartelDefensor.getCantArquero() * cuartelDefensor.getDefArquero());
		
		float factorDefensa = (float) (puebloDefensor.getMuralla().getFactorDefensa());
		
		fuerzaDefensa += fuerzaDefensa * (factorDefensa / 100);
		return (int) fuerzaDefensa;
	}

	private int getFuerzaAtaque() {
		int fAtaque = lancerosEnviados * cuartelAtacante.getAtkLancero() +
				soldadosEspadaEnviados * cuartelAtacante.getAtkSoldadoEspada() +
				soldadosHachaEnviados * cuartelAtacante.getAtkSoldadoHacha() +
				arquerosEnviados * cuartelAtacante.getAtkArquero();
		
		return fAtaque;
	}
		
	public void setEjercitoEnviado(int[] ejercito) {
		
		lancerosEnviados = ejercito[Cuartel.LANCERO];
		soldadosEspadaEnviados = ejercito[Cuartel.SOLDADOESPADA];
		soldadosHachaEnviados = ejercito[Cuartel.SOLDADOHACHA];
		arquerosEnviados = ejercito[Cuartel.ARQUERO];
		
	}
	
	public int[] getEjercitoVictorioso() {
		
		ejercitoVictorioso[Cuartel.LANCERO] = lancerosEnviados;
		ejercitoVictorioso[Cuartel.SOLDADOESPADA] = soldadosEspadaEnviados;
		ejercitoVictorioso[Cuartel.SOLDADOHACHA] = soldadosHachaEnviados;
		ejercitoVictorioso[Cuartel.ARQUERO] = arquerosEnviados;
		
		return ejercitoVictorioso;
		
	}

	public boolean getVictoria() {
		// TODO Auto-generated method stub
		return victoria;
	}

	public int[] getBotinRobado() {
		return botinRobado;
	}
	

}
