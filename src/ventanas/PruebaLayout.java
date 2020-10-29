package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JLayeredPane;

public class PruebaLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaLayout frame = new PruebaLayout();
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
	public PruebaLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel jLabel_nivel = new JLabel("Nivel:");
		panel.add(jLabel_nivel);
		
		JLabel jLabel_alimento = new JLabel("Alimento");
		panel.add(jLabel_alimento);
		
		JLabel jLabel_madera = new JLabel("Madera");
		panel.add(jLabel_madera);
		
		JLabel jLabel_piedra = new JLabel("Piedra");
		panel.add(jLabel_piedra);
		
		JLabel jLabel_hierro = new JLabel("Hierro");
		panel.add(jLabel_hierro);
		
		JLabel jLabel_oro = new JLabel("Oro");
		panel.add(jLabel_oro);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
	}
}
