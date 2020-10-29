package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Batalla;
import clases.Cuartel;
import clases.Edificio;
import clases.MapaMundial;
import clases.Poblado;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;

public class VentanaDelJuego extends JFrame {

	private JPanel contentPane;
	private JLabel jLabel_madera, jLabel_barro, jLabel_hierro, jLabel_oro;
	private Poblado pobladoJugador;
	private MapaMundial mapaMundial;
	private JButton jButton_mapa;
	private JLabel lblNewLabel;
	private JLabel jLabel_Poblacion;
	private JPanel panel_poblado;
	private JLabel jLabel_nivelCasaCentral;
	private JButton jButton_subirNivelCasaCentral;
	private JLabel jLabel_madera_casa;
	private JLabel jLabel_barro_casa;
	private JLabel jLabel_hierro_casa;
	private JLabel jLabel_nivelGranja;
	private JLabel jLabel_madera_granja;
	private JLabel jLabel_barro_granja;
	private JLabel jLabel_hierro_granja;
	private JLabel jLabel_nivelAserradero;
	private JLabel jLabel_madera_aserradero;
	private JLabel jLabel_barro_aserradero;
	private JLabel jLabel_hierro_aserradero;
	private JLabel jLabel_nivelBarrera;
	private JLabel jLabel_madera_barrera;
	private JLabel jLabel_barro_barrera;
	private JLabel jLabel_hierro_barrera;
	private JLabel jLabel_nivelMinaHierro;
	private JLabel jLabel_madera_mina;
	private JLabel jLabel_barro_mina;
	private JLabel jLabel_hierro_mina;
	private JLabel jLabel_nivelCuartel;
	private JButton jButton_subirNivelCuartel;
	private JLabel jLabel_madera_cuartel;
	private JLabel jLabel_barro_cuartel;
	private JLabel jLabel_hierro_cuartel;
	private JLabel jLabel_nivelPlaza;
	private JButton jButton_subirNivelCuadra;
	private JLabel[][] mapLabels;
	private JButton jButton_VerPoblado;
	private JButton jButton_VerCuartel;
	private JPanel panel_contenedorDelMapa;
	private JPanel panel_mapa;
	private JPanel panel_cuartel;
	private JLayeredPane layeredPane_principal;
	private JLabel lblNewLabel_1;
	private JLabel jLabel_lanceros,jLabel_lancerosP;
	private JLabel jLabel_SoldadosEspada,jLabel_SoldadosEspadaP;
	private JLabel jLabel_SoldadosHacha,jLabel_SoldadosHachaP;
	private JLabel jLabel_arqueros,jLabel_arquerosP;
	private JButton jButton_crearLancero;
	private JButton jButton_crearSoldadoEspada;
	private JButton jButton_crearSoldadoHacha;
	private JButton jButton_crearArquero;
	private JLabel jLabel_relojCreacionLancero;
	private JLabel jLabel_relojCreacionSoldadoEspada;
	private JLabel jLabel_relojCreacionSoldadoHacha;
	private JLabel jLabel_relojCreacionArquero;
	private JLabel jLabel_cantLanceros;
	private JLabel jLabel_cantSoldadosEspada;
	private JLabel jLabel_cantSoldadosHacha;
	private JLabel jLabel_cantArqueros;
	private Thread hiloContadorLancero;
	protected Thread hiloContadorSoldadoEspada;
	protected Thread hiloContadorSoldadoHacha;
	protected Thread hiloContadorArquero;
	private int cantLancerosParaCrear;
	private int cantSoldadoEspadaParaCrear;
	private int cantSoldadoHachaParaCrear;
	private int cantArqueroParaCrear;
	private JLabel jLabel_nivelCuadra;
	private JLabel jLabel_nivelTaller;
	private JLabel jLabel_nivelHerreria;
	private JLabel jLabel_nivelAlmacen;
	private JButton jButton_subirNivelTaller;
	private JButton jButton_subirNivelHerreria;
	private JButton jButton_subirNivelAlmacen;
	private JLabel jLabel_nivelEscondrijo;
	private JLabel jLabel_nivelIglesia;
	private JLabel jLabel_nivelCorte;
	private JLabel jLabel_nivelEstatua;
	private JLabel jLabel_nivelMercado;
	private JLabel jLabel_nivelMuralla;
	private JLabel jLabel_nivelTorre;
	private JLabel jLabel_madera_cuadra;
	private JLabel jLabel_madera_taller;
	private JLabel jLabel_madera_herreria;
	private JLabel jLabel_madera_almacen;
	private JLabel jLabel_madera_escondrijo;
	private JLabel jLabel_madera_iglesia;
	private JLabel jLabel_madera_corte;
	private JLabel jLabel_madera_estatua;
	private JLabel jLabel_madera_mercado;
	private JLabel jLabel_madera_muralla;
	private JLabel jLabel_madera_torre;
	private JLabel jLabel_barro_cuadra;
	private JLabel jLabel_barro_taller;
	private JLabel jLabel_barro_herreria;
	private JLabel jLabel_barro_almacen;
	private JLabel jLabel_barro_escondrijo;
	private JLabel jLabel_barro_iglesia;
	private JLabel jLabel_barro_corte;
	private JLabel jLabel_barro_estatua;
	private JLabel jLabel_barro_mercado;
	private JLabel jLabel_barro_muralla;
	private JLabel jLabel_barro_torre;
	private JButton jButton_subirNivelEscondrijo;
	private JButton jButton_subirNivelIglesia;
	private JButton jButton_subirNivelCorte;
	private JButton jButton_subirNivelEstatua;
	private JButton jButton_subirNivelMercado;
	private JButton jButton_subirNivelMuralla;
	private JButton jButton_subirNivelTorre;
	private JLabel jLabel_hierro_cuadra;
	private JLabel jLabel_hierro_taller;
	private JLabel jLabel_hierro_herreria;
	private JLabel jLabel_hierro_almacen;
	private JLabel jLabel_hierro_escondrijo;
	private JLabel jLabel_hierro_iglesia;
	private JLabel jLabel_hierro_corte;
	private JLabel jLabel_hierro_estatua;
	private JLabel jLabel_hierro_mercado;
	private JLabel jLabel_hierro_muralla;
	private JLabel jLabel_hierro_torre;
	private JLabel jLabel_requisitos_cuartel_3;
	private JLabel jLabel_poblacion_casaCentral;
	private JLabel jLabel_poblacion_granja;
	private JLabel jLabel_poblacion_aserradero;
	private JLabel jLabel_poblacion_barrera;
	private JLabel jLabel_poblacion_minaHierro;
	private JLabel jLabel_poblacion_cuartel;
	private JLabel jLabel_poblacion_cuadra;
	private JLabel jLabel_poblacion_taller;
	private JLabel jLabel_poblacion_herreria;
	private JLabel jLabel_poblacion_escondrijo;
	private JLabel jLabel_poblacion_iglesia;
	private JLabel jLabel_poblacion_corte;
	private JLabel jLabel_poblacion_estatua;
	private JLabel jLabel_poblacion_mercado;
	private JLabel jLabel_poblacion_muralla;
	private JLabel jLabel_poblacion_torre;
	private JLabel jLabel_poblacion_plaza;
	private JPanel panel_plaza;
	private JLabel  jLabel_maxLanceros,jLabel_maxSoldadosEspada,
		jLabel_maxSoldadosHacha, jLabel_maxArqueros;
	private JSpinner  spinner_Lanceros, spinner_SoldadosHacha,spinner_SoldadosEspada,spinner_Arqueros;
	private JButton btnNewButton;
	private JLabel jLabel_posicionEnemigo;
	private JButton jButton_Atacar;
	private int[] ubicacionEnemigo = {10,10};
	private int[] ubicacionJugador = new int[2];
	private Thread relojViaje;
	private JLabel jLabel_relojTropas;
	private int bandera;
	private JButton jButton_VerPlaza;
	private Poblado[][] ubicacionPueblos;
	private JTextPane textPane_listaEnemigos;
	private JButton jButton_actualizarEnemigos;
	private JLabel jLabel_ejercitoEnviado;
	private JLabel jLabel_botin;
	private JLabel jLabel_resultadoBatalla;
	private int[] botin;
	protected int[] ejercitoVictorioso;
	protected int unidadesPerdidasEnBatalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDelJuego frame = new VentanaDelJuego(null,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaDelJuego(Poblado pobladoJugador, MapaMundial mapaMundial) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaDelJuego.class.getResource("/images/IconoEspada.png")));
		setResizable(false);
		setTitle("Middle Age - " + pobladoJugador.getNombre() + " de " + pobladoJugador.getPropietario());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.pobladoJugador = pobladoJugador;
		this.mapaMundial = mapaMundial;
		cantLancerosParaCrear = 0;
		
		
		
		/**
		 * Diseño del panel norte y sus componentes
		 */
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(new Color(200, 184, 135));
		panel_norte.setBorder(new LineBorder(new Color(139, 69, 19), 2));
		panel_norte.setBounds(0, 0, 1194, 35);
		contentPane.add(panel_norte);
		
		jLabel_madera = new JLabel("Madera");
		 jLabel_madera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		panel_norte.add(jLabel_madera);
		
		 jLabel_barro = new JLabel("Barro");
		 jLabel_barro.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		panel_norte.add(jLabel_barro);
		
		 jLabel_hierro = new JLabel("Hierro");
		 jLabel_hierro.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		panel_norte.add(jLabel_hierro);
		
		 jLabel_oro = new JLabel("Oro");
		panel_norte.add(jLabel_oro);
		
		jButton_mapa = new JButton("Mapa");
		jButton_mapa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane_principal.removeAll();
				layeredPane_principal.add(panel_contenedorDelMapa);
				layeredPane_principal.repaint();
				layeredPane_principal.revalidate();
				
			}
		});
		
		panel_norte.add(jButton_mapa);
		
		lblNewLabel = new JLabel("                     ");
		panel_norte.add(lblNewLabel);
		
		jLabel_Poblacion = new JLabel("");
		panel_norte.add(jLabel_Poblacion);
		
		
		/**
		 * Diseño del panel izquierdo y sus componentes
		 */
		
		JPanel panel_oeste = inicializarPanelOeste();
		contentPane.add(panel_oeste);
		
		/**
		 * Controlador de paneles
		 */
		
		layeredPane_principal = new JLayeredPane();
		layeredPane_principal.setBounds(120, 35, 1074, 730);
		contentPane.add(layeredPane_principal);
		layeredPane_principal.setLayout(new CardLayout(0, 0));
		
		/**
		 * Diseño del panel del poblado y sus componentes que será añadido a layeredPane_principal
		 */
		
		panel_poblado = inicializarPanelPoblado();
		layeredPane_principal.add(panel_poblado, "name_523515338341400");
		
		
		
		/**
		 * Cuartel
		 */
		
		panel_cuartel = inicializarPanelCuartel();
		layeredPane_principal.add(panel_cuartel, "name_605147047660400");
		
		
		/**
		 * Mapa mundial y su contenedor
		 */
		
		this.mapaMundial = mapaMundial; 
		ubicacionPueblos = this.mapaMundial.getUbicacionPueblos();
		
		mapLabels = new JLabel[ubicacionPueblos.length][ubicacionPueblos.length];
		
		panel_contenedorDelMapa = new JPanel();
		panel_contenedorDelMapa.setBackground(new Color(34, 139, 34));
		layeredPane_principal.add(panel_contenedorDelMapa, "name_528250626953000");
		panel_contenedorDelMapa.setLayout(null);
		
		panel_mapa = new JPanel();
		
		panel_contenedorDelMapa.add(panel_mapa);
		
		
		
//		panel_mapa.setBounds(0, 0,(80 * mapaMundial.getUbicacionPueblos().length), 80 * mapaMundial.getUbicacionPueblos().length);
//		panel_mapa.setLayout(new GridLayout(ubicacionPueblos.length, ubicacionPueblos.length, 0, 0));
		
		for (int i = 0; i < ubicacionPueblos.length; i++) {
			for (int j = 0; j < ubicacionPueblos.length; j++) {
				
				if (ubicacionPueblos[i][j] != null) {
					mapLabels[i][j] =  new JLabel();
					mapLabels[i][j].setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/pueblo Mapa.png")));
					mapLabels[i][j].setToolTipText(ubicacionPueblos[i][j].getNombre());
					if (ubicacionPueblos[i][j].getNombre().equals(pobladoJugador.getNombre())) {
						ubicacionJugador[0] = i;
						ubicacionJugador[1] = j;
					}
					final int v = i;
					final int h = j;
					
					if (!ubicacionPueblos[i][j].getNombre().equals(pobladoJugador.getNombre())) {
						mapLabels[i][j].addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {

								enviarDatosPoblado(v, h);
								ubicacionEnemigo[0] = v;
								ubicacionEnemigo[1] = h;

								layeredPane_principal.removeAll();
								layeredPane_principal.add(panel_plaza);
								layeredPane_principal.repaint();
								layeredPane_principal.revalidate();

							}
						});
					}
					panel_mapa.add(mapLabels[i][j]);
				} else {
					mapLabels[i][j] =  new JLabel();
					mapLabels[i][j].setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/vacio Mapa.png")));
					panel_mapa.add(mapLabels[i][j]);


				}
				
			}
		}
		
		/**
		 * diseño panel plaza
		 */
		
		panel_plaza = inicializarPanelPlaza();

		layeredPane_principal.add(panel_plaza);
		
		
		
		Thread hilo = inicializarHiloModificacionLabels();
		hilo.start();
	}
	
	private Thread inicializarHiloModificacionLabels() {
		
		Thread hilo;
		
		Runnable hiloModificacionLabels = new Runnable() {

			@Override
			public void run() {
				while (true) {
					Thread.currentThread();
					
					jLabel_madera.setText("Madera " + pobladoJugador.getMadera() + "/" + pobladoJugador.getAlmacen().getCapacidadPorNivel());
					jLabel_barro.setText("Barro " + pobladoJugador.getBarro() + "/" + pobladoJugador.getAlmacen().getCapacidadPorNivel());
					jLabel_hierro.setText("Hierro " + pobladoJugador.getHierro() + "/" + pobladoJugador.getAlmacen().getCapacidadPorNivel());
					jLabel_Poblacion.setText(pobladoJugador.getPoblacion() + "/" + pobladoJugador.getPoblacionMax());
					
					
					jLabel_nivelCasaCentral.setText("Casa Central (Nivel "+ pobladoJugador.getCasaCentral().getNivel() +")");
					jLabel_nivelGranja.setText("Granja (Nivel "+ pobladoJugador.getGranja().getNivel() +")");
					jLabel_nivelAserradero.setText("Aserradero (Nivel "+ pobladoJugador.getAserradero().getNivel() +")");
					jLabel_nivelBarrera.setText("Barrera (Nivel "+ pobladoJugador.getBarrera().getNivel() +")");
					jLabel_nivelMinaHierro.setText("Mina de Hierro (Nivel "+ pobladoJugador.getMinaDeHierro().getNivel() +")");
					if (pobladoJugador.getCuartel().getNivel() > 0) {
						jLabel_nivelCuartel.setText("Cuartel (Nivel " + pobladoJugador.getCuartel().getNivel() + ")");
					} else {
						jLabel_nivelCuartel.setText("Cuartel (Sin Construir)");
					}
					if (pobladoJugador.getCuadra().getNivel() > 0) {
						jLabel_nivelCuadra.setText("Cuadra (Nivel " + pobladoJugador.getCuadra().getNivel() + ")");
					} else {
						jLabel_nivelCuadra.setText("Cuadra (Sin Construir)");
					}
					if (pobladoJugador.getAlmacen().getNivel() > 0) {
						jLabel_nivelAlmacen.setText("Almacén (Nivel " + pobladoJugador.getAlmacen().getNivel() + ")");
					} else {
						jLabel_nivelAlmacen.setText("Almacén (Sin Construir)");
					}
					if (pobladoJugador.getTaller().getNivel() > 0) {
						jLabel_nivelTaller.setText("Taller (Nivel " + pobladoJugador.getTaller().getNivel() + ")");
					} else {
						jLabel_nivelTaller.setText("Taller (Sin Construir)");
					}
					if (pobladoJugador.getHerreria().getNivel() > 0) {
						jLabel_nivelHerreria
								.setText("Herrería (Nivel " + pobladoJugador.getHerreria().getNivel() + ")");
					} else {
						jLabel_nivelHerreria
						.setText("Herrería (Sin Construir)");
					}
					if (pobladoJugador.getEscondrijo().getNivel() > 0) {
						jLabel_nivelEscondrijo
								.setText("Escondrijo (Nivel " + pobladoJugador.getEscondrijo().getNivel() + ")");
					} else {
						jLabel_nivelEscondrijo
						.setText("Escondrijo (Sin Construir)");
					}
					if (pobladoJugador.getIglesia().getNivel() > 0) {
						jLabel_nivelIglesia.setText("Iglesia (Nivel " + pobladoJugador.getIglesia().getNivel() + ")");
					} else {
						jLabel_nivelIglesia.setText("Iglesia (Sin Construir)");
					}
					
					
					if (pobladoJugador.getCorte().getNivel() > 0) {
						jLabel_nivelCorte.setText("Corte (Nivel "+ pobladoJugador.getCorte().getNivel() +")");
					}else {
						jLabel_nivelCorte.setText("Corte (Sin construir)");
					}
					if (pobladoJugador.getEstatua().getNivel() > 0) {
						jLabel_nivelEstatua.setText("Estatua (Nivel "+ pobladoJugador.getEstatua().getNivel() +")");
					}else {
						jLabel_nivelEstatua.setText("Estatua (Sin construir)");
					}
					if (pobladoJugador.getMercado().getNivel() > 0) {
						jLabel_nivelMercado.setText("Mercado (Nivel "+ pobladoJugador.getMercado().getNivel() +")");
					}else {
						jLabel_nivelMercado.setText("Mercado (Sin construir)");
						
					}
					
					
					if (pobladoJugador.getMuralla().getNivel() > 0) {
						jLabel_nivelMuralla.setText("Muralla (Nivel " + pobladoJugador.getMuralla().getNivel() + ")");
					} else {
						jLabel_nivelMuralla.setText("Muralla (Sin Construir)");
					}
					if (pobladoJugador.getTorreDeVigilancia().getNivel() > 0) {
						jLabel_nivelTorre.setText(
								"Torre de vigilancia (Nivel " + pobladoJugador.getTorreDeVigilancia().getNivel() + ")");
					} else {
						jLabel_nivelTorre.setText(
								"Torre de vigilancia (Sin Construir)");
					}
					
					
					
					/**
					 * Costo de subir nivel un edificio 
					 */
					
					int[] costoAserradero = pobladoJugador.getAserradero().getCostoSubirNivel();
					int[] costoBarrera = pobladoJugador.getBarrera().getCostoSubirNivel();
					int[] costoCasaCentral = pobladoJugador.getCasaCentral().getCostoSubirNivel();
					int[] costoGranja = pobladoJugador.getGranja().getCostoSubirNivel();
					int[] costoMina = pobladoJugador.getMinaDeHierro().getCostoSubirNivel();
					int[] costoCuartel = pobladoJugador.getCuartel().getCostoSubirNivel();
					int[] costoCuadra = pobladoJugador.getCuadra().getCostoSubirNivel();
					int[] costoAlmacen = pobladoJugador.getAlmacen().getCostoSubirNivel();
					int[] costoTaller = pobladoJugador.getTaller().getCostoSubirNivel();
					int[] costoHerreria = pobladoJugador.getHerreria().getCostoSubirNivel();
					int[] costoEscondrijo = pobladoJugador.getEscondrijo().getCostoSubirNivel();
					int[] costoIglesia = pobladoJugador.getIglesia().getCostoSubirNivel();
					int[] costoMuralla = pobladoJugador.getMuralla().getCostoSubirNivel();
					int[] costoTorre = pobladoJugador.getTorreDeVigilancia().getCostoSubirNivel();
					
					jLabel_madera_aserradero.setText(String.valueOf(costoAserradero[0]));
					jLabel_madera_barrera.setText(String.valueOf(costoBarrera[0]));
					jLabel_madera_casa.setText(String.valueOf(costoCasaCentral[0]));
					jLabel_madera_granja.setText(String.valueOf(costoGranja[0]));
					jLabel_madera_mina.setText(String.valueOf(costoMina[0]));
					jLabel_madera_cuartel.setText(String.valueOf(costoCuartel[0]));
					jLabel_madera_cuadra.setText(String.valueOf(costoCuadra[0]));
					jLabel_madera_almacen.setText(String.valueOf(costoAlmacen[0]));
					jLabel_madera_taller.setText(String.valueOf(costoTaller[0]));
					jLabel_madera_herreria.setText(String.valueOf(costoHerreria[0]));
					jLabel_madera_escondrijo.setText(String.valueOf(costoEscondrijo[0]));
					jLabel_madera_iglesia.setText(String.valueOf(costoIglesia[0]));
					jLabel_madera_muralla.setText(String.valueOf(costoMuralla[0]));
					jLabel_madera_torre.setText(String.valueOf(costoTorre[0]));
					
					jLabel_barro_aserradero.setText(String.valueOf(costoAserradero[1]));
					jLabel_barro_barrera.setText(String.valueOf(costoBarrera[1]));
					jLabel_barro_casa.setText(String.valueOf(costoCasaCentral[1]));
					jLabel_barro_granja.setText(String.valueOf(costoGranja[1]));
					jLabel_barro_mina.setText(String.valueOf(costoMina[1]));
					jLabel_barro_cuartel.setText(String.valueOf(costoCuartel[1]));
					jLabel_barro_cuadra.setText(String.valueOf(costoCuadra[1]));
					jLabel_barro_almacen.setText(String.valueOf(costoAlmacen[1]));
					jLabel_barro_taller.setText(String.valueOf(costoTaller[1]));
					jLabel_barro_herreria.setText(String.valueOf(costoHerreria[1]));
					jLabel_barro_escondrijo.setText(String.valueOf(costoEscondrijo[1]));
					jLabel_barro_iglesia.setText(String.valueOf(costoIglesia[1]));
					jLabel_barro_muralla.setText(String.valueOf(costoMuralla[1]));
					jLabel_barro_torre.setText(String.valueOf(costoTorre[1]));
					
					jLabel_hierro_aserradero.setText(String.valueOf(costoAserradero[2]));
					jLabel_hierro_barrera.setText(String.valueOf(costoBarrera[2]));
					jLabel_hierro_casa.setText(String.valueOf(costoCasaCentral[2]));
					jLabel_hierro_granja.setText(String.valueOf(costoGranja[2]));
					jLabel_hierro_mina.setText(String.valueOf(costoMina[2]));
					jLabel_hierro_cuartel.setText(String.valueOf(costoCuartel[2]));
					jLabel_hierro_cuadra.setText(String.valueOf(costoCuadra[2]));
					jLabel_hierro_almacen.setText(String.valueOf(costoAlmacen[2]));
					jLabel_hierro_taller.setText(String.valueOf(costoTaller[2]));
					jLabel_hierro_herreria.setText(String.valueOf(costoHerreria[2]));
					jLabel_hierro_escondrijo.setText(String.valueOf(costoEscondrijo[2]));
					jLabel_hierro_iglesia.setText(String.valueOf(costoIglesia[2]));
					jLabel_hierro_muralla.setText(String.valueOf(costoMuralla[2]));
					jLabel_hierro_torre.setText(String.valueOf(costoTorre[2]));
					
					/**
					 * Labels de población necesaria para siguiente nivel 
					 */
					
					jLabel_poblacion_casaCentral.setText(String.valueOf(pobladoJugador.getCasaCentral().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_granja.setText(String.valueOf(pobladoJugador.getGranja().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_aserradero.setText(String.valueOf(pobladoJugador.getAserradero().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_barrera.setText(String.valueOf(pobladoJugador.getBarrera().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_minaHierro.setText(String.valueOf(pobladoJugador.getMinaDeHierro().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_cuartel.setText(String.valueOf(pobladoJugador.getCuartel().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_cuadra.setText(String.valueOf(pobladoJugador.getCuadra().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_taller.setText(String.valueOf(pobladoJugador.getTaller().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_herreria.setText(String.valueOf(pobladoJugador.getHerreria().getCantidadTrabajadoresSiguienteNivel()));
					
					jLabel_poblacion_escondrijo.setText(String.valueOf(pobladoJugador.getEscondrijo().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_iglesia.setText(String.valueOf(pobladoJugador.getIglesia().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_muralla.setText(String.valueOf(pobladoJugador.getMuralla().getCantidadTrabajadoresSiguienteNivel()));
					jLabel_poblacion_torre.setText(String.valueOf(pobladoJugador.getTorreDeVigilancia().getCantidadTrabajadoresSiguienteNivel()));
					
					/**
					 * Labels máxima cantidad de soldados que se pueden enviar a atacar
					 */
					
					jLabel_maxLanceros.setText(String.valueOf(pobladoJugador.getCuartel().getCantLancero()));
					Object l = spinner_Lanceros.getValue();
					spinner_Lanceros.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantLancero(), 1));
					spinner_Lanceros.setValue(l);
					Object se = spinner_SoldadosEspada.getValue();
					jLabel_maxSoldadosEspada.setText(String.valueOf(pobladoJugador.getCuartel().getCantSoldadoEspada()));
					spinner_SoldadosEspada.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantSoldadoEspada(), 1));
					spinner_SoldadosEspada.setValue(se);
					Object sh = spinner_SoldadosHacha.getValue();
					jLabel_maxSoldadosHacha.setText(String.valueOf(pobladoJugador.getCuartel().getCantSoldadoHacha()));
					spinner_SoldadosHacha.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantSoldadoHacha(), 1));
					spinner_SoldadosHacha.setValue(sh);
					Object a = spinner_Arqueros.getValue();
					jLabel_maxArqueros.setText(String.valueOf(pobladoJugador.getCuartel().getCantArquero()));
					spinner_Arqueros.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantArquero(), 1));
					spinner_Arqueros.setValue(a);
					
					/**
					 * Labels cuartel
					 */
					
					jLabel_cantLanceros.setText("Cantidad Total: " + pobladoJugador.getCuartel().getCantLancero());
					jLabel_cantSoldadosEspada.setText("Cantidad Total: " + pobladoJugador.getCuartel().getCantSoldadoEspada());
					jLabel_cantSoldadosHacha.setText("Cantidad Total: " + pobladoJugador.getCuartel().getCantSoldadoHacha());
					jLabel_cantArqueros.setText("Cantidad Total: " + pobladoJugador.getCuartel().getCantArquero());
					
					 
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						JOptionPane.showMessageDialog(null, "Error al pausar hilo while");
					}
				}
				
			}
			
		};
		
		hilo = new Thread(hiloModificacionLabels);
		
		return hilo;
	}
	
	/**
		 * Habilitar o deshabilitar botones  
		 * según cumplan o no los requisitos
		 */
	
	private void habilitarODesabilitarBotones() {
		
		
		if (!pobladoJugador.sePuedeConstruirCuartel()) {
			jButton_subirNivelCuartel.setEnabled(false);
		}else {
			jButton_subirNivelCuartel.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirCuadra()) {
			jButton_subirNivelCuadra.setEnabled(false);
		}else {
			jButton_subirNivelCuadra.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirTaller()) {
			jButton_subirNivelTaller.setEnabled(false);
		}else {
			jButton_subirNivelTaller.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirHerreria()) {
			jButton_subirNivelHerreria.setEnabled(false);
		}else {
			jButton_subirNivelHerreria.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirMuralla()) {
			jButton_subirNivelMuralla.setEnabled(false);
		}else {
			jButton_subirNivelMuralla.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirTorre()) {
			jButton_subirNivelTorre.setEnabled(false);
		}else {
			jButton_subirNivelTorre.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirMercado()) {
			jButton_subirNivelMercado.setEnabled(false);
		}else {
			jButton_subirNivelMercado.setEnabled(true);
		}
		
		if (!pobladoJugador.sePuedeConstruirCorte()) {
			jButton_subirNivelCorte.setEnabled(false);
		}else {
			jButton_subirNivelCorte.setEnabled(true);
		}
		
		if (pobladoJugador.sePuedeCrearSoldadoHachaOEspada()) {
			jButton_crearSoldadoEspada.setEnabled(true);
			jButton_crearSoldadoHacha.setEnabled(true);
			
		}
		if (pobladoJugador.sePuedeCreararquero()) {
			jButton_crearArquero.setEnabled(true);
			
		}
		
	}
	
	private JPanel inicializarPanelCuartel() {
		
		JPanel panel_cuartel = new JPanel();
		
		panel_cuartel.setBackground(new Color(223, 184, 135));
		GridBagLayout gbl_panel_cuartel = new GridBagLayout();
		gbl_panel_cuartel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_cuartel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_cuartel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_cuartel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_cuartel.setLayout(gbl_panel_cuartel);
		
		lblNewLabel_1 = new JLabel("Cuartel");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 1;
		panel_cuartel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jLabel_lanceros = new JLabel("Lanceros");
		jLabel_lanceros.setHorizontalTextPosition(SwingConstants.LEFT);
		jLabel_lanceros.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_lanceros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_lanceros = new GridBagConstraints();
		gbc_jLabel_lanceros.anchor = GridBagConstraints.WEST;
		gbc_jLabel_lanceros.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_lanceros.gridx = 1;
		gbc_jLabel_lanceros.gridy = 4;
		panel_cuartel.add(jLabel_lanceros, gbc_jLabel_lanceros);
		
		jButton_crearLancero = new JButton("Crear");
		jButton_crearLancero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.hayLugarMasPoblacion(1) ) {
					if (pobladoJugador.hayRecursos(pobladoJugador.getCuartel().getCostoLancero())) {
					
						cantLancerosParaCrear++;
						if (cantLancerosParaCrear == 1) {
							hiloContadorLancero = crearLancero();
							jButton_crearLancero.setText("Creando " + String.valueOf(cantLancerosParaCrear));
							hiloContadorLancero.start();
						} else {
							
							jButton_crearLancero.setText("Creando " + String.valueOf(cantLancerosParaCrear));
							
		
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "No tienes los recursos para crear lancero");
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "No tienes espacio para crear lanceros");
					
				}
				
				
				
			}
		});
		
		
		
		jButton_crearLancero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_crearLancero.setToolTipText("50 Madera, 30 Barro, 10 Hierro");
		GridBagConstraints gbc_jButton_crearLancero = new GridBagConstraints();
		gbc_jButton_crearLancero.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_crearLancero.gridx = 3;
		gbc_jButton_crearLancero.gridy = 4;
		panel_cuartel.add(jButton_crearLancero, gbc_jButton_crearLancero);
		
		jLabel_relojCreacionLancero = new JLabel("           ");
		jLabel_relojCreacionLancero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_relojCreacionLancero = new GridBagConstraints();
		gbc_jLabel_relojCreacionLancero.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_relojCreacionLancero.gridx = 5;
		gbc_jLabel_relojCreacionLancero.gridy = 4;
		panel_cuartel.add(jLabel_relojCreacionLancero, gbc_jLabel_relojCreacionLancero);
		
		jLabel_cantLanceros = new JLabel("Cantidad Total: 0");
		jLabel_cantLanceros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_cantLanceros = new GridBagConstraints();
		gbc_jLabel_cantLanceros.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_cantLanceros.gridx = 7;
		gbc_jLabel_cantLanceros.gridy = 4;
		panel_cuartel.add(jLabel_cantLanceros, gbc_jLabel_cantLanceros);
		
		jLabel_SoldadosEspada = new JLabel("Soldados con Espada");
		jLabel_SoldadosEspada.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_SoldadosEspada = new GridBagConstraints();
		gbc_jLabel_SoldadosEspada.anchor = GridBagConstraints.WEST;
		gbc_jLabel_SoldadosEspada.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_SoldadosEspada.gridx = 1;
		gbc_jLabel_SoldadosEspada.gridy = 6;
		panel_cuartel.add(jLabel_SoldadosEspada, gbc_jLabel_SoldadosEspada);
		
		jButton_crearSoldadoEspada = new JButton("Crear");
		jButton_crearSoldadoEspada.setEnabled(false);
		jButton_crearSoldadoEspada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.hayLugarMasPoblacion(1) ) {
					if (pobladoJugador.hayRecursos(pobladoJugador.getCuartel().getCostoSoldadoEspada())) {
					
						cantSoldadoEspadaParaCrear++;
						if (cantSoldadoEspadaParaCrear == 1) {
							hiloContadorSoldadoEspada = crearSoldadoEspada();
							jButton_crearSoldadoEspada.setText("Creando " + String.valueOf(cantSoldadoEspadaParaCrear));
							hiloContadorSoldadoEspada.start();
						} else {
							
							jButton_crearSoldadoEspada.setText("Creando " + String.valueOf(cantSoldadoEspadaParaCrear));
							
		
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "No tienes los recursos para crear Soldado con Espada");
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "No tienes espacio para crear Soldado con Espada");
					
				}
			}
		});
		jButton_crearSoldadoEspada.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_crearSoldadoEspada.setToolTipText("<html>-Casa Central: Nivel 5<br>-Herrería: Nivel 1 </html>");
		GridBagConstraints gbc_jButton_crearSoldadoEspada = new GridBagConstraints();
		gbc_jButton_crearSoldadoEspada.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_crearSoldadoEspada.gridx = 3;
		gbc_jButton_crearSoldadoEspada.gridy = 6;
		panel_cuartel.add(jButton_crearSoldadoEspada, gbc_jButton_crearSoldadoEspada);
		
		jLabel_relojCreacionSoldadoEspada = new JLabel("           ");
		jLabel_relojCreacionSoldadoEspada.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_relojCreacionSoldadoEspada = new GridBagConstraints();
		gbc_jLabel_relojCreacionSoldadoEspada.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_relojCreacionSoldadoEspada.gridx = 5;
		gbc_jLabel_relojCreacionSoldadoEspada.gridy = 6;
		panel_cuartel.add(jLabel_relojCreacionSoldadoEspada, gbc_jLabel_relojCreacionSoldadoEspada);
		
		jLabel_cantSoldadosEspada = new JLabel("Cantidad Total: 0");
		jLabel_cantSoldadosEspada.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_cantSoldadosEspada = new GridBagConstraints();
		gbc_jLabel_cantSoldadosEspada.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_cantSoldadosEspada.gridx = 7;
		gbc_jLabel_cantSoldadosEspada.gridy = 6;
		panel_cuartel.add(jLabel_cantSoldadosEspada, gbc_jLabel_cantSoldadosEspada);
		
		jLabel_SoldadosHacha = new JLabel("Soldados con Hacha");
		jLabel_SoldadosHacha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_SoldadosHacha = new GridBagConstraints();
		gbc_jLabel_SoldadosHacha.anchor = GridBagConstraints.WEST;
		gbc_jLabel_SoldadosHacha.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_SoldadosHacha.gridx = 1;
		gbc_jLabel_SoldadosHacha.gridy = 8;
		panel_cuartel.add(jLabel_SoldadosHacha, gbc_jLabel_SoldadosHacha);
		
		jButton_crearSoldadoHacha = new JButton("Crear");
		jButton_crearSoldadoHacha.setEnabled(false);
		jButton_crearSoldadoHacha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.hayLugarMasPoblacion(1) ) {
					if (pobladoJugador.hayRecursos(pobladoJugador.getCuartel().getCostoSoldadoHacha())) {
					
						cantSoldadoHachaParaCrear++;
						if (cantSoldadoHachaParaCrear == 1) {
							hiloContadorSoldadoHacha = crearSoldadoHacha();
							jButton_crearSoldadoHacha.setText("Creando " + String.valueOf(cantSoldadoHachaParaCrear));
							hiloContadorSoldadoHacha.start();
						} else {
							
							jButton_crearSoldadoHacha.setText("Creando " + String.valueOf(cantSoldadoHachaParaCrear));
							
		
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "No tienes los recursos para crear Soldado con Hacha");
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "No tienes espacio para crear Soldado con Hachas");
					
				}
			}
		});
		jButton_crearSoldadoHacha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_crearSoldadoHacha.setToolTipText("<html>-Casa Central: Nivel 5<br>-Herrería: Nivel 1 </html>");
		GridBagConstraints gbc_jButton_crearSoldadoHacha = new GridBagConstraints();
		gbc_jButton_crearSoldadoHacha.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_crearSoldadoHacha.gridx = 3;
		gbc_jButton_crearSoldadoHacha.gridy = 8;
		panel_cuartel.add(jButton_crearSoldadoHacha, gbc_jButton_crearSoldadoHacha);
		
		jLabel_relojCreacionSoldadoHacha = new JLabel("           ");
		jLabel_relojCreacionSoldadoHacha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_relojCreacionSoldadoHacha = new GridBagConstraints();
		gbc_jLabel_relojCreacionSoldadoHacha.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_relojCreacionSoldadoHacha.gridx = 5;
		gbc_jLabel_relojCreacionSoldadoHacha.gridy = 8;
		panel_cuartel.add(jLabel_relojCreacionSoldadoHacha, gbc_jLabel_relojCreacionSoldadoHacha);
		
		jLabel_cantSoldadosHacha = new JLabel("Cantidad Total: 0");
		jLabel_cantSoldadosHacha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_cantSoldadosHacha = new GridBagConstraints();
		gbc_jLabel_cantSoldadosHacha.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_cantSoldadosHacha.gridx = 7;
		gbc_jLabel_cantSoldadosHacha.gridy = 8;
		panel_cuartel.add(jLabel_cantSoldadosHacha, gbc_jLabel_cantSoldadosHacha);
		
		jLabel_arqueros = new JLabel("Arqueros");
		jLabel_arqueros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_arqueros = new GridBagConstraints();
		gbc_jLabel_arqueros.anchor = GridBagConstraints.WEST;
		gbc_jLabel_arqueros.insets = new Insets(0, 0, 0, 5);
		gbc_jLabel_arqueros.gridx = 1;
		gbc_jLabel_arqueros.gridy = 10;
		panel_cuartel.add(jLabel_arqueros, gbc_jLabel_arqueros);
		
		jButton_crearArquero = new JButton("Crear");
		jButton_crearArquero.setEnabled(false);
		jButton_crearArquero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.hayLugarMasPoblacion(1) ) {
					if (pobladoJugador.hayRecursos(pobladoJugador.getCuartel().getCostoArquero())) {
					
						cantArqueroParaCrear++;
						if (cantArqueroParaCrear == 1) {
							hiloContadorArquero = crearArquero();
							jButton_crearArquero.setText("Creando " + String.valueOf(cantArqueroParaCrear));
							hiloContadorArquero.start();
						} else {
							
							jButton_crearArquero.setText("Creando " + String.valueOf(cantArqueroParaCrear));
							
		
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "No tienes los recursos para crear Arquero");
						
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "No tienes espacio para crear Arqueros");
					
				}
			}
		});
		jButton_crearArquero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_crearArquero.setToolTipText("<html>-Casa Central: Nivel 6<br>-Herrería: Nivel 3 </html>");
		GridBagConstraints gbc_jButton_crearArquero = new GridBagConstraints();
		gbc_jButton_crearArquero.insets = new Insets(0, 0, 0, 5);
		gbc_jButton_crearArquero.gridx = 3;
		gbc_jButton_crearArquero.gridy = 10;
		panel_cuartel.add(jButton_crearArquero, gbc_jButton_crearArquero);
		
		jLabel_relojCreacionArquero = new JLabel("           ");
		jLabel_relojCreacionArquero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_relojCreacionArquero = new GridBagConstraints();
		gbc_jLabel_relojCreacionArquero.insets = new Insets(0, 0, 0, 5);
		gbc_jLabel_relojCreacionArquero.gridx = 5;
		gbc_jLabel_relojCreacionArquero.gridy = 10;
		panel_cuartel.add(jLabel_relojCreacionArquero, gbc_jLabel_relojCreacionArquero);
		
		jLabel_cantArqueros = new JLabel("Cantidad Total: 0");
		jLabel_cantArqueros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_cantArqueros = new GridBagConstraints();
		gbc_jLabel_cantArqueros.gridx = 7;
		gbc_jLabel_cantArqueros.gridy = 10;
		panel_cuartel.add(jLabel_cantArqueros, gbc_jLabel_cantArqueros);
		
		return panel_cuartel;
		
	}
	
	private JPanel inicializarPanelOeste() {
		
		JPanel panel_oeste = new JPanel();
		panel_oeste.setBackground(new Color(200, 184, 135));
		panel_oeste.setBorder(new LineBorder(new Color(160, 82, 45), 2));
		panel_oeste.setBounds(0, 35, 121, 730);
		
		panel_oeste.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jButton_VerPoblado = new JButton("Poblado");
		jButton_VerPoblado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane_principal.removeAll();
				layeredPane_principal.add(panel_poblado);
				layeredPane_principal.repaint();
				layeredPane_principal.revalidate();
				
			}
		});
		panel_oeste.add(jButton_VerPoblado);
		
		jButton_VerCuartel = new JButton("Cuartel");
		jButton_VerCuartel.setEnabled(false);
		jButton_VerCuartel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane_principal.removeAll();
				layeredPane_principal.add(panel_cuartel);
				layeredPane_principal.repaint();
				layeredPane_principal.revalidate();
				
			}
		});
		panel_oeste.add(jButton_VerCuartel);
		
		jButton_VerPlaza = new JButton("Plaza");
		jButton_VerPlaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane_principal.removeAll();
				layeredPane_principal.add(panel_plaza);
				layeredPane_principal.repaint();
				layeredPane_principal.revalidate();
			}
		});
		panel_oeste.add(jButton_VerPlaza);
		
		return panel_oeste;
		
	}
	
	private JPanel inicializarPanelPoblado() {
		
		JPanel panelPoblado = new JPanel();
		
		new GridBagLayout();
		panelPoblado.setBackground(new Color(223, 184, 135));
		panelPoblado.setAlignmentX(Component.LEFT_ALIGNMENT);
		GridBagLayout gbl_panelPoblado = new GridBagLayout();
		gbl_panelPoblado.columnWidths = new int[] {30, 10, 30, 10, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0};
		gbl_panelPoblado.rowHeights = new int[] {30, 10, 10, 10, 10, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelPoblado.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelPoblado.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelPoblado.setLayout(gbl_panelPoblado);
		
		 jLabel_nivelCasaCentral = new JLabel("Casa Central");
		 jLabel_nivelCasaCentral.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		 jLabel_nivelCasaCentral.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/casa central.png")));
		 jLabel_nivelCasaCentral.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_jLabel_nivelCasaCentral = new GridBagConstraints();
		gbc_jLabel_nivelCasaCentral.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelCasaCentral.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelCasaCentral.gridx = 2;
		gbc_jLabel_nivelCasaCentral.gridy = 1;
		panelPoblado.add(jLabel_nivelCasaCentral, gbc_jLabel_nivelCasaCentral);
		
		jButton_subirNivelCasaCentral = new JButton("Subir nivel");
		jButton_subirNivelCasaCentral.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelCasaCentral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.getCasaCentral().getNivel() != pobladoJugador.getCasaCentral().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getCasaCentral(), jButton_subirNivelCasaCentral);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelCasaCentral.setText("Máximo Nivel");
					}
				
			}
		});
		jButton_subirNivelCasaCentral.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelCasaCentral = new GridBagConstraints();
		gbc_jButton_subirNivelCasaCentral.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelCasaCentral.gridx = 4;
		gbc_jButton_subirNivelCasaCentral.gridy = 1;
		panelPoblado.add(jButton_subirNivelCasaCentral, gbc_jButton_subirNivelCasaCentral);
		 
		 jLabel_madera_casa = new JLabel("Madera");
		 jLabel_madera_casa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_casa.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		 GridBagConstraints gbc_jLabel_madera_casa = new GridBagConstraints();
		 gbc_jLabel_madera_casa.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_madera_casa.gridx = 6;
		 gbc_jLabel_madera_casa.gridy = 1;
		 panelPoblado.add(jLabel_madera_casa, gbc_jLabel_madera_casa);
		 
		 jLabel_barro_casa = new JLabel("Barro");
		 jLabel_barro_casa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_casa.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		 GridBagConstraints gbc_jLabel_barro_casa = new GridBagConstraints();
		 gbc_jLabel_barro_casa.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_barro_casa.gridx = 7;
		 gbc_jLabel_barro_casa.gridy = 1;
		 panelPoblado.add(jLabel_barro_casa, gbc_jLabel_barro_casa);
		 
		 jLabel_hierro_casa = new JLabel("Hierro");
		 jLabel_hierro_casa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_hierro_casa.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		 GridBagConstraints gbc_jLabel_hierro_casa = new GridBagConstraints();
		 gbc_jLabel_hierro_casa.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_hierro_casa.gridx = 8;
		 gbc_jLabel_hierro_casa.gridy = 1;
		 panelPoblado.add(jLabel_hierro_casa, gbc_jLabel_hierro_casa);
		 
		 jLabel_poblacion_casaCentral = new JLabel("10");
		 jLabel_poblacion_casaCentral.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		 jLabel_poblacion_casaCentral.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 GridBagConstraints gbc_jLabel_poblacion_casaCentral = new GridBagConstraints();
		 gbc_jLabel_poblacion_casaCentral.anchor = GridBagConstraints.WEST;
		 gbc_jLabel_poblacion_casaCentral.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_poblacion_casaCentral.gridx = 9;
		 gbc_jLabel_poblacion_casaCentral.gridy = 1;
		 panelPoblado.add(jLabel_poblacion_casaCentral, gbc_jLabel_poblacion_casaCentral);
		
		 jLabel_nivelGranja = new JLabel("Granja");
		 jLabel_nivelGranja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		 jLabel_nivelGranja.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/granja.png")));
		GridBagConstraints gbc_jLabel_nivelGranja = new GridBagConstraints();
		gbc_jLabel_nivelGranja.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelGranja.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelGranja.gridx = 2;
		gbc_jLabel_nivelGranja.gridy = 2;
		panelPoblado.add(jLabel_nivelGranja, gbc_jLabel_nivelGranja);
		
		JButton jButton_subirNivelGranja = new JButton("Subir nivel");
		jButton_subirNivelGranja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelGranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (pobladoJugador.getGranja().getNivel() != pobladoJugador.getGranja().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getGranja(), jButton_subirNivelGranja);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelGranja.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelGranja.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelGranja = new GridBagConstraints();
		gbc_jButton_subirNivelGranja.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelGranja.gridx = 4;
		gbc_jButton_subirNivelGranja.gridy = 2;
		panelPoblado.add(jButton_subirNivelGranja, gbc_jButton_subirNivelGranja);
		 
		 jLabel_madera_granja = new JLabel("Madera");
		 jLabel_madera_granja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_granja.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		 GridBagConstraints gbc_jLabel_madera_granja = new GridBagConstraints();
		 gbc_jLabel_madera_granja.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_madera_granja.gridx = 6;
		 gbc_jLabel_madera_granja.gridy = 2;
		 panelPoblado.add(jLabel_madera_granja, gbc_jLabel_madera_granja);
		 
		 jLabel_barro_granja = new JLabel("Barro");
		 jLabel_barro_granja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_granja.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		 GridBagConstraints gbc_jLabel_barro_granja = new GridBagConstraints();
		 gbc_jLabel_barro_granja.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_barro_granja.gridx = 7;
		 gbc_jLabel_barro_granja.gridy = 2;
		 panelPoblado.add(jLabel_barro_granja, gbc_jLabel_barro_granja);
		 
		 jLabel_hierro_granja = new JLabel("Hierro");
		 jLabel_hierro_granja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_hierro_granja.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		 GridBagConstraints gbc_jLabel_hierro_granja = new GridBagConstraints();
		 gbc_jLabel_hierro_granja.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_hierro_granja.gridx = 8;
		 gbc_jLabel_hierro_granja.gridy = 2;
		 panelPoblado.add(jLabel_hierro_granja, gbc_jLabel_hierro_granja);
		 
		 jLabel_poblacion_granja = new JLabel("10");
		 jLabel_poblacion_granja.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_poblacion_granja.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		 GridBagConstraints gbc_jLabel_poblacion_granja = new GridBagConstraints();
		 gbc_jLabel_poblacion_granja.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_poblacion_granja.gridx = 9;
		 gbc_jLabel_poblacion_granja.gridy = 2;
		 panelPoblado.add(jLabel_poblacion_granja, gbc_jLabel_poblacion_granja);
		
		 jLabel_nivelAserradero = new JLabel("Aserradero (Nivel "+ pobladoJugador.getAserradero().getNivel() +")");
		 jLabel_nivelAserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		 jLabel_nivelAserradero.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/aserradero.png")));
		GridBagConstraints gbc_jLabel_nivelAserradero = new GridBagConstraints();
		gbc_jLabel_nivelAserradero.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelAserradero.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelAserradero.gridx = 2;
		gbc_jLabel_nivelAserradero.gridy = 3;
		panelPoblado.add(jLabel_nivelAserradero, gbc_jLabel_nivelAserradero);
		
		JButton jButton_subirNivelAserradero = new JButton("Subir nivel");
		jButton_subirNivelAserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelAserradero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.getAserradero().getNivel() != pobladoJugador.getAserradero().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getAserradero(), jButton_subirNivelAserradero);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelAserradero.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelAserradero.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelAserradero = new GridBagConstraints();
		gbc_jButton_subirNivelAserradero.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelAserradero.gridx = 4;
		gbc_jButton_subirNivelAserradero.gridy = 3;
		panelPoblado.add(jButton_subirNivelAserradero, gbc_jButton_subirNivelAserradero);
		 
		 jLabel_madera_aserradero = new JLabel("Madera");
		 jLabel_madera_aserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_aserradero.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		 GridBagConstraints gbc_jLabel_madera_aserradero = new GridBagConstraints();
		 gbc_jLabel_madera_aserradero.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_madera_aserradero.gridx = 6;
		 gbc_jLabel_madera_aserradero.gridy = 3;
		 panelPoblado.add(jLabel_madera_aserradero, gbc_jLabel_madera_aserradero);
		 
		 jLabel_barro_aserradero = new JLabel("Barro");
		 jLabel_barro_aserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_aserradero.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		 GridBagConstraints gbc_jLabel_barro_aserradero = new GridBagConstraints();
		 gbc_jLabel_barro_aserradero.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_barro_aserradero.gridx = 7;
		 gbc_jLabel_barro_aserradero.gridy = 3;
		 panelPoblado.add(jLabel_barro_aserradero, gbc_jLabel_barro_aserradero);
		 
		 jLabel_hierro_aserradero = new JLabel("Hierro");
		 jLabel_hierro_aserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_hierro_aserradero.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		 GridBagConstraints gbc_jLabel_hierro_aserradero = new GridBagConstraints();
		 gbc_jLabel_hierro_aserradero.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_hierro_aserradero.gridx = 8;
		 gbc_jLabel_hierro_aserradero.gridy = 3;
		 panelPoblado.add(jLabel_hierro_aserradero, gbc_jLabel_hierro_aserradero);
		 
		 jLabel_poblacion_aserradero = new JLabel("10");
		 jLabel_poblacion_aserradero.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_poblacion_aserradero.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		 GridBagConstraints gbc_jLabel_poblacion_aserradero = new GridBagConstraints();
		 gbc_jLabel_poblacion_aserradero.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_poblacion_aserradero.gridx = 9;
		 gbc_jLabel_poblacion_aserradero.gridy = 3;
		 panelPoblado.add(jLabel_poblacion_aserradero, gbc_jLabel_poblacion_aserradero);
		
		 jLabel_nivelBarrera = new JLabel("Barrera (Nivel "+ pobladoJugador.getBarrera().getNivel() +")");
		 jLabel_nivelBarrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		 jLabel_nivelBarrera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barrera.png")));
		GridBagConstraints gbc_jLabel_nivelBarrera = new GridBagConstraints();
		gbc_jLabel_nivelBarrera.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelBarrera.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelBarrera.gridx = 2;
		gbc_jLabel_nivelBarrera.gridy = 4;
		panelPoblado.add(jLabel_nivelBarrera, gbc_jLabel_nivelBarrera);
		
		JButton jButton_subirNivelBarrera = new JButton("Subir nivel");
		jButton_subirNivelBarrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelBarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.getBarrera().getNivel() != pobladoJugador.getBarrera().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getBarrera(), jButton_subirNivelBarrera);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelBarrera.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelBarrera.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelBarrera = new GridBagConstraints();
		gbc_jButton_subirNivelBarrera.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelBarrera.gridx = 4;
		gbc_jButton_subirNivelBarrera.gridy = 4;
		panelPoblado.add(jButton_subirNivelBarrera, gbc_jButton_subirNivelBarrera);
		 
		 jLabel_madera_barrera = new JLabel("Madera");
		 jLabel_madera_barrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_barrera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		 GridBagConstraints gbc_jLabel_madera_barrera = new GridBagConstraints();
		 gbc_jLabel_madera_barrera.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_madera_barrera.gridx = 6;
		 gbc_jLabel_madera_barrera.gridy = 4;
		 panelPoblado.add(jLabel_madera_barrera, gbc_jLabel_madera_barrera);
		 
		 jLabel_barro_barrera = new JLabel("Barro");
		 jLabel_barro_barrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_barrera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		 GridBagConstraints gbc_jLabel_barro_barrera = new GridBagConstraints();
		 gbc_jLabel_barro_barrera.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_barro_barrera.gridx = 7;
		 gbc_jLabel_barro_barrera.gridy = 4;
		 panelPoblado.add(jLabel_barro_barrera, gbc_jLabel_barro_barrera);
		 
		 jLabel_hierro_barrera = new JLabel("Hierro");
		 jLabel_hierro_barrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_hierro_barrera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		 GridBagConstraints gbc_jLabel_hierro_barrera = new GridBagConstraints();
		 gbc_jLabel_hierro_barrera.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_hierro_barrera.gridx = 8;
		 gbc_jLabel_hierro_barrera.gridy = 4;
		 panelPoblado.add(jLabel_hierro_barrera, gbc_jLabel_hierro_barrera);
		 
		 jLabel_poblacion_barrera = new JLabel("10");
		 jLabel_poblacion_barrera.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_poblacion_barrera.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		 GridBagConstraints gbc_jLabel_poblacion_barrera = new GridBagConstraints();
		 gbc_jLabel_poblacion_barrera.insets = new Insets(0, 0, 5, 5);
		 gbc_jLabel_poblacion_barrera.gridx = 9;
		 gbc_jLabel_poblacion_barrera.gridy = 4;
		 panelPoblado.add(jLabel_poblacion_barrera, gbc_jLabel_poblacion_barrera);
		
		 jLabel_nivelMinaHierro = new JLabel("Mina de Hierro (Nivel "+ pobladoJugador.getMinaDeHierro().getNivel() +")");
		 jLabel_nivelMinaHierro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		 jLabel_nivelMinaHierro.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/mina.png")));
		GridBagConstraints gbc_jLabel_nivelMinaHierro = new GridBagConstraints();
		gbc_jLabel_nivelMinaHierro.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelMinaHierro.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelMinaHierro.gridx = 2;
		gbc_jLabel_nivelMinaHierro.gridy = 5;
		panelPoblado.add(jLabel_nivelMinaHierro, gbc_jLabel_nivelMinaHierro);
		
		JButton jButton_subirNivelMinaHierro = new JButton("Subir nivel");
		jButton_subirNivelMinaHierro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelMinaHierro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.getMinaDeHierro().getNivel() != pobladoJugador.getMinaDeHierro().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getMinaDeHierro(), jButton_subirNivelMinaHierro);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelMinaHierro.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelMinaHierro.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelMinaHierro = new GridBagConstraints();
		gbc_jButton_subirNivelMinaHierro.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelMinaHierro.gridx = 4;
		gbc_jButton_subirNivelMinaHierro.gridy = 5;
		panelPoblado.add(jButton_subirNivelMinaHierro, gbc_jButton_subirNivelMinaHierro);
		
		jLabel_madera_mina = new JLabel("Madera");
		jLabel_madera_mina.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_madera_mina.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_mina = new GridBagConstraints();
		gbc_jLabel_madera_mina.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_mina.gridx = 6;
		gbc_jLabel_madera_mina.gridy = 5;
		panelPoblado.add(jLabel_madera_mina, gbc_jLabel_madera_mina);
		
		jLabel_barro_mina = new JLabel("Barro");
		jLabel_barro_mina.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_mina.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_mina = new GridBagConstraints();
		gbc_jLabel_barro_mina.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_mina.gridx = 7;
		gbc_jLabel_barro_mina.gridy = 5;
		panelPoblado.add(jLabel_barro_mina, gbc_jLabel_barro_mina);
		
		jLabel_hierro_mina = new JLabel("Hierro");
		jLabel_hierro_mina.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_mina.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_mina = new GridBagConstraints();
		gbc_jLabel_hierro_mina.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_mina.gridx = 8;
		gbc_jLabel_hierro_mina.gridy = 5;
		panelPoblado.add(jLabel_hierro_mina, gbc_jLabel_hierro_mina);
		
		jLabel_poblacion_minaHierro = new JLabel("10");
		jLabel_poblacion_minaHierro.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_minaHierro.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_minaHierro = new GridBagConstraints();
		gbc_jLabel_poblacion_minaHierro.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_minaHierro.gridx = 9;
		gbc_jLabel_poblacion_minaHierro.gridy = 5;
		panelPoblado.add(jLabel_poblacion_minaHierro, gbc_jLabel_poblacion_minaHierro);
		
		jLabel_nivelCuartel = new JLabel("Cuartel");
		jLabel_nivelCuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_nivelCuartel.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Cuartel.png")));
		GridBagConstraints gbc_jLabel_nivelCuartel = new GridBagConstraints();
		gbc_jLabel_nivelCuartel.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelCuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelCuartel.gridx = 2;
		gbc_jLabel_nivelCuartel.gridy = 6;
		panelPoblado.add(jLabel_nivelCuartel, gbc_jLabel_nivelCuartel);
		
		jButton_subirNivelCuartel = new JButton("Construir");
		jButton_subirNivelCuartel.setEnabled(false);
		jButton_subirNivelCuartel.setToolTipText("REQUISITOS: Casa Central (Nivel 3)");
		jButton_subirNivelCuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelCuartel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (pobladoJugador.getCuartel().getNivel() != pobladoJugador.getCuartel().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getCuartel(), jButton_subirNivelCuartel);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelCuartel.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelCuartel.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelCuartel = new GridBagConstraints();
		gbc_jButton_subirNivelCuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelCuartel.gridx = 4;
		gbc_jButton_subirNivelCuartel.gridy = 6;
		panelPoblado.add(jButton_subirNivelCuartel, gbc_jButton_subirNivelCuartel);
		
		jLabel_madera_cuartel = new JLabel("Madera");
		jLabel_madera_cuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_cuartel.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_cuartel = new GridBagConstraints();
		gbc_jLabel_madera_cuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_cuartel.gridx = 6;
		gbc_jLabel_madera_cuartel.gridy = 6;
		panelPoblado.add(jLabel_madera_cuartel, gbc_jLabel_madera_cuartel);
		
		jLabel_barro_cuartel = new JLabel("Barro");
		jLabel_barro_cuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_cuartel.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_cuartel = new GridBagConstraints();
		gbc_jLabel_barro_cuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_cuartel.gridx = 7;
		gbc_jLabel_barro_cuartel.gridy = 6;
		panelPoblado.add(jLabel_barro_cuartel, gbc_jLabel_barro_cuartel);
		
		jLabel_hierro_cuartel = new JLabel("Hierro");
		jLabel_hierro_cuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_cuartel.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_cuartel = new GridBagConstraints();
		gbc_jLabel_hierro_cuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_cuartel.gridx = 8;
		gbc_jLabel_hierro_cuartel.gridy = 6;
		panelPoblado.add(jLabel_hierro_cuartel, gbc_jLabel_hierro_cuartel);
		
		jLabel_poblacion_cuartel = new JLabel("10");
		jLabel_poblacion_cuartel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_cuartel.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_cuartel = new GridBagConstraints();
		gbc_jLabel_poblacion_cuartel.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_cuartel.gridx = 9;
		gbc_jLabel_poblacion_cuartel.gridy = 6;
		panelPoblado.add(jLabel_poblacion_cuartel, gbc_jLabel_poblacion_cuartel);
		
		jLabel_nivelCuadra = new JLabel("Cuadra");
		jLabel_nivelCuadra.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Cuadra.png")));
		jLabel_nivelCuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelCuadra = new GridBagConstraints();
		gbc_jLabel_nivelCuadra.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelCuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelCuadra.gridx = 2;
		gbc_jLabel_nivelCuadra.gridy = 7;
		panelPoblado.add(jLabel_nivelCuadra, gbc_jLabel_nivelCuadra);
		
		jButton_subirNivelCuadra = new JButton("Construir");
		jButton_subirNivelCuadra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pobladoJugador.getCuadra().getNivel() != pobladoJugador.getCuadra().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getCuadra(), jButton_subirNivelCuadra);
					if (contador != null) {
						contador.start();

					} 
				} else {
						jButton_subirNivelCuadra.setText("Máximo Nivel");
					}
				
			}
		});
		jButton_subirNivelCuadra.setEnabled(false);
		jButton_subirNivelCuadra.setToolTipText("<html>REQUISITOS: <br>-Casa Central (Nivel 10) \r\n\t\t\t    <br>-Cuartel (Nivel 5)\r\n\t\t\t    <br>-Herrería  (Nivel 5)</html>");
		jButton_subirNivelCuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelCuadra.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_jButton_subirNivelCuadra = new GridBagConstraints();
		gbc_jButton_subirNivelCuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelCuadra.gridx = 4;
		gbc_jButton_subirNivelCuadra.gridy = 7;
		panelPoblado.add(jButton_subirNivelCuadra, gbc_jButton_subirNivelCuadra);
		
		jLabel_madera_cuadra = new JLabel("Madera");
		jLabel_madera_cuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_cuadra.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_cuadra = new GridBagConstraints();
		gbc_jLabel_madera_cuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_cuadra.gridx = 6;
		gbc_jLabel_madera_cuadra.gridy = 7;
		panelPoblado.add(jLabel_madera_cuadra, gbc_jLabel_madera_cuadra);
		
		jLabel_barro_cuadra = new JLabel("Barro");
		jLabel_barro_cuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_cuadra.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_cuadra = new GridBagConstraints();
		gbc_jLabel_barro_cuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_cuadra.gridx = 7;
		gbc_jLabel_barro_cuadra.gridy = 7;
		panelPoblado.add(jLabel_barro_cuadra, gbc_jLabel_barro_cuadra);
		
		jLabel_hierro_cuadra = new JLabel("Hierro");
		jLabel_hierro_cuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_cuadra.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_cuadra = new GridBagConstraints();
		gbc_jLabel_hierro_cuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_cuadra.gridx = 8;
		gbc_jLabel_hierro_cuadra.gridy = 7;
		panelPoblado.add(jLabel_hierro_cuadra, gbc_jLabel_hierro_cuadra);
		
		jLabel_poblacion_cuadra = new JLabel("10");
		jLabel_poblacion_cuadra.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_cuadra.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_cuadra = new GridBagConstraints();
		gbc_jLabel_poblacion_cuadra.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_cuadra.gridx = 9;
		gbc_jLabel_poblacion_cuadra.gridy = 7;
		panelPoblado.add(jLabel_poblacion_cuadra, gbc_jLabel_poblacion_cuadra);
		
		jLabel_nivelTaller = new JLabel("Taller");
		jLabel_nivelTaller.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Taller.png")));
		jLabel_nivelTaller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelTaller = new GridBagConstraints();
		gbc_jLabel_nivelTaller.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelTaller.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelTaller.gridx = 2;
		gbc_jLabel_nivelTaller.gridy = 8;
		panelPoblado.add(jLabel_nivelTaller, gbc_jLabel_nivelTaller);
		
		jButton_subirNivelTaller = new JButton("Construir");
		jButton_subirNivelTaller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getTaller().getNivel() != pobladoJugador.getTaller().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getTaller(), jButton_subirNivelTaller);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelTaller.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelTaller.setEnabled(false);
		jButton_subirNivelTaller.setToolTipText("<html>REQUISITOS:  \r\n<br>-Casa Central (Nivel 10)\r\n<br>-Herrería (Nivel 10)</html>");
		jButton_subirNivelTaller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelTaller.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelTaller = new GridBagConstraints();
		gbc_jButton_subirNivelTaller.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelTaller.gridx = 4;
		gbc_jButton_subirNivelTaller.gridy = 8;
		panelPoblado.add(jButton_subirNivelTaller, gbc_jButton_subirNivelTaller);
		
		jLabel_madera_taller = new JLabel("Madera");
		jLabel_madera_taller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_taller.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_taller = new GridBagConstraints();
		gbc_jLabel_madera_taller.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_taller.gridx = 6;
		gbc_jLabel_madera_taller.gridy = 8;
		panelPoblado.add(jLabel_madera_taller, gbc_jLabel_madera_taller);
		
		jLabel_barro_taller = new JLabel("Barro");
		jLabel_barro_taller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_taller.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_taller = new GridBagConstraints();
		gbc_jLabel_barro_taller.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_taller.gridx = 7;
		gbc_jLabel_barro_taller.gridy = 8;
		panelPoblado.add(jLabel_barro_taller, gbc_jLabel_barro_taller);
		
		jLabel_hierro_taller = new JLabel("Hierro");
		jLabel_hierro_taller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_taller.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_taller = new GridBagConstraints();
		gbc_jLabel_hierro_taller.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_taller.gridx = 8;
		gbc_jLabel_hierro_taller.gridy = 8;
		panelPoblado.add(jLabel_hierro_taller, gbc_jLabel_hierro_taller);
		
		jLabel_poblacion_taller = new JLabel("10");
		jLabel_poblacion_taller.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_taller.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_taller = new GridBagConstraints();
		gbc_jLabel_poblacion_taller.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_taller.gridx = 9;
		gbc_jLabel_poblacion_taller.gridy = 8;
		panelPoblado.add(jLabel_poblacion_taller, gbc_jLabel_poblacion_taller);
		
		jLabel_nivelHerreria = new JLabel("Herrería");
		jLabel_nivelHerreria.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Herreria.png")));
		jLabel_nivelHerreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelHerreria = new GridBagConstraints();
		gbc_jLabel_nivelHerreria.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelHerreria.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelHerreria.gridx = 2;
		gbc_jLabel_nivelHerreria.gridy = 9;
		panelPoblado.add(jLabel_nivelHerreria, gbc_jLabel_nivelHerreria);
		
		jButton_subirNivelHerreria = new JButton("Construir");
		jButton_subirNivelHerreria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getHerreria().getNivel() != pobladoJugador.getHerreria().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getHerreria(), jButton_subirNivelHerreria);
					if (contador != null) {
						contador.start();

					} 
				} else {
						jButton_subirNivelHerreria.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelHerreria.setEnabled(false);
		jButton_subirNivelHerreria.setToolTipText("<html>REQUISITOS: \r\n<br>-Casa Central (Nivel 5)\r\n<br>-Cuartel (Nivel 1)</html>\r\n");
		jButton_subirNivelHerreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelHerreria.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelHerreria = new GridBagConstraints();
		gbc_jButton_subirNivelHerreria.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelHerreria.gridx = 4;
		gbc_jButton_subirNivelHerreria.gridy = 9;
		panelPoblado.add(jButton_subirNivelHerreria, gbc_jButton_subirNivelHerreria);
		
		jLabel_madera_herreria = new JLabel("Madera");
		jLabel_madera_herreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_herreria.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_herreria = new GridBagConstraints();
		gbc_jLabel_madera_herreria.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_herreria.gridx = 6;
		gbc_jLabel_madera_herreria.gridy = 9;
		panelPoblado.add(jLabel_madera_herreria, gbc_jLabel_madera_herreria);
		
		jLabel_barro_herreria = new JLabel("Barro");
		jLabel_barro_herreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_herreria.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_herreria = new GridBagConstraints();
		gbc_jLabel_barro_herreria.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_herreria.gridx = 7;
		gbc_jLabel_barro_herreria.gridy = 9;
		panelPoblado.add(jLabel_barro_herreria, gbc_jLabel_barro_herreria);
		
		jLabel_hierro_herreria = new JLabel("Hierro");
		jLabel_hierro_herreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_herreria.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_herreria = new GridBagConstraints();
		gbc_jLabel_hierro_herreria.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_herreria.gridx = 8;
		gbc_jLabel_hierro_herreria.gridy = 9;
		panelPoblado.add(jLabel_hierro_herreria, gbc_jLabel_hierro_herreria);
		
		jLabel_poblacion_herreria = new JLabel("10");
		jLabel_poblacion_herreria.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_herreria.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_herreria = new GridBagConstraints();
		gbc_jLabel_poblacion_herreria.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_herreria.gridx = 9;
		gbc_jLabel_poblacion_herreria.gridy = 9;
		panelPoblado.add(jLabel_poblacion_herreria, gbc_jLabel_poblacion_herreria);
		
		jLabel_requisitos_cuartel_3 = new JLabel("");
		jLabel_requisitos_cuartel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		GridBagConstraints gbc_jLabel_requisitos_cuartel_3 = new GridBagConstraints();
		gbc_jLabel_requisitos_cuartel_3.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_requisitos_cuartel_3.gridx = 11;
		gbc_jLabel_requisitos_cuartel_3.gridy = 9;
		panelPoblado.add(jLabel_requisitos_cuartel_3, gbc_jLabel_requisitos_cuartel_3);
		
		jLabel_nivelAlmacen = new JLabel("Almacén");
		jLabel_nivelAlmacen.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Almacen.png")));
		jLabel_nivelAlmacen.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelAlmacen = new GridBagConstraints();
		gbc_jLabel_nivelAlmacen.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelAlmacen.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelAlmacen.gridx = 2;
		gbc_jLabel_nivelAlmacen.gridy = 10;
		panelPoblado.add(jLabel_nivelAlmacen, gbc_jLabel_nivelAlmacen);
		
		jButton_subirNivelAlmacen = new JButton("Subir nivel");
		jButton_subirNivelAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getAlmacen().getNivel() != pobladoJugador.getAlmacen().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getAlmacen(), jButton_subirNivelAlmacen);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelAlmacen.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelAlmacen.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelAlmacen.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelAlmacen = new GridBagConstraints();
		gbc_jButton_subirNivelAlmacen.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelAlmacen.gridx = 4;
		gbc_jButton_subirNivelAlmacen.gridy = 10;
		panelPoblado.add(jButton_subirNivelAlmacen, gbc_jButton_subirNivelAlmacen);
		
		jLabel_madera_almacen = new JLabel("Madera");
		jLabel_madera_almacen.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_almacen.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_almacen = new GridBagConstraints();
		gbc_jLabel_madera_almacen.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_almacen.gridx = 6;
		gbc_jLabel_madera_almacen.gridy = 10;
		panelPoblado.add(jLabel_madera_almacen, gbc_jLabel_madera_almacen);
		
		jLabel_barro_almacen = new JLabel("Barro");
		jLabel_barro_almacen.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_almacen.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_almacen = new GridBagConstraints();
		gbc_jLabel_barro_almacen.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_almacen.gridx = 7;
		gbc_jLabel_barro_almacen.gridy = 10;
		panelPoblado.add(jLabel_barro_almacen, gbc_jLabel_barro_almacen);
		
		jLabel_hierro_almacen = new JLabel("Hierro");
		jLabel_hierro_almacen.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_almacen.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_almacen = new GridBagConstraints();
		gbc_jLabel_hierro_almacen.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_almacen.gridx = 8;
		gbc_jLabel_hierro_almacen.gridy = 10;
		panelPoblado.add(jLabel_hierro_almacen, gbc_jLabel_hierro_almacen);
		
		jLabel_nivelEscondrijo = new JLabel("Escondrijo");
		jLabel_nivelEscondrijo.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Escondrijo.png")));
		jLabel_nivelEscondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelEscondrijo = new GridBagConstraints();
		gbc_jLabel_nivelEscondrijo.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelEscondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelEscondrijo.gridx = 2;
		gbc_jLabel_nivelEscondrijo.gridy = 11;
		panelPoblado.add(jLabel_nivelEscondrijo, gbc_jLabel_nivelEscondrijo);
		
		jButton_subirNivelEscondrijo = new JButton("Construir");
		jButton_subirNivelEscondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelEscondrijo.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelEscondrijo = new GridBagConstraints();
		gbc_jButton_subirNivelEscondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelEscondrijo.gridx = 4;
		gbc_jButton_subirNivelEscondrijo.gridy = 11;
		panelPoblado.add(jButton_subirNivelEscondrijo, gbc_jButton_subirNivelEscondrijo);
		
		jLabel_madera_escondrijo = new JLabel("Madera");
		jLabel_madera_escondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_escondrijo.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_escondrijo = new GridBagConstraints();
		gbc_jLabel_madera_escondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_escondrijo.gridx = 6;
		gbc_jLabel_madera_escondrijo.gridy = 11;
		panelPoblado.add(jLabel_madera_escondrijo, gbc_jLabel_madera_escondrijo);
		
		jLabel_barro_escondrijo = new JLabel("Barro");
		jLabel_barro_escondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_escondrijo.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_escondrijo = new GridBagConstraints();
		gbc_jLabel_barro_escondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_escondrijo.gridx = 7;
		gbc_jLabel_barro_escondrijo.gridy = 11;
		panelPoblado.add(jLabel_barro_escondrijo, gbc_jLabel_barro_escondrijo);
		
		jLabel_hierro_escondrijo = new JLabel("Hierro");
		jLabel_hierro_escondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_escondrijo.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_escondrijo = new GridBagConstraints();
		gbc_jLabel_hierro_escondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_escondrijo.gridx = 8;
		gbc_jLabel_hierro_escondrijo.gridy = 11;
		panelPoblado.add(jLabel_hierro_escondrijo, gbc_jLabel_hierro_escondrijo);
		
		jLabel_poblacion_escondrijo = new JLabel("10");
		jLabel_poblacion_escondrijo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_escondrijo.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_escondrijo = new GridBagConstraints();
		gbc_jLabel_poblacion_escondrijo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_escondrijo.gridx = 9;
		gbc_jLabel_poblacion_escondrijo.gridy = 11;
		panelPoblado.add(jLabel_poblacion_escondrijo, gbc_jLabel_poblacion_escondrijo);
		
		jLabel_nivelIglesia = new JLabel("Iglesia");
		jLabel_nivelIglesia.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Iglesia.png")));
		jLabel_nivelIglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelIglesia = new GridBagConstraints();
		gbc_jLabel_nivelIglesia.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelIglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelIglesia.gridx = 2;
		gbc_jLabel_nivelIglesia.gridy = 12;
		panelPoblado.add(jLabel_nivelIglesia, gbc_jLabel_nivelIglesia);
		
		jButton_subirNivelIglesia = new JButton("Construir");
		jButton_subirNivelIglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelIglesia.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelIglesia = new GridBagConstraints();
		gbc_jButton_subirNivelIglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelIglesia.gridx = 4;
		gbc_jButton_subirNivelIglesia.gridy = 12;
		panelPoblado.add(jButton_subirNivelIglesia, gbc_jButton_subirNivelIglesia);
		
		jLabel_madera_iglesia = new JLabel("Madera");
		jLabel_madera_iglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_iglesia.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_iglesia = new GridBagConstraints();
		gbc_jLabel_madera_iglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_iglesia.gridx = 6;
		gbc_jLabel_madera_iglesia.gridy = 12;
		panelPoblado.add(jLabel_madera_iglesia, gbc_jLabel_madera_iglesia);
		
		jLabel_barro_iglesia = new JLabel("Barro");
		jLabel_barro_iglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_iglesia.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_iglesia = new GridBagConstraints();
		gbc_jLabel_barro_iglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_iglesia.gridx = 7;
		gbc_jLabel_barro_iglesia.gridy = 12;
		panelPoblado.add(jLabel_barro_iglesia, gbc_jLabel_barro_iglesia);
		
		jLabel_hierro_iglesia = new JLabel("Hierro");
		jLabel_hierro_iglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_iglesia.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_iglesia = new GridBagConstraints();
		gbc_jLabel_hierro_iglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_iglesia.gridx = 8;
		gbc_jLabel_hierro_iglesia.gridy = 12;
		panelPoblado.add(jLabel_hierro_iglesia, gbc_jLabel_hierro_iglesia);
		
		jLabel_poblacion_iglesia = new JLabel("10");
		jLabel_poblacion_iglesia.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_iglesia.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_iglesia = new GridBagConstraints();
		gbc_jLabel_poblacion_iglesia.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_iglesia.gridx = 9;
		gbc_jLabel_poblacion_iglesia.gridy = 12;
		panelPoblado.add(jLabel_poblacion_iglesia, gbc_jLabel_poblacion_iglesia);
		
		jLabel_nivelCorte = new JLabel("Corte");
		jLabel_nivelCorte.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/corte.png")));
		jLabel_nivelCorte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelCorte = new GridBagConstraints();
		gbc_jLabel_nivelCorte.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelCorte.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelCorte.gridx = 2;
		gbc_jLabel_nivelCorte.gridy = 13;
		panelPoblado.add(jLabel_nivelCorte, gbc_jLabel_nivelCorte);
		
		jButton_subirNivelCorte = new JButton("Construir");
		jButton_subirNivelCorte.setToolTipText("<html>REQUISITOS: <br>-Casa Central (Nivel 20) \r\n\t\t\t    <br>-Mercado (Nivel 10)\r\n\t\t\t    <br>-Herrería  (Nivel 20)</html>");
		jButton_subirNivelCorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getCorte().getNivel() != pobladoJugador.getCorte().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getCorte(), jButton_subirNivelCorte);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelCorte.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelCorte.setEnabled(false);
		jButton_subirNivelCorte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelCorte.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelCorte = new GridBagConstraints();
		gbc_jButton_subirNivelCorte.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelCorte.gridx = 4;
		gbc_jButton_subirNivelCorte.gridy = 13;
		panelPoblado.add(jButton_subirNivelCorte, gbc_jButton_subirNivelCorte);
		
		jLabel_madera_corte = new JLabel("Madera");
		jLabel_madera_corte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_corte.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_corte = new GridBagConstraints();
		gbc_jLabel_madera_corte.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_corte.gridx = 6;
		gbc_jLabel_madera_corte.gridy = 13;
		panelPoblado.add(jLabel_madera_corte, gbc_jLabel_madera_corte);
		
		jLabel_barro_corte = new JLabel("Barro");
		jLabel_barro_corte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_corte.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_corte = new GridBagConstraints();
		gbc_jLabel_barro_corte.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_corte.gridx = 7;
		gbc_jLabel_barro_corte.gridy = 13;
		panelPoblado.add(jLabel_barro_corte, gbc_jLabel_barro_corte);
		
		jLabel_hierro_corte = new JLabel("Hierro");
		jLabel_hierro_corte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_corte.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_corte = new GridBagConstraints();
		gbc_jLabel_hierro_corte.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_corte.gridx = 8;
		gbc_jLabel_hierro_corte.gridy = 13;
		panelPoblado.add(jLabel_hierro_corte, gbc_jLabel_hierro_corte);
		
		jLabel_poblacion_corte = new JLabel("10");
		jLabel_poblacion_corte.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_corte.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_corte = new GridBagConstraints();
		gbc_jLabel_poblacion_corte.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_corte.gridx = 9;
		gbc_jLabel_poblacion_corte.gridy = 13;
		panelPoblado.add(jLabel_poblacion_corte, gbc_jLabel_poblacion_corte);
		
		jLabel_nivelEstatua = new JLabel("Estatua");
		jLabel_nivelEstatua.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Estatua.png")));
		jLabel_nivelEstatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelEstatua = new GridBagConstraints();
		gbc_jLabel_nivelEstatua.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelEstatua.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelEstatua.gridx = 2;
		gbc_jLabel_nivelEstatua.gridy = 14;
		panelPoblado.add(jLabel_nivelEstatua, gbc_jLabel_nivelEstatua);
		
		jButton_subirNivelEstatua = new JButton("Construir");
		jButton_subirNivelEstatua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getEstatua().getNivel() != pobladoJugador.getEstatua().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getEstatua(), jButton_subirNivelEstatua);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelEstatua.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelEstatua.setEnabled(false);
		jButton_subirNivelEstatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelEstatua.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelEstatua = new GridBagConstraints();
		gbc_jButton_subirNivelEstatua.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelEstatua.gridx = 4;
		gbc_jButton_subirNivelEstatua.gridy = 14;
		panelPoblado.add(jButton_subirNivelEstatua, gbc_jButton_subirNivelEstatua);
		
		jLabel_madera_estatua = new JLabel("Madera");
		jLabel_madera_estatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_estatua.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_estatua = new GridBagConstraints();
		gbc_jLabel_madera_estatua.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_estatua.gridx = 6;
		gbc_jLabel_madera_estatua.gridy = 14;
		panelPoblado.add(jLabel_madera_estatua, gbc_jLabel_madera_estatua);
		
		jLabel_barro_estatua = new JLabel("Barro");
		jLabel_barro_estatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_estatua.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_estatua = new GridBagConstraints();
		gbc_jLabel_barro_estatua.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_estatua.gridx = 7;
		gbc_jLabel_barro_estatua.gridy = 14;
		panelPoblado.add(jLabel_barro_estatua, gbc_jLabel_barro_estatua);
		
		jLabel_hierro_estatua = new JLabel("Hierro");
		jLabel_hierro_estatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_estatua.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_estatua = new GridBagConstraints();
		gbc_jLabel_hierro_estatua.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_estatua.gridx = 8;
		gbc_jLabel_hierro_estatua.gridy = 14;
		panelPoblado.add(jLabel_hierro_estatua, gbc_jLabel_hierro_estatua);
		
		jLabel_poblacion_estatua = new JLabel("10");
		jLabel_poblacion_estatua.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_estatua.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_estatua = new GridBagConstraints();
		gbc_jLabel_poblacion_estatua.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_estatua.gridx = 9;
		gbc_jLabel_poblacion_estatua.gridy = 14;
		panelPoblado.add(jLabel_poblacion_estatua, gbc_jLabel_poblacion_estatua);
		
		jLabel_nivelMercado = new JLabel("Mercado");
		jLabel_nivelMercado.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/mercado.png")));
		jLabel_nivelMercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelMercado = new GridBagConstraints();
		gbc_jLabel_nivelMercado.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelMercado.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelMercado.gridx = 2;
		gbc_jLabel_nivelMercado.gridy = 15;
		panelPoblado.add(jLabel_nivelMercado, gbc_jLabel_nivelMercado);
		
		jButton_subirNivelMercado = new JButton("Construir");
		jButton_subirNivelMercado.setToolTipText("<html>REQUISITOS: <br>-Casa Central (Nivel 3) \r\n\t\t\t    <br>-Almacén (Nivel 2)</html>");
		jButton_subirNivelMercado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getMercado().getNivel() != pobladoJugador.getMercado().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getMercado(), jButton_subirNivelMercado);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelMercado.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelMercado.setEnabled(false);
		jButton_subirNivelMercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelMercado.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelMercado = new GridBagConstraints();
		gbc_jButton_subirNivelMercado.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelMercado.gridx = 4;
		gbc_jButton_subirNivelMercado.gridy = 15;
		panelPoblado.add(jButton_subirNivelMercado, gbc_jButton_subirNivelMercado);
		
		jLabel_madera_mercado = new JLabel("Madera");
		jLabel_madera_mercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_mercado.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_mercado = new GridBagConstraints();
		gbc_jLabel_madera_mercado.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_mercado.gridx = 6;
		gbc_jLabel_madera_mercado.gridy = 15;
		panelPoblado.add(jLabel_madera_mercado, gbc_jLabel_madera_mercado);
		
		jLabel_barro_mercado = new JLabel("Barro");
		jLabel_barro_mercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_mercado.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_mercado = new GridBagConstraints();
		gbc_jLabel_barro_mercado.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_mercado.gridx = 7;
		gbc_jLabel_barro_mercado.gridy = 15;
		panelPoblado.add(jLabel_barro_mercado, gbc_jLabel_barro_mercado);
		
		jLabel_hierro_mercado = new JLabel("Hierro");
		jLabel_hierro_mercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_mercado.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_mercado = new GridBagConstraints();
		gbc_jLabel_hierro_mercado.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_mercado.gridx = 8;
		gbc_jLabel_hierro_mercado.gridy = 15;
		panelPoblado.add(jLabel_hierro_mercado, gbc_jLabel_hierro_mercado);
		
		jLabel_poblacion_mercado = new JLabel("10");
		jLabel_poblacion_mercado.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_mercado.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_mercado = new GridBagConstraints();
		gbc_jLabel_poblacion_mercado.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_mercado.gridx = 9;
		gbc_jLabel_poblacion_mercado.gridy = 15;
		panelPoblado.add(jLabel_poblacion_mercado, gbc_jLabel_poblacion_mercado);
		
		jLabel_nivelMuralla = new JLabel("Muralla");
		jLabel_nivelMuralla.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/muralla.png")));
		jLabel_nivelMuralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelMuralla = new GridBagConstraints();
		gbc_jLabel_nivelMuralla.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelMuralla.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelMuralla.gridx = 2;
		gbc_jLabel_nivelMuralla.gridy = 16;
		panelPoblado.add(jLabel_nivelMuralla, gbc_jLabel_nivelMuralla);
		
		jButton_subirNivelMuralla = new JButton("Construir");
		jButton_subirNivelMuralla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getMuralla().getNivel() != pobladoJugador.getMuralla().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getMuralla(), jButton_subirNivelMuralla);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelMuralla.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelMuralla.setEnabled(false);
		jButton_subirNivelMuralla.setToolTipText("<html>REQUISITOS: \r\n<br>-Cuartel (Nivel 1)</html>\r\n");
		jButton_subirNivelMuralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelMuralla.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelMuralla = new GridBagConstraints();
		gbc_jButton_subirNivelMuralla.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelMuralla.gridx = 4;
		gbc_jButton_subirNivelMuralla.gridy = 16;
		panelPoblado.add(jButton_subirNivelMuralla, gbc_jButton_subirNivelMuralla);
		
		jLabel_madera_muralla = new JLabel("Madera");
		jLabel_madera_muralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_muralla.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_muralla = new GridBagConstraints();
		gbc_jLabel_madera_muralla.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_muralla.gridx = 6;
		gbc_jLabel_madera_muralla.gridy = 16;
		panelPoblado.add(jLabel_madera_muralla, gbc_jLabel_madera_muralla);
		
		jLabel_barro_muralla = new JLabel("Barro");
		jLabel_barro_muralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_muralla.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_muralla = new GridBagConstraints();
		gbc_jLabel_barro_muralla.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_muralla.gridx = 7;
		gbc_jLabel_barro_muralla.gridy = 16;
		panelPoblado.add(jLabel_barro_muralla, gbc_jLabel_barro_muralla);
		
		jLabel_hierro_muralla = new JLabel("Hierro");
		jLabel_hierro_muralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_muralla.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_muralla = new GridBagConstraints();
		gbc_jLabel_hierro_muralla.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_muralla.gridx = 8;
		gbc_jLabel_hierro_muralla.gridy = 16;
		panelPoblado.add(jLabel_hierro_muralla, gbc_jLabel_hierro_muralla);
		
		jLabel_poblacion_muralla = new JLabel("10");
		jLabel_poblacion_muralla.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_muralla.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_muralla = new GridBagConstraints();
		gbc_jLabel_poblacion_muralla.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_muralla.gridx = 9;
		gbc_jLabel_poblacion_muralla.gridy = 16;
		panelPoblado.add(jLabel_poblacion_muralla, gbc_jLabel_poblacion_muralla);
		
		jLabel_nivelTorre = new JLabel("Torre de vigilancia");
		jLabel_nivelTorre.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/torre.jpg")));
		jLabel_nivelTorre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		GridBagConstraints gbc_jLabel_nivelTorre = new GridBagConstraints();
		gbc_jLabel_nivelTorre.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelTorre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelTorre.gridx = 2;
		gbc_jLabel_nivelTorre.gridy = 17;
		panelPoblado.add(jLabel_nivelTorre, gbc_jLabel_nivelTorre);
		
		jButton_subirNivelTorre = new JButton("Construir");
		jButton_subirNivelTorre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pobladoJugador.getTorreDeVigilancia().getNivel() != pobladoJugador.getTorreDeVigilancia().getMaxNivel()) {
					Thread contador = subirNivel(pobladoJugador.getTorreDeVigilancia(), jButton_subirNivelTorre);
					if (contador != null) {
						contador.start();

					} 
				}else {
						jButton_subirNivelTorre.setText("Máximo Nivel");
					}
			}
		});
		jButton_subirNivelTorre.setEnabled(false);
		jButton_subirNivelTorre.setToolTipText("<html>REQUISITOS: \r\n<br>-Casa Central (Nivel 5)\r\n<br>-Granja (Nivel 5)</html>\r\n");
		jButton_subirNivelTorre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jButton_subirNivelTorre.setBackground(SystemColor.controlDkShadow);
		GridBagConstraints gbc_jButton_subirNivelTorre = new GridBagConstraints();
		gbc_jButton_subirNivelTorre.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_subirNivelTorre.gridx = 4;
		gbc_jButton_subirNivelTorre.gridy = 17;
		panelPoblado.add(jButton_subirNivelTorre, gbc_jButton_subirNivelTorre);
		
		jLabel_madera_torre = new JLabel("Madera");
		jLabel_madera_torre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_madera_torre.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/madera.png")));
		GridBagConstraints gbc_jLabel_madera_torre = new GridBagConstraints();
		gbc_jLabel_madera_torre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_madera_torre.gridx = 6;
		gbc_jLabel_madera_torre.gridy = 17;
		panelPoblado.add(jLabel_madera_torre, gbc_jLabel_madera_torre);
		
		jLabel_barro_torre = new JLabel("Barro");
		jLabel_barro_torre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		 jLabel_barro_torre.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/Barro.png")));
		GridBagConstraints gbc_jLabel_barro_torre = new GridBagConstraints();
		gbc_jLabel_barro_torre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_barro_torre.gridx = 7;
		gbc_jLabel_barro_torre.gridy = 17;
		panelPoblado.add(jLabel_barro_torre, gbc_jLabel_barro_torre);
		
		jLabel_hierro_torre = new JLabel("Hierro");
		jLabel_hierro_torre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_hierro_torre.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/hierro.png")));
		GridBagConstraints gbc_jLabel_hierro_torre = new GridBagConstraints();
		gbc_jLabel_hierro_torre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_hierro_torre.gridx = 8;
		gbc_jLabel_hierro_torre.gridy = 17;
		panelPoblado.add(jLabel_hierro_torre, gbc_jLabel_hierro_torre);
		
		jLabel_poblacion_torre = new JLabel("10");
		jLabel_poblacion_torre.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_torre.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_torre = new GridBagConstraints();
		gbc_jLabel_poblacion_torre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_torre.gridx = 9;
		gbc_jLabel_poblacion_torre.gridy = 17;
		panelPoblado.add(jLabel_poblacion_torre, gbc_jLabel_poblacion_torre);
		
		jLabel_nivelPlaza = new JLabel("Plaza");
		jLabel_nivelPlaza.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_nivelPlaza.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/plaza.png")));
		GridBagConstraints gbc_jLabel_nivelPlaza = new GridBagConstraints();
		gbc_jLabel_nivelPlaza.anchor = GridBagConstraints.WEST;
		gbc_jLabel_nivelPlaza.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_nivelPlaza.gridx = 2;
		gbc_jLabel_nivelPlaza.gridy = 18;
		panelPoblado.add(jLabel_nivelPlaza, gbc_jLabel_nivelPlaza);
		
		jLabel_poblacion_plaza = new JLabel("10");
		jLabel_poblacion_plaza.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		jLabel_poblacion_plaza.setIcon(new ImageIcon(VentanaDelJuego.class.getResource("/images/poblacion.png")));
		GridBagConstraints gbc_jLabel_poblacion_plaza = new GridBagConstraints();
		gbc_jLabel_poblacion_plaza.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_poblacion_plaza.gridx = 9;
		gbc_jLabel_poblacion_plaza.gridy = 18;
		panelPoblado.add(jLabel_poblacion_plaza, gbc_jLabel_poblacion_plaza);
		
		return panelPoblado;
	}
	

	private Thread crearSoldadoEspada() {
		
	
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				do {
					Thread.currentThread();
	
					int segundosTotales = pobladoJugador.getCuartel().getTiempoCreacionSoldadoEspada();
	
					for (int i = segundosTotales; i >= 0; i--) {
	
						String minutos = String.valueOf(i / 60);
						String segundos = String.valueOf(i % 60);
						
						if ((i%60) < 10) {
							jLabel_relojCreacionSoldadoEspada.setText(minutos + ":0" + segundos);
						} else {
							jLabel_relojCreacionSoldadoEspada.setText(minutos + ":" + segundos);
	
						}
	
						
	
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
						}
	
					}
	
					pobladoJugador.getCuartel().crearSoldadoEspada(); // Creamos un soldado con espada
					jLabel_cantSoldadosEspada.setText("Cantidad Total: " + String.valueOf(pobladoJugador.getCuartel().getCantSoldadoEspada()));
					pobladoJugador.agregarPobladores(1);
					cantSoldadoEspadaParaCrear--; // Decremetamos los soldados con espada en cola
	
					if (cantSoldadoEspadaParaCrear > 0) {
						
	
						jButton_crearSoldadoEspada.setText("Creando " + String.valueOf(cantLancerosParaCrear));
	
					} else {
						jButton_crearSoldadoEspada.setText("Crear   ");
						jButton_crearSoldadoEspada.setToolTipText("30 Madera, 30 Barro, 70 Hierro");
						jLabel_relojCreacionSoldadoEspada.setText("           ");
	
					}
	
				} while (cantSoldadoEspadaParaCrear > 0);
	
			}
	
		};
	
		hilo = new Thread(hiloWhile);
	
		return hilo;
	
		
	}
	
	
	private Thread crearSoldadoHacha() {
		
		
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				do {
					Thread.currentThread();

					int segundosTotales = pobladoJugador.getCuartel().getTiempoCreacionSoldadoHacha();

					for (int i = segundosTotales; i >= 0; i--) {

						String minutos = String.valueOf(i / 60);
						String segundos = String.valueOf(i % 60);
						
						if ((i%60) < 10) {
							jLabel_relojCreacionSoldadoHacha.setText(minutos + ":0" + segundos);
						} else {
							jLabel_relojCreacionSoldadoHacha.setText(minutos + ":" + segundos);

						}

						

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
						}

					}

					jButton_crearSoldadoHacha.setToolTipText("60 Madera, 30 Barro, 40 Hierro");

					pobladoJugador.getCuartel().crearSoldadoHacha(); // Creamos un soldado con hacha
					jLabel_cantSoldadosHacha.setText("Cantidad Total: " + String.valueOf(pobladoJugador.getCuartel().getCantLancero()));
					pobladoJugador.agregarPobladores(1);
					cantSoldadoHachaParaCrear--; // Decremetamos los soldados con hacha en cola

					if (cantSoldadoHachaParaCrear > 0) {
						

						jButton_crearSoldadoHacha.setText("Creando " + String.valueOf(cantSoldadoHachaParaCrear));

					} else {
						jButton_crearSoldadoHacha.setText("Crear   ");
						jLabel_relojCreacionSoldadoHacha.setText("           ");

					}

				} while (cantSoldadoHachaParaCrear > 0);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
		
			
		}
	
	private Thread crearArquero() {
		
		
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				do {
					Thread.currentThread();

					int segundosTotales = pobladoJugador.getCuartel().getTiempoCreacionArquero();

					for (int i = segundosTotales; i >= 0; i--) {

						String minutos = String.valueOf(i / 60);
						String segundos = String.valueOf(i % 60);
						
						if ((i%60) < 10) {
							jLabel_relojCreacionArquero.setText(minutos + ":0" + segundos);
						} else {
							jLabel_relojCreacionArquero.setText(minutos + ":" + segundos);

						}

						

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
						}

					}

					jButton_crearArquero.setToolTipText("100 Madera, 30 Barro, 60 Hierro");

					pobladoJugador.getCuartel().crearArquero(); // Creamos un Arquero
					jLabel_cantArqueros.setText("Cantidad Total: " + String.valueOf(pobladoJugador.getCuartel().getCantArquero()));
					pobladoJugador.agregarPobladores(1);
					cantArqueroParaCrear--; // Decremetamos los Arqueros en cola

					if (cantArqueroParaCrear > 0) {
						

						jButton_crearArquero.setText("Creando " + String.valueOf(cantArqueroParaCrear));

					} else {
						jButton_crearArquero.setText("Crear   ");
						jLabel_relojCreacionArquero.setText("           ");

					}

				} while (cantArqueroParaCrear > 0);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
		
			
		}
	
	private Thread crearLancero() {
		
		
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			@Override
			public void run() {
				do {
					Thread.currentThread();

					int segundosTotales = pobladoJugador.getCuartel().getTiempoCreacionLancero();

					for (int i = segundosTotales; i >= 0; i--) {

						String minutos = String.valueOf(i / 60);
						String segundos = String.valueOf(i % 60);
						
						if ((i%60) < 10) {
							jLabel_relojCreacionLancero.setText(minutos + ":0" + segundos);
						} else {
							jLabel_relojCreacionLancero.setText(minutos + ":" + segundos);

						}

						

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
						}

					}

					pobladoJugador.getCuartel().crearLancero(); // Creamos un lancero
					jLabel_cantLanceros.setText("Cantidad Total: " + String.valueOf(pobladoJugador.getCuartel().getCantLancero()));
					pobladoJugador.agregarPobladores(1);
					cantLancerosParaCrear--; // Decremetamos los lanceros en cola

					if (cantLancerosParaCrear > 0) {
						

						jButton_crearLancero.setText("Creando " + String.valueOf(cantLancerosParaCrear));

					} else {
						jButton_crearLancero.setText("Crear   ");
						jLabel_relojCreacionLancero.setText("           ");

					}

				} while (cantLancerosParaCrear > 0);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
		
			
		}

	private Thread subirNivel(Edificio edificio, JButton boton) {
		
		
		
		

		// Si hay recursos para construir y espacio para los nuevos trabajadores del edificio
		
		if (pobladoJugador.hayLugarMasPoblacion(edificio.getCantidadTrabajadoresSiguienteNivel() ) ) {
			
			if (!edificio.estaEnMaximoNivel()) {
				if (pobladoJugador.hayRecursos(edificio.getCostoSubirNivel())) {

					Thread hilo;

					Runnable hiloWhile = new Runnable() {

						@Override
						public void run() {

							Thread.currentThread();

							pobladoJugador.agregarPobladores(edificio.getCantidadTrabajadoresSiguienteNivel()); // Agregamos los pobladores que van a ocupar lugar 
																												// cuando se acabe de subir el nivel del edificio 
																												// para reservar ese lugar y que no provoque conflicto
																												// con otros elementos del sistema que quieran agregar
																												// población

							int segundosTotales = 1;

							for (int i = segundosTotales; i >= 0; i--) {
								boton.setEnabled(false);
								String minutos = String.valueOf(i / 60);
								String segundos = String.valueOf(i % 60);

								if ((i % 60) < 10) {

									boton.setText(minutos + ":0" + segundos);
								} else {
									boton.setText(minutos + ":" + segundos);
								}
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
								}

							}
							if (edificio.getNivel() != edificio.getMaxNivel()) {
								boton.setEnabled(true);
								boton.setText("Subir nivel");
								edificio.subirNivel();
								habilitarODesabilitarBotones();
							}else {

								boton.setText("Nivel Máximo");
							}
							
							
							
							
							
							if (boton.equals(jButton_subirNivelCuartel)) {
								jButton_VerCuartel.setEnabled(true);
							}
							if ((pobladoJugador.getCuartel().getNivel() >= 3) && (pobladoJugador.getHerreria().getNivel() >= 1)) {
								jButton_crearSoldadoEspada.setEnabled(true);
								jButton_crearSoldadoHacha.setEnabled(true);
							}
							if ((pobladoJugador.getCuartel().getNivel() >= 5) && (pobladoJugador.getHerreria().getNivel() >= 3)) {
								jButton_crearArquero.setEnabled(true);
							}
							

						}

					};

					hilo = new Thread(hiloWhile);

					return hilo;

				} else {
					JOptionPane.showMessageDialog(null, "No tienes los recursos para subir de nivel este edificio");
					return null;
				} 
			}else {
				boton.setEnabled(false);
				return null;
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "No tienes espacio para los nuevos trabajadores de este edificio");
			return null;
		}
		
	}
	
	private JPanel inicializarPanelPlaza() {
		JPanel panelPlaza = new JPanel();
		panelPlaza.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_panelPlaza = new GridBagLayout();
		gbl_panelPlaza.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelPlaza.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelPlaza.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelPlaza.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelPlaza.setLayout(gbl_panelPlaza);
		
		
		jLabel_lancerosP = new JLabel("Lanceros");
		jLabel_lancerosP.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_lancerosP.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_lanceros = new GridBagConstraints();
		gbc_jLabel_lanceros.anchor = GridBagConstraints.WEST;
		gbc_jLabel_lanceros.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_lanceros.gridx = 1;
		gbc_jLabel_lanceros.gridy = 1;
		panelPlaza.add(jLabel_lancerosP, gbc_jLabel_lanceros);
		
		
		spinner_Lanceros = new JSpinner();
		spinner_Lanceros.setModel(new SpinnerNumberModel(0, 0, 0, 1));
		spinner_Lanceros.setPreferredSize(new Dimension(60, 25));
		GridBagConstraints gbc_spinner_Lanceros = new GridBagConstraints();
		gbc_spinner_Lanceros.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_Lanceros.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_Lanceros.gridx = 3;
		gbc_spinner_Lanceros.gridy = 1;
		panelPlaza.add(spinner_Lanceros, gbc_spinner_Lanceros);
		
		jLabel_maxLanceros = new JLabel("/0");
		jLabel_maxLanceros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_maxLanceros.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_maxLanceros = new GridBagConstraints();
		gbc_jLabel_maxLanceros.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_maxLanceros.gridx = 4;
		gbc_jLabel_maxLanceros.gridy = 1;
		panelPlaza.add(jLabel_maxLanceros, gbc_jLabel_maxLanceros);
		
		jLabel_SoldadosEspadaP = new JLabel("Soldados con Espada");
		jLabel_SoldadosEspadaP.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_SoldadosEspadaP.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_SoldadosEspada = new GridBagConstraints();
		gbc_jLabel_SoldadosEspada.anchor = GridBagConstraints.WEST;
		gbc_jLabel_SoldadosEspada.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_SoldadosEspada.gridx = 1;
		gbc_jLabel_SoldadosEspada.gridy = 3;
		panelPlaza.add(jLabel_SoldadosEspadaP, gbc_jLabel_SoldadosEspada);
		
		spinner_SoldadosEspada = new JSpinner();
		spinner_SoldadosEspada.setModel(new SpinnerNumberModel(0, 0, 0, 1));
		spinner_SoldadosEspada.setPreferredSize(new Dimension(60, 25));
		GridBagConstraints gbc_spinner_SoldadosEspada = new GridBagConstraints();
		gbc_spinner_SoldadosEspada.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_SoldadosEspada.gridx = 3;
		gbc_spinner_SoldadosEspada.gridy = 3;
		panelPlaza.add(spinner_SoldadosEspada, gbc_spinner_SoldadosEspada);
		
		jLabel_maxSoldadosEspada = new JLabel("/0");
		jLabel_maxSoldadosEspada.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_maxSoldadosEspada.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_maxSoldadosEspada = new GridBagConstraints();
		gbc_jLabel_maxSoldadosEspada.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_maxSoldadosEspada.gridx = 4;
		gbc_jLabel_maxSoldadosEspada.gridy = 3;
		panelPlaza.add(jLabel_maxSoldadosEspada, gbc_jLabel_maxSoldadosEspada);
		
		jLabel_SoldadosHachaP = new JLabel("Soldados con Hacha");
		jLabel_SoldadosHachaP.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_SoldadosHachaP.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_SoldadosHacha = new GridBagConstraints();
		gbc_jLabel_SoldadosHacha.anchor = GridBagConstraints.WEST;
		gbc_jLabel_SoldadosHacha.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_SoldadosHacha.gridx = 1;
		gbc_jLabel_SoldadosHacha.gridy = 5;
		panelPlaza.add(jLabel_SoldadosHachaP, gbc_jLabel_SoldadosHacha);
		
		spinner_SoldadosHacha = new JSpinner();
		spinner_SoldadosHacha.setModel(new SpinnerNumberModel(0, 0, 0, 1));
		spinner_SoldadosHacha.setPreferredSize(new Dimension(60, 25));
		GridBagConstraints gbc_spinner_SoldadosHacha = new GridBagConstraints();
		gbc_spinner_SoldadosHacha.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_SoldadosHacha.gridx = 3;
		gbc_spinner_SoldadosHacha.gridy = 5;
		panelPlaza.add(spinner_SoldadosHacha, gbc_spinner_SoldadosHacha);
		
		jLabel_maxSoldadosHacha = new JLabel("/0");
		jLabel_maxSoldadosHacha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_maxSoldadosHacha.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_maxSoldadosHacha = new GridBagConstraints();
		gbc_jLabel_maxSoldadosHacha.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_maxSoldadosHacha.gridx = 4;
		gbc_jLabel_maxSoldadosHacha.gridy = 5;
		panelPlaza.add(jLabel_maxSoldadosHacha, gbc_jLabel_maxSoldadosHacha);
		
		jLabel_arquerosP = new JLabel("Arqueros");
		jLabel_arquerosP.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_arquerosP.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_arquerosP = new GridBagConstraints();
		gbc_jLabel_arquerosP.anchor = GridBagConstraints.WEST;
		gbc_jLabel_arquerosP.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_arquerosP.gridx = 1;
		gbc_jLabel_arquerosP.gridy = 7;
		panelPlaza.add(jLabel_arquerosP, gbc_jLabel_arquerosP);
		
		spinner_Arqueros = new JSpinner();
		spinner_Arqueros.setModel(new SpinnerNumberModel(0, 0, 0, 1));
		spinner_Arqueros.setPreferredSize(new Dimension(60, 25));
		GridBagConstraints gbc_spinner_Arqueros = new GridBagConstraints();
		gbc_spinner_Arqueros.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_Arqueros.gridx = 3;
		gbc_spinner_Arqueros.gridy = 7;
		panelPlaza.add(spinner_Arqueros, gbc_spinner_Arqueros);
		
		jLabel_maxArqueros = new JLabel("/0");
		jLabel_maxArqueros.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_maxArqueros.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_maxArqueros = new GridBagConstraints();
		gbc_jLabel_maxArqueros.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_maxArqueros.gridx = 4;
		gbc_jLabel_maxArqueros.gridy = 7;
		panelPlaza.add(jLabel_maxArqueros, gbc_jLabel_maxArqueros);
		
		
		
		btnNewButton = new JButton("Mapa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane_principal.removeAll();
				layeredPane_principal.add(panel_contenedorDelMapa);
				layeredPane_principal.repaint();
				layeredPane_principal.revalidate();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 9;
		panelPlaza.add(btnNewButton, gbc_btnNewButton);
		
		jLabel_posicionEnemigo = new JLabel("Enemigo [0,0]");
		jLabel_posicionEnemigo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_posicionEnemigo.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_posicionEnemigo = new GridBagConstraints();
		gbc_jLabel_posicionEnemigo.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_posicionEnemigo.gridx = 1;
		gbc_jLabel_posicionEnemigo.gridy = 10;
		panelPlaza.add(jLabel_posicionEnemigo, gbc_jLabel_posicionEnemigo);
		
		jButton_Atacar = new JButton("Atacar");
		jButton_Atacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((relojViaje==null) || (!relojViaje.isAlive())) {
					
						if (ubicacionEnemigo[0] != 10) {
							
							ataqueAceptado();

							

						} else {
							JOptionPane.showMessageDialog(panelPlaza, "Debe elegir un poblado enemigo para atacar");

						}
					 
				}
				 
			}

			private void ataqueAceptado() {

				double distancia = enviarTropas(ubicacionJugador, ubicacionEnemigo);
				int tiempoViaje = (int) (distancia * 10);

				bandera = 1;
				
				
				
				jLabel_ejercitoEnviado.setText(spinner_Lanceros.getValue().toString() + " Lanceros, "
						+ spinner_SoldadosEspada.getValue().toString() + " Soldados con Espada, "
								+ spinner_SoldadosHacha.getValue().toString() +  " Soldados con Hacha, "
										+ spinner_Arqueros.getValue().toString() +  " Arqueros");
				
				int[] ejercitoEnviado = new int[4];
				ejercitoEnviado[Cuartel.LANCERO] = (int) spinner_Lanceros.getValue();
				ejercitoEnviado[Cuartel.SOLDADOESPADA] = (int) spinner_SoldadosEspada.getValue();
				ejercitoEnviado[Cuartel.SOLDADOHACHA] = (int) spinner_SoldadosHacha.getValue();
				ejercitoEnviado[Cuartel.ARQUERO] = (int) spinner_Arqueros.getValue();
				
				relojViaje = inicializarRelojViaje(tiempoViaje ,ejercitoEnviado);
				relojViaje.start();
				
				pobladoJugador.getCuartel().eliminarLanceros(ejercitoEnviado[Cuartel.LANCERO]);
				pobladoJugador.getCuartel().eliminarSoldadosEspada(ejercitoEnviado[Cuartel.SOLDADOESPADA]);
				pobladoJugador.getCuartel().eliminarSoldadosHacha(ejercitoEnviado[Cuartel.SOLDADOHACHA]);
				pobladoJugador.getCuartel().eliminarArqueros(ejercitoEnviado[Cuartel.ARQUERO]);
				
				spinner_Lanceros.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantLancero(), 1));
				spinner_SoldadosEspada.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantSoldadoEspada(), 1));
				spinner_SoldadosHacha.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantSoldadoHacha(), 1));
				spinner_Arqueros.setModel(new SpinnerNumberModel(0, 0, pobladoJugador.getCuartel().getCantArquero(), 1));
			}
		});
		GridBagConstraints gbc_jButton_Atacar = new GridBagConstraints();
		gbc_jButton_Atacar.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_Atacar.gridx = 3;
		gbc_jButton_Atacar.gridy = 11;
		panelPlaza.add(jButton_Atacar, gbc_jButton_Atacar);
		
		jLabel_relojTropas = new JLabel("0:00");
		jLabel_relojTropas.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		jLabel_relojTropas.setAlignmentX(0.5f);
		GridBagConstraints gbc_jLabel_relojTropas = new GridBagConstraints();
		gbc_jLabel_relojTropas.insets = new Insets(0, 0, 5, 5);
		gbc_jLabel_relojTropas.gridx = 5;
		gbc_jLabel_relojTropas.gridy = 11;
		panelPlaza.add(jLabel_relojTropas, gbc_jLabel_relojTropas);
		
		Poblado[] pobladosEnemigos = mapaMundial.getPueblosEnemigos();
		
		
		jButton_actualizarEnemigos = new JButton("Actualizar recursos de enemigos");
		jButton_actualizarEnemigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String listaEnemigos = "";
				for (int i = 0; i < pobladosEnemigos.length; i++) {
					listaEnemigos += pobladosEnemigos[i].getNombre() + " de " + pobladosEnemigos[i].getPropietario()
							+ "\t madera: " + pobladosEnemigos[i].getMadera()
							+ "\t barro: " + pobladosEnemigos[i].getBarro()
							+ "\t hierro: " + pobladosEnemigos[i].getHierro()
							+ "\t nivel casa: " + pobladosEnemigos[i].getCasaCentral().getNivel()
							+ "\n aserradero: " + pobladosEnemigos[i].getAserradero().getNivel()
							+ "\t barrera: " + pobladosEnemigos[i].getBarrera().getNivel()
							+ "\t mina: " + pobladosEnemigos[i].getMinaDeHierro().getNivel()
							+ "\t cuartel: " + pobladosEnemigos[i].getCuartel().getNivel()
							+ "\t herrería: " + pobladosEnemigos[i].getHerreria().getNivel()
							+ "\t población: " + pobladosEnemigos[i].getPoblacion()
							+ "\t Lanceros: " + pobladosEnemigos[i].getCuartel().getCantLancero()+"\n";
				}
				
				textPane_listaEnemigos.setText(listaEnemigos);
				
			}
		});
		
		jLabel_ejercitoEnviado = new JLabel("");
		GridBagConstraints gbc_jLabel_ejercitoEnviado = new GridBagConstraints();
		gbc_jLabel_ejercitoEnviado.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_ejercitoEnviado.gridx = 6;
		gbc_jLabel_ejercitoEnviado.gridy = 11;
		panelPlaza.add(jLabel_ejercitoEnviado, gbc_jLabel_ejercitoEnviado);
		
		jLabel_botin = new JLabel("");
		GridBagConstraints gbc_jLabel_botin = new GridBagConstraints();
		gbc_jLabel_botin.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_botin.gridx = 6;
		gbc_jLabel_botin.gridy = 12;
		panelPlaza.add(jLabel_botin, gbc_jLabel_botin);
		
		jLabel_resultadoBatalla = new JLabel("");
		GridBagConstraints gbc_jLabel_resultadoBatalla = new GridBagConstraints();
		gbc_jLabel_resultadoBatalla.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel_resultadoBatalla.gridx = 6;
		gbc_jLabel_resultadoBatalla.gridy = 13;
		panelPlaza.add(jLabel_resultadoBatalla, gbc_jLabel_resultadoBatalla);
		GridBagConstraints gbc_jButton_actualizarEnemigos = new GridBagConstraints();
		gbc_jButton_actualizarEnemigos.insets = new Insets(0, 0, 5, 5);
		gbc_jButton_actualizarEnemigos.gridx = 1;
		gbc_jButton_actualizarEnemigos.gridy = 15;
		panelPlaza.add(jButton_actualizarEnemigos, gbc_jButton_actualizarEnemigos);
		
		textPane_listaEnemigos = new JTextPane();
		GridBagConstraints gbc_textPane_listaEnemigos = new GridBagConstraints();
		gbc_textPane_listaEnemigos.fill = GridBagConstraints.BOTH;
		gbc_textPane_listaEnemigos.gridx = 6;
		gbc_textPane_listaEnemigos.gridy = 16;
		panelPlaza.add(textPane_listaEnemigos, gbc_textPane_listaEnemigos);
		
		String listaEnemigos = "";
		
		for (int i = 0; i < pobladosEnemigos.length; i++) {
			listaEnemigos += pobladosEnemigos[i].getNombre() + " de " + pobladosEnemigos[i].getPropietario() + "\n";
		}
		
		textPane_listaEnemigos.setText(listaEnemigos);
		
		return panelPlaza;
		
		
	}
	
	private Thread inicializarRelojViaje(int tiempoViaje, int ejercito[]) {
		Thread hilo;

		Runnable hiloWhile = new Runnable() {

			

			@Override
			public void run() {

				Thread.currentThread();
				
				jButton_Atacar.setEnabled(false);

				

				for (int i = tiempoViaje; i >= 0; i--) {
					
					String minutos = String.valueOf(i / 60);
					String segundos = String.valueOf(i % 60);

					if ((i % 60) < 10) {

						jLabel_relojTropas.setText(minutos + ":0" + segundos);
					} else {
						jLabel_relojTropas.setText(minutos + ":" + segundos);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						JOptionPane.showMessageDialog(null, "Error al pausar hilo contador");
					}

				}
				if (bandera==1) {
					
					Poblado enemigo = ubicacionPueblos[ubicacionEnemigo[0]][ubicacionEnemigo[1]];
					Batalla batalla = new Batalla(pobladoJugador, enemigo);
					batalla.setEjercitoEnviado(ejercito);
					batalla.iniciar();

					unidadesPerdidasEnBatalla = 0;
					
					if (batalla.getVictoria()) {
						
						ejercitoVictorioso =   batalla.getEjercitoVictorioso();
						
						unidadesPerdidasEnBatalla = 0;
						
						for(int i = 0; i < ejercitoVictorioso.length; i++) {
							unidadesPerdidasEnBatalla += ejercito[i] - ejercitoVictorioso[i];
						}
						
						relojViaje = inicializarRelojViaje(tiempoViaje, ejercitoVictorioso);
						
						jLabel_ejercitoEnviado.setText(String.valueOf(ejercitoVictorioso[0]) + " Lanceros, "
								+ String.valueOf(ejercitoVictorioso[1]) + " Soldados con Espada, "
										+ String.valueOf(ejercitoVictorioso[2]) +  " Soldados con Hacha, "
												+ String.valueOf(ejercitoVictorioso[3]) +  " Arqueros");
						
						botin = batalla.getBotinRobado();
						
						jLabel_botin.setText("Madera: " + String.valueOf(botin[0]) + "	Barro: " + String.valueOf(botin[1]) + "	Hierro: " + String.valueOf(botin[2]));
						
						jLabel_resultadoBatalla.setText("¡VICTORIA!");
						jLabel_resultadoBatalla.setBackground(Color.GREEN);

						
						relojViaje.start();
						
					} else {
						
						jLabel_ejercitoEnviado.setText("");
						jLabel_resultadoBatalla.setText("DERROTA");
						
						for(int i = 0; i < ejercito.length; i++) {
							unidadesPerdidasEnBatalla += ejercito[i];
						}
						
						pobladoJugador.eliminarPoblacion(unidadesPerdidasEnBatalla);
						jLabel_resultadoBatalla.setBackground(Color.RED);
						jLabel_botin.setText("");
						jButton_Atacar.setEnabled(true);

					}
					bandera = 2;
					
				}else if (bandera == 2) {
					
					pobladoJugador.agregarBotin(botin);
					pobladoJugador.getCuartel().agregarEjercitoVictorioso(ejercitoVictorioso);
					
					pobladoJugador.eliminarPoblacion(unidadesPerdidasEnBatalla);
					
					jLabel_botin.setText("");
					jLabel_resultadoBatalla.setText("");
					jLabel_ejercitoEnviado.setText("");
					
					bandera=0;
					jButton_Atacar.setEnabled(true);
				}
				jButton_Atacar.setEnabled(true);

			}

		};

		hilo = new Thread(hiloWhile);

		return hilo;
	}

	

	public void enviarDatosPoblado(int v, int h) {
		String enemigo = ubicacionPueblos[v][h].getNombre();
		jLabel_posicionEnemigo.setText(enemigo + " [" + v + "," + h + "]");
		ubicacionEnemigo[0] = v;
		ubicacionEnemigo[1] = h;
		
	}
	
	private double enviarTropas(int[] origen, int[] destino) {
		
		double distVertical = origen[0] - destino[0];
		double distHorizontal = origen[1] - destino[1];
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double distanciaTotal = Double.parseDouble(df.format(Math.sqrt(Math.pow(distVertical, 2)+ Math.pow(distHorizontal, 2))));
		
		return distanciaTotal;
	}
}
