package pe.com.TasaDeCambio.control;

import javax.swing.JOptionPane;

import pe.com.TasaDeCambio.menus.EntradaDeValor;
import pe.com.TasaDeCambio.menus.MenuCambioMonedas;
import pe.com.TasaDeCambio.monedas.moneda;

public class ControlCambioALibra {
	
	public double registrarCantidad (moneda moneda) {
		
		JOptionPane.showMessageDialog(null," calculo actual es : " + moneda.getSolCambioA() + " Libras" );
		int salida =  JOptionPane.showConfirmDialog(null, "desea continuar", null, JOptionPane.YES_NO_OPTION);
		if (salida == 1) {
			EntradaDeValor E = new EntradaDeValor();
			MenuCambioMonedas M = new MenuCambioMonedas();
			E.setVisible(true);
									
		}
			return moneda.getCantidad();
				
		
	}

}
