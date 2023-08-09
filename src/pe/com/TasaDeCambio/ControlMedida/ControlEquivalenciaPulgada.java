package pe.com.TasaDeCambio.ControlMedida;

import javax.swing.JOptionPane;

import pe.com.TasaDeCambio.medida.*;
import pe.com.TasaDeCambio.menus.EntradaDeValorMedidas;

public class ControlEquivalenciaPulgada {
	
public double registrarMedida (Medida medida) {
		
		JOptionPane.showMessageDialog(null," calculo actual es : " + medida.getCambioAMetro()  + " pulgadas" );
		int salida =  JOptionPane.showConfirmDialog(null, "desea continuar", null, JOptionPane.YES_NO_CANCEL_OPTION);
		if (salida == 1) {
			EntradaDeValorMedidas E = new EntradaDeValorMedidas();
			E.setVisible(true);
									
		} else if(salida == 2){
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
			
		}
			return medida.getCambioAMetro() ;
				
		
	}

}