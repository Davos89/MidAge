package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import clases.MapaMundial;
import clases.Poblado;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DropMode;
import java.awt.Cursor;

public class VentanaCreacionDePartida extends JFrame {

	private JPanel contentPane;
	private JTextField txt_NombrePoblado;
	private JTextField txt_nombreJugador;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCreacionDePartida frame = new VentanaCreacionDePartida();
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
	public VentanaCreacionDePartida() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaCreacionDePartida.class.getResource("/images/IconoEspada.png")));
		VentanaCreacionDePartida vcp =this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		setLocationRelativeTo(null);
		setTitle("Middle Age  - Crear Partida");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nueva Partida");
		lblNewLabel_1.setBounds(155, 11, 268, 36);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(206, 145, 30));
		lblNewLabel_1.setFont(new Font("Harrington", Font.BOLD, 30));
		contentPane.add(lblNewLabel_1);
		
		JButton jButton_nuevaPartida = new JButton("Comenzar");
		jButton_nuevaPartida.setBounds(345, 393, 142, 28);
		jButton_nuevaPartida.setForeground(new Color(206, 145, 30));
		jButton_nuevaPartida.setFont(new Font("Harrington", Font.BOLD, 20));
		jButton_nuevaPartida.setFocusPainted(false);
		jButton_nuevaPartida.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jButton_nuevaPartida.setBackground(new Color(50, 49, 44));
		contentPane.add(jButton_nuevaPartida);
		
		JButton jButton_volverPantallaPrincipal = new JButton("Volver");
		jButton_volverPantallaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaPrincipal vp = new VentanaPrincipal();
				vp.setVisible(true);
				dispose();
			}
		});
		jButton_volverPantallaPrincipal.setForeground(new Color(206, 145, 30));
		jButton_volverPantallaPrincipal.setFont(new Font("Harrington", Font.BOLD, 20));
		jButton_volverPantallaPrincipal.setFocusPainted(false);
		jButton_volverPantallaPrincipal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jButton_volverPantallaPrincipal.setBackground(new Color(50, 49, 44));
		jButton_volverPantallaPrincipal.setBounds(99, 393, 142, 28);
		contentPane.add(jButton_volverPantallaPrincipal);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del Poblado");
		lblNewLabel_2.setFont(new Font("Harrington", Font.BOLD, 18));
		lblNewLabel_2.setBounds(62, 144, 296, 20);
		lblNewLabel_2.setForeground(new Color(206, 145, 30));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad de Poblados Enemigos");
		lblNewLabel_2_1.setForeground(new Color(206, 145, 30));
		lblNewLabel_2_1.setFont(new Font("Harrington", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(62, 193, 296, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dificultad");
		lblNewLabel_2_2.setForeground(new Color(206, 145, 30));
		lblNewLabel_2_2.setFont(new Font("Harrington", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(62, 241, 296, 20);
		contentPane.add(lblNewLabel_2_2);
		
		txt_NombrePoblado = new JTextField();
		txt_NombrePoblado.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txt_NombrePoblado.setFont(new Font("Harrington", Font.BOLD, 15));
		txt_NombrePoblado.setCaretColor(Color.WHITE);
		txt_NombrePoblado.setBackground(Color.GRAY);
		txt_NombrePoblado.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txt_NombrePoblado.setBounds(387, 138, 171, 28);
		txt_NombrePoblado.setForeground(new Color(206, 145, 30));
		contentPane.add(txt_NombrePoblado);
		txt_NombrePoblado.setColumns(10);
		
		JComboBox cmb_cantidadEnemigos = new JComboBox();
		cmb_cantidadEnemigos.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		cmb_cantidadEnemigos.setFont(new Font("Harrington", Font.BOLD, 15));
		cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cmb_cantidadEnemigos.setSelectedIndex(0);
		cmb_cantidadEnemigos.setMaximumRowCount(10);
		cmb_cantidadEnemigos.setBounds(387, 195, 45, 28);
		cmb_cantidadEnemigos.setBackground(Color.GRAY);
		contentPane.add(cmb_cantidadEnemigos);
		
		JComboBox cmb_dificultad = new JComboBox();
		cmb_dificultad.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		cmb_dificultad.setFont(new Font("Harrington", Font.BOLD, 15));
		cmb_dificultad.setModel(new DefaultComboBoxModel(new String[] {"Muy fácil", "Fácil", "Medio", "Difícil", "Muy difícil"}));
		cmb_dificultad.setSelectedIndex(2);
		cmb_dificultad.setMaximumRowCount(5);
		cmb_dificultad.setBounds(387, 243, 110, 28);
		cmb_dificultad.setBackground(Color.GRAY);
		contentPane.add(cmb_dificultad);
		

		
		
		JComboBox cmb_tamanioMapa = new JComboBox();
		cmb_tamanioMapa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch (cmb_tamanioMapa.getSelectedIndex()) {
				case 0:
					cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
					break;
				case 1:
					cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
					break;
				case 2:
					cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
					break;
				case 3:
					cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
					break;

				case 4:
					cmb_cantidadEnemigos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
					break;


				default:
					break;
				}
				
			}
		});
		cmb_tamanioMapa.setModel(new DefaultComboBoxModel(new String[] {"Muy chico (4x4)", "Chico (5x5)", "Mediano (6x6)", "Grande (7x7)", "Muy Grande (8x8)"}));
		cmb_tamanioMapa.setSelectedIndex(2);
		cmb_tamanioMapa.setMaximumRowCount(5);
		cmb_tamanioMapa.setFont(new Font("Harrington", Font.BOLD, 15));
		cmb_tamanioMapa.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		cmb_tamanioMapa.setBackground(Color.GRAY);
		cmb_tamanioMapa.setBounds(387, 290, 162, 28);
		contentPane.add(cmb_tamanioMapa);
		
		
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Tamaño de mapa");
		lblNewLabel_2_2_1.setForeground(new Color(206, 145, 30));
		lblNewLabel_2_2_1.setFont(new Font("Harrington", Font.BOLD, 18));
		lblNewLabel_2_2_1.setBounds(62, 293, 296, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Nombre del Jugador");
		lblNewLabel_2_3.setForeground(new Color(206, 145, 30));
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(62, 92, 296, 20);
		contentPane.add(lblNewLabel_2_3);
		
		txt_nombreJugador = new JTextField();
		txt_nombreJugador.setForeground(new Color(206, 145, 30));
		txt_nombreJugador.setFont(new Font("Dialog", Font.BOLD, 15));
		txt_nombreJugador.setColumns(10);
		txt_nombreJugador.setCaretColor(Color.WHITE);
		txt_nombreJugador.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		txt_nombreJugador.setBackground(Color.GRAY);
		txt_nombreJugador.setBounds(387, 93, 171, 28);
		contentPane.add(txt_nombreJugador);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Harrington", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon(VentanaCreacionDePartida.class.getResource("/images/wallpaper.jpg")));
		lblNewLabel.setBounds(0, 0, 594, 451);
		contentPane.add(lblNewLabel);
		
		
		jButton_nuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombrePoblado = txt_NombrePoblado.getText();
				String nombreJugador = txt_nombreJugador.getText();
				
				if (!txt_NombrePoblado.getText().equals("")) {
					
					Poblado poblado = new Poblado(nombrePoblado,nombreJugador);
					
					MapaMundial mapaMundial = new MapaMundial(poblado, cmb_cantidadEnemigos.getSelectedIndex() + 1, cmb_tamanioMapa.getSelectedIndex() + 4);
					
					VentanaDelJuego vj = new VentanaDelJuego(poblado, mapaMundial);
					vj.setVisible(true);
					
					dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(vcp, "Debe elegir un nombre para el poblado");

				}
				
			}
		});
	}
}
