package pe.com.TasaDeCambio.menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Resultado extends JFrame{

	
	
	private double dato;
	public  double valor;
	public JTextField txt1_;
	public 	JPanel panel;
	
	public Resultado() {
		

			
			setSize(400,200);
			setTitle("EntradaDeValor");
			setLocationRelativeTo(null);
			setMinimumSize(new Dimension(200,200));
			iniciarComponentes();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
									
		}
		
		
		private void iniciarComponentes() {
			
			panel = new JPanel();
			panel.setLayout(null);
			this.getContentPane().add(panel);
			texto();
			
			
		}
		
	
	public void setDato (double dato) {
		this.dato = dato;
		txt1_.setText(Double.toString(dato));
		
		
	}
	
	public void texto(){
		 
		 txt1_ = new JTextField();
		 txt1_.setBounds(63,65,280,25);
		 panel.add(txt1_);
		 
	}
	

	public static void main(String[] args) {
		
		MenuOpciones ventana = new MenuOpciones();
		ventana.setVisible(true);
	}

	

}

