package clases;

import javax.swing.JOptionPane;

import clases.Edificio;
import interfaces.EdificioProduccion;

public class Poblado{
	
	public static final int  BARRERA = 0;
	public static final int  ASERRADERO = 1;
	public static final int  MINADEHIERRO = 2;
	public static final int  ALMACEN = 3;
	public static final int  CASACENTRAL = 4;
	public static final int  CUADRA = 5;
	public static final int  CUARTEL = 6;
	public static final int  ESCONDRIJO = 7;
	public static final int  HERRERIA = 8;
	public static final int  MURALLA = 9;
	public static final int  TALLER = 10;
	public static final int  TORRE = 11;
	public static final int  IGLESIA = 12;
	public static final int  CORTE = 13;
	public static final int  ESTATUA = 14;
	public static final int  MERCADO = 15;
	public static final int  GRANJA = 16;
	
	private int moral;
	
	private String nombre,propietario;
	private int madera, barro, hierro, oro, poblacion;
	private Granja granja;
	private Barrera barrera;
	private Aserradero aserradero;
	private MinaDeHierro minaDeHierro;
	private Almacen almacen;
	private CasaCentral casaCentral;
	private Cuadra cuadra;
	private Cuartel cuartel;
	private Escondrijo escondrijo;
	private Herreria herreria;
	private Muralla muralla;
	private Taller taller;
	private TorreDeVigilancia torreDeVigilancia;
	private Iglesia iglesia;
	private Corte corte;
	private Estatua estatua;
	private Mercado mercado;
	
	


	private int nivelGranja, nivelBarrera, nivelAserradero, nivelMinaDeHierro, nivelCasaCentral, nivelCuartel;
	private PuebloEnemigo[] pueblosEnemigos;
	private int[] ubicacionPoblado; 
	
	
	public Poblado(String nombre, String propietario) {
		
		this.nombre = nombre;
		this.propietario = propietario;
		ubicacionPoblado = new int[2];
		moral = 100;
		
		
		granja = new Granja();
		barrera = new Barrera();
		minaDeHierro = new MinaDeHierro();
		aserradero = new Aserradero();
		almacen = new Almacen();
		casaCentral = new CasaCentral();
		cuadra = new Cuadra();
		cuartel = new Cuartel();
		iglesia = new Iglesia();
		escondrijo = new Escondrijo();
		herreria = new Herreria();
		muralla = new Muralla();
		taller = new Taller();
		torreDeVigilancia = new TorreDeVigilancia();
		corte = new Corte();
		estatua = new Estatua();
		mercado = new Mercado();
		
		poblacion = casaCentral.getCantidadTrabajadores() + barrera.getCantidadTrabajadores() + minaDeHierro.getCantidadTrabajadores() + aserradero.getCantidadTrabajadores();
		
		madera = 50000;
		barro = 50000;
		hierro = 50000;
		
		nivelGranja = granja.getNivel();
		nivelAserradero = aserradero.getNivel();
		nivelBarrera = barrera.getNivel();
		nivelMinaDeHierro = minaDeHierro.getNivel();
		
		Thread 	hiloBarro = inicializarHilo(barrera);
		Thread 	hiloMadera = inicializarHilo(aserradero);
		Thread 	hiloHierro = inicializarHilo(minaDeHierro);
		
		hiloBarro.start();
		hiloMadera.start();
		hiloHierro.start();
		
		
		
		
	} 
	
	
	private Thread inicializarHilo(EdificioProduccion ep) {
		
		Thread hilo;
		
		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				while (true) {
					Thread actual = Thread.currentThread();
					
					if (ep.equals(aserradero)) {
						
						if (madera < almacen.getCapacidadPorNivel()) {
							madera++;
						}
					} else if (ep.equals(barrera)) {
						if (barro < almacen.getCapacidadPorNivel()) {
							barro++;
						}
					} else {
						if (hierro < almacen.getCapacidadPorNivel()) {
							hierro++;
						}
					}
					
					
					
					try {
						actual.sleep(60000/ep.getProduccionPorNivel());
					} catch (InterruptedException e) {
						JOptionPane.showMessageDialog(null, "Error al pausar hilo while");
					}
				}
				
			}
			
		};
		
		hilo = new Thread(hiloWhile);
		
		return hilo;
		
	}
	
	public void setUbicacionPoblado(int[] ubicacion) {
		
		ubicacionPoblado = ubicacion; 
		
	}
	
	
	
	public int[] getUbicacionPoblado() {
		return ubicacionPoblado;
	}


	public boolean hayRecursos(int[] costo) {
		
		
		if ((costo[0] <= madera) && (costo[1] <= barro) && (costo[2] <= hierro)) {
			madera -=   costo[0];
			barro -=  costo[1];
			hierro -=  costo[2];
			
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean hayLugarMasPoblacion(int pobladores_agregados) {
		
		if ((pobladores_agregados + poblacion) <= granja.getPoblacionMaxima()) {
			
			
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public void agregarPobladores(int cantidad) {
		this.poblacion+=cantidad;
	}
	
	public boolean sePuedeConstruirCuartel() {
		if (casaCentral.getNivel() < 3) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirCuadra() {
		if ((casaCentral.getNivel() < 10) || (cuartel.getNivel() < 5) || (herreria.getNivel() < 5)) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirTaller() {
		if ((casaCentral.getNivel() < 10) || (herreria.getNivel() < 10)) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirHerreria() {
		if ((casaCentral.getNivel() < 5) || (cuartel.getNivel() < 1)) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirMuralla() {
		if (cuartel.getNivel() < 1) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirCorte() {
		if ((casaCentral.getNivel() < 20) || (mercado.getNivel() < 10) || (herreria.getNivel() < 20)) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirTorre() {
		if ((casaCentral.getNivel() < 5) || (granja.getNivel() < 5)) {
			return false;
		} else {
			return true;
		}
	}	
	
	public boolean sePuedeConstruirMercado() {
		if ((casaCentral.getNivel() < 3) || (almacen.getNivel() < 2)) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean sePuedeCrearSoldadoHachaOEspada() {
		if ((casaCentral.getNivel() < 5) || (herreria.getNivel() < 1)) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean sePuedeCreararquero() {
		if ((casaCentral.getNivel() < 6) || (herreria.getNivel() < 3)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String getPropietario() {
		return propietario;
	}


	public int getMoral() {
		return moral;
	}
	
	public int[] robarMercaderias(int botin) {
		
		int[] botinTotal = new int[3];
		
		botinTotal[0] = 0;
		botinTotal[1] = 0;
		botinTotal[2] = 0;

		if (botin < (madera + barro + hierro)) {
			int i = botin;
			while (i > 0) {
				if (madera > 0) {
					madera--;
					botinTotal[0]++;
					i--;
				}
				if ((barro > 0) && (i>0)) {
					barro--;
					botinTotal[1]++;
					i--;
				}
				if ((hierro > 0) && (i>0)) {
					hierro--;
					botinTotal[2]++;
					i--;
				}
			}
			
			
			
		} else {
			
			botinTotal[0] = madera;
			botinTotal[1] = barro;
			botinTotal[2] = hierro;
			
			

		}
		
		return botinTotal;
	}


	public int getMadera() {
		return madera;
	}
	
	public int getBarro() {
		return barro;
	}
	
	public int getHierro() {
		return hierro;
	}
	
	public int getPoblacion() {
		return poblacion;
	}
	
	public int getPoblacionMax() {
		return granja.getPoblacionMaxima();
	}
	
	public String getNombre() {
		return nombre;
	}


	public Granja getGranja() {
		return granja;
	}


	public Barrera getBarrera() {
		return barrera;
	}


	public Aserradero getAserradero() {
		return aserradero;
	}


	public MinaDeHierro getMinaDeHierro() {
		return minaDeHierro;
	}


	public Almacen getAlmacen() {
		return almacen;
	}


	public CasaCentral getCasaCentral() {
		return casaCentral;
	}


	public Cuadra getCuadra() {
		return cuadra;
	}


	public Cuartel getCuartel() {
		return cuartel;
	}


	public Escondrijo getEscondrijo() {
		return escondrijo;
	}


	public Herreria getHerreria() {
		return herreria;
	}
	
	public Iglesia getIglesia() {
		return iglesia;
	}


	public Muralla getMuralla() {
		return muralla;
	}


	public Taller getTaller() {
		return taller;
	}


	public TorreDeVigilancia getTorreDeVigilancia() {
		return torreDeVigilancia;
	}


	public Corte getCorte() {
		return corte;
	}


	public Estatua getEstatua() {
		return estatua;
	}


	public Mercado getMercado() {
		return mercado;
	}


	public void agregarBotin(int[] botin) {
		
		madera += botin[0];
		barro += botin[1];
		hierro += botin[2];
		
	}


	public void eliminarPoblacion(int unidadesPerdidasEnBatalla) {
		
		poblacion -= unidadesPerdidasEnBatalla;
		
	}
	
	

}


