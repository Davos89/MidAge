package clases;

import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class PuebloEnemigo extends Thread{
	
	private static String[] nombresPobladosEnemigos = {"Fendorland", "Garmor", "Fanidor", "Tramir","Miradir","Polostag","Yuping","Woluham", "Carpague"};
	private static String[] nombresEnemigos = {"Juan", "Pedro", "Leonardo", "Paula","Graciela","Rut","Mario","Emanuel", "Marcos"};
	private static Poblado[] enemigos;
	
	private Poblado pobladoEnemigo;
	private int nivCasa;
	private int nivAserradero;
	private int nivBarrera;
	private int nivMina;
	private int nivGranja;
	private int nivCuartel;
	private int nivCuadra;
	private int nivTaller;
	private int nivHerreria;
	private int nivAlmacen;
	private int nivEscondrijo;
	private int nivIglesia;
	private int nivCorte;
	private int nivEstatua;
	private int nivMercado;
	private int nivMuralla;
	private int nivTorre;
	
	private Thread[] threadEdificio;
	
	private int[] contadorEdificio;
	
	protected int cantLancerosParaCrear;
	private int cantSoldadosEspadasParaCrear;
	private int cantSoldadosHachaParaCrear;
	private int cantArquerosParaCrear;
	private Thread hiloContadorLancero;
	private Thread hiloContadorSoldadoEspada;
	private Thread hiloContadorSoldadoHacha;
	private Thread hiloContadorArquero;
	private int cantunidadesEnviadas;
	
	private Poblado pobladoAtacar;
	protected int[] ejercito;
	protected int unidadesPerdidasEnBatalla;
	protected int[] ejercitoVictorioso;
	protected int[] botin;
	
	
	public static Poblado[] getPueblosEnemigos(int cantidad) {
		
		enemigos = new Poblado[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			
			int numAzar1 = (int) (Math.random() * nombresEnemigos.length);//numero random para elegir nombre
			
			//mientras el nombre elegido esté vacio, sigo creando numeros random
			while (nombresEnemigos[numAzar1].equals("")) {
				
				numAzar1 = (int) (Math.random() * nombresEnemigos.length);
			}
			//cuando haya nombre disponible, se crea un nuevo pueblo enemigo con ese
			//nombre y se elimina el nombre de la lista para evitar repeticiones
			enemigos[i] = new Poblado(nombresPobladosEnemigos[numAzar1],nombresEnemigos[numAzar1]);
			PuebloEnemigo pe = new PuebloEnemigo(enemigos[i]);
			nombresEnemigos[numAzar1] = "";
			nombresPobladosEnemigos[numAzar1] = "";
			
			pe.start();
			
		}
		return enemigos;
		
	}
	
	
	public PuebloEnemigo(Poblado poblado) {
		this.pobladoEnemigo = poblado;
		
		contadorEdificio = new int[17];
		threadEdificio = new Thread[17];
		
		cantLancerosParaCrear = 0;
		cantSoldadosEspadasParaCrear = 0;
		cantSoldadosHachaParaCrear = 0;
		cantArquerosParaCrear = 0;
		cantunidadesEnviadas = 0;
		
		pobladoAtacar = null;
		ejercito = new int[4];
		botin = new int[3];
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		do {
			nivCasa = pobladoEnemigo.getCasaCentral().getNivel();
			 nivAserradero = pobladoEnemigo.getAserradero().getNivel();
			 nivBarrera = pobladoEnemigo.getBarrera().getNivel();
			 nivMina = pobladoEnemigo.getMinaDeHierro().getNivel();
			 nivGranja = pobladoEnemigo.getGranja().getNivel();
			 nivCuartel = pobladoEnemigo.getCuartel().getNivel();
			 nivCuadra = pobladoEnemigo.getCuadra().getNivel();
			 nivTaller = pobladoEnemigo.getTaller().getNivel();
			 nivHerreria = pobladoEnemigo.getHerreria().getNivel();
			 nivAlmacen = pobladoEnemigo.getAlmacen().getNivel();
			 nivEscondrijo = pobladoEnemigo.getEscondrijo().getNivel();
			 nivIglesia = pobladoEnemigo.getIglesia().getNivel();
			 nivCorte = pobladoEnemigo.getCorte().getNivel();
			 nivEstatua = pobladoEnemigo.getEstatua().getNivel();
			 nivMercado = pobladoEnemigo.getMercado().getNivel();
			 nivMuralla = pobladoEnemigo.getMuralla().getNivel();
			 nivTorre = pobladoEnemigo.getTorreDeVigilancia().getNivel();
			 
			 Cuartel cuartel = pobladoEnemigo.getCuartel();
			 
			 
			//1)- subimos casa central, aserradero, barrera y mina de hierro hasta el nivel 4
			if((nivCasa < 4)) {
				if (nivAserradero<4) {
					
					intentarSubirNivel(pobladoEnemigo.getAserradero());
					
					}else if (nivBarrera<4) {
						
						intentarSubirNivel(pobladoEnemigo.getBarrera());
						
						}else if (nivMina<4) {
							intentarSubirNivel(pobladoEnemigo.getMinaDeHierro());
					
							}else {
								intentarSubirNivel(pobladoEnemigo.getCasaCentral());
								
				}
			}
			/*
			 *  2)- Construimos el cuartel, la herrería y la muralla
			 */
			else if (pobladoEnemigo.sePuedeConstruirCuartel() && (nivCuartel == 0)){
				
				intentarSubirNivel(pobladoEnemigo.getCuartel());
				
			} 
			else if (pobladoEnemigo.sePuedeConstruirHerreria() && (nivHerreria == 0)) {
				intentarSubirNivel(pobladoEnemigo.getHerreria());
				
			}
			else if (pobladoEnemigo.sePuedeConstruirMuralla() && (nivMuralla == 0)) {
				intentarSubirNivel(pobladoEnemigo.getMuralla());
				
			}
			
			/*
			 * 3)- Mantenemos un minimo de 10 lanceros
			 */
			
			else if ((cuartel.getCantLancero() < 10) && ((cantLancerosParaCrear + cuartel.getCantLancero() < 10))) {
				intentarCrearUnidad(Cuartel.LANCERO);
			}
			
			/*
			 * 4)- Subimos casa central al nivel 6 y herrería al nivel 3
			 */
			
			else if (nivCasa < 6) {
				intentarSubirNivel(pobladoEnemigo.getCasaCentral());
			}
			else if (nivHerreria < 3) {
				intentarSubirNivel(pobladoEnemigo.getHerreria());
			}
			
			else if ((cuartel.getCantLancero() == 10) || ((cantunidadesEnviadas + cuartel.getCantLancero() <= 10))) {
				Poblado pobladoElegido = pobladoAtacar = elegirPobladoAtacar();
				
				atacar(pobladoElegido);
			}
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
			}
			
			
		} while (pobladoEnemigo.getMoral()!=0);
	}
	
	private void atacar(Poblado pobladoElegido) {

		int[] ubicacionAtaque =  pobladoElegido.getUbicacionPoblado();
		int[] origen = pobladoEnemigo.getUbicacionPoblado();
		
		double distVertical = ubicacionAtaque[0] - origen[0];
		double distHorizontal = ubicacionAtaque[1] - origen[1];
		
		ejercito[Cuartel.LANCERO] = pobladoEnemigo.getCuartel().getCantLancero();
		ejercito[Cuartel.SOLDADOESPADA] = pobladoEnemigo.getCuartel().getCantSoldadoEspada();
		ejercito[Cuartel.SOLDADOHACHA] = pobladoEnemigo.getCuartel().getCantSoldadoHacha();
		ejercito[Cuartel.ARQUERO] = pobladoEnemigo.getCuartel().getCantArquero();
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double distanciaTotal = Double.parseDouble(df.format(Math.sqrt(Math.pow(distVertical, 2)+ Math.pow(distHorizontal, 2))));
		
		int tiempoViaje = (int) (distanciaTotal * 10);
		
		Thread rv = relojViaje(tiempoViaje, pobladoElegido);
		rv.start();
		
	}


	private Thread relojViaje(int tiempoViaje, Poblado pobladoElegido) {
		
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			

			private int bandera;

			@Override
			public void run() {

				Thread.currentThread();
				
				

				for (int i = tiempoViaje; i >= 0; i--) {
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
					}

				}
				if (bandera==1) {
					
					
					Batalla batalla = new Batalla(pobladoEnemigo, pobladoElegido);
					batalla.setEjercitoEnviado(ejercito);
					batalla.iniciar();

					unidadesPerdidasEnBatalla = 0;
					
					if (batalla.getVictoria()) {
						
						ejercitoVictorioso =   batalla.getEjercitoVictorioso();
						
						unidadesPerdidasEnBatalla = 0;
						
						for(int i = 0; i < ejercitoVictorioso.length; i++) {
							unidadesPerdidasEnBatalla += ejercito[i] - ejercitoVictorioso[i];
						}
						
						Thread rv = relojViaje(tiempoViaje, pobladoElegido);
						
//						jLabel_ejercitoEnviado.setText(String.valueOf(ejercitoVictorioso[0]) + " Lanceros, "
//								+ String.valueOf(ejercitoVictorioso[1]) + " Soldados con Espada, "
//										+ String.valueOf(ejercitoVictorioso[2]) +  " Soldados con Hacha, "
//												+ String.valueOf(ejercitoVictorioso[3]) +  " Arqueros");
						
						botin = batalla.getBotinRobado();
//						
//						jLabel_botin.setText("Madera: " + String.valueOf(botin[0]) + "	Barro: " + String.valueOf(botin[1]) + "	Hierro: " + String.valueOf(botin[2]));
//						
//						jLabel_resultadoBatalla.setText("¡VICTORIA!");
//						jLabel_resultadoBatalla.setBackground(Color.GREEN);

						
						rv.start();
						
					} else {
						
//						jLabel_ejercitoEnviado.setText("");
//						jLabel_resultadoBatalla.setText("DERROTA");
						
						for(int i = 0; i < ejercito.length; i++) {
							unidadesPerdidasEnBatalla += ejercito[i];
						}
						
						pobladoEnemigo.eliminarPoblacion(unidadesPerdidasEnBatalla);
//						jLabel_resultadoBatalla.setBackground(Color.RED);
//						jLabel_botin.setText("");
//						jButton_Atacar.setEnabled(true);

					}
					bandera = 2;
					
				}else if (bandera == 2) {
					
					pobladoEnemigo.agregarBotin(botin);
					pobladoEnemigo.getCuartel().agregarEjercitoVictorioso(ejercitoVictorioso);
					
					pobladoEnemigo.eliminarPoblacion(unidadesPerdidasEnBatalla);
					
//					jLabel_botin.setText("");
//					jLabel_resultadoBatalla.setText("");
//					jLabel_ejercitoEnviado.setText("");
					
					bandera=0;
//					jButton_Atacar.setEnabled(true);
				}
//				jButton_Atacar.setEnabled(true);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
	}


	private Poblado elegirPobladoAtacar() {

		Poblado pobladoElegido = null;
		
		Poblado[][] mapa = MapaMundial.getUbicacionPueblos();
		
		do {
			
			int numAzar1 = (int) (Math.random() * mapa.length);
			int numAzar2 = (int) (Math.random() * mapa.length);
			
			pobladoElegido = mapa[numAzar1][numAzar2];
			
		} while (pobladoElegido == null);
		
		return pobladoElegido;
		
	}


	


	private void intentarSubirNivel(Edificio edificio) {
		
		if ((threadEdificio[edificio.codigoEdificio] == null) || (!threadEdificio[edificio.codigoEdificio].isAlive())) {
			contadorEdificio[edificio.codigoEdificio] = 2;
			threadEdificio[edificio.codigoEdificio] = subirNivel(edificio);
			if (threadEdificio[edificio.codigoEdificio] != null) {
				threadEdificio[edificio.codigoEdificio].start();
			}
		}
		
	}
	
	private void intentarCrearUnidad(int codigo) {
		if (pobladoEnemigo.hayLugarMasPoblacion(1) ) {
			
			switch (codigo) {
			case Cuartel.LANCERO:
				if (pobladoEnemigo.hayRecursos(pobladoEnemigo.getCuartel().getCostoLancero())) {

					cantLancerosParaCrear++;
					if (cantLancerosParaCrear == 1) {
						hiloContadorLancero = crearUnidad(Cuartel.LANCERO);
						hiloContadorLancero.start();
					}

				}
				break;
			case Cuartel.SOLDADOESPADA:
				if (pobladoEnemigo.hayRecursos(pobladoEnemigo.getCuartel().getCostoSoldadoEspada())) {

					cantSoldadosEspadasParaCrear++;
					if (cantSoldadosEspadasParaCrear == 1) {
						hiloContadorSoldadoEspada = crearUnidad(Cuartel.SOLDADOESPADA);
						hiloContadorSoldadoEspada.start();
					}

				}
				break;
			case Cuartel.SOLDADOHACHA:
				if (pobladoEnemigo.hayRecursos(pobladoEnemigo.getCuartel().getCostoSoldadoHacha())) {

					cantSoldadosHachaParaCrear++;
					if (cantSoldadosHachaParaCrear == 1) {
						hiloContadorSoldadoHacha = crearUnidad(Cuartel.SOLDADOHACHA);
						hiloContadorSoldadoHacha.start();
					}

				}
				break;
			case Cuartel.ARQUERO:
				if (pobladoEnemigo.hayRecursos(pobladoEnemigo.getCuartel().getCostoArquero())) {

					cantArquerosParaCrear++;
					if (cantArquerosParaCrear == 1) {
						hiloContadorArquero = crearUnidad(Cuartel.ARQUERO);
						hiloContadorArquero.start();
					}

				}
				break;

			default:
				break;
			}
		}
			
	}
	
	private Thread crearUnidad(int codigo) {
		
		
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				do {
					Thread.currentThread();
					
					int segundosTotales = 0;
					
					switch (codigo) {
					case Cuartel.LANCERO:
						segundosTotales = pobladoEnemigo.getCuartel().getTiempoCreacionLancero();
						break;
					case Cuartel.SOLDADOESPADA:
						segundosTotales = pobladoEnemigo.getCuartel().getTiempoCreacionSoldadoEspada();
						break;
					case Cuartel.SOLDADOHACHA:
						segundosTotales = pobladoEnemigo.getCuartel().getTiempoCreacionSoldadoHacha();
						break;
					case Cuartel.ARQUERO:
						segundosTotales = pobladoEnemigo.getCuartel().getTiempoCreacionArquero();
						break;

					default:
						break;
					}


					for (int i = segundosTotales; i >= 0; i--) {

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
					
					switch (codigo) {
					case Cuartel.LANCERO:
						pobladoEnemigo.getCuartel().crearLancero();
						cantLancerosParaCrear--; 
						break;
					case Cuartel.SOLDADOESPADA:
						pobladoEnemigo.getCuartel().crearSoldadoEspada();;
						cantSoldadosEspadasParaCrear--; 
						break;
					case Cuartel.SOLDADOHACHA:
						pobladoEnemigo.getCuartel().crearSoldadoHacha();;
						cantSoldadosHachaParaCrear--; 
						break;
					case Cuartel.ARQUERO:
						pobladoEnemigo.getCuartel().crearArquero();;
						cantArquerosParaCrear--; 
						break;

					default:
						break;
					}


					pobladoEnemigo.agregarPobladores(1);

					

				} while (cantLancerosParaCrear > 0);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
		
			
		}


	private Thread subirNivel(Edificio edificio) {
		
		
		// Si hay recursos para construir y espacio para los nuevos trabajadores del edificio
		
		if (pobladoEnemigo.hayLugarMasPoblacion(edificio.getCantidadTrabajadoresSiguienteNivel() ) ) {
			
			if (!edificio.estaEnMaximoNivel()) {
				if (pobladoEnemigo.hayRecursos(edificio.getCostoSubirNivel())) {

					Thread hilo;

					Runnable hiloWhile = new Runnable() {

						@Override
						public void run() {

							Thread.currentThread();

							pobladoEnemigo.agregarPobladores(edificio.getCantidadTrabajadoresSiguienteNivel()); // Agregamos los pobladores que van a ocupar lugar 
																												// cuando se acabe de subir el nivel del edificio 
																												// para reservar ese lugar y que no provoque conflicto
								while (contadorEdificio[edificio.codigoEdificio] > 0){																			// población
									contadorEdificio[edificio.codigoEdificio]--;
									
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}

								}
									
									 
								
							edificio.subirNivel();
							
						}

					};

					hilo = new Thread(hiloWhile);

					return hilo;

				} else {
					System.err.println("No hay recursos");
					return null;
				} 
			}else {
				System.err.println(edificio.toString() + "Está en Maximo nivel");
				return null;
			}
			
		} else {
			subirNivel(pobladoEnemigo.getGranja());
			System.err.println("No hay Mas poblacion");
			return null;
		}
		
	}

}
