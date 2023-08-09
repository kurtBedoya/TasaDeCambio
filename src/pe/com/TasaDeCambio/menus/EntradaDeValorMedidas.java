package pe.com.TasaDeCambio.menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EntradaDeValorMedidas extends JFrame{
	
	public 	JPanel panel;
	public  JButton B1;
	public  JButton B2;
	public JTextField txt_;
	
	
public EntradaDeValorMedidas() {
	
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
	Etiqueta ();
	botones(); 
	texto();
	
	
}

private void Etiqueta () {
	
	JLabel E = new JLabel();
	E.setText("ingresa la distancia que desea convertir");
	E.setBounds(50,10,300,80);
	E.setHorizontalAlignment(SwingConstants.CENTER);
	E.setForeground(Color.black);
	E.setFont(new Font("Arial",Font.BOLD,12));
	panel.add(E);
	
	
	JLabel I = new JLabel(new ImageIcon("interrogacion.png"));
	I.setBounds(18,45,27,27);
	panel.add(I);
	
	
	
}

private void botones() {
	
	B1 = new JButton();
	B2 = new JButton();
	
	B1.setBounds(120,  100, 80, 25);
	B2.setBounds(210,  100, 80, 25);
	
	 B1.setText("OK");
	 B2.setText("CANCEL");
	 
	 panel.add(B1);
	 panel.add(B2);
	 
	 
	 
	 B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				MenuOpciones M = new MenuOpciones();
				M.setVisible(true);
				EntradaDeValorMedidas.this.dispose();
				
				}
				 
	});
	 
	 
	 
}

	public void texto(){
	 
	 txt_ = new JTextField();
	 txt_.setBounds(63,65,280,25);
	 panel.add(txt_);
	 B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				temporal tm = new temporal();
				tm.setTexto(txt_.getText().trim());
				if (tm.getTexto().equals("")) {
					
					JOptionPane.showMessageDialog(null,"ingrese un valor valido");
				}else try {{
				JOptionPane.showMessageDialog(null," ingreso el valor de : " + tm.getTexto());
				MenuMedidas Mm = new MenuMedidas();
				double valor = Double.parseDouble(txt_.getText());
				Mm.setDato(valor);
				Mm.setVisible(true);
				EntradaDeValorMedidas.this.dispose();
				}
				}catch(NumberFormatException exception ) {
				
				System.out.println("atrapo error");
					 System.out.println(exception.getMessage());
					 exception.printStackTrace();
					 JOptionPane.showMessageDialog(null," error encontrado, ingrese solo numeros porfavor " );
					 txt_.setText("");
					 
				}
				
			}
				
				
				
				
			
						 
		});
	 
	 		
}
	
	
public static void main(String[] args) {

	MenuOpciones ventana = new MenuOpciones();
	ventana.setVisible(true);
}



}
