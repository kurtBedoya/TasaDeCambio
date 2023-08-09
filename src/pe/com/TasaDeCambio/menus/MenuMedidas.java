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


import pe.com.TasaDeCambio.medida.*;
import pe.com.TasaDeCambio.ControlMedida.*;


public class MenuMedidas extends JFrame {
	
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
	
	
			

	
	public MenuMedidas() {
		
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
		 opcion1 = new JMenuItem("Metro a Pulgada");
		 opcion2 = new JMenuItem("Metro a Pie");
		 opcion3 = new JMenuItem("Metro a Yarda");
		 opcion4 = new JMenuItem("Kilometro a Milla");
		 opcion5 = new JMenuItem("pulgada a Metro");
		 opcion6 = new JMenuItem("Pie a Metro");
		 opcion7 = new JMenuItem("Yarda a Metro");
		 opcion8 = new JMenuItem("Milla a Kilometro");
		 opcion9 = new JMenuItem("Metro a Kilometro");
		 opcion10 = new JMenuItem("Kilometro a Metro");
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
														
					Medida pulgada = new Pulgada();
					pulgada.setMedida(dato);
					ControlEquivalenciaPulgada cep = new ControlEquivalenciaPulgada();
					cep.registrarMedida(pulgada);
					
										
				}
							 
			});
			
			opcion2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida pie = new Pies();
					pie.setMedida(dato);
					ControlEquivalenciaPie cep = new ControlEquivalenciaPie();
					cep.registrarMedida(pie);
									
				}
							 
			});
			
			opcion3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida yarda = new Yardas();
					yarda.setMedida(dato);
					ControlEquivalenciaYarda cep = new ControlEquivalenciaYarda();
					cep.registrarMedida(yarda);
									
				}
							 
			});
			
			opcion4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida millas = new Millas();
					millas.setMedida(dato);
					ControlEquivalenciaMilla cep = new ControlEquivalenciaMilla();
					cep.registrarMedida(millas);
				}
							 
			});
			
			opcion5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida pulgada = new Pulgada();
					pulgada.setMedida(dato);
					ControlEquivalenciaMetro cem = new ControlEquivalenciaMetro();
					cem.registrarMedida(pulgada);
								}
							 
			});
			
			opcion6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida pie = new Pies();
					pie.setMedida(dato);
					ControlEquivalenciaMetro cem = new ControlEquivalenciaMetro();
					cem.registrarMedida(pie);
				}
							 
			});
			
			opcion7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida yarda = new Yardas();
					yarda.setMedida(dato);
					ControlEquivalenciaMetro cem = new ControlEquivalenciaMetro();
					cem.registrarMedida(yarda);
														
				}
							 
			});

			opcion8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida milla = new Millas();
					milla.setMedida(dato);
					ControlEquivalenciaMetro cem = new ControlEquivalenciaMetro();
					cem.registrarMedida(milla);
				}
				
			});
			
			opcion9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					
					Medida km = new Kilometro();
					km.setMedida(dato);
					ControlEquivalenciaKilometro cek = new ControlEquivalenciaKilometro();
					cek.registrarMedida(km);
				
				}
							 
			});
				
			 
			 opcion10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
				
						
						Medida km = new Kilometro();
						km.setMedida(dato);
						ControlEquivalenciaMetro cem = new ControlEquivalenciaMetro();
						cem.registrarMedida(km);
						
				}
					
						 
			});
			 
			 opcion11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
				
						EntradaDeValor E = new EntradaDeValor();
						
						E.setVisible(true);
						MenuMedidas.this.dispose();
						
				}
					
						 
			});
			 
			 opcion12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
				
						MenuOpciones M = new MenuOpciones();
						
						M.setVisible(true);
						MenuMedidas.this.dispose();
						
				}
					
						 
			});

	
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		MenuOpciones ventana = new MenuOpciones();
		ventana.setVisible(true);
	}

	

}


