package pe.com.TasaDeCambio.menus;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import pe.com.TasaDeCambio.control.*;
import pe.com.TasaDeCambio.monedas.Dolar;
import pe.com.TasaDeCambio.monedas.Euro;
import pe.com.TasaDeCambio.monedas.LibrasEsterlinas;
import pe.com.TasaDeCambio.monedas.Sol;
import pe.com.TasaDeCambio.monedas.Won;
import pe.com.TasaDeCambio.monedas.Yen;
import pe.com.TasaDeCambio.monedas.moneda;
import pe.com.TasaDeCambio.control.ControlSolCambio;

public class MenuCambioMonedas extends JFrame {
	
	
	
		
		private JMenuBar menuBar;
		private JMenu menu;
		private JMenuItem opcion1;
		private JMenuItem opcion2;
		private JMenuItem opcion3;
		private JMenuItem opcion4;
		private JMenuItem opcion5;
		private JMenuItem opcion6;
		private JMenuItem opcion7;
		private JMenuItem opcion8;
		private JMenuItem opcion9;
		private JMenuItem opcion10;
		private JMenuItem opcion11;
		private JMenuItem opcion12;
		private double dato;
		public  double valor;
		public JTextField txt1_;
		public 	JPanel panel;
		
		
				

		
		public MenuCambioMonedas() {
			
			setSize(600,400);
			setTitle("Opciones");
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			panel = new JPanel();
			mostrarMenu();
			panel.add(menuBar);
			add(panel);
			
			//panel.setLayout(null);
			//this.getContentPane().add(panel);
			texto();
			
		}
		
		
		
		public void setDato (double dato) {
			this.dato = dato;
			txt1_.setText(Double.toString(dato));
			
		}
		
		public void texto(){
			 
			 txt1_ = new JTextField();
			 txt1_.setBounds(100,100,100,100);
			 panel.add(txt1_);
			 
		}
		


		
		
		
		public void mostrarMenu() {
			
			
			 menuBar = new JMenuBar();
			 menu = new JMenu("Elija un cambio");
			 opcion1 = new JMenuItem("Sol a DOlar");
			 opcion2 = new JMenuItem("Sol a Euro");
			 opcion3 = new JMenuItem("Sol a Libra");
			 opcion4 = new JMenuItem("Sol a Yen");
			 opcion5 = new JMenuItem("Sol a Won");
			 opcion6 = new JMenuItem("Dolar a Sol");
			 opcion7 = new JMenuItem("Euro a Sol");
			 opcion8 = new JMenuItem("Libra a Sol");
			 opcion9 = new JMenuItem("Yen a Sol");
			 opcion10 = new JMenuItem("Won a Sol");
			 opcion11 = new JMenuItem("Ingrese Otro Valor");
			 opcion12 = new JMenuItem("Inicio");

			 
			 menu.add(opcion1);
			 menu.add(opcion2);
			 menu.add(opcion3);
			 menu.add(opcion4);
			 menu.add(opcion5);
			 menu.add(opcion6);
			 menu.add(opcion7);
			 menu.add(opcion8);
			 menu.add(opcion9);
			 menu.add(opcion10);
			 menu.add(opcion11);
			 menu.add(opcion12);
			 menuBar.add(menu);
			 
		
			 
			 
			 
				opcion1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
															
						moneda dolar = new Dolar();
						dolar.setCantidad(dato);
						ControlCambioADolar ccd = new ControlCambioADolar();
						ccd.registrarCantidad(dolar);
						
											
					}
								 
				});
				
				opcion2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda euro = new Euro();
						euro.setCantidad(dato);
						ControlCambioAEuro cce = new ControlCambioAEuro();
						cce.registrarCantidad(euro);
						
					}
								 
				});
				
				opcion3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda libra = new LibrasEsterlinas();
						libra.setCantidad(dato);
						ControlCambioALibra ccl = new ControlCambioALibra();
						ccl.registrarCantidad(libra);
						
					}
								 
				});
				
				opcion4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda yen = new Yen();
						yen.setCantidad(dato);
						ControlCambioAYen ccy = new ControlCambioAYen();
						ccy.registrarCantidad(yen);
					}
								 
				});
				
				opcion5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda won = new Won();
						won.setCantidad(dato);
						ControlCambioAWon ccw = new ControlCambioAWon();
						ccw.registrarCantidad(won);
						
					}
								 
				});
				
				opcion6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda dolar = new Dolar();
						dolar.setCantidad(dato);
						ControlCambio cc = new ControlCambio();
						cc.registrarCantidad(dolar);
						
					}
								 
				});
				
				opcion7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda euro = new Euro();
						euro.setCantidad(dato);
						ControlCambio cc = new ControlCambio();
						cc.registrarCantidad(euro);
					
											
					}
								 
				});

				opcion8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda libra = new LibrasEsterlinas();
						libra.setCantidad(dato);
						ControlCambio cc = new ControlCambio();
						cc.registrarCantidad(libra);
					}
					
				});
				
				opcion9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						moneda won = new Won();
						won.setCantidad(dato);
						ControlCambio cc = new ControlCambio();
						cc.registrarCantidad(won);
					
					}
								 
				});
					
				 
				 opcion10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent event) {
					
							moneda yen = new Yen();
							yen.setCantidad(dato);
							ControlCambio cc = new ControlCambio();
							cc.registrarCantidad(yen);
						
							
					}
						
							 
				});
				 
				 opcion11.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent event) {
					
							EntradaDeValor E = new EntradaDeValor();
							
							E.setVisible(true);
							MenuCambioMonedas.this.dispose();
							
					}
						
							 
				});
				 
				 opcion12.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent event) {
					
							MenuOpciones M = new MenuOpciones();
							
							M.setVisible(true);
							MenuCambioMonedas.this.dispose();
							
					}
						
							 
				});

		
		}
		
		
		
		
		

		public static void main(String[] args) {
			
			MenuOpciones ventana = new MenuOpciones();
			ventana.setVisible(true);
		}

		

	}


