package pe.com.TasaDeCambio.menus;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;



public class MenuOpciones extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	
	public MenuOpciones() {
		
		setSize(600,400);
		setTitle("");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);
	}
	
	public void mostrarMenu() {
		
		 menuBar = new JMenuBar();
		 menu = new JMenu("Elija una opcion valida");
		 opcion1 = new JMenuItem("conversor de Moneda");
		 opcion2 = new JMenuItem("conversor de distancias");
		 opcion3 = new JMenuItem("salir");
		 
		 menu.add(opcion1);
		 menu.add(opcion2);
		 menu.add(opcion3);
		 
		 menuBar.add(menu);
		 
		 
		 
		 
		 
		opcion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				EntradaDeValor E = new EntradaDeValor();
				E.setVisible(true);
				MenuOpciones.this.dispose();
				
			}
						 
		});
		
		opcion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				EntradaDeValorMedidas E = new EntradaDeValorMedidas();
				E.setVisible(true);
				MenuOpciones.this.dispose();
				
			}
						 
		});
		
		
		
		

		 
			
		 
		 opcion3.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
					 
		});
		 
	
	}
	
	public static void main(String[] args) {
		
		MenuOpciones ventana = new MenuOpciones();
		ventana.setVisible(true);
	}

	

}
