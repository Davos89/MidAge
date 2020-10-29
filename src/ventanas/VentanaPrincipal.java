package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/images/IconoEspada.png")));
		setTitle("Middle Age  - Pantalla de inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Age");
		lblNewLabel_1.setFont(new Font("Harrington", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(193, 60, 203, 60);
		lblNewLabel_1.setForeground(new Color(206,145,30));
		contentPane.add(lblNewLabel_1);
		
		JButton jButton_nuevaPartida = new JButton("Nueva Partida");
		jButton_nuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaCreacionDePartida vcp = new VentanaCreacionDePartida();
				vcp.setVisible(true);
				dispose();
			}
		});
		jButton_nuevaPartida.setFocusPainted(false);
		jButton_nuevaPartida.setFont(new Font("Harrington", Font.BOLD, 20));
		jButton_nuevaPartida.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jButton_nuevaPartida.setBackground(new Color(50,49,44));
		jButton_nuevaPartida.setBounds(214, 204, 161, 30);
		jButton_nuevaPartida.setForeground(new Color(206,145,30));
		contentPane.add(jButton_nuevaPartida);
		
		JButton jButton_cargarPartida = new JButton("Cargar Partida");
		jButton_cargarPartida.setForeground(new Color(206, 145, 30));
		jButton_cargarPartida.setFont(new Font("Harrington", Font.BOLD, 20));
		jButton_cargarPartida.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jButton_cargarPartida.setBackground(new Color(50, 49, 44));
		jButton_cargarPartida.setBounds(214, 264, 161, 30);
		contentPane.add(jButton_cargarPartida);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/wallpaper.jpg")));
		lblNewLabel.setBounds(0, 0, 594, 451);
		contentPane.add(lblNewLabel);
	}
}
