package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class General_Interface {

	private JFrame frame;
	private JTabbedPane tabbedPane;
	private JPanel tab3;
	private JPanel tab2;
	private JPanel tab1;
	private JLabel lblPlateNumber;
	private JLabel lblDni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					General_Interface window = new General_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public General_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		tab1 = new JPanel();
		tabbedPane.addTab("Radar", null, tab1, null);
		
		tab2 = new JPanel();
		tabbedPane.addTab("Payment", null, tab2, null);
		
		tab3 = new JPanel();
		tabbedPane.addTab("Management", null, tab3, null);
		tab3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPlateNumber = new JLabel("Plate number:");
		tab3.add(lblPlateNumber);
		
		lblDni = new JLabel("DNI:");
		tab3.add(lblDni);
	}
}
